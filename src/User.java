import java.util.ArrayList;

public class User {
	private int choice;
	private ArrayList<SelectorType> listOfSelectors = new ArrayList<SelectorType>();
	public User() {
		
	}
	public void selectChoice() {
		listOfSelectors.get(0).createSelectionIn();
	}
	public void updateChoice() {
		choice = listOfSelectors.get(0).returnChoice();
		if(choice == 1) {
			
		}
	}
	public int returnC() {
		System.out.println(choice);
		return choice;
	}
	public void store(SelectorType selector) {
		listOfSelectors.add(selector);
	}
}
