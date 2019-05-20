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
	private String[] fontStyle = {"Italic", "Bold", "Plain"};
	private Integer[] size = {8, 10,11,12,14,16,18,20,22,24,26,28,30,32};
	private Color textColor = styleConfig.getFontColor();
	private Color shadowColor = styleConfig.getShadowColor();
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
		frame.setResizable(false);
		frame.setBounds(100, 100, 652, 394);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
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
		
		cmbFont.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				cmbFont_Item_Selected(arg0);
			}
			
		});
		JLabel lblNewLabel_1 = new JLabel("Font Style:");
		sl_panel.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 19, SpringLayout.SOUTH, lblNewLabel);
		sl_panel.putConstraint(SpringLayout.WEST, lblNewLabel_1, 0, SpringLayout.WEST, lblNewLabel);
		panel.add(lblNewLabel_1);
		
		JComboBox cmbFontStyle = new JComboBox(fontStyle);
		sl_panel.putConstraint(SpringLayout.NORTH, cmbFontStyle, 13, SpringLayout.SOUTH, cmbFont);
		sl_panel.putConstraint(SpringLayout.WEST, cmbFontStyle, 5, SpringLayout.EAST, lblNewLabel_1);
		sl_panel.putConstraint(SpringLayout.EAST, cmbFontStyle, 0, SpringLayout.EAST, cmbFont);
		panel.add(cmbFontStyle);
		
		
		cmbFontStyle.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				cmbFontStyle_Item_Selected(arg0);
			}
			
		});
		
		
		JLabel lblFontSize = new JLabel("Font Size:");
		sl_panel.putConstraint(SpringLayout.NORTH, lblFontSize, 18, SpringLayout.SOUTH, lblNewLabel_1);
		sl_panel.putConstraint(SpringLayout.WEST, lblFontSize, 0, SpringLayout.WEST, lblNewLabel);
		panel.add(lblFontSize);
		
		JComboBox cmbFontSize = new JComboBox(size);
		cmbFontSize.setSelectedIndex(13);
		sl_panel.putConstraint(SpringLayout.NORTH, cmbFontSize, 9, SpringLayout.SOUTH, cmbFontStyle);
		sl_panel.putConstraint(SpringLayout.WEST, cmbFontSize, 11, SpringLayout.EAST, lblFontSize);
		sl_panel.putConstraint(SpringLayout.EAST, cmbFontSize, 0, SpringLayout.EAST, cmbFont);
		panel.add(cmbFontSize);
		
		cmbFontSize.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				cmbFontSize_Item_Selected(arg0);
			}
			
		});
		
		JLabel lblFontColor = new JLabel("Font Color:");
		sl_panel.putConstraint(SpringLayout.WEST, lblFontColor, 0, SpringLayout.WEST, lblNewLabel);
		panel.add(lblFontColor);
		
		JButton btnApply = new JButton("Apply");
		sl_panel.putConstraint(SpringLayout.WEST, btnApply, -233, SpringLayout.EAST, panel);
		btnApply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnApply_Clicked(arg0);
			}
		});
		sl_panel.putConstraint(SpringLayout.SOUTH, btnApply, 0, SpringLayout.SOUTH, lblNewLabel);
		panel.add(btnApply);
		
		JButton btnCancel = new JButton("Cancel");
		sl_panel.putConstraint(SpringLayout.WEST, btnCancel, 143, SpringLayout.EAST, cmbFontStyle);
		sl_panel.putConstraint(SpringLayout.EAST, btnCancel, -72, SpringLayout.EAST, panel);
		sl_panel.putConstraint(SpringLayout.EAST, btnApply, 0, SpringLayout.EAST, btnCancel);
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnCancel_Clicked(arg0);
			}
		});
		
		sl_panel.putConstraint(SpringLayout.NORTH, btnCancel, -4, SpringLayout.NORTH, lblNewLabel_1);
		panel.add(btnCancel);
		
		JButton btnChooseColor = new JButton("Choose Color");
		sl_panel.putConstraint(SpringLayout.WEST, btnChooseColor, 1, SpringLayout.EAST, lblFontColor);
		sl_panel.putConstraint(SpringLayout.EAST, btnChooseColor, -376, SpringLayout.EAST, panel);
		sl_panel.putConstraint(SpringLayout.NORTH, lblFontColor, 4, SpringLayout.NORTH, btnChooseColor);
		
		btnChooseColor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnChooseColor_Clicked(arg0);
			}
		});
		
	
		sl_panel.putConstraint(SpringLayout.NORTH, btnChooseColor, 6, SpringLayout.SOUTH, cmbFontSize);
		panel.add(btnChooseColor);
	}
	/**
	 * Click Event for bntChooseColor
	 * <p>
	 */
	private void btnChooseColor_Clicked(ActionEvent e){
		Color initialColor = new Color(255,255,255);
		textColor = JColorChooser.showDialog(frame, "Choose text Color", initialColor);
		styleConfig.setFontColor(textColor);
		banner.setTextForeGroundColor(textColor);
		
	
	}
	private void cmbFont_Item_Selected(ActionEvent e){
		JComboBox itm = (JComboBox)e.getSource();
		String fontName = itm.getSelectedItem().toString();
		styleConfig.setFontName(fontName);
		banner.setFont((String)itm.getSelectedItem());
	}
	private void cmbFontStyle_Item_Selected(ActionEvent e){
		JComboBox itm = (JComboBox)e.getSource();
		String selItm = (String) itm.getSelectedItem();
		switch(selItm){
		case "Bold":
			styleConfig.setFontStyle(Font.BOLD);
			banner.setFontStyle(Font.BOLD);
			break;
		case "Italic":
			styleConfig.setFontStyle(Font.ITALIC);
			banner.setFontStyle(Font.ITALIC);
			break;
		case "Plain":
			styleConfig.setFontStyle(Font.PLAIN);
			break;
		}
	}
	
	private void cmbFontSize_Item_Selected(ActionEvent e){
		JComboBox itm = (JComboBox)e.getSource();
		String selItm = itm.getSelectedItem().toString();
		int size = Integer.valueOf(selItm);
		styleConfig.setFontSize(size);
		banner.setFontSize(size);
	
	}
	
	private void btnApply_Clicked(ActionEvent e){
		frame.dispose();
	}
	private void btnCancel_Clicked(ActionEvent e){
		frame.dispose();
	}
}
