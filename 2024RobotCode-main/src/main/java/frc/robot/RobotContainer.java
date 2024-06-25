// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.


package frc.robot;

import frc.robot.subsystems.ArmSubsystem;

import frc.robot.commands.SetArmAngleDown;
import frc.robot.commands.SetArmAngleUp;

import  edu.wpi.first.wpilibj2.command.button.CommandXboxController;


import edu.wpi.first.wpilibj.XboxController;
import frc.robot.Constants.OIConstants;

import edu.wpi.first.wpilibj2.command.button.JoystickButton;



import com.pathplanner.lib.auto.NamedCommands;




public class RobotContainer{
 

  private final ArmSubsystem m_arm = new ArmSubsystem();

  static CommandXboxController m_driverController = new CommandXboxController(OIConstants.kDriverControllerPort);
  static CommandXboxController m_operatorController = new CommandXboxController(OIConstants.kOperatorControllerPort);

 
  public RobotContainer() {
    // Register Named Commands Path planner 
    registerNamedCommands();

    // Configure the button bindings
    configureButtonBindings();
    
  }

  public static CommandXboxController getDriverController() {
    return m_driverController;
  }

  public static CommandXboxController getOperatorController() {
    return m_operatorController;
  }

  /**
   * Use this method to define your button->command mappings. Buttons can be
   * created by
   * instantiating a {@link edu.wpi.first.wpilibj.GenericHID} or one of its
   * subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then calling
   * passing it to a
   * {@link JoystickButton}.
   */

   

  
  private void configureButtonBindings() {

         m_operatorController.leftTrigger().whileTrue(m_arm.armSpeakerAngle());

         m_operatorController.rightTrigger().whileTrue(m_arm.armIntakeAngle());

         m_operatorController.leftBumper().whileTrue(m_arm.armClockWise());

         m_operatorController.rightBumper().whileTrue(m_arm.armCounterClockWise());


  }

  public void registerNamedCommands(){
    
    NamedCommands.registerCommand("Arm Speaker Up", new SetArmAngleUp(m_arm, Constants.desiredEncoderValue.kSpeakerArmAngle));
    NamedCommands.registerCommand("Arm Speaker Down", new SetArmAngleDown(m_arm, Constants.desiredEncoderValue.kIntakeArmAngle));
    // NamedCommands.registerCommand("Detect Color", new DetectNoteColor(m_intake, Constants.IntakeShooter.kIntakeSpeed));
    
  }
}