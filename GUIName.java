/*import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
 */
import java.util.Random;
import java.util.Scanner;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI extends JFrame implements ActionListener{
    private JTextArea textfeld;
    private JTextField eingabeFeld;
    private JButton newText, deleteText, addLine;
    private int summe;
    private int zahl;
    private String name;

    private Spieler spieler1;
    private Spieler spieler2;

    public static void main(String[] args) {
        GUI beispiel1 = new GUI();
        beispiel1.createTextArea();
        beispiel1.addText("Setzen Sie einen beliebigen Betrag Ihres Startkapitals von 10");

        
    }

    public void createTextArea() {
        JFrame meinJFrame = new JFrame();
        meinJFrame.setTitle("VerfliXte 7");
        meinJFrame.setSize(600, 500);
        JPanel panel = new JPanel();

        //20-zeiliges und 50-spaltiges Textfeld wird erzeugt
        textfeld = new JTextArea(20, 50);

        //Text für das Textfeld wird gesetzt
        textfeld.setText("");
        //Zeilenumbruch wird eingeschaltet
        textfeld.setLineWrap(true);

        //Zeilenumbrüche erfolgen nur nach ganzen Wörtern
        textfeld.setWrapStyleWord(true);

        //Ein JScrollPane, der das Textfeld beinhaltet, wird erzeugt
        JScrollPane scrollpane = new JScrollPane(textfeld);       

        //Scrollpane wird unserem Panel hinzugefügt
        panel.add(scrollpane);

        meinJFrame.add(panel);
        meinJFrame.setVisible(true);

        //Eingabefeld und Buttons hinzufügen
        eingabeFeld = new JTextField("");
        eingabeFeld.setColumns(10); 
        panel.add(eingabeFeld);
        newText = new JButton("Würfeln");
        newText.addActionListener(this);
        deleteText = new JButton("Setzen");
        deleteText.addActionListener(this);
        addLine = new JButton("Aufhören");
        addLine.addActionListener(this);
        panel.add(newText);
        panel.add(deleteText);
        panel.add(addLine);
    }

    public void actionPerformed(ActionEvent e){

        if(e.getSource() == this.newText){
            wuerfeln();
        }
        else if(e.getSource() == this.deleteText){
            nameSetzen();
        }
        else if (e.getSource() == this.addLine){
            aufhören();
        }

    }

    public void addText(String newText) {
        textfeld.append(newText);
    }

    public void deleteText() {
        textfeld.selectAll();
        textfeld.cut();
    }

    public void newLine() {
        textfeld.append("\n");
    }

    public void windowClosed(WindowEvent w){
        System.exit(0);
    }

    public void nameSetzen()
    {
        textfeld.append("Wie möchtest du heißen?");
        Spieler spieler1 = new Spieler("");
        
        spieler1.setName(eingabeFeld.getText());
        textfeld.append("Dein Name lautet " + spieler1.getName());

    }

    public void wuerfeln()
    {
        Scanner scan = new Scanner( System.in );
        Random rand = new Random();
        for (int i=0; i<100; i++)
        {
            zahl = (rand.nextInt(6)+1) + (rand.nextInt(6)+1);
            summe = summe + zahl;
            if (zahl==7)
            {

                summe= summe - 14;
                textfeld.append("Oh nein, Ihr Wurf ist eine verflixte 7" + ". Ihre Endsumme lautet " + summe  + "!");
                newLine();
                break;
            }
            textfeld.append("Ihr Wurf ist eine " + zahl + ". Wollen Sie weiter würfeln? Ihre Zwischensumme beträgt: " + summe);
            newLine();
            break;
        }
    }

    public void aufhören()
    {
        textfeld.append("Sie brechen Ihren Zug mit der Summe von " + summe + " ab. Der nächste Spieler ist dran.");
    }
}
