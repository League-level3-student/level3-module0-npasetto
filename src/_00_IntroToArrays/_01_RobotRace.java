package _00_IntroToArrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	static //1. make a main method
	Random rand=new Random();
	public static void main(String[] args) {
		//2. create an array of 5 robots.
		Robot[] robots=new Robot[5];
				//3. use a for loop to initialize the robots.
for (int i = 0; i < robots.length; i++) {
	robots[i]=new Robot();
	robots[i].setSpeed(999999999);
}
					//4. make each robot start at the bottom of the screen, side by side, facing up
			for (int i = 0; i < robots.length; i++) {
				robots[i].moveTo(i*50, 500);
			}
				//5. use another for loop to iterate through the array and make each robot move 
			    //   a random amount less than 50.
			boolean finished=false;
			Robot robotFinished=null;
			while(finished==false) {
		    	for (int i = 0; i < robots.length; i++) {
					robots[i].move(rand.nextInt(rand.nextInt(40)+1));
					robots[i].turn(1);
					if(robots[i].getY()<0) {
						robotFinished=robots[i];
						finished=true;
					}
				}
			}
				//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

				//7. declare that robot the winner and throw it a party!
		    	System.out.println(robotFinished+" won!!!!");
				//8. try different races with different amounts of robots.
		    	
			    //9. make the robots race around a circular track.
	}
		

	
}
