import java.util.Scanner;

public class Ex01 {
    
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int n = 0;

        System.out.print("Digite um número:");
        n = entrada.nextInt();

        while(true) {
            System.out.print(n + " ");

            if(n == 1){
                break;
            }
            
            if (n % 2 != 0) {
            n = 3 * n + 1;
             } else {
            n = n / 2;
            }
        } 
        entrada.close();
    }
}
