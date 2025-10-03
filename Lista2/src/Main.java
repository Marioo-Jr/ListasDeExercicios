
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
    }


}