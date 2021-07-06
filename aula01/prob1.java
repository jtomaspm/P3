package aula01;
import java.util.Scanner;

public class prob1 {

	public static void main(String[] args) {
		System.out.println("Escreva qualquer coisa: ");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		System.out.print("a) Total de caracteres numéricos (0..9). \n" + Nums(s) + "\n");
		System.out.print("b) Indicar se só tem minúsculas. \n" + Min(s) + "\n");
		System.out.print("c) Indicar se só tem maiúsculas. \n" + Cap(s) + "\n");
		System.out.print(Words(s) + "\n");
		System.out.print("e) Imprimir uma nova String na qual todos os caracteres foram trocados 2 a 2 \n" + Swap(s) + "\n");
		
		sc.close();
	}
	
	private static int Nums (String s) {
		int count = 0;
		for(int i = 0; i < s.length(); i++) {
			if(Character.isDigit(s.charAt(i))) {
				count++;
			}
		}
		
		return count;
	}
	
	private static Boolean Min (String s) {
		int count = 0;
		for(int i = 0; i < s.length(); i++) {
			if(Character.isLowerCase(s.charAt(i)) || Character.isWhitespace(s.charAt(i))) {
				count++;
			}
		}
		if(count == s.length())
			return true;
		else
			return false;
	}
	
	private static Boolean Cap (String s) {
		int count = 0;
		for(int i = 0; i < s.length(); i++) {
			if(Character.isUpperCase(s.charAt(i)) || Character.isWhitespace(s.charAt(i))) {
				count++;
			}
		}
		if(count == s.length())
			return true;
		else
			return false;
	}
	
	
	private static int Words (String s) {
		String[] sp = s.split(" ");
		System.out.print("d) Total de palavras lidas, imprimindo-as no ecrã. \n");
		for(String word : sp) {
			System.out.println(word);
		}
 		return sp.length;
	}
	
	private static String Swap (String s) {
		char t;
		char[] c = s.toCharArray();
		String r = "";
		for(int i = 0; i<s.length() - 1; i+=2) {
			t = c[i];
			c[i]=c[i+1];
			c[i+1] = t;
		}
		for (char x : c) {
			r+=x;
		}
		return r;
	}
}
