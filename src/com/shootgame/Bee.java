package com.shootgame;

import java.util.Random;

public class Bee extends FlyingObject implements Award {
	private int xSpeed = 1;
	private int ySpeed = 2;
	private int awardType;
	
	public Bee(){
		image = ShootGame.bee;
		width = image.getWidth();
		height = image.getHeight();
		y = -height;
		Random rand = new Random();
		x = rand.nextInt(ShootGame.WIDTH-width);
		awardType = rand.nextInt(2);		
	}
	
	public void step(){
		x += xSpeed;
		y += ySpeed;
		if(x<0){
			xSpeed = 1;
		}
		if(x>ShootGame.WIDTH-width){
			xSpeed = -1;
		}
	}
	
	public int getType(){
		return awardType;
	}
	
	public boolean outofBounds(){
		return y>ShootGame.HEIGHT;
	}

}
