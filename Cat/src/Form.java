import javax.swing.*;

public class Form extends JFrame {
    private Cat cat = new Cat();
    private JList list1;
    private JTextField textField1;
    private JButton button1;
    private JButton button2;
    private JPanel panelMain;

    private Form() {
        button1.addActionListener(actionEvent -> {
            cat.push(textField1.getText());
            textField1.setText("");
        });
        button2.addActionListener(actionEvent -> {
            list1.setListData(cat.getCats());
            list1.setLayoutOrientation(JList.VERTICAL);
        });

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Cat's if here?!");
        frame.setContentPane(new Form().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}