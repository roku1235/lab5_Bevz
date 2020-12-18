import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class T extends JFrame {
    JTextField jta = new JTextField(10);
    JButton jba1 = new JButton("Попробуй угадай");
    Font fnt = new Font("Arial", Font.BOLD, 16);
    T() {
        super("Example");
        setLayout(new FlowLayout());
        setSize(250, 150);
        add(new JLabel("Введите число"));
        add(jta);
        add(jba1);
        add(new JLabel("Нажми кнопку"));
jba1.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            Random generate = new Random();
            int number = generate.nextInt(5);
            System.out.println("number = " + number);
            int x =  Integer.parseInt(jta.getText().trim());
            if(x == number){
                JOptionPane.showMessageDialog(null,"Вы угадали" + x,"Внимание", JOptionPane.INFORMATION_MESSAGE);
            } else{
                JOptionPane.showMessageDialog(null,"Вы не угадали", "Внимание", JOptionPane.INFORMATION_MESSAGE );
            }
        } catch (Exception ex ){
            JOptionPane.showMessageDialog(null,"Ошибка","Внимание", JOptionPane.INFORMATION_MESSAGE);
        }
    }
});
setVisible(true);
    }

    public static void main(String[] args) {
        new T();
    }
}

