import java.applet.Applet;
import java.awt.Button;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.*;

public class Calculator2 extends Applet implements ActionListener {
    Label l1, l2, l3;
    TextField t1, t2, t3;
    Button b1, b2, b3, b4;

    public void actionPerformed(ActionEvent e) {
        int num1 = Integer.parseInt(t1.getText());
        int num2 = Integer.parseInt(t2.getText());

        if (e.getSource() == b1) {
            int num3 = num1 + num2;
            t3.setText(String.valueOf(num3));
        } else if (e.getSource() == b2) {
            int num3 = num1 - num2;
            t3.setText(String.valueOf(num3));
        } else if (e.getSource() == b3) {
            int num3 = num1 * num2;
            t3.setText(String.valueOf(num3));
        } else {
            int num3 = num1 / num2;
            t3.setText(String.valueOf(num3));
        }

    }

    public void init() {
        l1 = new Label("Enter 1st number..");
        l2 = new Label("Enter 2nd number..");
        l3 = new Label("Enter 3rd number..");

        t1 = new TextField();
        t2 = new TextField();
        t3 = new TextField();

        b1 = new Button("+");
        b2 = new Button("-");
        b3 = new Button("*");
        b4 = new Button("/");

        setLayout(null);

        l1.setBounds(50, 50, 100, 30);
        t1.setBounds(170, 50, 100, 30);

        l2.setBounds(50, 100, 100, 30);
        t2.setBounds(170, 100, 100, 30);

        l3.setBounds(50, 150, 100, 30);
        t3.setBounds(170, 150, 100, 30);

        b1.setBounds(50, 200, 50, 30);
        b2.setBounds(110, 200, 50, 30);
        b3.setBounds(170, 200, 50, 30);
        b4.setBounds(230, 200, 50, 30);

        add(l1); add(t1);
        add(l2); add(t2);
        add(l3); add(t3);
        add(b1); add(b2); add(b3); add(b4);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);

        setSize(350, 300);
        setVisible(true);
    }
}

