
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

// Grid Layout Demo; re-written using "array of JButtons"

public class GridLayoutTester extends JFrame {

    private JButton[] b;

    public void initialize() {

        // contentPane's default layout manager --> Border Layout
        Container contentPane = getContentPane();
        JPanel panel = new JPanel(); // JPanel's default layout manager --> Flow layout
        panel.setLayout(new GridLayout(2, 3)); // change to 2x3 Grid layout
        contentPane.add(panel, "Center");

        ButtonObserver observer = new ButtonObserver();

        b = new JButton[6];

        for (int i = 0; i < 6; i++) {
            b[i] = new JButton("" + i);
            b[i].addActionListener(observer);
            panel.add(b[i]);
        }

    }

    class ButtonObserver implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            Object source = event.getSource();
            JButton button = (JButton) source; // type casting
            String label = button.getText(); // getActionCommand()
            System.out.println(label + " pressed");
        }
    }

}
