package aula03;
import aula01.Date;

public class Test {
	 public static void main(String[] args) {
		Student est = new Student ("Andreia", 98505678, new Date(18, 7, 1974));
		Bolseiro bls = new Bolseiro ("Maria", 89765403, new Date(11, 5, 1976));
		bls.setBolsa(745);
	 }
}
