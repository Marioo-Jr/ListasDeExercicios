public class Vetor {

    private Integer[] elementos;
    private int tamanho;
    private int capacidade;


    public Vetor(int capacidade) {
        this.elementos = new Integer[capacidade];
        this.capacidade = capacidade;
        this.tamanho = 0;
    }


    public Vetor(Integer[] dadosIniciais, int capacidadeMaxima) {
        this.capacidade = capacidadeMaxima;
        this.elementos = new Integer[capacidadeMaxima];


        for (int i = 0; i < dadosIniciais.length; i++) {
            this.elementos[i] = dadosIniciais[i];
        }


        this.tamanho = dadosIniciais.length;
    }


    public boolean insereNoInicio(Integer elemento) {
        if (this.tamanho < this.capacidade) {


            for (int i = this.tamanho; i > 0; i--) {
                this.elementos[i] = this.elementos[i - 1];
            }


            this.elementos[0] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }


    public int buscaBinaria(Integer valor) {


        int inicio = 0;
        int fim = this.tamanho - 1;

        while (inicio <= fim) {
            int meio = inicio + (fim - inicio) / 2;

            if (this.elementos[meio].equals(valor)) {
                return meio;
            }

            if (this.elementos[meio].compareTo(valor) < 0) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
        return -1;
    }

    public String toString() {
        if (this.tamanho == 0) {
            return "[]";
        }

        String resultado = "[";
        for (int i = 0; i < this.tamanho; i++) {
            resultado = resultado + this.elementos[i];

            if (i < this.tamanho - 1) {
                resultado = resultado + ", ";
            }
        }
        resultado = resultado + "]";
        return resultado;
    }
}