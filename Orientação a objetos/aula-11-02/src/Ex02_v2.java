import java.util.Scanner;

public class Ex02_v2 {
    
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int i;
        int j;
        int totalParcial;
        int maior = 0;

        System.out.print("informe o valor de i:");
        i = entrada.nextInt();

        System.out.print("informe o valor de j:");
        j = entrada.nextInt();

        while (i <= j) {
            totalParcial = calcular(i);
            if (totalParcial > maior) {
                maior = totalParcial;
            }
            i++;
        }

        System.out.println("Número maximo de impressões:" + maior);
        
        entrada.close();
    }

    public static int calcular (int i){

        int cont = 0;

        while(true) {
            cont++;
            if(i == 1){
                break;
            }
            
            if (i % 2 != 0) {
            i = 3 * i + 1;

             } else {
            i = i / 2;
            }
        } 

        return cont;
    }
}
