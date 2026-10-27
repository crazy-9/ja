import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class NumberFrame extends JFrame implements ActionListener {

    private JTextField t1;
    private JTextField t2;
    private JTextField t3;

    public NumberFrame() {
        setTitle("Previous and Next Number");
        setLayout(new GridLayout(3, 2, 5, 5));

        t1 = new JTextField();
        t2 = new JTextField();
        t3 = new JTextField();

        t2.setEditable(false);
        t3.setEditable(false);

        add(new JLabel("Enter number:"));
        add(t1);

        add(new JLabel("Previous number:"));
        add(t2);

        add(new JLabel("Next number:"));
        add(t3);

        t1.addActionListener(this);

        setSize(350, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            int n = Integer.parseInt(t1.getText().trim());

            t2.setText(String.valueOf(n - 1));
            t3.setText(String.valueOf(n + 1));
        } catch (NumberFormatException ex) {
            t2.setText("Invalid");
            t3.setText("Invalid");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(NumberFrame::new);
    }
}
