/*import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
/**
 * Beschreiben Sie hier die Klasse Spieler.
 * 
 * @author Luka Cisneiros e Faria, Antonius Veitl, Jan Jubel, Bela Marx
 * @version Alpha 15.12.15
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JTextAreaBeispiel extends JFrame implements ActionListener{
    private JTextArea textfeld;
    private JTextField eingabeFeld;
    private JButton newText, deleteText, addLine;

    public static void main(String[] args) {
        JTextAreaBeispiel beispiel1 = new JTextAreaBeispiel();
        beispiel1.createTextArea();
        beispiel1.addText("Ich bin ein Textfeld.");

    }
    public void createTextArea() {
        JFrame meinJFrame = new JFrame();
        meinJFrame.setTitle("JTextArea Beispiel");
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
        eingabeFeld = new JTextField("Eingabe");
        eingabeFeld.setColumns(10); 
        panel.add(eingabeFeld);
        newText = new JButton("Aufhören");
        newText.addActionListener(this);
        deleteText = new JButton("Setzen");
        deleteText.addActionListener(this);
        addLine = new JButton("Würfeln");
        addLine.addActionListener(this);
        panel.add(newText);
        panel.add(deleteText);
        panel.add(addLine);
    }

    public void actionPerformed(ActionEvent e){

        if(e.getSource() == this.newText){
            addText(eingabeFeld.getText());
        }
        else if(e.getSource() == this.deleteText){
            deleteText();
        }
        else if (e.getSource() == this.addLine){
            newLine();
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
}
