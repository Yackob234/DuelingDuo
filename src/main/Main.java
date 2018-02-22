package main;

import hsa_ufa.Console;
import java.awt.*;
import java.util.*;
import java.util.Random;

public class Main {

	static Console c = new Console(1920, 1060, "Dueling Duo by Matt, Alex, Samson & Jacob");

	public static void main(String[] args) throws InterruptedException{

		Player p1 = new Player();
		Player p2 = new Player();
		boolean p1Win = false;
		boolean p2Win = false;
		
//		Initializing all images
		Image bulletS, tankBaseN, tankBaseE, tankBaseS, tankBaseW, tankBaseNE, tankBaseNW, tankBaseSE, tankBaseSW,
				tankTurretN, tankTurretE, tankTurretS, tankTurretW, tankTurretNE, tankTurretNW, tankTurretSE,
				tankTurretSW, tankBaseNBlue, tankBaseEBlue, tankBaseSBlue, tankBaseWBlue,
				tankBaseNEBlue, tankBaseNWBlue, tankBaseSEBlue, tankBaseSWBlue, tankTurretNBlue, tankTurretEBlue,
				tankTurretSBlue, tankTurretWBlue, tankTurretNEBlue, tankTurretNWBlue, tankTurretSEBlue,
				tankTurretSWBlue, heart, duelL, duelR, startL, startR, bg;
		
//		Blue tank images
		tankBaseNBlue = Toolkit.getDefaultToolkit()
				.getImage(c.getClass().getClassLoader().getResource("main/tankBaseNBlue.png"));
		tankBaseEBlue = Toolkit.getDefaultToolkit()
				.getImage(c.getClass().getClassLoader().getResource("main/tankBaseEBlue.png"));
		tankBaseSBlue = Toolkit.getDefaultToolkit()
				.getImage(c.getClass().getClassLoader().getResource("main/tankBaseSBlue.png"));
		tankBaseWBlue = Toolkit.getDefaultToolkit()
				.getImage(c.getClass().getClassLoader().getResource("main/tankBaseWBlue.png"));
		tankBaseNEBlue = Toolkit.getDefaultToolkit()
				.getImage(c.getClass().getClassLoader().getResource("main/tankBaseNEBlue.png"));
		tankBaseNWBlue = Toolkit.getDefaultToolkit()
				.getImage(c.getClass().getClassLoader().getResource("main/tankBaseNWBlue.png"));
		tankBaseSEBlue = Toolkit.getDefaultToolkit()
				.getImage(c.getClass().getClassLoader().getResource("main/tankBaseSEBlue.png"));
		tankBaseSWBlue = Toolkit.getDefaultToolkit()
				.getImage(c.getClass().getClassLoader().getResource("main/tankBaseSWBlue.png"));
		tankTurretNBlue = Toolkit.getDefaultToolkit()
				.getImage(c.getClass().getClassLoader().getResource("main/tankTurretNBlue.png"));
		tankTurretEBlue = Toolkit.getDefaultToolkit()
				.getImage(c.getClass().getClassLoader().getResource("main/tankTurretEBlue.png"));
		tankTurretSBlue = Toolkit.getDefaultToolkit()
				.getImage(c.getClass().getClassLoader().getResource("main/tankTurretSBlue.png"));
		tankTurretWBlue = Toolkit.getDefaultToolkit()
				.getImage(c.getClass().getClassLoader().getResource("main/tankTurretWBlue.png"));
		tankTurretNEBlue = Toolkit.getDefaultToolkit()
				.getImage(c.getClass().getClassLoader().getResource("main/tankTurretNEBlue.png"));
		tankTurretNWBlue = Toolkit.getDefaultToolkit()
				.getImage(c.getClass().getClassLoader().getResource("main/tankTurretNWBlue.png"));
		tankTurretSEBlue = Toolkit.getDefaultToolkit()
				.getImage(c.getClass().getClassLoader().getResource("main/tankTurretSEBlue.png"));
		tankTurretSWBlue = Toolkit.getDefaultToolkit()
				.getImage(c.getClass().getClassLoader().getResource("main/tankTurretSWBlue.png"));
		
//		Green tank images
		tankBaseN = Toolkit.getDefaultToolkit()
				.getImage(c.getClass().getClassLoader().getResource("main/tankBaseN.png"));
		tankBaseE = Toolkit.getDefaultToolkit()
				.getImage(c.getClass().getClassLoader().getResource("main/tankBaseE.png"));
		tankBaseS = Toolkit.getDefaultToolkit()
				.getImage(c.getClass().getClassLoader().getResource("main/tankBaseS.png"));
		tankBaseW = Toolkit.getDefaultToolkit()
				.getImage(c.getClass().getClassLoader().getResource("main/tankBaseW.png"));
		tankBaseNE = Toolkit.getDefaultToolkit()
				.getImage(c.getClass().getClassLoader().getResource("main/tankBaseNE.png"));
		tankBaseNW = Toolkit.getDefaultToolkit()
				.getImage(c.getClass().getClassLoader().getResource("main/tankBaseNW.png"));
		tankBaseSE = Toolkit.getDefaultToolkit()
				.getImage(c.getClass().getClassLoader().getResource("main/tankBaseSE.png"));
		tankBaseSW = Toolkit.getDefaultToolkit()
				.getImage(c.getClass().getClassLoader().getResource("main/tankBaseSW.png"));
		tankTurretN = Toolkit.getDefaultToolkit()
				.getImage(c.getClass().getClassLoader().getResource("main/tankTurretN.png"));
		tankTurretE = Toolkit.getDefaultToolkit()
				.getImage(c.getClass().getClassLoader().getResource("main/tankTurretE.png"));
		tankTurretS = Toolkit.getDefaultToolkit()
				.getImage(c.getClass().getClassLoader().getResource("main/tankTurretS.png"));
		tankTurretW = Toolkit.getDefaultToolkit()
				.getImage(c.getClass().getClassLoader().getResource("main/tankTurretW.png"));
		tankTurretNE = Toolkit.getDefaultToolkit()
				.getImage(c.getClass().getClassLoader().getResource("main/tankTurretNE.png"));
		tankTurretNW = Toolkit.getDefaultToolkit()
				.getImage(c.getClass().getClassLoader().getResource("main/tankTurretNW.png"));
		tankTurretSE = Toolkit.getDefaultToolkit()
				.getImage(c.getClass().getClassLoader().getResource("main/tankTurretSE.png"));
		tankTurretSW = Toolkit.getDefaultToolkit()
				.getImage(c.getClass().getClassLoader().getResource("main/tankTurretSW.png"));
		
//		Bullet Image
		bulletS = Toolkit.getDefaultToolkit()
				.getImage(c.getClass().getClassLoader().getResource("main/bullet.png"));
				
//		bg Image
		bg = Toolkit.getDefaultToolkit()
				.getImage(c.getClass().getClassLoader().getResource("main/bg.jpg"));
		
//		Heart Image
		heart = Toolkit.getDefaultToolkit().getImage(c.getClass().getClassLoader().getResource("main/Heart.png"));
		duelL = Toolkit.getDefaultToolkit().getImage(c.getClass().getClassLoader().getResource("main/duelL.png"));
		duelR = Toolkit.getDefaultToolkit().getImage(c.getClass().getClassLoader().getResource("main/duelR.png"));
		startL = Toolkit.getDefaultToolkit().getImage(c.getClass().getClassLoader().getResource("main/startL.png"));
		startR = Toolkit.getDefaultToolkit().getImage(c.getClass().getClassLoader().getResource("main/startR.png"));
		
		c.clear();
		boolean start;
		//start 80,740
		//duel 80,930
		
		//trying to fix a bad choice
		int heightOfText = c.getHeight() - 40;
    	while (true) {
				synchronized(c){
				c.clear();
				c.drawImage(duelL, 300, 0,(int)Math.round(heightOfText / 11.625) , 	heightOfText);
				c.drawImage(duelR, c.getDrawWidth()-300 - (int)Math.round(heightOfText / 11.625), 0 , (int)Math.round(heightOfText / 11.625) , heightOfText);
				c.drawImage(startL, 200, (c.getHeight() - (int)Math.round((heightOfText / 11.625)*9.375))/2,(int)Math.round(heightOfText / 11.625) ,(int)Math.round((heightOfText / 11.625)*9.375));
				c.drawImage(startR, c.getDrawWidth()-200 - (int)Math.round(heightOfText / 11.625), (c.getHeight() - (int)Math.round((heightOfText / 11.625)*9.375))/2 , (int)Math.round(heightOfText / 11.625) , (int)Math.round((heightOfText / 11.625)*9.375));
				c.fillRect(0, c.getHeight() - 40, 10, 1);
				}
				if (c.isKeyDown(c.VK_ENTER) == true) {
				start = true;
				break;
			}
				Thread.sleep(8);
		}
    	boolean midHeart = true;
    	int time = 10;
    	int Bx[] = new int[0];
    	int By[] = new int[0];
    	int BDir[] = new int[0];
    	int BRic[] = new int[0];
    	int empty[] = new int[0];
    	int bounceLimit = 2;
        int loser = 0;
        p1.x = (c.getWidth()/4) - 32;
        p1.y = (c.getHeight()/2) - 32;
        p2.x = ((c.getWidth()/4)*3) - 32;
        p2.y = (c.getHeight()/2) - 32;
        int heartSize = 64;
        
    	while(start){
    		synchronized (c) {
    			c.clear();
    			
    			c.drawImage(bg, 0, 0, c.getWidth(), c.getHeight()-40);
    			
    			// tank movement
    			if (p1.keyUp && p1.keyRight) {
    				c.drawImage(tankBaseNE, p1.x, p1.y, p1.width+p1.width/2, p1.height+p1.height/2);
    				c.drawImage(tankTurretNE, p1.x, p1.y, p1.width+p1.width/2, p1.height+p1.height/2);
    				p1.bulletDirection = 1;
    				p1.prevDir = 1;
    			} else if (p1.keyUp && p1.keyLeft) {
    				c.drawImage(tankBaseNW, p1.x, p1.y, p1.width+p1.width/2, p1.height+p1.height/2);
    				c.drawImage(tankTurretNW, p1.x, p1.y, p1.width+p1.width/2, p1.height+p1.height/2);
    				p1.bulletDirection = 7;
    				p1.prevDir = 7;
    			} else if (p1.keyDown && p1.keyRight) {
    				c.drawImage(tankBaseSE, p1.x, p1.y, p1.width+p1.width/2, p1.height+p1.height/2);
    				c.drawImage(tankTurretSE, p1.x, p1.y, p1.width+p1.width/2, p1.height+p1.height/2);
    				p1.bulletDirection = 3;
    				p1.prevDir = 3;
    			} else if (p1.keyDown && p1.keyLeft) {
    				c.drawImage(tankBaseSW, p1.x, p1.y, p1.width+p1.width/2, p1.height+p1.height/2);
    				c.drawImage(tankTurretSW, p1.x, p1.y, p1.width+p1.width/2, p1.height+p1.height/2);
    				p1.bulletDirection = 5;
    				p1.prevDir = 5;
    			} else if (p1.keyUp) {
    				c.drawImage(tankBaseN, p1.x, p1.y, p1.width, p1.height);
    				c.drawImage(tankTurretN, p1.x, p1.y, p1.width, p1.height);
    				p1.bulletDirection = 0;
    				p1.prevDir = 0;
    			} else if (p1.keyRight) {
    				c.drawImage(tankBaseE, p1.x, p1.y, p1.width, p1.height);
    				c.drawImage(tankTurretE, p1.x, p1.y, p1.width, p1.height);
    				p1.bulletDirection = 2;
    				p1.prevDir = 2;
    			} else if (p1.keyDown) {
    				c.drawImage(tankBaseS, p1.x, p1.y, p1.width, p1.height);
    				c.drawImage(tankTurretS, p1.x, p1.y, p1.width, p1.height);
    				p1.bulletDirection = 4;
    				p1.prevDir = 4;
    			} else if (p1.keyLeft) {
    				c.drawImage(tankBaseW, p1.x, p1.y, p1.width, p1.height);
    				c.drawImage(tankTurretW, p1.x, p1.y, p1.width, p1.height);
    				p1.bulletDirection = 6;
    				p1.prevDir = 6;
    			} else {
    				if (p1.prevDir == 1) {
    					c.drawImage(tankBaseNE, p1.x, p1.y, p1.width+p1.width/2, p1.height+p1.height/2);
    					c.drawImage(tankTurretNE, p1.x, p1.y, p1.width+p1.width/2, p1.height+p1.height/2);
    				} else if (p1.prevDir == 7) {
    					c.drawImage(tankBaseNW, p1.x, p1.y, p1.width+p1.width/2, p1.height+p1.height/2);
    					c.drawImage(tankTurretNW, p1.x, p1.y, p1.width+p1.width/2, p1.height+p1.height/2);

    				} else if (p1.prevDir == 3) {
    					c.drawImage(tankBaseSE, p1.x, p1.y, p1.width+p1.width/2, p1.height+p1.height/2);
    					c.drawImage(tankTurretSE, p1.x, p1.y, p1.width+p1.width/2, p1.height+p1.height/2);

    				} else if (p1.prevDir == 5) {
    					c.drawImage(tankBaseSW, p1.x, p1.y, p1.width+p1.width/2, p1.height+p1.height/2);
    					c.drawImage(tankTurretSW, p1.x, p1.y, p1.width+p1.width/2, p1.height+p1.height/2);

    				} else if (p1.prevDir == 0) {
    					c.drawImage(tankBaseN, p1.x, p1.y, p1.width, p1.height);
    					c.drawImage(tankTurretN, p1.x, p1.y, p1.width, p1.height);

    				} else if (p1.prevDir == 2) {
    					c.drawImage(tankBaseE, p1.x, p1.y, p1.width, p1.height);
    					c.drawImage(tankTurretE, p1.x, p1.y, p1.width, p1.height);

    				} else if (p1.prevDir == 4) {
    					c.drawImage(tankBaseS, p1.x, p1.y, p1.width, p1.height);
    					c.drawImage(tankTurretS, p1.x, p1.y, p1.width, p1.height);

    				} else if (p1.prevDir == 6) {
    					c.drawImage(tankBaseW, p1.x, p1.y, p1.width, p1.height);
    					c.drawImage(tankTurretW, p1.x, p1.y, p1.width, p1.height);

    				}
    			}
    			
    			if (p2.keyUp && p2.keyRight) {
    				c.drawImage(tankBaseNEBlue, p2.x, p2.y, p2.width+p2.width/2, p2.height+p2.height/2);
    				c.drawImage(tankTurretNEBlue, p2.x, p2.y, p2.width+p2.width/2, p2.height+p2.height/2);
    				p2.bulletDirection = 1;
    				p2.prevDir = 1;
    			} else if (p2.keyUp && p2.keyLeft) {
    				c.drawImage(tankBaseNWBlue, p2.x, p2.y, p2.width+p2.width/2, p2.height+p2.height/2);
    				c.drawImage(tankTurretNWBlue, p2.x, p2.y, p2.width+p2.width/2, p2.height+p2.height/2);
    				p2.bulletDirection = 7;
    				p2.prevDir = 7;
    			} else if (p2.keyDown && p2.keyRight) {
    				c.drawImage(tankBaseSEBlue, p2.x, p2.y, p2.width+p2.width/2, p2.height+p2.height/2);
    				c.drawImage(tankTurretSEBlue, p2.x, p2.y, p2.width+p2.width/2, p2.height+p2.height/2);
    				p2.bulletDirection = 3;
    				p2.prevDir = 3;
    			} else if (p2.keyDown && p2.keyLeft) {
    				c.drawImage(tankBaseSWBlue, p2.x, p2.y, p2.width+p2.width/2, p2.height+p2.height/2);
    				c.drawImage(tankTurretSWBlue, p2.x, p2.y, p2.width+p2.width/2, p2.height+p2.height/2);
    				p2.bulletDirection = 5;
    				p2.prevDir = 5;
    			} else if (p2.keyUp) {
    				c.drawImage(tankBaseNBlue, p2.x, p2.y, p2.width, p2.height);
    				c.drawImage(tankTurretNBlue, p2.x, p2.y, p2.width, p2.height);
    				p2.bulletDirection = 0;
    				p2.prevDir = 0;
    			} else if (p2.keyRight) {
    				c.drawImage(tankBaseEBlue, p2.x, p2.y, p2.width, p2.height);
    				c.drawImage(tankTurretEBlue, p2.x, p2.y, p2.width, p2.height);
    				p2.bulletDirection = 2;
    				p2.prevDir = 2;
    			} else if (p2.keyDown) {
    				c.drawImage(tankBaseSBlue, p2.x, p2.y, p2.width, p2.height);
    				c.drawImage(tankTurretSBlue, p2.x, p2.y, p2.width, p2.height);
    				p2.bulletDirection = 4;
    				p2.prevDir = 4;
    			} else if (p2.keyLeft) {
    				c.drawImage(tankBaseWBlue, p2.x, p2.y, p2.width, p2.height);
    				c.drawImage(tankTurretWBlue, p2.x, p2.y, p2.width, p2.height);
    				p2.bulletDirection = 6;
    				p2.prevDir = 6;
    			} else {
    				if (p2.prevDir == 1) {
    					c.drawImage(tankBaseNEBlue, p2.x, p2.y, p2.width+p2.width/2, p2.height+p2.height/2);
    					c.drawImage(tankTurretNEBlue, p2.x, p2.y, p2.width+p2.width/2, p2.height+p2.height/2);
    				} else if (p2.prevDir == 7) {
    					c.drawImage(tankBaseNWBlue, p2.x, p2.y, p2.width+p2.width/2, p2.height+p2.height/2);
    					c.drawImage(tankTurretNWBlue, p2.x, p2.y, p2.width+p2.width/2, p2.height+p2.height/2);

    				} else if (p2.prevDir == 3) {
    					c.drawImage(tankBaseSEBlue, p2.x, p2.y, p2.width+p2.width/2, p2.height+p2.height/2);
    					c.drawImage(tankTurretSEBlue, p2.x, p2.y, p2.width+p2.width/2, p2.height+p2.height/2);

    				} else if (p2.prevDir == 5) {
    					c.drawImage(tankBaseSWBlue, p2.x, p2.y, p2.width+p2.width/2, p2.height+p2.height/2);
    					c.drawImage(tankTurretSWBlue, p2.x, p2.y, p2.width+p2.width/2, p2.height+p2.height/2);

    				} else if (p2.prevDir == 0) {
    					c.drawImage(tankBaseNBlue, p2.x, p2.y, p2.width, p2.height);
    					c.drawImage(tankTurretNBlue, p2.x, p2.y, p2.width, p2.height);

    				} else if (p2.prevDir == 2) {
    					c.drawImage(tankBaseEBlue, p2.x, p2.y, p2.width, p2.height);
    					c.drawImage(tankTurretEBlue, p2.x, p2.y, p2.width, p2.height);

    				} else if (p2.prevDir == 4) {
    					c.drawImage(tankBaseSBlue, p2.x, p2.y, p2.width, p2.height);
    					c.drawImage(tankTurretSBlue, p2.x, p2.y, p2.width, p2.height);

    				} else if (p2.prevDir == 6) {
    					c.drawImage(tankBaseWBlue, p2.x, p2.y, p2.width, p2.height);
    					c.drawImage(tankTurretWBlue, p2.x, p2.y, p2.width, p2.height);

    				}
    			}
    			
    			// bullet movement
    			for (int i = 0; i < Bx.length; i++) {
    				c.drawImage(bulletS, Bx[i], By[i], 32, 32);
    				if (BDir[i] == 1) {
    					By[i] -= 7;
    					Bx[i] += 7;
    				} else if (BDir[i] == 7) {
    					By[i] -= 7;
    					Bx[i] -= 7;

    				} else if (BDir[i] == 3) {
    					By[i] += 7;
    					Bx[i] += 7;
    				} else if (BDir[i] == 5) {
    					By[i] += 7;
    					Bx[i] -= 7;

    				} else if (BDir[i] == 0) {
    					By[i] -= 7;

    				} else if (BDir[i] == 2) {
    					Bx[i] += 7;

    				} else if (BDir[i] == 4) {
    					By[i] += 7;

    				} else if (BDir[i] == 6) {
    					Bx[i] -= 7;

    				}

    			}
    			
    			// displays lives
    			
    			if (p1.lives == 3) {
    				c.drawImage(heart, 10, 10, heartSize, heartSize);
    				c.drawImage(heart, 15+heartSize, 10, heartSize, heartSize);
    				c.drawImage(heart, 20+heartSize+heartSize, 10, heartSize, heartSize);
    			} else if (p1.lives == 2) {
    				c.drawImage(heart, 10, 10, heartSize, heartSize);
    				c.drawImage(heart, 15+heartSize, 10, heartSize, heartSize);
    			} else if (p1.lives == 1) {
    				c.drawImage(heart, 10, 10, heartSize, heartSize);
    			}
    			if (p2.lives == 3) {
    				c.drawImage(heart, c.getWidth()-10-heartSize, 10, heartSize, heartSize);
    				c.drawImage(heart, c.getWidth()-heartSize-15-heartSize, 10, heartSize, heartSize);
    				c.drawImage(heart, c.getWidth()-heartSize-20-heartSize-heartSize, 10, heartSize, heartSize);
    			} else if (p2.lives == 2) {
    				c.drawImage(heart, c.getWidth()-10-heartSize, 10, heartSize, heartSize);
    				c.drawImage(heart, c.getWidth()-heartSize-15-heartSize, 10, heartSize, heartSize);
    			} else if (p2.lives == 1) {
    				c.drawImage(heart, c.getWidth()-10-heartSize, 10, heartSize, heartSize);
    			}
    			
    			// middle heart
    			if(midHeart == true){
    			    c.drawImage(heart, c.getWidth()/2-heartSize/2,c.getHeight()/2-heartSize/2+2, heartSize, heartSize);
    			    if (checkColl(p1.x, p1.y, p1.width, p1.height, c.getWidth()/2-heartSize/2, c.getHeight()/2-heartSize/2+2, heartSize, heartSize)) {
					    p1.lives++;	
					    midHeart = false;
				    }
				    if (checkColl(p2.x, p2.y, p2.width, p2.height, c.getWidth()/2-heartSize/2, c.getHeight()/2-heartSize/2+2, heartSize, heartSize)) {
				    	p2.lives++;
					    midHeart = false;
			    	}
    			}
    		
    		}

    			// tank movement
    			if (p1.moveRight == true) {
    				if (c.isKeyDown('D')) {
    					p1.keyRight = true;
    				} else {
    					p1.keyRight = false;
    				}
    			} else {
    				p1.keyRight = false;
    			}
    			if (p1.moveLeft == true) {
    				if (c.isKeyDown('A')) {
    					p1.keyLeft = true;
    				} else {
    					p1.keyLeft = false;
    				}
    			} else {
    				p1.keyLeft = false;
    			}
    			if (p1.moveUp == true) {
    				if (c.isKeyDown('W')) {
    					p1.keyUp = true;
    				} else {
    					p1.keyUp = false;
    				}
    			} else {
    				p1.keyUp = false;
    			}
    			if (p1.moveDown == true) {
    				if (c.isKeyDown('S')) {
    					p1.keyDown = true;
    				} else {
    					p1.keyDown = false;
    				}
    			} else {
    				p1.keyDown = false;
    			}
    			
    			if (p1.keyDown == true) {
    				p1.y += 2;
    			}
    			if (p1.keyUp == true) {
    				p1.y -= 2;
    			}
    			if (p1.keyRight == true) {
    				p1.x += 2;
    			}
    			if (p1.keyLeft == true) {
    				p1.x -= 2;
    			}
    			
    			
    			if (p2.moveRight == true) {
    				if (c.isKeyDown('L')) {
    					p2.keyRight = true;
    				} else {
    					p2.keyRight = false;
    				}
    			} else {
    				p2.keyRight = false;
    			}
    			if (p2.moveLeft == true) {
    				if (c.isKeyDown('J')) {
    					p2.keyLeft = true;
    				} else {
    					p2.keyLeft = false;
    				}
    			} else {
    				p2.keyLeft = false;
    			}
    			if (p2.moveUp == true) {
    				if (c.isKeyDown('I')) {
    					p2.keyUp = true;
    				} else {
    					p2.keyUp = false;
    				}
    			} else {
    				p2.keyUp = false;
    			}
    			if (p2.moveDown == true) {
    				if (c.isKeyDown('K')) {
    					p2.keyDown = true;
    				} else {
    					p2.keyDown = false;
    				}
    			} else {
    				p2.keyDown = false;
    			}
    			
    			if (p2.keyDown == true) {
    				p2.y += 2;
    			}
    			if (p2.keyUp == true) {
    				p2.y -= 2;
    			}
    			if (p2.keyRight == true) {
    				p2.x += 2;
    			}
    			if (p2.keyLeft == true) {
    				p2.x -= 2;
    			}
    			
    			// shooting
    			if (c.isKeyDown('E')) {
					p1.keyAttack = true;
				} else {
				    p1.keyAttack = false;
				}
				if (c.isKeyDown('O')) {
					p2.keyAttack = true;
				} else {
				    p2.keyAttack = false;
				}
				
                if (p1.keyAttack == true && p1.timer <= 0) {
    				int newABx[] = new int[Bx.length + 1];
    				int newABy[] = new int[By.length + 1];
    				int newABdir[] = new int[BDir.length + 1];
    				int newABric[] = new int[BRic.length + 1];

    				for (int i = 0; i < Bx.length; i++) {
    					newABx[i] = Bx[i];
    					newABy[i] = By[i];
    					newABdir[i] = BDir[i];
    					newABric[i] = BRic[i];

    				}
    				Bx = newABx;
    				By = newABy;
    				BDir = newABdir;
    				BRic = newABric;

    				if (p1.prevDir == 1) {
    					Bx[Bx.length - 1] = p1.x + 32*2;
    					By[By.length - 1] = p1.y;
    					BDir[BDir.length - 1] = p1.prevDir;
    				} else if (p1.prevDir == 7) {
    					Bx[Bx.length - 1] = p1.x - 16*2;
    					By[By.length - 1] = p1.y - 16*2;
    					BDir[BDir.length - 1] = p1.prevDir;
    				} else if (p1.prevDir == 3) {
    					Bx[Bx.length - 1] = p1.x + 32*2;
    					By[By.length - 1] = p1.y + 32*2;
    					BDir[BDir.length - 1] = p1.prevDir;
    				} else if (p1.prevDir == 5) {
    					Bx[Bx.length - 1] = p1.x;
    					By[By.length - 1] = p1.y + 32*2;
    					BDir[BDir.length - 1] = p1.prevDir;
    				} else if (p1.prevDir == 0) {
    					Bx[Bx.length - 1] = p1.x + 8*2;
    					By[By.length - 1] = p1.y - 16*2;
    					BDir[BDir.length - 1] = p1.prevDir;
    				} else if (p1.prevDir == 2) {
    					Bx[Bx.length - 1] = p1.x + 32*2;
    					By[By.length - 1] = p1.y + 8*2;
    					BDir[BDir.length - 1] = p1.prevDir;
    				} else if (p1.prevDir == 4) {
    					Bx[Bx.length - 1] = p1.x + 8*2;
    					By[By.length - 1] = p1.y + 32*2;
    					BDir[BDir.length - 1] = p1.prevDir;
    				} else if (p1.prevDir == 6) {
    					Bx[Bx.length - 1] = p1.x - 16*2;
    					By[By.length - 1] = p1.y + 8*2;
    					BDir[BDir.length - 1] = p1.prevDir;
    				}
    				BRic[BRic.length - 1] = 0;
    				p1.timer = 40;
    			}
    			
    			
    			if (p2.keyAttack == true && p2.timer <= 0) {
    				int newABx[] = new int[Bx.length + 1];
    				int newABy[] = new int[By.length + 1];
    				int newABdir[] = new int[BDir.length + 1];
    				int newABric[] = new int[BRic.length + 1];

    				for (int i = 0; i < Bx.length; i++) {
    					newABx[i] = Bx[i];
    					newABy[i] = By[i];
    					newABdir[i] = BDir[i];
    					newABric[i] = BRic[i];

    				}
    				Bx = newABx;
    				By = newABy;
    				BDir = newABdir;
    				BRic = newABric;

    				if (p2.prevDir == 1) {
    					Bx[Bx.length - 1] = p2.x + 32*2;
    					By[By.length - 1] = p2.y;
    					BDir[BDir.length - 1] = p2.prevDir;
    				} else if (p2.prevDir == 7) {
    					Bx[Bx.length - 1] = p2.x - 16*2;
    					By[By.length - 1] = p2.y - 16*2;
    					BDir[BDir.length - 1] = p2.prevDir;
    				} else if (p2.prevDir == 3) {
    					Bx[Bx.length - 1] = p2.x + 32*2;
    					By[By.length - 1] = p2.y + 32*2;
    					BDir[BDir.length - 1] = p2.prevDir;
    				} else if (p2.prevDir == 5) {
    					Bx[Bx.length - 1] = p2.x;
    					By[By.length - 1] = p2.y + 32*2;
    					BDir[BDir.length - 1] = p2.prevDir;
    				} else if (p2.prevDir == 0) {
    					Bx[Bx.length - 1] = p2.x + 8*2;
    					By[By.length - 1] = p2.y - 16*2;
    					BDir[BDir.length - 1] = p2.prevDir;
    				} else if (p2.prevDir == 2) {
    					Bx[Bx.length - 1] = p2.x + 32*2;
    					By[By.length - 1] = p2.y + 8*2;
    					BDir[BDir.length - 1] = p2.prevDir;
    				} else if (p2.prevDir == 4) {
    					Bx[Bx.length - 1] = p2.x + 8*2;
    					By[By.length - 1] = p2.y + 32*2;
    					BDir[BDir.length - 1] = p2.prevDir;
    				} else if (p2.prevDir == 6) {
    					Bx[Bx.length - 1] = p2.x - 16*2;
    					By[By.length - 1] = p2.y + 8*2;
    					BDir[BDir.length - 1] = p2.prevDir;
    				}
    				BRic[BRic.length - 1] = 0;
    				p2.timer = 40;
    			}

    			// collision with console
    			if (p1.x < 8) {
    				p1.x = 8;
    			}
    			if (p1.x > c.getWidth()/2-64) {
    				p1.x = c.getWidth()/2-64;
    			}
    			if (p1.y > c.getHeight()-80){
    				p1.y = c.getHeight()-80;
    			}
    			if (p1.y < 85) {
    				p1.y = 85;
    			}
    			
    			if (p2.x < c.getWidth()/2+8) {
    				p2.x = c.getWidth()/2+8;
    			}
    			if (p2.x > c.getWidth()-64) {
    				p2.x = c.getWidth()-64;
    			}
    			if (p2.y > c.getHeight()-80) {
    				p2.y = c.getHeight()-80;
    			}
    			if (p2.y < 85) {
    				p2.y = 85;
    			}

    			// Left wall collision (bullet)
    			for (int i = 0; i < Bx.length; i++) {
    				if (Bx[i] < 8*2) {
    					int newDir = bounceBulletV(BDir[i]);
    					BRic[i] += 1;
    					BDir[i] = newDir;
    					Bx[i] += bulletExtraMoveV(newDir);
    				}
    			}

    			// Right wall collision (bullet)
    			for (int i = 0; i < Bx.length; i++) {
    				if (Bx[i] > c.getWidth()-24*2) {
    					int newDir = bounceBulletV(BDir[i]);
    					BRic[i] += 1;
    					BDir[i] = newDir;
    					Bx[i] += bulletExtraMoveV(newDir);
    				}
    			}

    			// Top wall collision (bullet)
    			for (int i = 0; i < By.length; i++) {
    				if (By[i] < 8*2) {
    					int newDir = bounceBulletH(BDir[i]);
    					BRic[i] += 1;
    					BDir[i] = newDir;
    					By[i] += bulletExtraMoveH(newDir);
    				}
    			}

    			// Bottom wall collision (bullet)
    			for (int i = 0; i < By.length; i++) {
    				if (By[i] > c.getHeight()-24*2) {
    					int newDir = bounceBulletH(BDir[i]);
    					BRic[i] += 1;
    					BDir[i] = newDir;
    					By[i] += bulletExtraMoveH(newDir);
    				}
    			}

    			// Delete bullet once it exceeds bounce limit
    			for (int i = 0; i < Bx.length; i++) {
    				if (BRic[i] >= bounceLimit) {

    					BRic[i] = BRic[BRic.length - 1];
    					BDir[i] = BDir[BDir.length - 1];
    					Bx[i] = Bx[Bx.length - 1];
    					By[i] = By[By.length - 1];

    					int newArrayX[] = new int[Bx.length - 1];
    					int newArrayDir[] = new int[BDir.length - 1];
    					int newArrayY[] = new int[By.length - 1];
    					int newArrayRic[] = new int[BRic.length - 1];

    					for (int l = 0; l < BRic.length - 1; l++) {

    						newArrayX[l] = Bx[l];
    						newArrayY[l] = By[l];
    						newArrayDir[l] = BDir[l];
    						newArrayRic[l] = BRic[l];

    					}

    					BRic = newArrayRic;
    					Bx = newArrayX;
    					By = newArrayY;
    					BDir = newArrayDir;
    				}

    			}	
    			
    			// collision
    			// player with walls
    			p1.moveRight = true;
    			p1.moveLeft = true;
    			p1.moveUp = true;
    			p1.moveDown = true;
    			p2.moveRight = true;
    			p2.moveLeft = true;
    			p2.moveUp = true;
    			p2.moveDown = true;
    			// TODO:

    			// Player & Bullet Collision
    			for (int i = 0; i < Bx.length; i++) {
    				if (checkColl(Bx[i], By[i], 16*2, 16*2, p1.x, p1.y, p1.width, p1.height) == true) {
    					
    						p1.lives--;

    						BRic[i] = BRic[BRic.length - 1];
    						BDir[i] = BDir[BDir.length - 1];
    						Bx[i] = Bx[Bx.length - 1];
    						By[i] = By[By.length - 1];

    						int newArrayX[] = new int[Bx.length - 1];
    						int newArrayDir[] = new int[BDir.length - 1];
    						int newArrayY[] = new int[By.length - 1];
    						int newArrayRic[] = new int[BRic.length - 1];

    						for (int l = 0; l < BRic.length - 1; l++) {

    							newArrayX[l] = Bx[l];
    							newArrayY[l] = By[l];
    							newArrayDir[l] = BDir[l];
    							newArrayRic[l] = BRic[l];

    						}

    						BRic = newArrayRic;
    						Bx = newArrayX;
    						By = newArrayY;
    						BDir = newArrayDir;
                            break;
    					
    				}
    				if (checkColl(Bx[i], By[i], 16*2, 16*2, p2.x, p2.y, p2.width, p2.height) == true) {
    					
    						p2.lives--;

    						BRic[i] = BRic[BRic.length - 1];
    						BDir[i] = BDir[BDir.length - 1];
    						Bx[i] = Bx[Bx.length - 1];
    						By[i] = By[By.length - 1];

    						int newArrayX[] = new int[Bx.length - 1];
    						int newArrayDir[] = new int[BDir.length - 1];
    						int newArrayY[] = new int[By.length - 1];
    						int newArrayRic[] = new int[BRic.length - 1];

    						for (int l = 0; l < BRic.length - 1; l++) {

    							newArrayX[l] = Bx[l];
    							newArrayY[l] = By[l];
    							newArrayDir[l] = BDir[l];
    							newArrayRic[l] = BRic[l];

    						}

    						BRic = newArrayRic;
    						Bx = newArrayX;
    						By = newArrayY;
    						BDir = newArrayDir;
    					
    				}
    			}

    			if (p1.lives <= 0) {
    			    loser = 1;
                    break;
    			} else if (p2.lives <= 0){
    			    loser = 2;
    			    break;
    			}

    			p1.timer--;
    			p2.timer--;

    			Thread.sleep(8);

    		}
    		
    		// ending screen
    	c.setFont(new Font("SansSerif", 0, 50));
    		while (loser == 1) {
    			synchronized (c) {
    				c.clear();
    				c.drawImage(bg, 0, 0, c.getWidth(), c.getHeight()-40);
    				p2.x = (c.getWidth()/2)-32;
    				p2.y = ((c.getHeight()-heartSize-4)/2)-32;
    			
    				c.drawImage(tankBaseNBlue, p2.x, p2.y, p2.width, p2.height);
    				c.drawImage(tankTurretNBlue, p2.x, p2.y, p2.width, p2.height);
    				c.setColor(Color.BLUE);
    				c.drawString("Blue Wins", (c.getWidth()/2)-110, c.getHeight() - 100);
    				
    				
    			}

    			if (c.isKeyDown(c.VK_ENTER)) {
    				Thread.sleep(100);
    				main(args);
    			}

    			Thread.sleep(10);
    		}
    		
    		while (loser == 2) {
    			synchronized (c) {
    				c.clear();
    				c.drawImage(bg, 0, 0, c.getWidth(), c.getHeight()-40);
    				p1.x = (c.getWidth()/2)-32;
    				p1.y = ((c.getHeight()-heartSize-4)/2)-32;
    				
    				c.drawImage(tankBaseN, p1.x, p1.y, p1.width, p1.height);
    				c.drawImage(tankTurretN, p1.x, p1.y, p1.width, p1.height);
    				c.setColor(Color.GREEN);
    				c.drawString("Green Wins", (c.getWidth()/2)-140, c.getHeight() - 100);
    			}

    			if (c.isKeyDown(c.VK_ENTER)) {
    				Thread.sleep(100);
    				main(args);
    			}

    			Thread.sleep(10);
    		}

		}

