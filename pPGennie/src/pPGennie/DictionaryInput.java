package pPGennie;


import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Pattern;


public class DictionaryInput {

	
	@SuppressWarnings("deprecation")
	public static ArrayList<String> get_list_of_words(String file_path) {
		
		ArrayList<String> list_words = new ArrayList<String>();
		File file = new File(file_path);
	    FileInputStream fis = null;
	    BufferedInputStream bis = null;
	    DataInputStream dis = null;
	    
		try {
			fis = new FileInputStream(file);
		      bis = new BufferedInputStream(fis);
		      dis = new DataInputStream(bis);
		      Scanner in = new Scanner(dis).useDelimiter(Pattern.compile("[,\\n]"));
		      while(in.hasNext()){
		    	  String x = in.next();
		    	  list_words.add(x);
		    	  
		      }
		      
		      fis.close();
		      bis.close();
		      dis.close();
			
		        
		}
		
		 catch (FileNotFoundException e) {
			
			// TODO Auto-generated catch block
			System.out.println("file not found");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//System.out.println(list_words);
		
		return list_words;
		
	}
public static String getwords(int num){
	String file_path1 = "C:/Users/dannystormball/workspace/pPGennie/small_file_2.txt";
	String file_path2 = "C:/Users/dannystormball/workspace/pPGennie/small_file_3.txt";
	String file_path3 = "C:/Users/dannystormball/workspace/pPGennie/small_file_4.txt";
	String file_path4 = "C:/Users/dannystormball/workspace/pPGennie/small_file_5.txt";
	String file_path5 = "C:/Users/dannystormball/workspace/pPGennie/small_file_6.txt";
	String file_path6 = "C:/Users/dannystormball/workspace/pPGennie/small_file_7.txt";
	String file_path7 = "C:/Users/dannystormball/workspace/pPGennie/small_file_8.txt";
	String file_path8 = "C:/Users/dannystormball/workspace/pPGennie/small_file_9.txt";
	String file_path9 = "C:/Users/dannystormball/workspace/pPGennie/small_file_10.txt";
	String file_path10 = "C:/Users/dannystormball/workspace/pPGennie/small_file_11.txt";
	String file_path11 = "C:/Users/dannystormball/workspace/pPGennie/small_file_12.txt";
	
	ArrayList<String> list_of_words1 =get_list_of_words(file_path1);
	ArrayList<String> list_of_words2 =get_list_of_words(file_path2);
	ArrayList<String> list_of_words3 =get_list_of_words(file_path3);
	ArrayList<String> list_of_words4 =get_list_of_words(file_path4);
	ArrayList<String> list_of_words5 =get_list_of_words(file_path5);
	ArrayList<String> list_of_words6 =get_list_of_words(file_path6);
	ArrayList<String> list_of_words7 =get_list_of_words(file_path7);
	ArrayList<String> list_of_words8 =get_list_of_words(file_path8);
	ArrayList<String> list_of_words9 =get_list_of_words(file_path9);
	ArrayList<String> list_of_words10 =get_list_of_words(file_path10);
	ArrayList<String> list_of_words11 =get_list_of_words(file_path11);
	
	
	Random inputRan = new Random();
	String word = "";
	switch (num) {
	
	case 0:
		int a = inputRan.nextInt(list_of_words1.size());
		word = list_of_words1.get(a);
		break;
	case 1:
		int b = inputRan.nextInt(list_of_words2.size());
		word = list_of_words2.get(b);
		break;
	case 2:
		int c = inputRan.nextInt(list_of_words3.size());
		word = list_of_words3.get(c);
		break;
	case 3:
		int d = inputRan.nextInt(list_of_words4.size());
		word = list_of_words4.get(d);
		break;
	case 4:
		int e = inputRan.nextInt(list_of_words5.size());
		word = list_of_words5.get(e);
		break;
	case 5:
		int f = inputRan.nextInt(list_of_words6.size());
		word = list_of_words6.get(f);
		break;
	case 6:
		int g = inputRan.nextInt(list_of_words7.size());
		word = list_of_words7.get(g);
		break;
	case 7:
		int h = inputRan.nextInt(list_of_words8.size());
		word = list_of_words8.get(h);
		break;
	case 8:
		int i = inputRan.nextInt(list_of_words9.size());
		word = list_of_words9.get(i);
		break;
	case 9:
		int j = inputRan.nextInt(list_of_words10.size());
		word = list_of_words10.get(j);
		break;
	case 10:
		int k = inputRan.nextInt(list_of_words11.size());
		word = list_of_words11.get(k);
		break;
		
	}
	return word;
}

/*public DictionaryInput (int num, int num1){
	String first_word = getwords(num);
	String second_word = getwords(num1);
	System.out.println(first_word);
	System.out.println(second_word);
}/*

/*public static void main(String []args){
	pass_words();
	
	
}*/
}
