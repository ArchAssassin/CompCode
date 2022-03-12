package frc.swerverobot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.CommandScheduler;
import frc.swerverobot.commands.FeederDown;
import frc.swerverobot.subsystems.FeederSubsystem;
import frc.swerverobot.subsystems.IndexSubsystem;
import frc.swerverobot.subsystems.ShooterSubsystem;
import edu.wpi.first.cameraserver.CameraServer;

public class Robot extends TimedRobot {
    private final RobotContainer container = new RobotContainer();
    //private final IndexSubsystem index = new IndexSubsystem();
    //private final ShooterSubsystem shoot = new ShooterSubsystem();
    //private final FeederSubsystem feed = new FeederSubsystem();

    @Override
    public void robotInit() {
        CameraServer.startAutomaticCapture();
    }

    @Override 
    public void autonomousInit(){
        /*
        shoot.setShooterSpeed(0.85);
        feed.setFeederSpeed(1);
        Timer.delay(2);
        index.setIndexSpeed(1);
        Timer.delay(5);
        shoot.setShooterSpeed(0);
        index.setIndexSpeed(0);
        feed.setFeederSpeed(0);
        */
    }
    

    @Override
    public void robotPeriodic() {
        CommandScheduler.getInstance().run();
    }



}
