package com.shootgame;

import java.util.Random;

public class Airplane extends FlyingObject implements Enemy {
	private int speed = 2;
	
	public Airplane(){
		image = ShootGame.airplane;
		width = image.getWidth();
		height = image.getHeight();
		y = -height;
		Random rand = new Random();
		x = rand.nextInt(ShootGame.WIDTH-width);
	}
	
	public void step(){
		y += speed;
	}
	
	public int getScore(){
		return 5;
	}
	
	public boolean outofBounds(){
		return y>ShootGame.HEIGHT;
	}

}
