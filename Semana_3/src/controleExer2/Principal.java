package controleExer2;
import dominioExer2.*;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        for(int i=0;i<numeros.length;i++){
            System.out.println("Preencha o array: ");
            numeros[i] = sc.nextInt();
        }
        System.out.println("Digite o número que deseja verificar se tem no array: ");
        int numEspecial = sc.nextInt();
        NumeroArray na = new NumeroArray(numeros);
        int[] posicoes = na.buscarOcorrencias(numEspecial);
        if (posicoes.length == 0) {
            System.out.println("O número " + numEspecial + " NÃO foi encontrado no array.");
        } else {
            System.out.print("O número " + numEspecial + " foi encontrado nas posições (índices): ");
            for (int i = 0; i < posicoes.length; i++) {
                System.out.print(posicoes[i]);
                System.out.print(", ");
            }
        }
    }
}
