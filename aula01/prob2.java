package aula01;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.function.Function;
import java.util.Comparator;
import java.util.HashMap;

public class prob2 {
	
	private static LinkedList<Person> Persons = new LinkedList<Person>();
	public static void main(String[] args) {
		int z  = 0;
		Scanner sc = new Scanner(System.in);
		String[] input;	
		
		while (z == 0) {
			input = sc.nextLine().split(" ");
			String arg = "";
			for (int i = 1;i < input.length; i++) {
				arg += input[i] + " ";
			}
			if(arg.length() > 0) {
				arg = arg.substring(0, arg.length()-1);
			}
			if (input[0].equals("add")) {
				addPerson(arg);
			}else if (input[0].equals("remove")) {
				remPerson(arg);
			}else if (input[0].equals("print")) {
				printList();
			}else if(input[0].equals("exit")){
				z = 1;
			}else if(input[0].equals("sortName")) {
				sortName();
			}else if(input[0].equals("sortCC")) {
				sortCC();
			}else {
				System.out.print("invalid input \n");
			}
		}
		sc.close();

	}
	
	
	private static void addPerson (String s){
		String[] arg = s.split(" ");
		Boolean valid = false;
		int ccP = 0, count = 0, cc = 0;
		String name = " ", date;
		for(String a : arg) {
			if(a.matches("^[0-9]{8}$")) {
				valid = true;
				ccP = count;
			}
			count++;
		}
		
		if(valid) {
			for(int i = 0; i < arg.length; i++) {
				if(i<ccP) {
					name += arg[i] + " ";
				}
				if(i == ccP) {
					cc = Integer.parseInt(arg[i]);
				}
				if(i > ccP) {
					date = arg[i];
					int[] d = new int[3];
					d[0] = Integer.parseInt(date.split("/")[0]);
					d[1] = Integer.parseInt(date.split("/")[1]);
					d[2] = Integer.parseInt(date.split("/")[2]);
					Date da = new Date(d[0], d[1], d[2]);
					Person p = new Person(name, cc, da);
					Persons.add(p);
				}
			}
			
		}else {
			System.out.print("invalid syntax \n");
		}
		
	}
	
	private static void remPerson(String s) {
		int n = Integer.parseInt(s);
		Persons.remove(n);
	}
	
	private static void printList() {
		int i = 0;
		for (Person p : Persons) {
			System.out.println(i + " > " + p.toString());
			i++;
		}
	}
	
	private static void sortName() {
		Persons.sort(Comparator.comparing(Person::getName));
	}
	
	private static void sortCC() {
		Persons.sort(Comparator.comparing(Person::getCC));
	}
}
