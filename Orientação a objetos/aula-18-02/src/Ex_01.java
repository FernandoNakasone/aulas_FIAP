import java.util.Scanner;

public class Ex_01 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in); 

        Aluno a = new Aluno();

        System.out.print("Digite seu RM:");
        a.rm = entrada.nextInt();

        entrada.nextLine();

        System.out.print("Digite seu nome:");
        a.nome = entrada.nextLine();
        
        System.out.print("Digite a 1º nota:");
        a.nota1 = entrada.nextDouble(); 

        System.out.print("Digite a 2º nota:");
        a.nota2 = entrada.nextDouble(); 

        System.out.println("-----------------------------------------------------------------------------");

        System.out.println("Nome:"+ a.nome );
        System.out.println("RM:" + a.rm);
        System.out.println("Média:" + a.calcularMedia());
        System.out.println("Situação:" + a.verificarSituacao());

        entrada.close();
    }
}
