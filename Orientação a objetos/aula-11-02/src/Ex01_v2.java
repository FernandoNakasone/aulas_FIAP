import java.util.Scanner;

public class Ex01_v2 {
    
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int n;

        System.out.print("Digite um número:");
        n = entrada.nextInt();

        verificarParImpar(n);
        
        entrada.close();
    }

    public static void verificarParImpar (int n){
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
    }
}
