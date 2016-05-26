package com.Radcliffe.ImageResizerApp;
import java.awt.Graphics;

import javax.swing.JComponent;
import java.awt.Graphics2D;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.font.FontRenderContext;
import java.awt.font.TextLayout;
public class Title extends JComponent {
private String title = "Photo Resizer and Date Stamper";
private String title2 = "by: Gene Radcliffe";


private int x, y;
private int x2, y2;
private Font font = new Font("Arial", Font.BOLD, 32);

	public Title(){
				
	}
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		//create a blank canvas
	
		BufferedImage img = new BufferedImage(this.getWidth(), this.getHeight(), BufferedImage.TYPE_INT_RGB);
		Graphics2D imgcanvas = img.createGraphics();
		 imgcanvas.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

		 imgcanvas.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);		 
		FontRenderContext frc = imgcanvas.getFontRenderContext();
		
		
		//fill the canvas with a orange filled rectangle
		imgcanvas.setColor(new Color(255,200,60));
		imgcanvas.fillRect(1, 1,this.getWidth(), this.getHeight());
		
		//draw a string on the canvas
		imgcanvas.setFont(font);
		TextLayout tl = new TextLayout(title,font,frc);
		TextLayout tl2 = new TextLayout(title2,font,frc);
		//position our title center
		x = (int) ((this.getWidth()/2) - (tl.getBounds().getWidth()/2));
		y= (int) ((this.getHeight()/2) - (tl.getBounds().getHeight()/2));
		x2 = (int) ((this.getWidth()/2) - (tl2.getBounds().getWidth()/2));
		y2= (int) ((this.getHeight()/2) - (tl.getBounds().getHeight()/2));
		
		imgcanvas.setColor(new Color(50,50,50));
		tl.draw(imgcanvas, x+2, y+2);
		tl2.draw(imgcanvas, x2+2, y2+37);
		imgcanvas.setColor(new Color(255,255,255));
		tl.draw(imgcanvas, x, y);
		tl2.draw(imgcanvas, x2, y2+35);
		
		
		// create the graphics output
		Graphics2D outPut = (Graphics2D) g;
		//draw the rendered image on the control
		
		outPut.drawImage(img,1,1,this.getWidth(),this.getHeight(),null);
		outPut.dispose();
		

	}



}
