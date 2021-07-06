package aula04;
import aula03.Student;
import aula01.Date;
import aula01.Person;
import aula03.Bolseiro;

public class Test {
	 public static void main(String[] args) {
		 Student est1 = new Student("Andreia", 9855678, new Date(18, 7, 1974));
		 Student est2 = new Student("Monica", 75266454, new Date(11, 8, 1978));
		 Student est3 = new Student("Jose", 85265426, new Date(15, 2, 1976));
		 Student est4 = new Student("Manuel", 85153442, new Date(1, 3, 1973));
	Bolseiro bls1 = new Bolseiro("Maria", 8976543, new Date(12, 5, 1976));
	Bolseiro bls2 = new Bolseiro("Xico", 872356522, new Date(21, 4, 1975));
	Bolseiro bls3 = new Bolseiro("Duarte", 32423512, new Date(6, 1, 1976));
	bls1.setBolsa(745);
	bls2.setBolsa(845);
	bls3.setBolsa(745);
	Professor pf1 = new Professor("Jose Manuel", 11223344, new Date(11, 9, 1969));
	Disciplina dis = new Disciplina("P5", "Informatica", 6, pf1);
	dis.addAluno(est1);
	dis.addAluno(est2);
	dis.addAluno(bls1);
	if (dis.alunoInscrito(est3.nMec()))
	System.out.println("\n" + est3
	+ " \n\t-> EST� inscrito na Disciplina");
	else
	System.out.println("\n" + est3
	+ " \n\t-> N�O EST� inscrito na Disciplina");
	System.out.println("\nN� de Alunos Inscritos: " + dis.numAlunos());
	dis.addAluno(est3);
	dis.addAluno(bls2);
	dis.addAluno(est4);
	dis.addAluno(bls3);
	if (!dis.addAluno(bls3))
	System.out.println(bls3.nMec() + ", " + bls3.nome()
	+ " j� est� inscrito nesta disciplina!");
	if (dis.delAluno(bls2.nMec()))
	System.out.println(bls2.nome() + " Removido!");
	System.out.println("\nN� de Alunos Inscritos: " + dis.numAlunos());
	System.out.println(dis + "\n");
	System.out.println("\n Listagem de Estudantes:");
	for (Person e : dis.getAlunoss())
	 System.out.println(e);
	System.out.println("\n Listagem de Bolseiros:");
	for (Person e : dis.getAlunos("Bolseiro"))
	 System.out.println(e);
	 }
	}
