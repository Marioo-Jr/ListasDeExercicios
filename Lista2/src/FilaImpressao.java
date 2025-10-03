class FilaImpressao {
    private Lista fila;

    FilaImpressao() {
        this.fila = new Lista();
    }

    int getNumeroDocumentos() {
        return fila.tamanho;
    }

    void adicionarDocumento(String nome, int tamanho) {
        Documento novoDoc = new Documento(nome, tamanho);
        fila.inserirNoFinal(novoDoc);
    }

    Documento imprimirProximo() {
        return fila.removerDoInicio();
    }

    void mostrarFila() {
        if (fila.estaVazia()) {
            System.out.println("A fila de impressao esta vazia.");
            return;
        }

        System.out.println("Documentos na fila (" + getNumeroDocumentos() + " total):");
        No2 atual = fila.inicio;
        int contador = 1;
        while (atual != null) {
            System.out.println("  " + contador + ". Nome: " + atual.dado.nome + ", Tamanho: " + atual.dado.tamanho + "KB");
            atual = atual.proximo;
            contador++;
        }
    }
}
