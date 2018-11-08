import javax.swing.JOptionPane;

public class OwnAdventure {
	public static void main(String[] args) {
		int happy = 0;
		int plane = JOptionPane.showOptionDialog(null, "You see a plane that is taking off that has your family's most important award. What do you do?", "Own adventure", 0, JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "Take the car near you and drive up there and try to get there in time", "Get on right now!!!!!!!!!!!!", "I am too lazy" }, null);
		System.out.println(plane);
		if(plane==1) {
			JOptionPane.showMessageDialog(null, "You get there so fast that you manage to hang on to the plane.");
			int he = JOptionPane.showOptionDialog(null, "You need to get in, but you don't know how to. Which door do you take? ", "Own Adventure", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] {"Go to the cockpit", "Open the door nearest to you"} , null);
			System.out.println(he);
			if(he==0) {
				JOptionPane.showMessageDialog(null, "You go to the cockpit, but the pilot throws you off the plane. Whoops!");
			}
				if(he==1) {
					JOptionPane.showMessageDialog(null, "You get in, but the plane is so large that you don't know where to go.");
					int one = JOptionPane.showOptionDialog(null, "What do you do?", "Own Adventure", 0, JOptionPane.INFORMATION_MESSAGE, null,
							new String[] {"Go in front of you", "Go behind you"}, null);
					if(one==0) {
						JOptionPane.showMessageDialog(null, "You take the first hallway and eventually get to the cockpit, where you get thrown out of the plane.");
					}
					if (one==1 ) {
						int two = JOptionPane.showOptionDialog(null, "You make it to the back of the plane where the cargo is. You eventually find the award, but you don't know how to get off the plane. What do you do?", "Own Adventure", 0, JOptionPane.INFORMATION_MESSAGE, null,
								new String[]{"Take the parachute", "Just jump"}, null);
						if(two==0) {
							JOptionPane.showMessageDialog(null, "You pull the parachute out just at the right time, to save yourself. You made it!");
							happy=+10000;
							JOptionPane.showMessageDialog(null, "Your score is "+happy+" .");
							
						}
						if(two==1) {
							JOptionPane.showMessageDialog(null, "Let's just say you didn't make it.");
						}
					}
				}
			}
			
		
		if(plane==0) {
			JOptionPane.showMessageDialog(null, "You don't get there in time because you wasted your time trying to pick the lock and making the car turn on with out a key");
			int hey = JOptionPane.showOptionDialog(null, "What do you do?", "Own Adventure", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] {"Drive back home", "Don't do anything"} , null);
			System.out.println(hey);
			if(hey==0) {
				JOptionPane.showMessageDialog(null, "You drive home and your family yells at you for losing the award and throws you out of the house and you never find a new home.");
			}
			if(hey==1) {
				JOptionPane.showMessageDialog(null, "You eventually take a cab home and your family yells at you for losing the award and throws you out of the house and you never find a new home.");
			}
		}
			if(plane==2) {
				JOptionPane.showMessageDialog(null, "You take a cab home and your family yells at you for losing the award and throws you out of the house and you never find a new home.");
			
	
			}
	}
}

		
	
		





