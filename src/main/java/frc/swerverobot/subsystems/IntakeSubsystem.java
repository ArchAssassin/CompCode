// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.swerverobot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.swerverobot.Constants;

public class IntakeSubsystem extends SubsystemBase {
  /** Creates a new IntakeSubsystem. */
  private CANSparkMax intakeMotor;
  private DoubleSolenoid intakeSolenoid;
  public IntakeSubsystem() {
    intakeMotor = new CANSparkMax(Constants.INTAKE_MOTOR, MotorType.kBrushless);
    intakeSolenoid = new DoubleSolenoid(PneumaticsModuleType.CTREPCM, Constants.INTAKE_EXTENSION_SOLENOID_FORWARD, Constants.INTAKE_EXTENSION_SOLENOID_REVERSE);
  }

  public void setIntakeSpeed(double speed){
    intakeMotor.set(speed);
  }

  public void extendo(){
    intakeSolenoid.set(Value.kForward);
}

public void retractoyo(){
    intakeSolenoid.set(Value.kReverse);
}

public void asphyxiate(){
    intakeSolenoid.set(Value.kOff);
}

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
