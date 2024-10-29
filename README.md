# Lista Circular em Java

Este projeto implementa uma lista circular genérica em Java, a lista circular é uma estrutura de dados onde o último elemento aponta para o primeiro, formando um ciclo, este tipo de lista é útil em várias aplicações, como em sistemas operacionais para gerenciar processos em execução.

## Estrutura do Projeto

O projeto é composto por três classes principais:

1. **Main**: Classe principal que contém o método `main` para testar a lista circular.
2. **No**: Classe que representa um nó da lista, contendo um dado genérico e uma referência para o próximo nó.
3. **ListaCircular**: Classe que implementa a lista circular com métodos para adicionar, remover e buscar elementos.

## Funcionalidades

### Adicionar Elementos

- **adicionarNoFim**: Adiciona um novo elemento no final da lista.
- **adicionarNoInicio**: Adiciona um novo elemento no início da lista.
- **adicionarNaPosicao**: Adiciona um novo elemento em uma posição específica da lista.

### Remover Elementos

- **removerDoInicio**: Remove o elemento do início da lista.
- **removerNoFim**: Remove o elemento do final da lista.
- **removerDaPosicao**: Remove o elemento de uma posição específica da lista.
- **removerPorValor**: Remove o primeiro elemento que contém o valor especificado.

### Buscar Elementos

- **buscarPosicao**: Busca e exibe o elemento em uma posição específica da lista.

### Outros Métodos

- **imprimir**: Imprime todos os elementos da lista.
