
import javax.swing.JFrame;

public class Main {

    public static void main(String[] args) {
        GridLayoutTester frame = new GridLayoutTester();
        frame.setSize(500, 200);
        frame.setTitle("Grid Layout Demo");
        frame.setLocation(200, 200);
        frame.initialize();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
