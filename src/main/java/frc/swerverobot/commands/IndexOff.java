// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.swerverobot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.swerverobot.subsystems.IndexSubsystem;
import frc.swerverobot.subsystems.IntakeSubsystem;

public class IndexOff extends CommandBase {
  /** Creates a new IndexUp. */
  private IndexSubsystem index;
  public IndexOff(IndexSubsystem index) {

    this.index = index;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(index);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    index.setIndexSpeed(0);
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
