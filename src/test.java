import javax.swing.JFrame;
import javax.swing.JRootPane;

public class test {

    public static void main(final String args[]) {
        JFrame frame = new JFrame("Adornment Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setUndecorated(true);
        frame.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
        frame.setSize(300, 100);
        frame.setVisible(true);

    }
}
