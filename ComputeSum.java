import java.util.Scanner;
/*
 * FORMÅL: designe en metode med et while-loop
 *
 * OPGAVEN:
 * lav en metode computeSum der udregner tværsummen af et tal fra en bruger
 * og returnerer det til main der printer det i en streng som vist i testkørslen.
 * Tværsummen af 345 er f.eks 3 + 4 + 5. Brug operatorerne modulo og division 
 *
 * TESTKØRSEL:
 * 345
 * tværsummen af 345 er 12
 */
public class ComputeSum {
  public static void main(String[] args) {
    Scanner myScan = new Scanner(System.in);
    int userInt = myScan.nextInt();
    int sum = computeSum(userInt);
  }
}
