package pPGennie;


import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;

public class Randomizer {
	private String input1;
	private String input2;
	private String finalW;

	public String Randomizer(String input1, String input2) {
		this.input1 = input1;
		this.input2 = input2;
//		if(input1.length() < 5 || input2.length()<5){
//			System.out.print("input must be greater then 5 chars");
//		System.exit(0);	
//		}
		input1 = input1.toLowerCase();
		input2 = input2.toLowerCase();
		Random inputRan = new Random();
		int concat1 = inputRan.nextInt(2);

		String concatV1 = "";
		String concatV2 = "";
		String concatV3 = "";
		String concatV4 = "";

		switch (concat1) {
		case 0:
			String a = splitString(input1);
			String b = splitString(input2);
			concatV1 = a.concat(b);

			break;
		case 1:
			String c = splitString(input1);
			String d = splitString(input2);
			concatV1 = d.concat(c);
			break;
		}

		concatV2 = capitalLetters(concatV1);
		concatV3 = symbolizer(concatV2);
		concatV4 = appendNumbers(concatV3);
		setFinalW(concatV4);
//		JOptionPane.showMessageDialog(null,input1 +"\n"+input2+"\n"+ "Your password is: " + concatV4);
//		System.out.println(concatV4);
		return concatV4;
	}

	private String capitalLetters(String input) {
		Random howMany = new Random();
		int whichCase = howMany.nextInt(4);
		String cappedInput = "";

		switch (whichCase) {
		case 0:
			cappedInput = input;
			char cap_1st_letter = Character.toUpperCase(cappedInput.charAt(0));
			cappedInput = cap_1st_letter + cappedInput.substring(1);
			break;

		case 1:
			cappedInput = input;
			char cap_last_letter = Character.toUpperCase(cappedInput
					.charAt(input.length() - 1));
			cappedInput = cappedInput.substring(0, input.length() - 1)
					+ cap_last_letter;
			break;

		case 2:
			cappedInput = input;
			char cap_1st = Character.toUpperCase(cappedInput.charAt(0));
			char cap_last = Character.toUpperCase(cappedInput.charAt(input
					.length() - 1));
			cappedInput = cap_1st
					+ cappedInput.substring(1, input.length() - 1) + cap_last;
			break;
		case 3:
			cappedInput = input;
			char cap_middle = Character.toUpperCase(cappedInput.charAt(input
					.length() / 2));
			cappedInput = cappedInput.substring(0, input.length() / 2)
					+ cap_middle
					+ cappedInput.substring((input.length() / 2) + 1,
							input.length());
		}
		return cappedInput;
	}

	private String splitString(String input) {
		int splitLocation;
		String splitString;
		Random splitRan = new Random();
		if (input.length() <= 3) {

			splitLocation = splitRan.nextInt(input.length());
			while (splitLocation == 0) {
				splitLocation = splitRan.nextInt(input.length());
			}

			splitString = input.substring(0, splitLocation);
			return splitString;

		}

		else {
			splitLocation = splitRan.nextInt(input.length());

			while (splitLocation < 4) {
				splitLocation = splitRan.nextInt(input.length());

			}
			splitString = input.substring(0, splitLocation);

			return splitString;
		}

	}

	private String symbolizer(String input) {
		Random whichSym = new Random();
		int randomSym = whichSym.nextInt(5);
		String plusSym = input;
		switch (randomSym) {
		case 0:
			for (int i = 0; i < input.length(); i++) {
				if (plusSym.charAt(i) == 'a' || plusSym.charAt(i) == 'A'
						&& input.length() - 1 != i) {
					plusSym = plusSym.substring(0, i) + "@"
							+ plusSym.substring(i + 1, plusSym.length());

				} else if (plusSym.charAt(i) == 'a' || plusSym.charAt(i) == 'A') {
					plusSym = plusSym.substring(0, i) + "@";

				}
			}
			break;

		case 1:
			for (int i = 0; i < input.length(); i++) {
				if (plusSym.charAt(i) == 's' || plusSym.charAt(i) == 'S'
						&& input.length() - 1 != i) {
					plusSym = plusSym.substring(0, i) + "$"
							+ plusSym.substring(i + 1, plusSym.length());

				} else if (plusSym.charAt(i) == 's' || plusSym.charAt(i) == 'S') {
					plusSym = plusSym.substring(0, i) + "$";

				}
			}
			break;
		case 2:
			for (int i = 0; i < input.length(); i++) {
				if (plusSym.charAt(i) == 'i' || plusSym.charAt(i) == 'I'
						&& input.length() - 1 != i) {
					plusSym = plusSym.substring(0, i) + "!"
							+ plusSym.substring(i + 1, plusSym.length());

				} else if(plusSym.charAt(i) == 'i' || plusSym.charAt(i) == 'I') {
					plusSym = plusSym.substring(0, i) + "!";

				}
			}
			break;
		case 3:
			Random whichSym1 = new Random();
			int randomSym1 = whichSym1.nextInt(2);
			if (randomSym1 == 0)
				plusSym = "#" + plusSym;

			if (randomSym1 == 1)
				plusSym = plusSym + "#";
			break;

		case 4:
			Random whichSym2 = new Random();
			int randomSym2 = whichSym2.nextInt(2);
			if (randomSym2 == 0)
				plusSym = "%" + plusSym;

			if (randomSym2 == 1)
				plusSym = plusSym + "%";
			break;
		}
		return plusSym;

	}

	private String appendNumbers(String input) {
		String plusNum = input;
		Random randomNum = new Random();
		int num1 = randomNum.nextInt(9) + 1;
		int num2 = randomNum.nextInt(10);
		int num3 = randomNum.nextInt(10);
		int num4 = randomNum.nextInt(2);

		if (plusNum.charAt(0) == '#' || plusNum.charAt(0) == '%')
			plusNum = plusNum.substring(0, 1) + num1 + num2 + num3
					+ plusNum.substring(1, input.length());
		else if (plusNum.charAt(plusNum.length() - 1) == '#'
				|| plusNum.charAt(plusNum.length() - 1) == '%')
			plusNum = plusNum + num1 + num2 + num3;
		else {
			if (num4 == 0)
				plusNum = plusNum + num1 + num2 + num3;
			if (num4 == 1)
				plusNum = "" + num1 + num2 + num3 + plusNum;
		}

		return plusNum;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Randomizer r1 = new Randomizer("jordan", "cinderella");
		//Randomizer r2 = new Randomizer("shawn", "apple");

	}

	public String getFinalW() {
		return finalW;
	}

	public void setFinalW(String finalW) {
		
		this.finalW = finalW;
	}

}