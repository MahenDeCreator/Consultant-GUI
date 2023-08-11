import javax.swing.*;

public class MenuPage {
    public static void main(String[] args) {
        showWindow();
    }
//Creating MENU PAGE..
    public static void showWindow() {
        JFrame frame = new JFrame("Menu Page");
        frame.setBounds(300, 90, 1010, 650);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        //Creating Patient form for the menu page
        JButton jB1 = new JButton("Patient Form");
        jB1.setBounds(300, 200, 400, 150);
        frame.getContentPane().add(jB1);
        jB1.addActionListener(e -> {
            frame.setVisible(false);
            Patient p1 = new Patient();
            p1.showWindow();
        });
        frame.setVisible(true);
    }
}




