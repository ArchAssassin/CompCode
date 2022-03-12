package frc.swerverobot;

import java.util.GregorianCalendar;

import org.frcteam2910.common.math.Rotation2;
import org.frcteam2910.common.robot.UpdateManager;
import org.frcteam2910.common.robot.input.Controller;
import org.frcteam2910.common.robot.input.XboxController;
import org.frcteam2910.common.robot.input.DPadButton.Direction;

import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj2.command.CommandScheduler;
import frc.swerverobot.commands.DriveCommand;
import frc.swerverobot.commands.FeederDown;
import frc.swerverobot.commands.FeederOff;
import frc.swerverobot.commands.FeederUp;
import frc.swerverobot.commands.Green;
import frc.swerverobot.commands.IndexDown;
import frc.swerverobot.commands.IndexOff;
import frc.swerverobot.commands.IndexUp;
import frc.swerverobot.commands.IntakeExtend;
import frc.swerverobot.commands.IntakeForward;
import frc.swerverobot.commands.IntakeOff;
import frc.swerverobot.commands.IntakeReverse;
import frc.swerverobot.commands.Lime;

import frc.swerverobot.commands.Yellow;
import frc.swerverobot.subsystems.DrivetrainSubsystem;
import frc.swerverobot.subsystems.FeederSubsystem;
import frc.swerverobot.subsystems.IndexSubsystem;
import frc.swerverobot.subsystems.IntakeSubsystem;
import frc.swerverobot.subsystems.ShooterSubsystem;


public class RobotContainer {
    private final Controller controller = new XboxController(0);
    private final Controller secondaryController = new XboxController(1);

    private final DrivetrainSubsystem drivetrain = new DrivetrainSubsystem();
    private final IntakeSubsystem intakeSubsystem = new IntakeSubsystem();
    private final IndexSubsystem indexSub = new IndexSubsystem();
    private final ShooterSubsystem shooterSubsystem = new ShooterSubsystem();
    private final FeederSubsystem feederSubsystem = new FeederSubsystem();

    private final UpdateManager updateManager = new UpdateManager(
            drivetrain
    );


    public RobotContainer() {

        // set the drivetrain's default command to the driver's controller values
        CommandScheduler.getInstance().setDefaultCommand(drivetrain, new DriveCommand(
                drivetrain,
                () -> -controller.getLeftXAxis().get(true)*0.75,
                () -> controller.getLeftYAxis().get(true)*0.75,
                () -> controller.getRightXAxis().get(true)*0.5,
                () -> controller.getRightBumperButton().get()
        ));


        updateManager.startLoop(5.0e-3);

        configureButtonBindings();
       
    }

    private void configureButtonBindings() {
        // reset gyro angle
        controller.getBackButton().whenPressed(
                () -> drivetrain.resetGyroAngle(Rotation2.ZERO)
        );

        secondaryController.getRightTriggerAxis().getButton(0.8).whileHeld(new IntakeForward(intakeSubsystem));
        secondaryController.getLeftBumperButton().whenPressed(new IntakeExtend(intakeSubsystem, true));

        secondaryController.getLeftTriggerAxis().getButton(0.8).whenPressed(new IntakeReverse(intakeSubsystem));
        
        secondaryController.getLeftTriggerAxis().getButton(0.8).whenReleased(new IntakeOff(intakeSubsystem));
        secondaryController.getRightTriggerAxis().getButton(0.8).whenReleased(new IntakeOff(intakeSubsystem));

        secondaryController.getRightBumperButton().whenPressed(new IntakeExtend(intakeSubsystem, false));

        secondaryController.getLeftJoystickButton().whenPressed(new IntakeOff(intakeSubsystem));

        secondaryController.getLeftTriggerAxis().getButton(0.5).whileHeld(new IndexUp(indexSub));
        secondaryController.getRightTriggerAxis().getButton(0.5).whileHeld(new IndexDown(indexSub));

       secondaryController.getLeftTriggerAxis().getButton(0.5).whenReleased(new IndexOff(indexSub));
       secondaryController.getRightTriggerAxis().getButton(0.5).whenReleased(new IndexOff(indexSub));

    
       // secondaryController.getXButton().whenPressed(new FeederOff(feederSubsystem));

    


        secondaryController.getYButton().whenPressed(new Green(shooterSubsystem, true));
        secondaryController.getBButton().whenPressed(new Lime(shooterSubsystem, true));
        secondaryController.getAButton().whenPressed(new Yellow(shooterSubsystem, true));
        
        secondaryController.getXButton().whenPressed(new Lime(shooterSubsystem, false));
        secondaryController.getXButton().whenPressed(new Yellow(shooterSubsystem, false));
        secondaryController.getXButton().whenPressed(new Green(shooterSubsystem, false));



        
        secondaryController.getLeftYAxis().getButton(0.5).whileHeld(new FeederUp(feederSubsystem));
      secondaryController.getLeftXAxis().getButton(0.5).whileHeld(new FeederDown(feederSubsystem));

      secondaryController.getLeftYAxis().getButton(0.5).whenReleased(new FeederOff(feederSubsystem));
       secondaryController.getLeftXAxis().getButton(0.5).whenReleased(new FeederOff(feederSubsystem));


      //  secondaryController.getRightYAxis().getButton(0.5).whileHeld(new FeederForward(feederSubsystem));
      //  secondaryController.getRightXAxis().getButton(0.5).whileHeld(new FeederReverse(feederSubsystem));


     //   secondaryController.getRightYAxis().getButton(0.5).whenReleased(new FeederOff(feederSubsystem));
      //  secondaryController.getRightXAxis().getButton(0.5).whenReleased(new FeederOff(feederSubsystem));

       // secondaryController.getRightJoystickButton().whenPressed(new FeederOff(feederSubsystem));

    }


}
