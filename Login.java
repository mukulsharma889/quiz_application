import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener {
    JButton btn;
    String name;
    Login(String name) {

        this.name = name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("images/login.jpeg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0 ,0 , 600 , 500);
        add(image);

        JLabel heading = new JLabel("Let's start");
        heading.setBounds(800 , 50 , 300,45);
        heading.setFont(new Font("arial" , Font.BOLD , 28));
        heading.setForeground(Color.GREEN);
        add(heading);

        JLabel name_label = new JLabel("Enter your name");
        name_label.setBounds(810 , 125 , 300,20);
        name_label.setFont(new Font("arial" , Font.BOLD , 18));
        name_label.setForeground(new Color(255,51,255));
        add(name_label);

        JTextField txtfield = new JTextField();
        txtfield.setBounds(735 , 200 , 300 , 25);
        txtfield.setFont(new Font("times new roman",Font.BOLD , 20));
        add(txtfield);

        btn = new JButton("Start");
        btn.setBackground(Color.BLACK);
        btn.setForeground(Color.WHITE);
        btn.setBounds(735,270,120,25);
        btn.addActionListener(this);
        add(btn);


        setSize(1200,500);
        setLocation(150,150);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Login("user");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btn) {
            new Start(name);
            setVisible(false);
        }
    }
}
