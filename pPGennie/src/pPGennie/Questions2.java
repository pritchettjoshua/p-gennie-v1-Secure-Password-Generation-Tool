package pPGennie;

import java.util.ArrayList;
import java.util.Random;

public class Questions2 {
	private static ArrayList<String> arr = new ArrayList<String>();
	public Questions2() {
		arr.add("Where were you when you had your first alcoholic drink (or cigarette)?");
		arr.add("What is the name of your first pet?");
		arr.add("When you were young, what did you want to be when you grew up?");
		arr.add("When you were a child what was your favorite clothing brand?");
		arr.add("When you were a child what was your favorite shoe?");
		arr.add("What was your favorite book as a child?");
		arr.add("What was your favorite hobby as a child?");
		arr.add("What was the name of the church or temple you attended as a child");
		arr.add("What was the name of your elementary school?");
		arr.add("What was the name of your middle school?");
		arr.add("What was the name of your childhood favorite movie?");
		arr.add("What was the name of your childhood favorite tv show?");
		arr.add("What tv show character did you most want to be when you were a child?");
		arr.add("Who was your favorite actor as a child?");
		arr.add("Who was your favorite singer as a child?");
		arr.add("What was your favorite candy bar as a child?");
		arr.add("What is the name of your childhood hero?");

	}
	public String random(){
		int arrSize = arr.size();
		int randomNum1;
		Random generator = new Random(); 
		randomNum1 = generator.nextInt(arrSize);
		
		String a = arr.get(randomNum1);
		return a;
	}
}
