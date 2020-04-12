package HW8.Snake;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {
    public Window(){
        setTitle("Snake");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(370,380);
        setLocation(400, 400);
        add(new GameField());
        setVisible(true);
    }


    public static void main(String[] args) {
        Window w = new Window();
    }
}
