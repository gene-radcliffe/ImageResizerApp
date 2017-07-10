package com.Radcliffe.ImageResizerApp;
import java.awt.Color;
import java.awt.Font;

public class StyleConfiguration {

	private static StyleConfiguration instance = null;
	
	
	private static int fontSize;
	private static Color fontColor;
	private static Font fontStyle;
	
	public static StyleConfiguration getInstance() {
		if(instance == null){
			instance = new StyleConfiguration();
		}
		return instance;
	}

	public static int getFontSize() {
		return fontSize;
	}

	public static void setFontSize(int fontSize) {
		StyleConfiguration.fontSize = fontSize;
	}

	public static Color getFontColor() {
		return fontColor;
	}

	public static void setFontColor(Color fontColor) {
		StyleConfiguration.fontColor = fontColor;
	}

	public static Font getFontStyle() {
		return fontStyle;
	}

	public static void setFontStyle(Font fontStyle) {
		StyleConfiguration.fontStyle = fontStyle;
	}

	/*
	 * No Instantiation allowed.
	 * This is a Singleton Class
	 */
	private StyleConfiguration(){
		
	}
	
	
}
