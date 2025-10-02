public class Main {
    public static void main(String[] args) {

        Integer[] dadosIniciais = {2, 7, 9, 12, 16, 21, 27, 33, 42, 54};
        Vetor vetor = new Vetor(dadosIniciais,10);
        vetor.insereNoInicio(2);
        vetor.insereNoInicio(7);
        System.out.println(vetor);
        System.out.println("//--------------------------------------------------------------------//");

        ListaDupla lista = new ListaDupla();

        lista.inserirNoFinal(10);
        lista.inserirNoFinal(20);

        System.out.println("Lista inicial: " + lista);
        System.out.println("Tamanho inicial: " + lista.getTamanho());

        lista.inserirAposValor(20, 25);
        System.out.println("Lista após inserir 25 depois de 20: " + lista);

        System.out.println("Tamanho final: " + lista.getTamanho());

        System.out.println("//--------------------------------------------------------------------//");


        ListaDuplaSimples listaDupla = new ListaDuplaSimples();

        listaDupla.inserirNoFinal(10);
        listaDupla.inserirNoFinal(20);
        listaDupla.inserirNoFinal(30);
        listaDupla.inserirNoFinal(40);

        System.out.println("Inicial: " + listaDupla); // [10, 20, 30, 40]

        // 1. Inserir após (após 20)
        listaDupla.inserirApos(20, 25);
        System.out.println("Apos 20 (insere 25): " + listaDupla); // [10, 20, 25, 30, 40]

        // 2. Inserir antes (antes de 25)
        listaDupla.inserirAntes(25, 22);
        System.out.println("Antes 25 (insere 22): " + listaDupla); // [10, 20, 22, 25, 30, 40]

        // 3. Remover antes (remover 20, que está antes de 22)
        listaDupla.removerAntes(22);
        System.out.println("Antes 22 (remove 20): " + listaDupla); // [10, 22, 25, 30, 40]

        // 4. Remover após (remover 40, que está após 30)
        listaDupla.removerApos(30);
        System.out.println("Apos 30 (remove 40): " + listaDupla); // [10, 22, 25, 30]

        // Teste de caso de borda: remover o primeiro elemento (10)
        listaDupla.removerAntes(22); // Remove o 10
        System.out.println("Antes 22 (remove 10): " + listaDupla); // [22, 25, 30]

    }



}