    public static int bounceBulletH(int dir) {
    	if (dir == 1) {
    		return dir = 3;
    	} else if (dir == 3) {
    		return dir = 1;
    	} else if (dir == 7) {
    		return dir = 5;
    	} else if (dir == 5) {
    		return dir = 7;
    	} else if (dir == 0) {
    		return dir = 4;
    	} else if (dir == 4) {
    		return dir = 0;
    	} else {
    		return dir;
    	}

    }

    public static int bounceBulletV(int dir) {
    	if (dir == 1) {
    		return dir = 7;
    	} else if (dir == 7) {
    		return dir = 1;
    	} else if (dir == 2) {
    		return dir = 6;
    	} else if (dir == 6) {
    		return dir = 2;
    	} else if (dir == 3) {
    		return dir = 5;
    	} else if (dir == 5) {
    		return dir = 3;
    	} else {
    		return dir;
    	}

    }

    public static int bulletExtraMoveV(int dir) {
    	if (dir == 1) {
    		return 2;
    	} else if (dir == 7) {
    		return -2;
    	} else if (dir == 2) {
    		return 2;
    	} else if (dir == 6) {
    		return -2;
    	} else if (dir == 3) {
    		return 2;
    	} else if (dir == 5) {
    		return -2;
    	} else {
    		return 2;
    	}
    }

