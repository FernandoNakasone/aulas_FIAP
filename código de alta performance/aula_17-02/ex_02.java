package fiap;

import java.util.Scanner;

public class ex_02 {

	static Scanner entrada = new Scanner(System.in);
	static final int N=30;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] RM = new int [N];
		double[] n1 = new double [N];
		double[] n2 = new double [N];
		
		int n = entradaDados(RM, n1, n2);
		
		double[] media = calculaMedia(n1, n2, n);
		
		for(int i=0;i<n;i++) {
			System.out.println("\t RM:" + RM[i] + "\t Média:" + media[i]);
		}
		
		int[] aprovados = new int[n];
		int nAp = gerarListaAprovados(RM, n, media, aprovados);
				
		System.out.println("\t Alunos Aprovados:");
		for(int i=0;i<nAp;i++) {
			System.out.println("RM:" + aprovados[i]);
		}
		
		entrada.close();
	}
	
	public static int entradaDados(int[] RM, double[] n1, double[] n2) {
		
		int n = 0;
		
		System.out.print("Informe o RM do aluno ou negativo para encerrar:");
		int rm = entrada.nextInt();
		
		while(rm > 0 && n < N) {
			RM[n] = rm;
			
			System.out.print("Digite a 1º nota do aluno(a):");
			n1[n] = entrada.nextDouble();
			
			System.out.print("Digite a 2º nota do aluno(a):");
			n2[n] = entrada.nextDouble();
			
			n++;

			System.out.print("Digie o RM do alunoou negativo para encerrar:");
			rm = entrada.nextInt();
		}
		
		return n;
	}

	public static double[] calculaMedia(double[] n1, double[] n2, int n) {
		
		double[] media = new double[N];
		
		for(int i=0;i<n;i++) {
			media[i] = (n1[i] + n2[i])/2;
		}
		
		return media;
	}

	public static int gerarListaAprovados(int[] RM, int n, double[] media, int[] aprovados) {
		int nAp = 0;
		
		for(int i=0;i<n;i++) {
			if(media[i] >= 6) {
				aprovados[nAp] = RM[i];
				nAp++;
			}
		}
		
		return nAp;
	}
	
}