
// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

//import edu.wpi.first.math.MathUtil;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.CommandScheduler;
import frc.robot.Constants.OIConstants;
//import frc.robot.subsystems.DriveSubsystem;
//import com.revrobotics.CANSparkBase.IdleMode;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to
 * each mode, as described in the TimedRobot documentation. If you change the
 * name of this class or
 * the package after creating this project, you must also update the
 * build.gradle file in the
 * project.
 */
public class Robot extends TimedRobot {
private static final String version = "Jeanelle's laptop";

  // Following are for buttons that are either
  // pressed (getRawButton returns true) or not (getRawButton returns false).
  public static final int kAButton = 1;
  public static final int kBButton = 2;
  public static final int kXButton = 3;
  public static final int kYButton = 4;
  public static final int kLeftBumper = 5;
  public static final int kRightBumper = 6;
  public static final int kBackButton = 7;
  public static final int kStartButton = 8;
  public static final int kLeftStickPress = 9;
  public static final int kRighttStickPress = 10;

  // following are for triggers/joy sticks
  // getRawAxis returns values from -1.0000 to 1.0000
  public static final int kLeftStickXaxis = 0;
  public static final int kleftStickYaxis = 1;
  public static final int kLeftTrigger = 2; // 0.00 to 1.00
  public static final int kRightTrigger = 3; // 0.00 to 1.00
  public static final int kRightStickXaxis = 4;
  public static final int kRightStickYaxis = 5;

 
  @Override
  public void robotInit() {
    
  }

  @Override
  public void robotPeriodic() {
   
  }

  
  public void disabledInit() {
  }

  
  @Override
  public void autonomousInit() {
 
  }

 
  @Override
  public void autonomousPeriodic() {
  }

  @Override
  public void teleopInit() {
   
    }
  

  @Override
  public void teleopPeriodic() {
   
  }

  @Override
  public void testInit() {
   
  }

 
  @Override
  public void testPeriodic() {
  }

 
  @Override
  public void disabledPeriodic() {
  }
}