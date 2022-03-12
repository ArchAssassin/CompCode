package frc.swerverobot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.CommandScheduler;

public class Robot extends TimedRobot {
    private RobotContainer robotContainer = new RobotContainer();
    
    @Override
    public void robotInit() {
    }

    @Override
    public void robotPeriodic() {
        CommandScheduler.getInstance().run();
    }

    @Override
    public void autonomousInit() {
        robotContainer.getShooterSubsystem().setShooterSpeed(0.75);
        Timer.delay(3);
        robotContainer.getFeederSubsystem().setFeederSpeed(-1);
        robotContainer.getIndexSubsystem().setIndexSpeed(1);
        Timer.delay(2);
        robotContainer.getShooterSubsystem().setShooterSpeed(0);
        robotContainer.getIndexSubsystem().setIndexSpeed(0);
        robotContainer.getFeederSubsystem().setFeederSpeed(0);
    }

}
