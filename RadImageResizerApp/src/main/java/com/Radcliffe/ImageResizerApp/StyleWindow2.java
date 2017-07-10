package com.Radcliffe.ImageResizerApp;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import com.radcliffe.Forms.Banner;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JColorChooser;

import java.awt.Dialog;
import java.awt.Component;
import javax.swing.JColorChooser;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import java.awt.event.ActionEvent;

public class StyleWindow2 {
	private static StyleConfiguration styleConfig;
	private String[] fonts;
	private String[] fontStyle = {"Italic", "Bold"};
	private Integer[] size = {8, 10,11,12,14,16,18,20,22,24,26,28,30};
	private Color textColor = Color.black; // Default Foreground Color is Black;
	private Color shadowColor = Color.white; //Default Shadow Color is White;
	private Banner banner;
	private JFrame frame;
	private JColorChooser colorChooser;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StyleWindow2 window = new StyleWindow2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public StyleWindow2() {
		initialize();
		frame.setVisible(true);
	}

	private String[] loadFonts(){
		
		return GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 652, 394);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(2, 0, 0, 0));

		
		banner = new Banner("Arial", Font.BOLD, 32);
		banner.setString("Text Sample...");
		
		JPanel displayPanel = new JPanel();
		frame.getContentPane().add(banner);
		
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel);
		SpringLayout sl_panel = new SpringLayout();
		panel.setLayout(sl_panel);
		
		JLabel lblNewLabel = new JLabel("Fonts:");
		sl_panel.putConstraint(SpringLayout.NORTH, lblNewLabel, 26, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, lblNewLabel, 20, SpringLayout.WEST, panel);
		panel.add(lblNewLabel);
		fonts = loadFonts();
		JComboBox cmbFont = new JComboBox(fonts);
		sl_panel.putConstraint(SpringLayout.NORTH, cmbFont, -3, SpringLayout.NORTH, lblNewLabel);
		sl_panel.putConstraint(SpringLayout.WEST, cmbFont, 37, SpringLayout.EAST, lblNewLabel);
		sl_panel.putConstraint(SpringLayout.EAST, cmbFont, -376, SpringLayout.EAST, panel);
		panel.add(cmbFont);
		
		JLabel lblNewLabel_1 = new JLabel("Font Style:");
		sl_panel.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 19, SpringLayout.SOUTH, lblNewLabel);
		sl_panel.putConstraint(SpringLayout.WEST, lblNewLabel_1, 0, SpringLayout.WEST, lblNewLabel);
		panel.add(lblNewLabel_1);
		
		JComboBox cmbFontStyle = new JComboBox(fontStyle);
		sl_panel.putConstraint(SpringLayout.NORTH, cmbFontStyle, 13, SpringLayout.SOUTH, cmbFont);
		sl_panel.putConstraint(SpringLayout.WEST, cmbFontStyle, 5, SpringLayout.EAST, lblNewLabel_1);
		sl_panel.putConstraint(SpringLayout.EAST, cmbFontStyle, 0, SpringLayout.EAST, cmbFont);
		panel.add(cmbFontStyle);
		
		JLabel lblFontSize = new JLabel("Font Size:");
		sl_panel.putConstraint(SpringLayout.NORTH, lblFontSize, 18, SpringLayout.SOUTH, lblNewLabel_1);
		sl_panel.putConstraint(SpringLayout.WEST, lblFontSize, 0, SpringLayout.WEST, lblNewLabel);
		panel.add(lblFontSize);
		
		JComboBox cmbFontSize = new JComboBox(size);
		sl_panel.putConstraint(SpringLayout.NORTH, cmbFontSize, 9, SpringLayout.SOUTH, cmbFontStyle);
		sl_panel.putConstraint(SpringLayout.WEST, cmbFontSize, 11, SpringLayout.EAST, lblFontSize);
		sl_panel.putConstraint(SpringLayout.EAST, cmbFontSize, 0, SpringLayout.EAST, cmbFont);
		panel.add(cmbFontSize);
		
		JLabel lblFontColor = new JLabel("Font Color:");
		sl_panel.putConstraint(SpringLayout.WEST, lblFontColor, 0, SpringLayout.WEST, lblNewLabel);
		sl_panel.putConstraint(SpringLayout.SOUTH, lblFontColor, -10, SpringLayout.SOUTH, panel);
		panel.add(lblFontColor);
		
		JButton btnApply = new JButton("Apply");
		btnApply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		sl_panel.putConstraint(SpringLayout.SOUTH, btnApply, 0, SpringLayout.SOUTH, lblNewLabel);
		sl_panel.putConstraint(SpringLayout.EAST, btnApply, -78, SpringLayout.EAST, panel);
		panel.add(btnApply);
		
		JButton btnCancel = new JButton("Cancel");
		sl_panel.putConstraint(SpringLayout.NORTH, btnCancel, -4, SpringLayout.NORTH, lblNewLabel_1);
		sl_panel.putConstraint(SpringLayout.WEST, btnCancel, 0, SpringLayout.WEST, btnApply);
		panel.add(btnCancel);
		
		JButton btnChooseColor = new JButton("Choose Color");
		
		btnChooseColor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnChooseColor_Clicked(arg0);
			}
		});
		
	
		sl_panel.putConstraint(SpringLayout.NORTH, btnChooseColor, 6, SpringLayout.SOUTH, cmbFontSize);
		sl_panel.putConstraint(SpringLayout.WEST, btnChooseColor, 1, SpringLayout.EAST, lblFontColor);
		sl_panel.putConstraint(SpringLayout.EAST, btnChooseColor, 0, SpringLayout.EAST, cmbFont);
		panel.add(btnChooseColor);
	}
	
	private void btnChooseColor_Clicked(ActionEvent e){
		Color initialColor = Color.black;
		textColor = JColorChooser.showDialog(frame, "Choose text Color", initialColor);
		styleConfig.setFontColor(textColor);
		System.out.println(textColor);
		banner.setForeGroundColor(textColor);
	
	}
}
