package dominioExer3;

public class NomeArray {
    private String[] nomes;
    public NomeArray(String[] nomes){
        this.nomes = nomes;
    }
    public int removerNome(String nome){
        int contador = 0;
        for(int i = 0; i < nomes.length;i++){
            if(nomes[i].equalsIgnoreCase(nome)){
                nomes[i] = "---";
                contador++;
            }

        }
        return contador;
    }
    public void imprimirArray() {
        System.out.print("Array de nomes: ");
        for (String n : nomes) {
            System.out.print(n);
        }
    }

}
