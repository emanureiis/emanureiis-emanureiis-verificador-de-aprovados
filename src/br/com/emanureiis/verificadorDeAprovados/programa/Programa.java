package br.com.emanureiis.verificadorDeAprovados.programa;

import java.util.Scanner;

import br.com.emanureiis.verificadorDeAprovacao.modelos.Aluno;

/**
 * @author Emanuel Reis
 * @RA 12722211873
 */
public class Programa {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		/**
		 * Estrutura criada com a finalidade de capturar o nome,
		 * média e falta(s) de cada aluno, além de cadastrá-los
		 * em suas respectivas listas.
		 */
		for(int i=0; i<20; i++) {
			System.out.println("Digite o nome do aluno "+(i+1)+":");
			String nome = leitor.next();
			
			System.out.println("Digite a nota de "+nome);
			int nota = leitor.nextInt();
			
			System.out.println("Digite a quantidade de faltas de "+nome);
			int faltas = leitor.nextInt();
			System.out.println("\n");
			
			Aluno a = new Aluno(nome, nota, faltas);
			Aluno.cadastraAluno(a);
		}
		
		/**
		 * Invocação do método que retorna o nome e a quantidade
		 * total de todos os alunos.
		 */
		Aluno.getAlunos();
		System.out.println();
		
		/**
		 * Invocação do método que retorna o nome e a quantidade
		 * total dos alunos aprovados.
		 */
		Aluno.getAlunosAprovados();
		System.out.println();
		
		/**
		 * Invocação do método que retorna o nome e a quantidade
		 * total dos alunos reprovados.
		 */
		Aluno.getAlunosReprovados();
		System.out.println();
	}
}
