package br.com.emanureiis.verificadorDeAprovacao.modelos;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Emanuel Reis
 * @RA 12722211873
 */
public class Aluno {
	private String nome;
	private int nota;
	private int faltas;
	private String situacaoAcademica;
	
	private static List<Aluno> listaDeAlunos = new ArrayList<>();
	private static List<Aluno> listaDeAlunosAprovados = new ArrayList<>();
	private static List<Aluno> listaDeAlunosReprovados = new ArrayList<>();
	
	
	/**
	 * Construtor do objeto Aluno.
	 */
	public Aluno (String nome, int nota, int faltas) {
		this.nome = nome;
		this.nota = nota;
		this.faltas = faltas;
	}
	
	
	/**
	 * O método cadastraAluno verifica se o aluno atingiu a média 
	 * e define a situação acadêmica do mesmo de acordo com o resultado.
	 * Além disso, este método adiciona os alunos aprovados para uma lista,
	 * e adiciona os alunos reprovados para outra lista.
	 */
	public static void cadastraAluno(Aluno a) {
		if (a.faltas > 15) {
			a.situacaoAcademica = ("Reprovado");
			listaDeAlunosReprovados.add(a);
		} else if (a.nota < 70) {
			a.situacaoAcademica = ("Reprovado");
			listaDeAlunosReprovados.add(a);
		} else {
			a.situacaoAcademica = ("Aprovado");
			listaDeAlunosAprovados.add(a);
		}
		listaDeAlunos.add(a);
		
	}
	
	/**
	 * Imprime no console a relação completa de todos os
	 * alunos que passaram pelo cadastro.
	 */
	public static void getAlunos(){
		System.out.println(("\n-------- Relação de alunos --------"));							
		int total = 0;
		for(Aluno a : listaDeAlunos) {
			System.out.println(a.toString());
			total++;
		}	
		System.out.println("Total: "+total);
		System.out.println("---------------------------------------");
	}
	
	/**
	 * Imprime no console a relação completa de todos os
	 * alunos que foram reprovados, além da qtd total.
	 */
	public static void getAlunosReprovados(){
		System.out.println(("\n-------- Alunos reprovados --------")); 
		int total = 0;
		for(Aluno a : listaDeAlunosReprovados) {
			System.out.println(a.nome);
			total++;
		}
		System.out.println("- Total: "+total);
		System.out.println("---------------------------------------");
	}
	
	/**
	 * Imprime no console a relação completa de todos os
	 * alunos que foram aprovados, além da qtd total.
	 */
	public static void getAlunosAprovados(){
		System.out.println(("\n-------- Alunos aprovados --------"));
		int total = 0;
		for(Aluno a : listaDeAlunosAprovados) {
			System.out.println(a.nome);
			total++;
		}
		System.out.println("- Total: "+total);
		System.out.println("---------------------------------------");
	}
	
	/**
	 * Subscrevi o método toString para que o nome e a situação
	 * do aluno sejam retornados.
	 */
	@Override
	public String toString() {
		return "Aluno: " +this.nome+
				"\nSituação: " +this.situacaoAcademica+"\n";
	}
	
}
