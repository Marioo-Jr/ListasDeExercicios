public class ListaDupla {

    private No inicio;
    private No fim;
    private int tamanho;

    public ListaDupla() {
        this.inicio = null;
        this.fim = null;
        this.tamanho = 0;
    }

    public void inserirNoFinal(Integer valor) {
        No novoNo = new No(valor);

        if (this.inicio == null) {
            this.inicio = novoNo;
            this.fim = novoNo;
        } else {
            this.fim.proximo = novoNo;
            novoNo.anterior = this.fim;
            this.fim = novoNo;
        }
        this.tamanho++;
    }


    public int getTamanho() {
        return this.tamanho;
    }


    public boolean inserirAposValor(Integer valorExistente, Integer novoValor) {
        No atual = this.inicio;

        while (atual != null && !atual.valor.equals(valorExistente)) {
            atual = atual.proximo;
        }

        if (atual == null) {
            return false;
        }

        No novoNo = new No(novoValor);

        if (atual == this.fim) {
            this.fim.proximo = novoNo;
            novoNo.anterior = this.fim;
            this.fim = novoNo;
        } else {
            No proximoNo = atual.proximo;

            novoNo.proximo = proximoNo;
            novoNo.anterior = atual;

            atual.proximo = novoNo;
            proximoNo.anterior = novoNo;
        }

        this.tamanho++;
        return true;
    }


    public String toString() {
        if (this.inicio == null) {
            return "[]";
        }

        String resultado = "[";
        No atual = this.inicio;

        while (atual != null) {
            resultado = resultado + atual.valor;

            if (atual.proximo != null) {
                resultado = resultado + ", ";
            }
            atual = atual.proximo;
        }
        resultado = resultado + "]";
        return resultado;
    }


}
