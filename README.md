# Calculadora de Média e Identificador de Elementos Abaixo da Média em Vetor em Java

Este projeto consiste em um programa Java simples que lê uma quantidade especificada de números (podendo ser decimais) inseridos pelo usuário, calcula a média desses números e, em seguida, exibe a média e todos os elementos que são menores do que a média calculada.

**Autor:** gustavodees

## Arquivos Incluídos

* `principal/Main.java`: Contém a classe principal com o método `main`, responsável por obter a entrada do usuário, calcular a média dos números e identificar e exibir os elementos abaixo da média.

## Como Usar

1.  **Salve o arquivo:** Salve o código fornecido em um arquivo chamado `Main.java` dentro de uma pasta chamada `principal`.
2.  **Compile o código:** Abra um terminal ou prompt de comando, navegue até o diretório raiz do seu projeto e compile o arquivo Java utilizando o compilador Java:

    ```bash
    javac principal/Main.java
    ```

3.  **Execute o programa:** Após a compilação ser concluída com sucesso, execute a classe `Main` com o comando:

    ```bash
    java principal.Main
    ```

4.  **Entrada de Dados:**
    * O programa primeiro solicitará que você digite a quantidade de números que você deseja inserir. Digite o número desejado e pressione Enter.
    * Em seguida, o programa pedirá que você digite cada um dos números, um por vez. Para cada número, digite-o e pressione Enter.

5.  **Resultado:** Após inserir todos os números, o programa exibirá:
    * A média de todos os números digitados, com a mensagem "Média do vetor: " seguida do valor da média.
    * Uma lista com a mensagem "Elementos abaixo da media: " seguida por cada um dos números que são menores do que a média calculada, cada um em uma linha separada.

## Explicação do Código

### `principal/Main.java`

Este arquivo contém a classe `Main`, que é o ponto de entrada do programa.

* **Método `main`:**
    1.  Cria um objeto da classe `Scanner` para permitir a leitura de dados inseridos pelo usuário no console.
    2.  Solicita ao usuário que digite a quantidade de elementos que o vetor terá e armazena esse valor na variável inteira `n`.
    3.  Cria um array de números de ponto flutuante de dupla precisão (`double`) chamado `vect` com o tamanho especificado por `n`. Este array será utilizado para armazenar os números digitados pelo usuário.
    4.  Utiliza um loop `for` para iterar `n` vezes (para cada número que o usuário irá digitar). Em cada iteração:
        * Solicita ao usuário que digite um número.
        * Lê o número decimal inserido pelo usuário e armazena no array `vect` na posição correspondente ao índice `i`.
    5.  Inicializa duas variáveis `double`: `soma` com 0.0 (para acumular a soma dos números) e `media` com 0.0 (para armazenar a média).
    6.  Utiliza um loop `for` para percorrer o array `vect`. Em cada iteração:
        * Adiciona o valor do número armazenado em `vect[i]` à variável `soma`.
    7.  Calcula a média dos números dividindo a `soma` pelo número de elementos no array (`vect.length`) e armazena o resultado na variável `media`.
    8.  Imprime a média calculada com a mensagem "Média do vetor: ".
    9.  Utiliza outro loop `for` para percorrer o array `vect` novamente. Em cada iteração:
        * Verifica se o número armazenado em `vect[i]` é menor do que o valor da `media`.
        * Se o número for menor que a média, imprime a mensagem "Elementos abaixo da media: " seguida do valor do número.
    10. O objeto `Scanner` é fechado ao final do método `main` para liberar os recursos.