    public static int bulletExtraMoveH(int dir) {
    	if (dir == 1) {
    		return -2;
    	} else if (dir == 3) {
    		return 2;
    	} else if (dir == 7) {
    		return -2;
    	} else if (dir == 5) {
    		return 2;
    	} else if (dir == 0) {
    		return -2;
    	} else if (dir == 4) {
    		return 2;
    	} else {
    		return 2;
    	}
    }

    public static boolean checkColl(int x1, int y1, int wid1, int hei1, int x2, int y2, int wid2, int hei2) {

    	if (x2 < x1 + wid1 && x2 > x1) {
    		if (y2 < y1 + hei1 && y2 > y1) {
    			return true;
    		}
    	}
    	if (x2 + wid2 < x1 + wid1 && x2 + wid2 > x1) {
    		if (y2 + hei2 < y1 + hei1 && y2 + hei2 > y1) {
    			return true;
    		}
    	}
    	if (x2 < x1 + wid1 && x2 > x1) {
    		if (y2 + hei2 < y1 + hei1 && y2 + hei2 > y1) {
    			return true;
    		}
    	}
    	if (x2 + wid2 < x1 + wid1 && x2 + wid2 > x1) {
    		if (y2 < y1 + hei1 && y2 > y1) {
    			return true;
    		}
    	}
    	if (x1 < x2 + wid2 && x1 > x2) {
    		if (y1 < y2 + hei2 && y1 > y2) {
    			return true;
    		}
    	}
    	if (x1 + wid1 < x2 + wid2 && x1 + wid1 > x2) {
    		if (y1 + hei1 < y2 + hei2 && y1 + hei1 > y2) {
    			return true;
    		}
    	}
    	if (x1 < x2 + wid2 && x1 > x2) {
    		if (y1 + hei1 < y2 + hei2 && y1 + hei1 > y2) {
    			return true;
    		}
    	}
    	if (x1 + wid1 < x2 + wid2 && x1 + wid1 > x2) {
    		if (y1 < y2 + hei2 && y1 > y2) {
    			return true;
    		}
    	}

    	return false;

    }

