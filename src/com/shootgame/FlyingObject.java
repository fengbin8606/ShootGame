package com.shootgame;

import java.awt.image.BufferedImage;

public abstract class FlyingObject {
	protected int width;
	protected int height;
	protected int x;
	protected int y;
	protected BufferedImage image;
	
	public abstract void step();
	
	public boolean shootBy(Bullet b){
		int x = b.x;
		int y = b.y;
		
		return x>this.x && x<this.x+width
		          &&
		       y>this.y && y<this.y+height;
	}
	
	public abstract boolean outofBounds();

}
