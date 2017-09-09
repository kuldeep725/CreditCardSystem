import java.util.Scanner;
public class Keypad {
	
	Scanner input;
	public Keypad () {
		input = new Scanner(System.in);
	}
	
	int getInt () {
		return input.nextInt();
	}
	
	long getLong () {
		return input.nextLong();
	}
	
	String getString () {
		return input.nextLine();
	}
	
	String getNextLineString (){
		return input.nextLine();
	}
	
	double getDouble () {
		return input.nextDouble();
	}
	
	Boolean checkEnterKey() {
		return input.nextLine().equals("");
	}

	void removeBufferString() {
		input.nextLine();
	}
	
	Boolean hasNext() {
		return input.hasNext();
	}
}
