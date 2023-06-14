package homehateam;
import robocode.*;
import java.awt.Color;


// API help : https://robocode.sourceforge.io/docs/robocode/robocode/Robot.html

/**
 * DmytroHomehaBot - a robot by (your name hee)
 */
public class DmytroHomehaBot extends AdvancedRobot
{
	/**
	 * run: DmytroHomehaBot's default behavior
	 */
	public void run() {
		setBodyColor(new Color(208, 255, 0));
		setGunColor(new Color(11, 77, 243));
		setRadarColor(new Color(0, 81, 255));
		setScanColor(Color.white);
		setBulletColor(Color.PINK);

		// Robot main loop
		while(true) {
			turnGunRight(180);
			setMaxVelocity(100);
			setAhead(100);
			setTurnLeft(100);

		}
	}

	public void onScannedRobot(ScannedRobotEvent e) {
		fire(3);
	}

	public void onHitByBullet(HitByBulletEvent e) {
		setBack(100);
		setTurnRight(100);
		fire(3);
	}


	public void onHitWall(HitWallEvent e) {
		fire(1);

	}
	public void onRoundEnded(RoundEndedEvent event) {
		out.println("СЛАВА УКРАЇНІ");
	}
}
