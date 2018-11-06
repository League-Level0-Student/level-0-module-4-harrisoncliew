import javax.swing.JOptionPane;

public class OwnAdventure {
	public static void main(String[] args) {
		int plane = JOptionPane.showOptionDialog(null, "You see a plane that is taking off that has your family's most important award. What do you do?", "Own adventure", 0, JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "Take the car near you and drive up there and try to get there in time", "Get on right now!!!!!!!!!!!!", "I am too lazy" }, null);
		System.out.println(plane);
		if(plane==1) {
			JOptionPane.showMessageDialog(null, "You get there so fast that you manage to hang on to the plane.");
			int he = JOptionPane.showOptionDialog(null, "You need to get in, but you don't know how to. Which door do you take? ", "Own Adventure", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] {"Open the door nearest to you", "Go to the cockpit"} , null);
		}
		if(plane==0) {
			JOptionPane.showMessageDialog(null, "You don't get there in time because you wasted your time trying to pick the lock and making the car turn on with out a key");
			int hey = JOptionPane.showOptionDialog(null, "What do you do?", "Own Adventure", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] {"Drive back home", "Don't do anything"} , null);
			if(plane==2) {
				JOptionPane.showMessageDialog(null, "You take a cab home and your family yells at you for losing the award and throws you out of the house and you never find a new home.");
			}
			
		}
		
	}

}

