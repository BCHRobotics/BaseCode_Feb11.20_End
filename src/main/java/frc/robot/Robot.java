/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import com.kauailabs.navx.frc.AHRS;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.SerialPort.Port;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.auto.AutoCommands;
import frc.robot.auto.Autonomous;
import frc.robot.auto.TestAuto;
import frc.robot.subsystems.BallHandler;
import frc.robot.subsystems.Drivetrain;
import frc.robot.subsystems.Retriever;
import frc.robot.subsystems.Shooter;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the TimedRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the build.gradle file in the
 * project.
 */
public class Robot extends TimedRobot {

  private final boolean newBot = true; 

  private AHRS ahrs = new AHRS(Port.kUSB);

  private Drivetrain mDrivetrain = new Drivetrain(newBot);
  private OI mOi = new OI();
  private Teleop mTeleop = new Teleop(mOi, mDrivetrain);
  private BallHandler mBallHandler = new BallHandler();
  private Shooter mShooter = new Shooter();
  private Retriever mRetriever = new Retriever();

  private Autonomous mAutonomous = new Autonomous();
  private AutoCommands mAutoCommands = new AutoCommands(ahrs, mDrivetrain, newBot);

  private TestAuto mTestAuto = new TestAuto(mAutoCommands, ahrs, mDrivetrain);
  /**
   * This function is run when the robot is first started up and should be
   * used for any initialization code.
   */
  @Override
  public void robotInit() {
    
  }

  /**
   * This function is called every robot packet, no matter the mode. Use
   * this for items like diagnostics that you want ran during disabled,
   * autonomous, teleoperated and test.
   *
   * <p>This runs after the mode specific periodic functions, but before
   * LiveWindow and SmartDashboard integrated updating.
   */
  @Override
  public void robotPeriodic() {
    //mAutoCommandsTune.setPID();
    mAutoCommands.printPID();

    SmartDashboard.putNumber("gyro", ahrs.getAngle());

    if(SmartDashboard.getBoolean("resetEncoders", false)) mDrivetrain.resetEncoders();
    if(SmartDashboard.getBoolean("resetNavX", false)) ahrs.reset();

    mBallHandler.periodic();
    mDrivetrain.periodic();
    mShooter.periodic();
    mRetriever.periodic();
  }

  /**
   * This autonomous (along with the chooser code above) shows how to select
   * between different autonomous modes using the dashboard. The sendable
   * chooser code works with the Java SmartDashboard. If you prefer the
   * LabVIEW Dashboard, remove all of the chooser code and uncomment the
   * getString line to get the auto name from the text box below the Gyro
   *
   * <p>You can add additional auto modes by adding additional comparisons to
   * the switch structure below with additional strings. If using the
   * SendableChooser make sure to add them to the chooser code above as well.
   */
  @Override
  public void autonomousInit() {
    mAutonomous.init();
  }

  /**
   * This function is called periodically during autonomous.
   */
  @Override
  public void autonomousPeriodic() {
    mAutonomous.periodic();
  }

  /**
   * This function is called periodically during operator control.
   */
  @Override
  public void teleopPeriodic() {
    mTeleop.driveStick();
  }

  /**
   * This function is called periodically during test mode.
   */
  @Override
  public void testPeriodic() {
    
    //PUT YOUR AUTOCODE TO TEST HERE

  }
}
