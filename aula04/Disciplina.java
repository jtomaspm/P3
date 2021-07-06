package aula04;
import java.util.Arrays;
import java.util.LinkedList;

import aula01.Person;
import aula03.Student;
import aula03.Bolseiro;

public class Disciplina {
	
	private String nome;
	private String area;
	private int ects;
	private Professor responsavel;
	private LinkedList<Person> Alunos;
	
	public Disciplina(String nome, String area, int ects, Professor responsavel, Student[] Alunos) {
		this.nome = nome;
		this.area = area;
		this.ects = ects;
		this.responsavel = responsavel;
		this.Alunos = new LinkedList(Arrays.asList(Alunos));
	}
	
	public Disciplina(String nome, String area, int ects, Professor responsavel) {
		this.nome = nome;
		this.area = area;
		this.ects = ects;
		this.responsavel = responsavel;
		this.Alunos = new LinkedList<Person>();
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getArea() {
		return this.area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public int getEcts() {
		return this.ects;
	}

	public void setEcts(int ects) {
		this.ects = ects;
	}

	public Professor getResponsavel() {
		return this.responsavel;
	}

	public void setResponsavel(Professor responsavel) {
		this.responsavel = responsavel;
	}
	
	public LinkedList<Person> getAlunoss() {
		return this.Alunos;
	}
	
	public LinkedList<Person> getAlunos(String tipo) {
		LinkedList<Person> temp = new LinkedList<Person>();
		for (Person es : this.Alunos) {
			if (es.getType().equals(tipo)) {
				temp.add(es);
			}
		}
		return temp;
	}

	public void setAlunos(Student[] alunos) {
		this.Alunos = new LinkedList(Arrays.asList(alunos));
	}
	
	public boolean addAluno(Person est) {
		if(this.Alunos.contains(est)) {
			return false;
		}
		return this.Alunos.add(est);
	}
	
	public boolean delAluno(int nMec) {
		String nMecS = "" + nMec;
		return this.Alunos.remove(this.Alunos.stream().filter(Student -> nMecS.equals(Student.nMecToString())).findFirst().orElse(null));
	}
	
	public boolean alunoInscrito(int nMec) {
		String nMecS = "" + nMec;
		return this.Alunos.contains(this.Alunos.stream().filter(Student -> nMecS.equals(Student.nMecToString())).findFirst().orElse(null));
	}
	
	public int numAlunos() {
		return this.Alunos.size();
	}
	
	public String toString() {
		return this.nome +"\n"+
			   this.area +"\n"+
			   this.ects +"\n"+
			   this.responsavel +"\n"+
			   this.Alunos;
	}

}
