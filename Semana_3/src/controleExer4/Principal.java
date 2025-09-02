package controleExer4;
import java.util.Scanner;
import dominioExer4.*;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetor = new int[10];
        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vetor[i] = sc.nextInt();
        }

        NumeroArray numArray = new NumeroArray(vetor);
        numArray.imprimirArray();
        numArray.contarFrequencia();

        sc.close();
    }
}