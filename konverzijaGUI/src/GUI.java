import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {
    private JPanel Panel;
    private JTextField unosKM;
    private JComboBox izborVal;
    private JButton konvertDugme;
    private JLabel ispisIznosa;

    public GUI() {
        izborVal.addItem("USD");
        izborVal.addItem("GBP");
        izborVal.addItem("EUR");
        konvertDugme.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                konvertujValutu();
            }
        });

    }

    private void konvertujValutu(){
//Preuzimanje teksta iz polja za unos
        String tekst = unosKM.getText().trim();
//Podrska za decimalni zarez
        tekst = tekst.replace(',','.');
//Provjera da li je polje za unos prazno
        if(tekst.isEmpty()){
            JOptionPane.showMessageDialog(null,
                    "Unesite ispravan pozitivan iznos!");
            return;
        }
        try{
//Pretvaranje string vrijednosti u double
            double iznosKM = Double.parseDouble(tekst);
            if(!Double.isFinite(iznosKM) || iznosKM<0){
                JOptionPane.showMessageDialog(null,
                        "Unesite ispravan pozitivan iznos");
                return;
            }
//Izbor valute i setovanje kursa odabrane valute
            String valuta = (String) izborVal.getSelectedItem();
            double kurs = 0;
            switch (valuta){
                case "USD":
                    kurs = 0.55;
                    break;
                case "EUR":
                    kurs = 0.51;
                    break;
                case "GBP":
                    kurs = 0.43;
                    break;
            }
//Izračunavanje konvertovanog iznosa
            double rezultat = iznosKM * kurs;
//Ispis rezultata u Label
            ispisIznosa.setText(String.format("%.2f %s",rezultat,valuta));
        } catch (NumberFormatException ex){
            JOptionPane.showMessageDialog(null,
                    "Unesite ispravan numerički iznos");
        }
    }


    public static void main(String[] args) {
        JFrame frame = new JFrame("GUI");
        frame.setContentPane(new GUI().Panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
