package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj2.command.CommandScheduler;

public class Robot extends TimedRobot {

    @Override
    public void robotInit() {
    }

    @Override
    public void robotPeriodic() {
        // always run the CommandScheduler during periodic

        //static singleton command scheduler :nausea:
        CommandScheduler.getInstance().run();
    }

    @Override
    public void teleopInit() {

    }

    //not a fan: why do we need this for initialization
    public static Robot win() {
        return new Robot();
    }

}