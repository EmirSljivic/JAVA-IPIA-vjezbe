import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {
    private JTextField textImeSt;
    private JTextField textPr2;
    private JTextField textPr1;
    private JTextField textZI;
    private JTextField textUK;
    private JTextField textOcjena;
    private JTextField textUpit;
    private JButton izracunajButton;
    private JPanel Panel;

    public GUI() {
        izracunajButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int m1,m2,m3;
                m1 = Integer.parseInt(textPr1.getText());
                m2 = Integer.parseInt(textPr2.getText());
                m3 = Integer.parseInt(textZI.getText());
                int tot = m1+m2+m3;
                textUK.setText(String.valueOf(tot));

                if(tot > 55){
                    textUpit.setText("Polozen!");
                }else{
                    textUpit.setText("Nije polozen!");
                }

                if(tot <= 54){
                    textOcjena.setText("5");
                }else if(tot >= 55 && tot <= 64){
                    textOcjena.setText("6");
                }else if(tot >= 65 && tot <= 74) {
                    textOcjena.setText("7");
                }else if(tot >= 75 && tot <= 84){
                    textOcjena.setText("8");
                }else if (tot >= 85 && tot <= 94){
                    textOcjena.setText("9");
                }else if(tot >= 95 && tot <= 100){
                    textOcjena.setText("10");
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("GUI");
        frame.setContentPane(new GUI().Panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
