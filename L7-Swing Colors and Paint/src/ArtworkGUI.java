import javax.swing.*;
import java.awt.*;

public class ArtworkGUI {

    //DECLARE VARIABLES
    JFrame frame;

    public ArtworkGUI() {
        //CREATE THE GUI
        frame = new JFrame("Ivan's Artwork");
        frame.setSize(600,700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        JPanel panel = new MyDrawing();

        frame.add(panel);
        frame.setVisible(true);
    }

    private class MyDrawing extends JPanel
    {
        public MyDrawing(){
            //Set the background color
            setBackground(Color.CYAN);
        }

        //Add the PaintComponent Method and create your drawing.
        public void paintComponent(Graphics g) {
            super.paintComponent(g);

            g.setColor(Color.GREEN);
            g.fillRect(0,450,600,250);

            g.setColor(Color.WHITE);
            g.fillRect(150,250,300,200);

            g.setColor(Color.BLACK);
            g.fillRect(275,350,50,100);

            g.setColor(Color.BLACK);
            g.drawLine(150,250,300,75);

            g.setColor(Color.BLACK);
            g.drawLine(300,75,450,250);

            g.setColor(Color.BLACK);
            g.fillRect(375,125,50,125);

            g.setColor(Color.BLACK);
            g.fillRect(350,300,50,50);
        }
    }
}
