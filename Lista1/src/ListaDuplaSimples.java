public class ListaDuplaSimples {

    private No inicio;
    private No fim;
    private int tamanho;

    public ListaDuplaSimples() {
        this.inicio = null;
        this.fim = null;
        this.tamanho = 0;
    }

    public void inserirNoFinal(Integer valor) {
        No novoNo = new No(valor);

        if (this.inicio == null) {
            this.inicio = novoNo;
        } else {
            this.fim.proximo = novoNo;
            novoNo.anterior = this.fim;
        }
        this.fim = novoNo;
        this.tamanho++;
    }

    public boolean inserirApos(Integer valorAtual, Integer novoValor) {
        No atual = this.inicio;
        while (atual != null && !atual.valor.equals(valorAtual)) {
            atual = atual.proximo;
        }
        if (atual == null) return false;

        No novoNo = new No(novoValor);

        if (atual == this.fim) {
            this.fim.proximo = novoNo;
            novoNo.anterior = this.fim;
            this.fim = novoNo;
        } else {
            No proximo = atual.proximo;

            novoNo.proximo = proximo;
            novoNo.anterior = atual;

            atual.proximo = novoNo;
            proximo.anterior = novoNo;
        }
        this.tamanho++;
        return true;
    }

    public boolean removerApos(Integer valorAtual) {
        No atual = this.inicio;
        while (atual != null && !atual.valor.equals(valorAtual)) {
            atual = atual.proximo;
        }
        if (atual == null || atual.proximo == null) return false;

        No noRemover = atual.proximo;
        No proximoDoRemover = noRemover.proximo;

        atual.proximo = proximoDoRemover;

        if (noRemover == this.fim) {
            this.fim = atual;
        } else {
            proximoDoRemover.anterior = atual;
        }
        this.tamanho--;
        return true;
    }

    public boolean inserirAntes(Integer valorAtual, Integer novoValor) {
        No atual = this.inicio;
        while (atual != null && !atual.valor.equals(valorAtual)) {
            atual = atual.proximo;
        }
        if (atual == null) return false;

        No novoNo = new No(novoValor);
        No anterior = atual.anterior;

        if (atual == this.inicio) {
            // Inserir antes do início
            novoNo.proximo = this.inicio;
            this.inicio.anterior = novoNo;
            this.inicio = novoNo;
        } else {
            // Inserir no meio
            novoNo.proximo = atual;
            novoNo.anterior = anterior;

            anterior.proximo = novoNo;
            atual.anterior = novoNo;
        }
        this.tamanho++;
        return true;
    }

    public boolean removerAntes(Integer valorAtual) {
        No atual = this.inicio;
        while (atual != null && !atual.valor.equals(valorAtual)) {
            atual = atual.proximo;
        }
        if (atual == null || atual.anterior == null) return false;

        No noRemover = atual.anterior;
        No anteriorDoRemover = noRemover.anterior;

        if (noRemover == this.inicio) {
            // Remover o primeiro nó
            this.inicio = atual;
            this.inicio.anterior = null;
        } else {
            // Remover do meio
            anteriorDoRemover.proximo = atual;
            atual.anterior = anteriorDoRemover;
        }
        this.tamanho--;
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
        return resultado + "]";
    }
}