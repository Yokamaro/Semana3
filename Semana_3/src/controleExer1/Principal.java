package controleExer1;
import dominioExer1.*;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[20];
        for(int i = 0; i < vetor.length; i++){
            System.out.println("Preencha o array: ");
            vetor[i] = sc.nextInt();
        }
        NumeroArray numArray = new NumeroArray(vetor);
        numArray.imprimirArray();
        numArray.contarParesEimpares();
        sc.close();
    }
}
