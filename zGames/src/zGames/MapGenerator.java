package zGames;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;

public class MapGenerator {

	public int map[][]; 
	public int brickW; 
	public int brickH;
	
	public MapGenerator(int row, int col)
	{
		map= new int[row][col]; 
		for(int i =0; i<map.length;i++)
		{
			for(int j=0;j<map[0].length;j++)
			{
				map[i][j]=1; 
			}
			
		}
		brickW=540/col; 
		brickH=150/row;
		
		
	}
	public void drow(Graphics2D g)
	{
		for(int i=0;i<map.length;i++)
		{
			for(int j=0; j<map[0].length;j++)
			{ if(map[i][j]>0)
			{
				g.setColor(Color.WHITE);
				g.fillRect(j*brickW+80, i*brickH+50, brickW, brickH);
				g.setStroke(new BasicStroke(3));
				g.setColor(Color.black);
				g.drawRect(j*brickW+80, i*brickH+50, brickW, brickH);
					
			}
			
			}
			
		}
		
	}
	
	public void setBrickValue(int value, int row, int col)
	{
		map[row][col]=value; 
	}
	
	
}
