class Pilha {
    No topo;
    int tamanho;

    Pilha() {
        this.topo = null;
        this.tamanho = 0;
    }

    boolean estaVazia() {
        return topo == null;
    }

    void push(String elemento) {
        No novoNo = new No(elemento);
        novoNo.proximo = topo;
        topo = novoNo;
        tamanho++;
    }

    String pop() {
        if (estaVazia()) {
            return null;
        }
        String dado = topo.dado;
        topo = topo.proximo;
        tamanho--;
        return dado;
    }

    String peek() {
        if (estaVazia()) {
            return null;
        }
        return topo.dado;
    }

    void limpar() {
        topo = null;
        tamanho = 0;
    }
}