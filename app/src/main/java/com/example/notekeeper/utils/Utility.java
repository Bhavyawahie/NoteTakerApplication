package com.example.notekeeper.utils;

public class Utility {
	public static String truncateText(String text, int maxLength) {
		if (text.length() > maxLength) {
			return text.substring(0, maxLength - 3) + "...";
		} else {
			return text;
		}
	}
	public static String removeWhiteSpace(String text) {
		return text.replaceAll("\\s+", " ").trim();
	}

}
