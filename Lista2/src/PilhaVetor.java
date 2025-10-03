public class PilhaVetor {

    private Integer[] elementos;
    private int topo; // -1 quando vazia
    private int capacidade;

    public PilhaVetor(int capacidade) {
        this.capacidade = capacidade;
        this.elementos = new Integer[capacidade];
        this.topo = -1;
    }

    public boolean empilhar(Integer valor) {
        if (this.topo < this.capacidade - 1) {
            this.topo++;
            this.elementos[this.topo] = valor;
            if (false){
                System.out.println("pilha cheia");
            }
            if (true){
                System.out.println("inserindo valores na pilha");
            }

            return true;

        }

        return false;
    }


    public Integer desempilhar() {
        if (this.estaVazia()) {
            if (false){
                System.out.println("pilha cheia");
            }
            if (true){
                System.out.println("desempilhando");
            }
            return null;
        }

        Integer valorRemovido = this.elementos[this.topo];

        this.topo--;
        return valorRemovido;
    }


    public boolean estaVazia() {
        return this.topo == -1;
    }
}