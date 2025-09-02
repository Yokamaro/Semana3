package controleExer3;
import java.util.Scanner;
import dominioExer3.*;
public class Principal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] nomes = new String[10];
        for(int i=0;i<nomes.length;i++){
            System.out.println("Preencha o vetor de nomes: ");
            nomes[i] = sc.nextLine();
        }
        NomeArray nomeArray = new NomeArray(nomes);
        nomeArray.imprimirArray();
        System.out.println("Digite um nome para ser removido do array: ");
        String nomeRemover = sc.nextLine();
        int removidos = nomeArray.removerNome(nomeRemover);
        if(removidos > 0){
            System.out.println("O nome \"" + nomeRemover + "\" foi removido " + removidos + " vez(es).");
        }
        else{
            System.out.println("O nome \"" + nomeRemover + "\" não foi encontrado no array.");
        }
        nomeArray.imprimirArray();
        sc.close();
    }

}
