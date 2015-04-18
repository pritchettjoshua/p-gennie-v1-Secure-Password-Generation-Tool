package pPGennie;

import java.util.ArrayList;
import java.util.Random;

public class Questions1 {
	private static ArrayList<String> arr = new ArrayList<String>();
	
	public Questions1(){
		arr.add("What is your favorite athlete's jersey number?");
		arr.add("What is the first name of the person you first kissed?");
		arr.add("What is the name of the first beach you visited?");
		arr.add("What was the make and model of your first car?");
		arr.add("What was your childhood nickname?");
		arr.add("In what city did you meet your spouse/significant other?");
		arr.add("What is the name of your favorite childhood friend?");
		arr.add("What street did you live on in third grade?");
		arr.add("What is your oldest sibling's middle name?");
		arr.add("What school did you attend for sixth grade?");
		arr.add("What was your childhood phone number including area code?");
		arr.add("What was the name of your first stuffed animal?");
		arr.add("In what city or town did your mother and father meet?");
		arr.add("Where were you when you had your first kiss?");
		arr.add("What was the last name of your fifth grade teacher?");
		arr.add("What is your grandmother's (father side) maiden name?");
		arr.add("What is your grandmother's (mother side) maiden name?");
		arr.add("In what city or town was your first job?");
		arr.add("What is the name of a college you applied to but didn't attend?");
		arr.add("Where were you when you first heard about 9/11 crisis?");
		
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
