package com.Radcliffe.ImageResizerApp;
import com.radcliffe.Forms.*;
import com.radcliffe.utilities.ImageResizer;
import javax.swing.JDialog;
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

public class StyleWindow extends JDialog {
	private static StyleConfiguration styleConfig;
	private JPanel mainPanel;
	private JComboBox comboBoxFont;
	private JButton buttonOk, buttonExit;
	private SpringLayout sLayout;
	private Banner banner;
	private TextLayout foreGround;
	private TextLayout backGround;
	
	public StyleWindow(){
		
		//super("Font and Color", new Dimension(600,300));
		this.setTitle("Font and Style");
		this.setSize(new Dimension(600,300));
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		banner = new Banner("Arial", Font.BOLD, 32);
		banner.setString("Text Sample...");
		mainPanel = new JPanel();
			
		
		sLayout = new SpringLayout();
		this.setLayout(new GridLayout(2,1,1,1));
		
		mainPanel.setBorder(BorderFactory.createEtchedBorder());
		
		this.add(banner);
		this.add(mainPanel);
		this.setVisible(true);
		
	}
	
	
	
	
	
}
