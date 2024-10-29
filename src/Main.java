public class Main {
    public static void main(String[] args) {
        ListaCircular<Integer> lista = new ListaCircular<>();

        lista.adicionarNoFim(10);
        lista.adicionarNoFim(20);
        lista.adicionarNoFim(30);
        lista.imprimir();

        lista.adicionarNoInicio(5);
        lista.imprimir();

        lista.adicionarNaPosicao(2, 15);
        lista.imprimir();

        lista.removerDoInicio();
        lista.imprimir();

        lista.removerNoFim();
        lista.imprimir();

        lista.removerDaPosicao(1);
        lista.imprimir();

        lista.removerPorValor(15);
        lista.imprimir();

        lista.buscarPosicao(1);
    }
}
