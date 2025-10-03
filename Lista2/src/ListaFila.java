class ListaFila {
    No inicio;
    No fim;

    ListaFila() {
        this.inicio = null;
        this.fim = null;
    }

    boolean estaVazia() {
        return inicio == null;
    }

    void inserirNoFinal(String elemento) {
        No novoNo = new No(elemento);
        if (estaVazia()) {
            inicio = novoNo;
            fim = novoNo;
        } else {
            fim.proximo = novoNo;
            fim = novoNo;
        }
    }

    String removerDoInicio() {
        if (estaVazia()) {
            return null;
        }
        String dado = inicio.dado;
        inicio = inicio.proximo;
        if (inicio == null) {
            fim = null;
        }
        return dado;
    }

    void mostrarLista() {
        if (estaVazia()) {
            System.out.println("A lista esta vazia.");
            return;
        }
        No atual = inicio;
        System.out.print("Fila: [");
        while (atual != null) {
            System.out.print(atual.dado);
            if (atual.proximo != null) {
                System.out.print(", ");
            }
            atual = atual.proximo;
        }
        System.out.println("]");
    }
}