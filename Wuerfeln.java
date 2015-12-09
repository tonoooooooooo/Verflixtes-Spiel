import java.util.Random;
import java.util.Scanner;

public class Wuerfeln
{
 
  public static void main ( String[] args )
  {
    Scanner scan = new Scanner( System.in );
    Random  rand = new Random();
   int ergebnis = 0;
    for (int i=0; i<50; i++)
    {
     
     int zahl =    (rand.nextInt(6)+1) +  (rand.nextInt(6)+1); 
     if (zahl==7)
     {
         System.out.println("Oh nein, Ihr Wurf ist eine " +zahl + ". Sie haben verloren!");
         break;
        }
     ergebnis = ergebnis + zahl; 
     System.out.println("Ihr Wurf ist eine " + zahl + ". Wollen Sie weiter würfeln? Ihre Zwischensumme beträgt: "+ ergebnis);
     
     
     
      String zeile = scan.nextLine();
    }
  }
}
