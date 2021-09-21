package exception;
import java.io.*;
public class TestExceptions{
	public static void main(String[] args){
		try {
			PrintWriter pw = new PrintWriter("abc.txt");
			pw.println("Test data");
			System.out.println(10/0);
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
/**
* The exceptions that are checked by compiler to see whether programmer is handling them or not are called "checked Exceptions".
* The exceptions that are not checked by the compiler to whether programmer is handling them or not are called "Unchecked Exceptions"
* In the above code we will get the following error irrespective of "abc.txt" file present or not.
* TestExceptions.java:4: error: unreported exception FileNotFoundException; must be caught or declared to be thrown
        PrintWriter pw = new PrintWriter("abc.txt");
		
* Here compiler is complaining about handling the exception but not occurrence of exception.
* So, these checked exception must be handled through try-catch or by declaring the exceptions using "throws" 
* Something like : 
* 
* public static void main(String[] args) throws Exception{
		PrintWriter pw = new PrintWriter("abc.txt");
		pw.println("Test data");
		System.out.println(10/0);
	}
* or something like:
* public static void main(String[] args){
		try {
			PrintWriter pw = new PrintWriter("abc.txt");
			pw.println("Test data");
			System.out.println(10/0);
		}catch(Exception e) {
			e.printStackTrace();
		}

	}
**/