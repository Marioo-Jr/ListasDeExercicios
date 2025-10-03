
public class Main {
    public static void main(String[] args) {

        PilhaVetor pilha = new PilhaVetor(3);

        pilha.empilhar(10);
        pilha.empilhar(20);
        pilha.empilhar(30);


        System.out.println("Empilhar 40 (cheia): " + pilha.empilhar(40)); // false

        System.out.println("Vazia: " + pilha.estaVazia());

        System.out.println("Desempilhando: " + pilha.desempilhar()); // Remove 30
        System.out.println("Desempilhando: " + pilha.desempilhar()); // Remove 20
        System.out.println("Desempilhando: " + pilha.desempilhar()); // Remove 10

        System.out.println("Desempilhando (vazio): " + pilha.desempilhar());
        System.out.println("Vazia: " + pilha.estaVazia());


        System.out.println("//-----------------------------------------------------------------//");


        EditorTexto editor = new EditorTexto();

        System.out.println("--- Exemplo de Uso Desfazer/Refazer ---");
        System.out.println("Estado Inicial: " + editor.getTextoAtual());

        System.out.println("\n1. Insere: 'ALO ALO.'");
        editor.inserirTexto("ALO ALO");
        System.out.println("Texto Atual: " + editor.getTextoAtual());

        System.out.println("\n2. Adiciona mais: ' GALERA DE COWBOY?'");
        editor.inserirTexto("GALERA DE COWBOY? ");
        System.out.println("Texto Atual: " + editor.getTextoAtual());

        System.out.println("\n3. Desfaz a última ação :");
        editor.desfazer();
        System.out.println("Texto Atual (Após Desfazer): " + editor.getTextoAtual());

        System.out.println("\n4. Refaz a ação:");
        editor.refazer();
        System.out.println("Texto Atual (Após Refazer): " + editor.getTextoAtual());

        System.out.println("\n5. Adiciona novo texto: ' Novo parágrafo.' (Limpa Refazer)");
        editor.inserirTexto(" Novo parágrafo.");
        System.out.println("Texto Atual: " + editor.getTextoAtual());
        System.out.println("Tentativa de Refazer (Deve falhar):");
        editor.refazer();
        System.out.println("Texto Atual: " + editor.getTextoAtual());

        System.out.println("\n6. Desfaz múltiplas vezes:");
        System.out.println("Desfaz 1/2:");
        editor.desfazer();
        System.out.println("Texto Atual: " + editor.getTextoAtual());

        System.out.println("Desfaz 2/2:");
        editor.desfazer();
        System.out.println("Texto Atual: " + editor.getTextoAtual());

        System.out.println("Tentativa de Desfazer novamente (Deve falhar):");
        editor.desfazer();
        System.out.println("Texto Atual: " + editor.getTextoAtual());

        System.out.println("\n7. ");
        System.out.println("Refaz 1/2:");
        editor.refazer();
        System.out.println("Texto Atual: " + editor.getTextoAtual());

        System.out.println("Refaz 2/2 :");
        editor.refazer();
        System.out.println("Texto Atual: " + editor.getTextoAtual());


        System.out.println("//-----------------------------------------------------------------//");


        ListaFila fila = new ListaFila();

        System.out.println("1. Verificando se esta vazia (esperado: true): " + fila.estaVazia());

        System.out.println("\n2. Inserindo elementos (Enfileirar):");
        fila.inserirNoFinal("A");
        fila.inserirNoFinal("B");
        fila.inserirNoFinal("C");
        fila.mostrarLista();

        System.out.println("3. Verificando se esta vazia (esperado: false): " + fila.estaVazia());

        System.out.println("\n4. Removendo do inicio (Desenfileirar):");
        String removido1 = fila.removerDoInicio();
        System.out.println("Elemento removido: " + removido1 + " (Esperado: A)");
        fila.mostrarLista();

        String removido2 = fila.removerDoInicio();
        System.out.println("Elemento removido: " + removido2 + " (Esperado: B)");
        fila.mostrarLista();

        System.out.println("\n5. Inserindo mais um elemento:");
        fila.inserirNoFinal("D");
        fila.mostrarLista();

        System.out.println("\n6. Removendo restantes:");
        String removido3 = fila.removerDoInicio();
        System.out.println("Elemento removido: " + removido3 + " (Esperado: C)");
        String removido4 = fila.removerDoInicio();
        System.out.println("Elemento removido: " + removido4 + " (Esperado: D)");

        System.out.println("\n7. Estado final da lista:");
        fila.mostrarLista();

        System.out.println("8. Tentativa de remover de lista vazia (esperado: null): " + fila.removerDoInicio());


        System.out.println("//-----------------------------------------------------------------//");


        FilaImpressao impressora = new FilaImpressao();


        System.out.println("\n1. Adiciona documentos na fila:");
        impressora.adicionarDocumento("Relatorio_A.pdf", 512);
        System.out.println("Adicionado: Relatorio_A.pdf");
        impressora.adicionarDocumento("Foto_Familia.jpg", 1024);
        System.out.println("Adicionado: Foto_Familia.jpg");
        impressora.adicionarDocumento("Email_Importante.txt", 40);
        System.out.println("Adicionado: Email_Importante.txt");

        System.out.println("\n2. Estado atual da fila:");
        impressora.mostrarFila();

        System.out.println("\n3. Imprime o proximo documento:");
        Documento docImpresso1 = impressora.imprimirProximo();
        if (docImpresso1 != null) {
            System.out.println("Imprimindo: " + docImpresso1.nome + " (" + docImpresso1.tamanho + "KB)");
        }

        System.out.println("\n4. Adiciona um novo documento enquanto imprime:");
        impressora.adicionarDocumento("Tabela_Dados.xlsx", 700);
        System.out.println("Adicionado: Tabela_Dados.xlsx");

        System.out.println("\n5. Imprime os documentos restantes:");
        Documento docImpresso2 = impressora.imprimirProximo();
        if (docImpresso2 != null) {
            System.out.println("Imprimindo: " + docImpresso2.nome + " (" + docImpresso2.tamanho + "KB)");
        }

        Documento docImpresso3 = impressora.imprimirProximo();
        if (docImpresso3 != null) {
            System.out.println("Imprimindo: " + docImpresso3.nome + " (" + docImpresso3.tamanho + "KB)");
        }

        System.out.println("\n6. Estado final da fila:");
        impressora.mostrarFila();

        System.out.println("\n7. Imprime o ultimo documento:");
        Documento docImpresso4 = impressora.imprimirProximo();
        if (docImpresso4 != null) {
            System.out.println("Imprimindo: " + docImpresso4.nome + " (" + docImpresso4.tamanho + "KB)");
        }

        System.out.println("\n8. Tentativa de imprimir com fila vazia:");
        Documento docVazio = impressora.imprimirProximo();
        if (docVazio == null) {
            System.out.println("Nenhum documento para imprimir. Fila vazia.");
        }
    }
}


