import java.io.FileWriter;
import java.io.IOException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.InputMismatchException;

public class CreditPage {

	private int userinput;
	private String name;
	private String city;
	private String occupation;
	private int day;
	private int month;
	private int year;
	private String qualification;
	private double annualIncome;
	private String pan;
	private long mobileNumber;

	private MenuClass menuClass;
	private Age age;
	private Screen screen;
	private Keypad keypad;
	private Information information;

	public CreditPage() {

		menuClass = new MenuClass();
		age = new Age();
		screen = new Screen();
		keypad = new Keypad();
		information = new Information();

	}

	public void run() {

		while (true) {

			screen.showMessage("----------WELCOME TO SBI CREDIT CARD MENU-----------\n");
			menuClass.showSigningMenu();
			screen.askUserInput();
			userinput = keypad.getInt();
			screen.showEnd();

			switch (userinput) {

			case 1:
				signUpPage();
				break;
			case 3:
				screen.showGoodBye();
				break;
			default:
				screen.showMessage("You have entered invalid input. Try again.");

			}
		}

	}

	void signUpPage() {
		int checkInput = -1;
		int x = 0;
		do {
			
			do {
				try {

				screen.showMessageInFormat("%-25s%s", "FULL NAME ", ": ");
				if (x == 0) {
				    keypad.removeBufferString();
				}
				name = keypad.getString();
				x++;
				break;
				}
				catch (InputMismatchException e) {
					System.out.println("Invalid Input. Try again.\n");
					keypad.getNextLineString();
					continue;
				}
			} while(keypad.hasNext());
			
			do{
			try {
				
				screen.showMessageInFormat("%-25s%s", "CITY ", ": ");
				city = keypad.getString();
				break;
				
				}
			catch (InputMismatchException e) {
				System.out.println("Invalid Input. Try again.\n");
				keypad.getNextLineString();
				continue;
			}
		    }while(keypad.hasNext());
		do {
			try {

				screen.showMessageInFormat("%-25s%s", "OCCUPATION ", ": ");
				occupation = keypad.getString();
				break;
				}
			catch (InputMismatchException e) {
				System.out.println("Invalid Input. Try again.\n");
				keypad.getNextLineString();
				continue;
			}
		}while(keypad.hasNext());

				int i = 0;

					if (i > 0) {
						screen.showMessage("");
					}
					screen.showMessageInFormat("%-25s%s", "BITH-YEAR ", ": ");
					do{
						
						try{
							
					        year = keypad.getInt();
					        age.setYear(year);
					        break;
					    }
						catch (InputMismatchException e) {
							System.out.println("Invalid Input. Try again.\n");
							keypad.getNextLineString();
							screen.showMessageInFormat("%-25s%s", "BITH-YEAR ", ": ");
							continue;
						}
					}while(keypad.hasNext());
					
					screen.showMessageInFormat("%-25s%s", "BIRTH-MONTH ", ": ");
					do{
						try{
					        
					        month = keypad.getInt();
					        if (month >=1 && month <= 12) {
					            age.setMonth(month);
					            break;
					        }
					        else {
					        	System.out.println("Invalid Input. Try again.\n");
							    keypad.getNextLineString();
							    screen.showMessageInFormat("%-25s%s", "BIRTH-MONTH ", ": ");
							    continue;
					        }
					    }
						catch (InputMismatchException e) {
							System.out.println("Invalid Input. Try again.\n");
							keypad.getNextLineString();
							screen.showMessageInFormat("%-25s%s", "BIRTH-MONTH ", ": ");
							continue;
						}
					}while (keypad.hasNext());
					
					int j = 0;
					do  {
						if (j>0){
						    keypad.getNextLineString();
						    System.out.println("Invalid Input. Try again.\n");
						}
					screen.showMessageInFormat("%-25s%s", "BIRTH-DAY ", ": ");
					do {
						try{
					        
					        day = keypad.getInt();
					        age.setDay(day);
					        break;
					    }
						catch (InputMismatchException e) {
							System.out.println("Invalid Input. Try again.\n");
							keypad.getNextLineString();
							screen.showMessageInFormat("%-25s%s", "BIRTH-DAY ", ": ");
							continue;
						}
					}while (keypad.hasNext());
					i++;
					j++;

				} while (age.checkAge() != 0);
				
				do{
					try{

				screen.showMessageInFormat("%-25s%s", "QUALIFICATION ", ": ");
				keypad.removeBufferString();
				qualification = keypad.getString();
				break;
				}
					catch (InputMismatchException e) {
						System.out.println("Invalid Input. Try again.\n");
						keypad.getNextLineString();
						continue;
					}
				}while (keypad.hasNext());
				
				screen.showMessageInFormat("%-25s%s", "ANNUAL INCOME ", ": ");
				do{
					try{

				annualIncome = keypad.getDouble();
				break;
					}
					catch (InputMismatchException e) {
						System.out.println("Invalid Input. Try again.\n");
						keypad.getNextLineString();
						screen.showMessageInFormat("%-25s%s", "ANNUAL INCOME ", ": ");
						continue;
					}
				}while (keypad.hasNext());
				
				screen.showMessageInFormat("%-25s%s", "PAN CARD NUMBER", ": ");
				do{
					try{

				keypad.removeBufferString();
				pan = keypad.getString();
				break;
				}
					catch (InputMismatchException e) {
						System.out.println("Invalid Input. Try again.\n");
						keypad.getNextLineString();
						screen.showMessageInFormat("%-25s%s", "PAN CARD NUMBER", ": ");
						continue;
					}
				}while (keypad.hasNext());
				
				screen.showMessageInFormat("%-25s%s", "MOBILE NUMBER", ": ");
				do{
					try{
				
				mobileNumber = keypad.getLong();
				keypad.removeBufferString();
				break;
				}
                   catch (InputMismatchException e) {
						System.out.println("Invalid Input. Try again.\n");
						keypad.getNextLineString();
						screen.showMessageInFormat("%-25s%s", "MOBILE NUMBER", ": ");
						continue;
					}
				}while (keypad.hasNext());
				
			
			screen.showEnd();

			information.showSignUpDetails(name, city, occupation, year, month,
					day, qualification, annualIncome, pan, mobileNumber); // For user to check the details
																			

			int flagType = 0;
			do {
				screen.showEnd();

				menuClass.showConfirmOption(); // For user to confirm the details and proceed
				screen.showMessageInLine("Your Choice -> ");
				checkInput = keypad.getInt();
				keypad.removeBufferString();
				if (checkInput == 1) {
					screen.showMessage("Your Credit Card Request is successfully made.\n");
					createFile();
					break;
				}
				if (checkInput == 2) {
					flagType = -1;
					screen.showMessage("You are now editing.");
					break;
				} else {
					screen.showMessage("Invalid Input. Try Again.\n");
					continue;
				}
			} while (flagType != -1);
		} while (checkInput != 1);
		
	}
	
