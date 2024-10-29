public class ListaCircular<T> {
    private No<T> inicio;

    public ListaCircular() {
        this.inicio = null;
    }

    public void adicionarNoFim(T dado) {
        No<T> novoNo = new No<>(dado);

        if (inicio == null) {
            inicio = novoNo;
            novoNo.proximo = novoNo;
        } else {
            No<T> atual = inicio;

            while (atual.proximo != inicio) {
                atual = atual.proximo;
            }
            atual.proximo = novoNo;
            novoNo.proximo = inicio;
        }
    }

    public void adicionarNoInicio(T dado) {
        No<T> novoNo = new No<>(dado);

        if (inicio == null) {
            inicio = novoNo;
            novoNo.proximo = novoNo;
        } else {
            novoNo.proximo = inicio;
            No<T> ultimo = inicio;

            while (ultimo.proximo != inicio) {
                ultimo = ultimo.proximo;
            }
            ultimo.proximo = novoNo;
            inicio = novoNo;
        }
    }

    public void adicionarNaPosicao(int posicao, T dado) {
        No<T> novoNo = new No<>(dado);

        if (posicao == 0) {
            adicionarNoInicio(dado);
            return;
        }

        No<T> atual = inicio;
        for (int i = 0; i < posicao - 1; i++) {
            if (atual.proximo == inicio) {
                throw new IndexOutOfBoundsException("Posição fora dos limites da lista.");
            }
            atual = atual.proximo;
        }

        novoNo.proximo = atual.proximo;
        atual.proximo = novoNo;
    }

    public void removerDoInicio() {
        if (inicio == null) {
            System.out.println("A lista está vazia, nada para remover.");
            return;
        }
        if (inicio.proximo == inicio) {
            inicio = null;
        } else {
            No<T> atual = inicio;
            while (atual.proximo != inicio) {
                atual = atual.proximo;
            }

            inicio = inicio.proximo;
            atual.proximo = inicio;
        }
    }

    public void removerNoFim() {
        if (inicio == null) {
            System.out.println("A lista está vazia, nada para remover.");
            return;
        }
        if (inicio.proximo == inicio) {
            inicio = null;
        } else {
            No<T> atual = inicio;
            No<T> anterior = null;
            while (atual.proximo != inicio) {
                anterior = atual;
                atual = atual.proximo;
            }
            anterior.proximo = inicio; // Penúltimo aponta para o início
        }
    }

    public void removerDaPosicao(int posicao) {
        if (inicio == null) {
            System.out.println("A lista está vazia, nada para remover.");
            return;
        }

        if (posicao == 0) {
            removerDoInicio();
            return;
        }

        No<T> atual = inicio;
        No<T> anterior = null;
        for (int i = 0; i < posicao; i++) {
            if (atual.proximo == inicio) {
                throw new IndexOutOfBoundsException("Posição fora dos limites da lista.");
            }
            anterior = atual;
            atual = atual.proximo;
        }

        anterior.proximo = atual.proximo;
    }

    public void removerPorValor(T valor) {
        if (inicio == null) {
            System.out.println("A lista está vazia, nada para remover.");
            return;
        }

        if (inicio.dado.equals(valor)) {
            removerDoInicio();
            return;
        }

        No<T> atual = inicio;
        No<T> anterior = null;
        do {
            anterior = atual;
            atual = atual.proximo;
            if (atual.dado.equals(valor)) {
                anterior.proximo = atual.proximo;
                return;
            }
        } while (atual != inicio);

        System.out.println("Valor não encontrado na lista.");
    }

    public void imprimir() {
        if (inicio == null) {
            System.out.println("Lista vazia");
            return;
        }
        No<T> atual = inicio;
        do {
            System.out.print(atual.dado + " ");
            atual = atual.proximo;
        } while (atual != inicio);
        System.out.println();
    }

    public void buscarPosicao(int posicao) {
        if (inicio == null) {
            System.out.println("A lista está vazia.");
            return;
        }

        No<T> atual = inicio;
        for (int i = 0; i < posicao; i++) {
            if (atual.proximo == inicio) {
                throw new IndexOutOfBoundsException("Posição fora dos limites da lista.");
            }
            atual = atual.proximo;
        }

        System.out.println("Elemento na posição " + posicao + ": " + atual.dado);
    }
}
