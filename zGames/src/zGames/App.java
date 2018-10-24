package zGames;

import javax.swing.JFrame;

public class App {
	
	public static void main(String[] args) {
		
		JFrame obj= new JFrame(); 
		GamePlay gameplay = new GamePlay();
		obj.setTitle("My first game");
	obj.setBounds(10, 10, 700, 600);
		obj.setVisible(true);
obj.setResizable(false);
obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
obj.add(gameplay); 

	}

}
