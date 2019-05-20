
package com.Radcliffe.ImageResizerApp;
import java.awt.Color;
import java.awt.Font;

public class StyleConfiguration {

	private static StyleConfiguration instance = null;
	
	private static String strFontName = "Arial";
	private static Font fontName;
	private static int fontSize = 32;
	private static Color fontColor = new Color(255,255,255);
	private static int fontStyle = Font.PLAIN;
	private static Color shadowColor = new Color(50,50,50);
	
	public static StyleConfiguration getInstance() {
		if(instance == null){
			instance = new StyleConfiguration();
		}
		return instance;
	}

	public static String getFontName() {
		return strFontName;
	}
	
	public static Font getFontName(int a) {
		return fontName;
	}

	public static void setFontName(Font fontName) {
		StyleConfiguration.fontName = fontName;
	}
	
	public static void setFontName(String fontName){
		strFontName = fontName;
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

	public static Color getShadowColor(){
		return shadowColor;
	}
	public static void setShadowColor(Color color){
		shadowColor = color;
	}
	public static int getFontStyle() {
		return fontStyle;
	}

	public static void setFontStyle(int fontStyle) {
		StyleConfiguration.fontStyle = fontStyle;
	}

	/*
	 * No Instantiation allowed.
	 * This is a Singleton Class
	 */
	private StyleConfiguration(){
		
	}
	
	
}
