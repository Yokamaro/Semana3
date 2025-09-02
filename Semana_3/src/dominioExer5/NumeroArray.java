package dominioExer5;

public class NumeroArray {
    private int[] numeros;

    public NumeroArray(int[] numeros) {
        this.numeros = numeros;
    }

    public void bubbleSort() {
        int n = numeros.length;
        boolean trocou;


        for (int i = 0; i < n - 1; i++) {
            trocou = false;


            for (int j = 0; j < n - 1 - i; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                    trocou = true;
                }
            }
            if (!trocou) {
                break;
            }
        }
    }

    public void imprimirArray() {
        for (int n : numeros) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}