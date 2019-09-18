import java.util.Scanner;
import java.util.Random;

class MakeNewName {
  public static void main(String[] args) {
    String yourName = getUserName();
    String improvedName = improveName(yourName);
    System.out.println(improvedName);
    /*
     * FORMÅL:
     * bruge String-metoder
     *
     * OPGAVE:
     * Der skal altså bygges tre metoder. 
     * Byg først en metode improveName som skifter det første bogstav i navnet ud med en vokal
     * Fremgangsmåde til at bygge metoden improveName: 
     * lav en streng bestående af alle vokaler
     * gem brugerens navn minus første bogstav i en ny streng.
     * hent et tilfældigt tal og brug det til at finde en tilfældig vokal
     * Sæt vokalen og resten af navnet sammen og returnér det til main
     * 
     * Der skal så også være den sædvanlige bruger-dialog-metode, der returnerer brugerens navn.
     * Og en getRandomNumber-metode, der returnerer et tilfældigt tal mellem 0 og antallet af vokaler
     * Du må gerne kalde getRandomMetoden fra improveName-metoden.
     * 
     * TESTKØRSEL: 
     * Skovsen
     * Dit nye navn er: Ykovsen
     *

*/
  }
}
