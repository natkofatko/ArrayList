package zGames;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePlay extends JPanel implements KeyListener, ActionListener {
	// declare variables
	private boolean play = false;
	private int score = 0;
	private int totalBricks = 21;
	private Timer time;
	private int delay = 1;
	private int playerX = 310;
	private int ballPosX = 120;
	private int ballDirX = -1;
	private int ballPosY=350; 
	private int ballDirY = -2;
	MapGenerator map; 
	
	// constructor
	public GamePlay() {
		map = new MapGenerator(3, 7); 
		addKeyListener(this);
		setFocusable(true);
		setFocusTraversalKeysEnabled(false);
		time = new Timer(1, this);
		time.start();
	}

	// add a function

	public void paint(Graphics g) {
		// background
		g.setColor(Color.BLACK);
		g.fillRect(1, 1, 692, 592);
		map.drow((Graphics2D)g);

		// borders
		g.setColor(Color.yellow);
		g.fillRect(0, 0, 3, 592);
		g.fillRect(0, 0, 692, 3);
		g.fillRect(691, 0, 3, 592);

		// the paddle
		g.setColor(Color.pink);
		g.fillRect(playerX, 550, 100, 8);
		
		//
		if(ballPosY>570) 
		{
			play=false; 
			ballDirX=0;
			ballDirY=0;
			g.setColor(Color.red);
			g.setFont(new Font("Serif",Font.BOLD,40));
			g.drawString("Press Enter to restart", 230, 350);
			 
		}
		if(totalBricks<=0)
		{
			play=false; 
			ballDirX=0;
			ballDirY=0;
			g.setColor(Color.red);
			g.setFont(new Font("Serif",Font.BOLD,40));
			g.drawString("You won congratulation", 230, 350);
			 
		}

		// score
		g.setColor(Color.GREEN);
		g.setFont(new Font("Serif", Font.BOLD,30));
		g.drawString(""+score, 590, 30);
		
		// ball
		g.setColor(Color.RED);
		g.fillOval(ballPosX, ballPosY, 20, 20);
		g.dispose();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		time.start();
	if(play) 
	{ 
		if(new Rectangle(ballPosX,ballPosY,20,20).intersects(new Rectangle(playerX, 550, 100, 8)))
		{
		ballDirY= -ballDirY; 	
		}
		
	A:	for(int i=0; i<map.map.length;i++)
		{
			for(int j=0; j<map.map[0].length; j++)
			{
				if(map.map[i][j]>0){
					int brickX=j*map.brickW+80;
					int brickY=i*map.brickW+50;
					int brickWidth=map.brickW;
					int brickHeight=map.brickW;
				
					
					
					Rectangle rec = new Rectangle(brickX, brickY, brickHeight, brickWidth);
					Rectangle ballRec = new Rectangle(ballPosX, ballPosY, 20, 20);
					Rectangle brickRect = rec; 
					if(ballRec.intersects(brickRect))
					{
						map.setBrickValue(0, i, j);
						totalBricks--;
						score+=5;
						if (ballPosX+19<=brickRect.x||ballPosX+1>=brickRect.x+brickRect.width)
								{
							ballDirX=-ballDirX;
								}
						else {ballDirY=ballDirY; 
						}
						break A; 
					
					}
				}
			}
		}
		
		ballPosX+=ballDirX ;
	ballPosY+=ballDirY; }
	if(ballPosX<0) { ballDirX= -ballDirX; }
	if(ballPosY<0) { ballDirY= -ballDirY; }
	if(ballPosY>670) { ballDirX= -ballDirX; }
	
	repaint(); 

	}

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			if (playerX >= 600) {
				playerX = 600;
			} else {
				play = true;
				playerX += 20;
			}

		}
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			if (playerX < 10) {
				playerX = 10;
			} else {
				play = true;
				playerX -= 20;
			}
		}
		if (e.getKeyCode()==KeyEvent.VK_ENTER)
		{
			if(!play)
			{
				play=true;
				ballPosX=120;
				ballPosY=350;
				ballDirX=-1;
				ballDirY=-2; 
				playerX=350;
				totalBricks=21;
				score=0;
				map=new MapGenerator(3, 7); 
			}
		}

		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

}
