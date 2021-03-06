package charAt_scanners_optionDialogs;
import javax.swing.JOptionPane;

public class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int happinesslevel = 0;
	
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
		String pet = JOptionPane.showInputDialog("What type of pet do you want?");

		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		for (int i = 0; i < 6; i++) {
		
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "What do you want to do to make your pet happy?", "Pet Questions", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Take a walk", "Clean up poop", "I am too lazy" }, null);
			System.out.println(task);

			// 5. Use user input to call the appropriate method created in step 4.
			if(task==0) {
				walk();
			}
			if(task==2 ) {
				lazy();
			}
			if(task==1) {
				clean();
			}
		}

			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.

	}

	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	static void clean() {
		happinesslevel++;
		JOptionPane.showMessageDialog(null, "Your pet's happiness level is "+ happinesslevel + " . It feels cleaner.");
	}
	static void walk() {
		happinesslevel=+5;
		JOptionPane.showMessageDialog(null, "Your pet's happiness level is "+ happinesslevel + " . It is now happier than before.");
	}
	static void lazy() {
		happinesslevel=-10;
		JOptionPane.showMessageDialog(null, "Your pet's happiness level is "+ happinesslevel + " . It is not feeling good at all.");
	}
}