package dominioExer1;

public class NumeroArray {
    private int[] numeros;
    public NumeroArray(int[] numeros){
        this.numeros = numeros;
    }
    public void contarParesEimpares(){
        int pares = 0;
        int impares = 0;
        for(int n : numeros){
            if(n % 2 == 0){
                pares++;
            }
            else{
                impares++;
            }
        }
        System.out.println("Quantidade de pares: " + pares);
        System.out.println("Quantidade de ímpares: " + impares);
    }
    public void imprimirArray(){
        System.out.println("Array digitado: ");
        for(int n : numeros){
            System.out.println(n + " ");
        }
        System.out.println();
    }
}
