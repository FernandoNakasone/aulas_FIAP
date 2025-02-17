package fiap;

import java.util.Scanner;

public class ex_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		final int N=30;
		
		int[] RM = new int [N];
		double[] n1 = new double [N];
		double[] n2 = new double [N];
		double[] media = new double[N];
		int n=0;
		
		System.out.print("Informe o RM do aluno ou negativo para encerrar:");
		int rm = entrada.nextInt();
		
		while(rm > 0 && n < N) {
			RM[n] = rm;
			
			System.out.print("Digite a 1º nota do aluno(a):");
			n1[n] = entrada.nextDouble();
			
			System.out.print("Digite a 2º nota do aluno(a):");
			n2[n] = entrada.nextDouble();
			
			media[n] = (n1[n] + n2[n])/2;
			
			n++;

			System.out.print("Digie o RM do alunoou negativo para encerrar:");
			rm = entrada.nextInt();
		}
		
		System.out.println("\t RM e média de cada aluno da sala");
				
		for(int i=0;i<n;i++) {
			System.out.println("\t RM:" + RM[i] + "\t Média:" + media[i]);
		}
		
		int[] aprovados = new int[n];
		int nAp = 0;
		
		for(int i=0;i<n;i++) {
			if(media[i] >= 6) {
				aprovados[nAp] = RM[i];
				nAp++;
			}
		}
		
		System.out.println("\t Alunos Aprovados:");
		for(int i=0;i<nAp;i++) {
			System.out.println("RM:" + aprovados[i]);
		}
		
		entrada.close();
	}

}
