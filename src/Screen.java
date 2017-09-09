
public class Screen {
	
    void showMessage (String s ) {
		System.out.println(s);
	}
	
	void showMessageInLine (String s) {
		System.out.print(s);
	}
	
	void showMessageInFormat (String s,String s1, String s2) {
		System.out.printf(s, s1, s2);
	}
	void showEnd () {
		System.out.println("\n----------------------------------------------------\n");
	}
	
	void askUserInput () {
		showMessageInLine("Your Choice -> ");
	}
	
	void showGoodBye () {
		showMessage("----------GOOD-BYE----------");
		showEnd();
		return;
	}
	

}
