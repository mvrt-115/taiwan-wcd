// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.xrp.XRPServo;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Servo extends SubsystemBase {

  private final XRPServo servo = new XRPServo(4);

  /** Creates a new Servo. */
  public Servo() {}

  public void setAngle(double degrees){
    servo.setAngle(degrees);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
