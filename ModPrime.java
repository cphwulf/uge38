import java.util.Scanner;
class ModPrime {
  public static void main(String[] args) {
    Scanner  myScan = new Scanner(System.in);
    int userInt = myScan.nextInt();
    String answer = isPrime(userInt);
    System.out.println(userInt + answer);
    /*
     * FORMÅL:
     * bruge modulo-operatoren, for-loop og if-statement
     *
     * OPGAVE:
     * Et primtal er et positivt heltal større end 1, 
     * der ikke er deleligt med andre hele positive tal end 1 
     * og tallet selv,
     * 
     * Lav et for-loop som løber fra 2 til tallet som skal undersøges
     * Derved får man mulighed for at tjekke alle positive tal større end 
     * 1 og mindre end tallet selv.
     *
     * Løs opgaven med Scanner-input så input bliver dynamisk.
     *
     * TESTKØRSEL: 
     * for tallet 45 skal der returneres:
     * 45 not a prime because divisor 15
     * for tallet 11
     * 11 is a prime 
*/
  }
  //TODO: lav metoden isPrime
}
