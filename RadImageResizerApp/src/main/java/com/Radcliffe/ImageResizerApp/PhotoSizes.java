package com.Radcliffe.ImageResizerApp;
import java.awt.Dimension;

import javax.swing.JRadioButton;
public enum PhotoSizes {
	
	SMALL (854,480), MEDIUM(1366, 768), LARGE(1920, 1080);

	private int width;
	private int height;
	
	
	PhotoSizes(int x, int y){
		width =x;
		height =y;
	}
	public int getWidth(){
		return width; 
	}
	public int getHeight(){
		return height;
	}
}