	private void createFile () {
		
		try {
			
			FileWriter f = new FileWriter("CREDIT-CARD-DETAILS",true);
			Formatter output = new Formatter(f);
			
		    try {
			    
		    	output.format("----------%s----------","CREDIT-CARDs DETAILS");
			    output.format("%-25s%s%s\n", "1. FULL NAME ", ": ",name);
			    output.format("%-25s%s%s\n", "2. CITY ", ": ",city);
			    output.format("%-25s%s%s\n", "3. OCCUPATION ", ": ", occupation);
			    output.format("%-25s%s%s\n", "4. DATE OF BIRTH ", ": ",day+"-"+month+"-"+year);
			    output.format("%-25s%s%s\n", "5. QUALIFICATION ", ": ",qualification);
			    output.format("%-25s%s%s\n", "6. ANNUAL INCOME ", ": Rs. ",""+annualIncome);
			    output.format("%-25s%s%s\n", "7. PAN CARD NUMBER", ": ",pan);
			    output.format("%-25s%s%s\n\n", "8. MOBILE NUMBER", ": +91",""+mobileNumber);
			
		    }
		    catch (FormatterClosedException e) {
		    	screen.showMessage("Error in file formatting");
		    }
		    output.close();
		}
		catch (IOException e) {
			System.out.println(e);
		}
	
		
		
	}
		
		
	
	
	
}
