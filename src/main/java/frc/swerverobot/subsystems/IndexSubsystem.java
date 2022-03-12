// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.swerverobot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.swerverobot.Constants;

public class IndexSubsystem extends SubsystemBase {
  private CANSparkMax indexMotor;
  /** Creates a new IndexSubsystem. */
  public IndexSubsystem() {
    indexMotor = new CANSparkMax(Constants.INDEX_MOTOR, MotorType.kBrushed);
  }
  public void setIndexSpeed(double speed){
    indexMotor.set(speed);
  }
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
