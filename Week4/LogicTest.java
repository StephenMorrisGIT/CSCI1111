public class LogicTest
{
	public static void main(String[] args)
	{
		String lightState = "red";
		String driveSte;
		boolean pedestrianThere = true;
		if (lightState.equals("green") && !pedestrianThere)
		{
			driveState = "Go";
		}
		else if(lightState.equals("Yellow") && !pedestrianThere)
		{
			driveState = "Slow Down";
		}
		else
		{
			driveState = "Stop";
		}
	}
}