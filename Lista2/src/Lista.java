class Lista {
    No2 inicio;
    No2 fim;
    int tamanho;

    Lista() {
        this.inicio = null;
        this.fim = null;
        this.tamanho = 0;
    }

    boolean estaVazia() {
        return inicio == null;
    }

    void inserirNoFinal(Documento documento) {
        No2 novoNo2 = new No2(documento);
        if (estaVazia()) {
            inicio = novoNo2;
            fim = novoNo2;
        } else {
            fim.proximo = novoNo2;
            fim = novoNo2;
        }
        tamanho++;
    }

    Documento removerDoInicio() {
        if (estaVazia()) {
            return null;
        }
        Documento dado = inicio.dado;
        inicio = inicio.proximo;
        if (inicio == null) {
            fim = null;
        }
        tamanho--;
        return dado;
    }
}
