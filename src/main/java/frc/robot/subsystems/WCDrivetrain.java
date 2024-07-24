// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.xrp.XRPMotor;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class WCDrivetrain extends SubsystemBase {

  private final XRPMotor leftMotor = new XRPMotor(0);
  private final XRPMotor rightMotor = new XRPMotor(1);

  /** Creates a new WCDrivetrain. */
  public WCDrivetrain() {}

  public void move(double speed, double turn){
    double left = speed + turn;
    double right = speed - turn;

    leftMotor.set(left);
    rightMotor.set(-right);
  }

  public void stop(){
    move(0,0);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
