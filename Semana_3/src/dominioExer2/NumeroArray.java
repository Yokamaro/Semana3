package dominioExer2;

public class NumeroArray {
    private int[] numeros;
    public NumeroArray(int[] numeros){
        this.numeros = numeros;
    }
    public int[] buscarOcorrencias(int valor) {
        int[] posicoesTemp = new int[numeros.length];
        int contador = 0;


        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == valor) {
                posicoesTemp[contador] = i;
                contador++;
            }
        }


        int[] resultado = new int[contador];
        for (int i = 0; i < contador; i++) {
            resultado[i] = posicoesTemp[i];
        }
        return resultado;
    }

}
