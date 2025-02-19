import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int i = 0;
        int j = 0;

        System.out.print("Digite um número:");
        i = entrada.nextInt();

        System.out.print("Digite outro número:");
        j = entrada.nextInt();

        int maiorCont = verificarMaxImpre(i, j);

        System.out.println("Número maxímo de impressões:" + maiorCont);

        entrada.close();
    }

    public static int verificarMaxImpre(int i, int j) {

        int n = 0;
        int contador = 0;
        int maiorCont = 0;

        while (i <= j) {
            n = i;
            while (true) {
                    contador++;
                if (n == 1) {

                    break;
                }
                if (n % 2 != 0) {
                    n = 3 * n + 1;
                } else {
                    n = n / 2;
                }
            }

            if (contador > maiorCont) {
                maiorCont = contador;
            }

            contador = 0;
            i++;
        }
        return maiorCont;
    }
}
