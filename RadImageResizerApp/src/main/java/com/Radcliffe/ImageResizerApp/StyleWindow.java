package com.Radcliffe.ImageResizerApp;
import com.radcliffe.Forms.*;

import com.radcliffe.utilities.ImageResizer;
import javax.swing.JDialog;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsEnvironment;
import java.awt.font.FontRenderContext;
import java.awt.font.TextLayout;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;
import javax.swing.JComponent;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JColorChooser;
import javax.swing.BorderFactory;
import java.awt.SystemColor;
import javax.swing.SpringLayout;
import javax.swing.JComboBox;
import java.awt.GridLayout;
import java.awt.Color;

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
	private JLabel lblFontSize,lblFont, lblFontStyle, lblFontColor; 
	private JComboBox cmbFonts, cmbFontStyle, cmbFontSize;
	private SpringLayout springLayout;
	private Banner banner;
	private TextLayout foreGround;
	private TextLayout backGround;
	private Color color;
	private String fonts[];
	
	public StyleWindow(){
		
		InitializeGUI();
	
	}
	
	private String[] loadFonts(){
		
		return GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		
	}
	
	private void InitializeGUI(){
		//super("Font and Color", new Dimension(600,300));
		
		this.setTitle("Font and Style");
		this.setSize(new Dimension(600,300));
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		fonts = loadFonts();
		String[] fontStyle = {"Italic", "Bold"};
		Integer[] size = {8, 10,11,12,14,16,18,20,22,24,26,28,30};
		lblFont = new JLabel("Font Name");
		
		lblFontStyle  = new JLabel("Font Style");
		lblFontSize = new JLabel("Font Size");
		lblFontColor  = new JLabel("Font Color");
		
		cmbFonts = new JComboBox(fonts);
		cmbFontSize = new JComboBox(size);
		cmbFontStyle = new JComboBox(fontStyle);
	
		buttonOk= new JButton("OK");
		buttonExit = new JButton("Exit");
		
		 		
		banner = new Banner("Arial", Font.BOLD, 32);
		banner.setString("Text Sample...");
		
		mainPanel = new JPanel();
		this.setLayout(new GridLayout(2,1,1,1));
		springLayout = new SpringLayout();
		mainPanel.setLayout(springLayout);
		mainPanel.add(lblFont);
		mainPanel.add(cmbFonts);
		 
		 springLayout.putConstraint(SpringLayout.WEST, lblFont, 5, SpringLayout.WEST, mainPanel);
		 springLayout.putConstraint(SpringLayout.NORTH, lblFont, 5, SpringLayout.NORTH, mainPanel);

	    // Adjust constraints for the text field so it's at
	    // (<label's right edge> + 5, 5).
		 springLayout.putConstraint(SpringLayout.WEST, cmbFontStyle, 5, SpringLayout.EAST, lblFontStyle);
		 springLayout.putConstraint(SpringLayout.NORTH, cmbFontStyle, 5, SpringLayout.NORTH, mainPanel);
		 
		 mainPanel.add(lblFontStyle);
		 mainPanel.add(cmbFontStyle);
		 
		 springLayout.putConstraint(SpringLayout.WEST, lblFontStyle, 5, SpringLayout.WEST, mainPanel);
		 springLayout.putConstraint(SpringLayout.NORTH, lblFontStyle, 5, SpringLayout.NORTH, mainPanel);

	    // Adjust constraints for the text field so it's at
	    // (<label's right edge> + 5, 5).
		 springLayout.putConstraint(SpringLayout.WEST, cmbFonts, 5, SpringLayout.EAST, lblFont);
		 springLayout.putConstraint(SpringLayout.NORTH, cmbFonts, 5, SpringLayout.NORTH, mainPanel);


		
		mainPanel.setBorder(BorderFactory.createEtchedBorder());
		
		this.add(banner);
		this.add(mainPanel);
		this.setVisible(true);
			
	}
	
	
	
	
}
