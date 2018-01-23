import java.util.ArrayList;
import java.util.Random;
import java.util.stream.IntStream;

public class Monster {
	private static ArrayList<Integer> arr = new ArrayList<Integer>();
	private int health;
	private static int counter = 0;
	public boolean alive = true;

	public Monster() {
		health = 3;
	}

	public boolean checkLife() {
		if (health <= 0) {
			alive = false;
		}
		return alive;
	}
	
	public int getHealth() {
		return health;
	}
	
	public void setHealth(int newhealth) {
		health = newhealth;
	}
	
	public String bodyPart() {
		int num = (int) (Math.random() * 8); 
		String part = "";
		while (arr.contains(num)) {  // not working for some reason. Trying to get all the num so i dont repeat
			num = (int) (Math.random() * 8); 
		}
		arr.add(num);
		
		if(num == 0) {
			part = "left leg";
			return part;
		} else if(num == 1) {
			part= "right leg";
			return part;
		} else if(num == 2) {
			part = "left arm";
			return part;
		} else if(num == 3) {
			part = "right arm";
			return part;
		} else if(num == 4) {
			part = "tail";
			return part;
		} else if(num == 5) {
			part = "left head";
			return part;
		} else if(num == 6) {
			part = "middle head";
			return part;
		} else if(num == 7) {
			part = "right head";
			return part;
		}
		return "";
	}
}