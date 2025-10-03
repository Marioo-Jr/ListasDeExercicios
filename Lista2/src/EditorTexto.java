class EditorTexto {
    private String textoAtual;
    private Pilha pilhaDesfazer;
    private Pilha pilhaRefazer;

    EditorTexto() {
        this.textoAtual = "";
        this.pilhaDesfazer = new Pilha();
        this.pilhaRefazer = new Pilha();
    }

    String getTextoAtual() {
        return textoAtual;
    }

    void inserirTexto(String novoTrecho) {
        pilhaDesfazer.push(textoAtual);
        pilhaRefazer.limpar();
        textoAtual = textoAtual + novoTrecho;
    }

    void desfazer() {
        if (!pilhaDesfazer.estaVazia()) {
            pilhaRefazer.push(textoAtual);
            String estadoAnterior = pilhaDesfazer.pop();
            if (estadoAnterior != null) {
                textoAtual = estadoAnterior;
            }
        }
    }

    void refazer() {
        if (!pilhaRefazer.estaVazia()) {
            pilhaDesfazer.push(textoAtual);
            String estadoFuturo = pilhaRefazer.pop();
            if (estadoFuturo != null) {
                textoAtual = estadoFuturo;
            }
        }
    }
}
