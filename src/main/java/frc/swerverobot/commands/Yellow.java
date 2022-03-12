// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.swerverobot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.swerverobot.subsystems.ShooterSubsystem;

public class Yellow extends CommandBase {
  /** Creates a new Red. */
  private ShooterSubsystem shooter;
  private boolean on;
  public Yellow(ShooterSubsystem shooter, boolean on) {
    // Use addRequirements() here to declare subsystem dependencies.;
    this.shooter  = shooter;
    this.on = on;
    addRequirements(shooter);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    if(on){
      shooter.setShooterSpeed(0.80);
    }
    else{
      shooter.setShooterSpeed(0);
    }
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
