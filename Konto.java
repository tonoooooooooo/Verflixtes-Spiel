
/**
 * Die Klasse Konto ist die Klasse, welche den Guthabenstand eines Spilers beschreibt.
 * 
 * @author Antonius Jan Luka Bela
 * @version 0.1.0
 */
public class Konto
{
   
    private int konto;

    public Konto()
    {
       
    }

    /**
     * Get Methode: Holt den Wert des Kontostandes
     */
    public int getKonto()
    {
        return konto;
    }
    
    /**
     * Set Methode: Setzt einen Wert für das Konto
     *
     */
    public void setKonto(int neuKonto)
    {
        konto = neuKonto;
    }
}
