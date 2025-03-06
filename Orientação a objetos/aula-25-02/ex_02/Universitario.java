package ex_02;

import java.util.Scanner;

public class Universitario{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.print("informe o RM do aluno:");
        aluno.rm = Integer.valueOf(entrada.nextLine());

        System.out.println("Informe as disciplinas cursadas");
        for (int i=0;i<3;i++){
            System.out.print("Informe a " + (i+1) + "º disciplina:");
            aluno.disciplinas[i] = entrada.nextLine();
        }

        System.out.println(" ");
        System.out.println("Informe as notas do aluno");
        System.out.println(" ");

        for (int i=0;i<3;i++){
            System.out.println("Informe as notas da disciplina " + aluno.disciplinas[i] + ":");

            for (int n=0;n<2;n++){
                System.out.print("Informe a nota " + (n+1) + ":");
                aluno.notas[i][n] = Double.valueOf(entrada.nextLine());
            }

            System.out.println(" ");
        }

        System.out.println(" ");


            System.out.println("Situação do aluno");
            for (int i=0;i<3;i++){
                System.out.println(" ");
                System.out.println("Disciplina:" + aluno.disciplinas[i]);
                System.out.println("Media:" + aluno.calcularMedia()[i]);
                System.out.println("Situação:" + aluno.verificaSitu()[i]);
            }
        entrada.close();
    }
}
