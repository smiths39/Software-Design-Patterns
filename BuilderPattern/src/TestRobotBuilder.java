public class TestRobotBuilder {

	public static void main(String [] args) { 
		
		/*
		 * Get a RobotBuilder of type OldRobotBuilder
		 */
		RobotBuilder oldStyleRobot = new OldRobotBuilder();
		
		/*
		 * Pass the OldRobotBuilder specification to the engineer
		 */
		RobotDirector robotDirector = new RobotDirector(oldStyleRobot);

		/*
		 * Tell the engineer to make the Robot using the specifications of the OldRobotBuilder class
		 */
		robotDirector.makeRobot();
		
		/*
		 * The engineer returns the right robot based off of the specification
		 */
		Robot firstRobot = robotDirector.getRobot();
		
		System.out.println("Robot Built");
		System.out.println("Robot Head Type: " + firstRobot.getRobotHead());
		System.out.println("Robot Torso Type: " + firstRobot.getRobotTorso());
		System.out.println("Robot Arms Type: " + firstRobot.getRobotArms());
		System.out.println("Robot Legs Type: " + firstRobot.getRobotLegs());
	}
}
