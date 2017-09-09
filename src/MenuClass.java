public class MenuClass {

	Screen screen;

	public MenuClass() {
		screen = new Screen();
	}

	void showSigningMenu() {

		screen.showMessage("1. Sign Up");
		screen.showMessage("2. Sign In");
		screen.showMessage("3. Go Back\n");
	}

	void showConfirmOption() {
		
		screen.showMessage("1 - CONFIRM AND PROCEED.");
		screen.showMessage("2 - GO BACK AND EDIT.");

	}
}