    public static int checkCollB(int x1, int y1, int wid1, int hei1, int x2, int y2, int wid2, int hei2) {

    	boolean topLeft = false;
    	boolean topRight = false;
    	boolean bottomLeft = false;
    	boolean bottomRight = false;

    	if (x1 < x2 + wid2 && x1 > x2) {
    		if (y1 < y2 + hei2 && y1 > y2) {
    			topLeft = true;
    		}
    	}
    	if (x1 + wid1 < x2 + wid2 && x1 + wid1 > x2) {
    		if (y1 + hei1 < y2 + hei2 && y1 + hei1 > y2) {
    			bottomRight = true;
    		}
    	}
    	if (x1 < x2 + wid2 && x1 > x2) {
    		if (y1 + hei1 < y2 + hei2 && y1 + hei1 > y2) {
    			bottomLeft = true;
    		}
    	}
    	if (x1 + wid1 < x2 + wid2 && x1 + wid1 > x2) {
    		if (y1 < y2 + hei2 && y1 > y2) {
    			topRight = true;
    		}
    	}

    	if (topLeft && topRight) {
    		return 1;
    	}
    	if (bottomLeft && bottomRight) {
    		return 1;
    	}
    	if (bottomRight && topRight) {
    		return 2;
    	}
    	if (topLeft && bottomLeft) {
    		return 2;
    	}
    	return 2;

    }

    public static int randX(int px){
    	Random rand = new Random();
    	
        int xPos = rand.nextInt(25 * 32) + 32;
        int xDiff = (xPos - px);
    	    if(xDiff < 50 && (px - xPos) > -50){
    	        randX(px);
    	    }
    	    return xPos;
    }

    public static int randY(int py){
    	Random rand = new Random();
    	
        int yPos = rand.nextInt(16 * 32) + 32; 
        int yDiff = (yPos - py);
        
    	    if(yDiff < 50 && (py - yPos) > -50){
    	        randY(py);
    	    } 
    	    
    	    return yPos;
    	    
    }
    
}