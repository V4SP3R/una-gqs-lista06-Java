/**
 * Lista 06 - Gestao e Qualidade de Software
 * Calculo do fatorial de um numero inteiro utilizando um loop for.
 */
public class CalculoFatorial {

    /**
     * Calcula o fatorial de um numero inteiro nao negativo.
     *
     * @param numero numero cujo fatorial sera calculado
     * @return o valor do fatorial
     */
    public static long calcularFatorial(int numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("Nao existe fatorial de numero negativo.");
        }

        long fatorial = 1;

        for (int contador = 2; contador <= numero; contador++) {
            fatorial = fatorial * contador;
        }

        return fatorial;
    }

    public static void main(String[] args) {
        int numero = 5;

        long resultado = calcularFatorial(numero);

        System.out.println("O fatorial de " + numero + " e igual a " + resultado);
    }
}

