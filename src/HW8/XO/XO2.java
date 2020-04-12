package HW8.XO;

import javax.swing.*;
import java.awt.*;

public class XO2 extends JFrame {

    private final ImageIcon imageX = new ImageIcon("src/HW8/XO/x.jpg");
    private final ImageIcon imageO = new ImageIcon("src/HW8/XO/o.jpg");
    private final ImageIcon imageEmpty = new ImageIcon("src/HW8/XO/empty.jpg");
    private int cnt = 0;

    public XO2() throws HeadlessException {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(500, 400);
        setSize(300, 300);
        setResizable(false);
        JPanel panel = new JPanel(new GridLayout(3, 3));
        JButton[][] buttons = new JButton[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                buttons[i][j] = new JButton();
                buttons[i][j].setIcon(imageEmpty);
                JButton copy = buttons[i][j];
                copy.addActionListener(action -> {
                    copy.setIcon(imageX);
                    copy.setEnabled(false);
                    cnt++;
                    copy.setDisabledIcon(imageX);
                    movePC(buttons);
                    if (isVictory(buttons, imageX)) {
                        String text = "Победа";
                        alert(text);
                    }
                    if (isVictory(buttons, imageO)) {
                        String text = "Поражение";
                        alert(text);
                    }
                    if (cnt == 9) {
                        String text = "Ничья";
                        alert(text);
                    }
                });
                panel.add(buttons[i][j]);

            }
        }
        add(panel);
        setVisible(true);
    }

    private void alert(String text){
        JFrame alert = new JFrame(text);
        alert.setLocation(500, 400);
        alert.setSize(300, 100);
        JPanel alertPanel = new JPanel(new FlowLayout());
        JButton newGame = new JButton("new game");
        newGame.addActionListener(a -> {
            this.dispose();
            new XO2();
            alert.dispose();
        });
        JButton close = new JButton("close");
        close.addActionListener(a -> {
            dispose();
            alert.dispose();
        });
        alertPanel.add(newGame);
        alertPanel.add(close);
        alert.add(alertPanel);
        alert.setResizable(false);
        alert.setVisible(true);
    }

    private boolean isVictory(JButton[][] buttons, ImageIcon dot) {
        boolean isCheckedDiagB, isCheckedDiagS;
        isCheckedDiagB = isCheckedDiagS = true;

        for (int diag = 0; diag < 3; diag++) {

            boolean isRow, isCol;
            isRow = isCol = true;

            for (int i = 0; i < 3; i++) {
                isRow = (buttons[diag][i].equals(dot)) && isRow;
                isCol = (buttons[i][diag].equals(dot))&& isCol;
                if (i == diag) {
                    isCheckedDiagB = (buttons[diag][diag].equals(dot)) && isCheckedDiagB;
                    isCheckedDiagS = (buttons[diag][2 - diag].equals(dot)) && isCheckedDiagS;
                }
            }

            if (isRow || isCol) return true;
        }

        if (isCheckedDiagB || isCheckedDiagS) return true;

        return false;
    }

    private void movePC(JButton[][] buttons) {
        int random = (int)(Math.random() * 3);
        for (int i = random; i < 3; i++) {
            for (int j = random; j < 3; j++) {
                if (buttons[i][j].isEnabled()) {
                    buttons[i][j].setIcon(imageO);
                    buttons[i][j].setEnabled(false);
                    buttons[i][j].setDisabledIcon(imageO);
                    cnt++;
                    return;
                }
            }
        }
    }

    public static void main(String[] args) {
        new XO2();
    }
}
