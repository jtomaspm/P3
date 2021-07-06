package aula02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;

public class prob2 {

	public static void main(String[] args) {
		File f = new File("D:/jtoma/Documents/UA/PIII/p3/src/aula02/input.txt");
		
		char[][] maze;
		LinkedList<String> words;
		try {
			Scanner sc = new Scanner(f);
			String s = "";
			while(sc.hasNextLine()) {
				s += sc.nextLine()+"\n";
			}
			System.out.println(s);
			maze = fillMaze(getMaze(s));
			words = getWords(s);
			
			maze m1 = new maze(maze, words);
			m1.generateResult();
			
			sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}
	
	public static LinkedList<String> getWords (String s) {
		LinkedList<String> words = new LinkedList<String>();
		
		for (String l : s.split("\n")) {
			for(String w : l.split(",")) {
				w = w.trim();
				if(isStringLowerCase(w)) {
					words.add(w);
				}
			}
		}
		
		return words;
	}
	
	private static boolean isStringLowerCase(String str){
        
        char[] charArray = str.toCharArray();
        
        for(int i=0; i < charArray.length; i++){
            if( !Character.isLowerCase( charArray[i] ))
                return false;
        }
        
        return true;
 
    }
	
	
	
	
	
	
	
	
	// MAZE
	
	public static char[][] fillMaze(String s) {
		int size = getMazeSize(s);
		char[][] c = new char[size][size];
		char[] sc = s.toCharArray();
		int count = 0;
		for(int x = 0; x < size; x++) {
			for(int y = 0; y < size; y++) {
				c[x][y] = sc[count];
				count++;
			}
			count++;
		}
		return c;
	}
	
	public static String getMaze(String s) {
		String r="";
		char[] c = s.toCharArray();
		
		for(char a : c) {
			if (a == '\n' || Character.isUpperCase(a)){
					r += a;
			}
		}
		System.out.println(r);
		
		return r;
	}
	
	public static int getMazeSize(String s) {
		int count = 0;
		for(char a : s.toCharArray()) {
			if (a == '\n'){
					return count;
			}else {
				count++;
			}
		}
		return count;
	}
	

}
