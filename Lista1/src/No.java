public class No {
    public Integer valor;
    public No proximo;
    public No anterior;

    public No(Integer valor) {
        this.valor = valor;
        this.proximo = null;
        this.anterior = null;

    }
    public String toString() {
        return this.valor.toString();
    }


}