// Special thanks to Bro Code for his videos
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("What is your name?");
		String name = in.nextLine();
		
		System.out.println("How old are you?");
		int age = in.nextInt();
		in.nextLine(); // This is needed to clear out the Scanner so that the nextLine() method is actually usable
		
		System.out.println("What is your favorite food?");
		String food = in.nextLine();
		
		System.out.println("Hello " + name);
		System.out.println("You are " + age + " years old");
		System.out.println("You like " + food);

		in.close();
	}

}
