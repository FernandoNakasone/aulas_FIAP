import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex_04 {
    
    public static void main(String[] args) {
     
        Scanner entrada = new Scanner(System.in);
        DecimalFormat fM = new DecimalFormat("R$#0.00");
        Professor professor = new Professor();

        System.out.print("Digite o nome do professor(a):");
        professor.nome = entrada.nextLine();

        System.out.print("Digite o número de aulas semanais:");
        professor.numAulasSemanal = entrada.nextInt();

        System.out.print("Digite o valor de cada aula:");
        professor.valorAula = entrada.nextDouble();

        System.out.println("-------------------------------------------------");

        System.out.println("Nome do professor(a):" + professor.nome);
        System.out.println("Salario Base:" + fM.format(professor.salarioBase()));
        System.out.println("Adicional hora e atividade:" + fM.format(professor.horaAtividade()));
        System.out.println("Descanso remunerado:" + fM.format(professor.descansoRemunerado()));
        System.out.println("Salario bruto:" + fM.format(professor.salarioBruto()));
        
        entrada.close();
    }
}
