package com.string.reverse;

/**
 * @author msfata ProgrammingHelp
 *
 */
public class ReverseString {
	public static void main(String[] args) {
		char[] test = reverse("ATAFSM YB PLEH GNIMARGORP");
		System.out.println(test);
	}

	/*
	 * reversing string with the help of char array
	 */
	private static char[] reverse(String string) {
		char[] array = string.toCharArray();
		char[] reversedArray = new char[array.length];
		for (int i = 0; i < array.length; i++) {
			reversedArray[i] = array[array.length - i - 1];
		}
		return reversedArray;
	}
}
