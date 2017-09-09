
public class Information {
	
	Screen screen;
	public Information ()   {
		screen = new Screen();
	}
	public void showSignUpDetails (String name,String city,String occupation,int year,int month,int day,String qualification,double annualIncome,String pan,long mobileNumber) {
		
		screen.showMessage("----------YOUR SIGN-UP DETAIL----------\n");
		
		screen.showMessageInFormat("%-25s%s", "1. FULL NAME ", ": ");
		screen.showMessage(name);
		
		screen.showMessageInFormat("%-25s%s", "2. CITY ", ": ");
		screen.showMessage(city);
		
		screen.showMessageInFormat("%-25s%s", "3. OCCUPATION ", ": ");
		screen.showMessage(occupation);
		
		screen.showMessageInFormat("%-25s%s", "4. DATE OF BIRTH ", ": ");
		screen.showMessage(day+"-"+month+"-"+year);
		
		screen.showMessageInFormat("%-25s%s", "5. QUALIFICATION ", ": ");
		screen.showMessage(qualification);
		
		screen.showMessageInFormat("%-25s%s", "6. ANNUAL INCOME ", ": Rs. ");
		screen.showMessage(""+annualIncome);
		
		screen.showMessageInFormat("%-25s%s", "7. PAN CARD NUMBER", ": ");
		screen.showMessage(pan);
		
		screen.showMessageInFormat("%-25s%s", "8. MOBILE NUMBER", ": +91");
		screen.showMessage(""+mobileNumber);
		
	}

}
