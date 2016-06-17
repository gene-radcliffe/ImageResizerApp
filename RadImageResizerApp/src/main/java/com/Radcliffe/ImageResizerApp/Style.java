package com.Radcliffe.ImageResizerApp;
import com.radcliffe.Forms.*;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.font.FontRenderContext;
import java.awt.font.TextLayout;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;
import javax.swing.JComponent;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.BorderFactory;
import java.awt.SystemColor;
import javax.swing.SpringLayout;
import javax.swing.JComboBox;
import java.awt.GridLayout;
enum Colors{
	RED("red"), BLUE("blue"), LIGHTGREEN("light green"), GREEN("green"), CYAN("cyan"), BLACK("black"), DARKGRAY("dark gray"), GRAY("gray"), WHITE("white"),	MAGENTA("magenta"), ORANGE("orange"), PINK("pink"), YELLOW("yellow");
	
	private String _color;
	
	Colors(String color){
		_color=color;
	}
}

public class Style extends WinForm {
	private JPanel panel1;
	private JComboBox comboBoxFont;
	private JButton buttonOk, buttonExit;
	private SpringLayout sLayout;
	private Banner banner;
	private TextLayout foreGround;
	private TextLayout backGround;
	
	public Style(){
		
		super("Font and Color", new Dimension(600,300));
		banner = new Banner("Arial", Font.BOLD, 32);
		banner.setString("Text Sample...");
		panel1 = new JPanel();
			
		
		sLayout = new SpringLayout();
		this.setLayout(new GridLayout(2,1,1,1));
		
		panel1.setBorder(BorderFactory.createEtchedBorder());
		
		this.add(banner);
		this.add(panel1);
		this.setVisible(true);
		
	}
	
	
	
	
	
}
