import java.util.Scanner;

public class MakeNewSpeech {
  public static void main(String[] args) {
    /*
     * FORMÅL: At læse og forstå et program så man kan ændre i det
     *
     * OPGAVEN: copy/paste programmet og tilføj nu to pladsholdere i templaten så din tale ud over 
     * erindringsstedet også rummer en begivenhed og en følelse
     *
     * Templaten er strengen speechTemplate.
     * Pladsholderen finder du i speechTemplaten - TEMPPLACE.
     *
     * Du skal nu udvide programmet ved at tilføje to nye pladsholdere (find selv på navne) 
     * og derpå via en brugerdialog få input til hvad de skal udskiftes med på samme måde
     * som erindringsstedet bliver sat ind i den endelige tekst i stedet for TEMPPLACE.
     *
     * TESTKØRSEL: (eksempel)
     * Jeg er så glad at være med idag. Vi har kendt hinanden siden skolegården. 
     * Jeg husker tydeligt hvordan du kastede op
     *
     */

    String speechTemplate = "Vi har kendt hinanden siden TEMPPLACE. Jeg husker tydeligt ...\n"; 
    String erindringsSted = userSpeechInput("erindringssted");
    String mySpeech = speechComposer(speechTemplate,erindringsSted);
    System.out.print(mySpeech);
  }
  public static String speechComposer(String speechTemplate, String erindringsSted) {
    String myString = speechTemplate.replaceAll("TEMPPLACE",erindringsSted);
    return myString;
  }
  public static String userSpeechInput(String typeOfQuestion) {
    Scanner input = new Scanner(System.in);
    String ditValg;
    System.out.println("Hvad er dit " + typeOfQuestion);
    ditValg = input.nextLine();
    return ditValg;
  }
}
