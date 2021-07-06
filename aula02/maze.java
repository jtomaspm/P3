package aula02;

import java.util.LinkedList;

public class maze {
	
	private char[][] maze;
	private LinkedList<String> words;
	
	public maze(char[][] maze, LinkedList<String> words) {
		this.maze = maze;
		this.words = words;
	}

	public char[][] getMaze() {
		return this.maze;
	}

	public LinkedList<String> getWords() {
		return this.words;
	}
	 
	public void generateResult() {
		for(String s : this.words) {
			getResult(s);
		}
	}
	
	private void getResult(String s){
		char[] word = s.toCharArray();
		for(int i = 0; i < word.length; i++) {
			word[i] = Character.toUpperCase(word[i]);
		}
		int xMod = 0;
		int yMod = 0;
		
		// Get First Letter
		
		for(int x = 0; x < this.maze.length; x++) {
			for (int y = 0; y < this.maze[0].length; y++) {
				if(this.maze[x][y] == word[0]) {
					coord c = new coord(x, y);
					// Get Rest
					
					try {
						for(int x1 = c.getX()-1; x < c.getX()+1; x++) {
							for(int y1 = c.getY() - 1; y < c.getY() + 1; y++) {
								if(this.maze[x1][y1]==word[1]) {
									xMod = x1 - c.getX();
									yMod = y1 - c.getY();
									boolean check = true;
									for(int l = 0; l < word.length; l++) {
										if(!(this.maze[c.getX() + (l * xMod)][c.getY() + (l * yMod)]==word[l])) {
											check = false;
										}
									}
									
									if(check) {
										String q = xMod + ", " + yMod;
										System.out.println(s + "     " + c.getX() + ", " + c.getY() + "     " + getDir(q));
									}
								}
							}
						}
					}catch(Exception e) {
						System.out.print("eheh");
					}
				}
			}
		}
		
	}
	
	private String getDir (String c) {
		switch (c) {
		case	"-1, -1" : 
			return "upleft";
				
		case	"-1, 1" : 
			return "downleft";
			
		case	"1, -1" : 
			return "uprigth";
			
		case	"1, 1" : 
			return "downrigth";
			
		case	"-1, 0" : 
			return "left";
			
		case	"0, -1" : 
			return "up";
			
		case	"1, 0" : 
			return "rigth";
			
		case	"0, 1" : 
			return "down";
		
		default:
			return "error";
		}
	}
	
}
