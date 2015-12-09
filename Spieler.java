
/**
 * Beschreiben Sie hier die Klasse Spieler.
 * 
 * @author Luka Cisneiros e Faria, Bela Marx, Jan Jubel, Antonius Veitl
 * @version Alpha 09.12.15
 */
public class Spieler
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private String name;

    public Spieler(String neuerName)
    {
        name=neuerName;
    }

    public void setName (String nameAendern)
    {
        name=nameAendern;
    }

    public String getName()
    {
        return name;
    }
}
