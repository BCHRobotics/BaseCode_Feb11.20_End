/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.revrobotics.CANEncoder;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotMap;

public class ColorWheel extends SubsystemBase {

  private CANSparkMax SPARK_COLOREXTEND = new CANSparkMax(RobotMap.SPARK_COLOREXTEND, MotorType.kBrushless);
  private CANSparkMax SPARK_COLORSPINNER = new CANSparkMax(RobotMap.SPARK_COLORSPINNER, MotorType.kBrushless);

  private CANEncoder encoderExtend = new CANEncoder(SPARK_COLOREXTEND);
  private CANEncoder encoderSpinner = new CANEncoder(SPARK_COLORSPINNER);

  private double encoderExtendCal = 1;
  private double encoderSpinnerCal = 1;

  private double extendMin = 0;
  private double extendMax = 1;
  
  /**
   * Creates a new ColorWheel.
   */
  public ColorWheel() {

    SPARK_COLOREXTEND.setInverted(false);
    SPARK_COLORSPINNER.setInverted(false);
  
  }

  public void extend(double speed){

    if(getEncoderExtend() <= extendMax ){
      SPARK_COLOREXTEND.set(speed);
    } else{
      SPARK_COLOREXTEND.set(0);
    }

  }

  public void retract(double speed){

    if(getEncoderExtend() >= extendMin ){
      SPARK_COLOREXTEND.set(speed);
    } else{
      SPARK_COLOREXTEND.set(0);
    }
  
  }

  public void manualSpin(double speed){
    SPARK_COLORSPINNER.set(speed);
  }

  public void automaticSpin(double speed){
  
  }

  public double getEncoderExtend(){
    return encoderExtend.getPosition() / encoderExtendCal;
  }

  public double getEncoderSpinner(){
    return encoderSpinner.getPosition() / encoderSpinnerCal;
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
