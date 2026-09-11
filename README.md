# Cálculo de Fatorial em Java

Lista 06 — Gestão e Qualidade de Software

Autor: Geovane dos Santos Silva

## Sobre o programa

Programa em Java que calcula o fatorial de um número inteiro utilizando um laço `for`.

O fatorial de um número `n` (escrito `n!`) é o produto de todos os inteiros positivos de 1 até `n`:

```
5! = 1 x 2 x 3 x 4 x 5 = 120
```

Por definição, `0! = 1`.

## Estrutura do código

Arquivo: `CalculoFatorial.java`

### `calcularFatorial(int numero)`

Percorre os valores de 2 até `numero` com um laço `for`, acumulando o produto na variável `fatorial` e devolvendo o resultado. Lança `IllegalArgumentException` caso receba um número negativo, já que fatorial não é definido para negativos.

### `main(String[] args)`

Define o número a ser calculado, chama o método acima e imprime o resultado no console.

## Como executar

Pré-requisito: JDK instalado. Para conferir:

```bash
java -version
javac -version
```

Compilar e rodar:

```bash
javac CalculoFatorial.java
java CalculoFatorial
```

Saída esperada:

```
O fatorial de 5 e igual a 120
```

## Calculando outro número

Basta alterar o valor da variável `numero` dentro do método `main` e compilar novamente.

## Limite do tipo de retorno

O método devolve um `long`, que comporta com segurança até `20!`. A partir de `21!` o valor ultrapassa a capacidade do tipo e o resultado passa a ser incorreto (overflow). Para números maiores, o caminho é usar a classe `BigInteger`.
