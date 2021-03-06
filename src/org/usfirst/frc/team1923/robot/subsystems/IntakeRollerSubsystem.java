package org.usfirst.frc.team1923.robot.subsystems;

import org.usfirst.frc.team1923.robot.Robot;
import org.usfirst.frc.team1923.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *Subsystem to handle intake talons
 */
public class IntakeRollerSubsystem extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	private String intakeState = "Neutral";
	private boolean override = false;

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
    }
    
    public void intake(){
    	RobotMap.intake.set(-1);
    	intakeState="In";

    }
    
    public void outake(){
    	RobotMap.intake.set(1);
    	intakeState="Out";
    }
    
    public void neutral(){
    	RobotMap.intake.set(0);
    	intakeState="Neutral";
    }
    
    public String getIntakeState(){
    	return intakeState;
    }
    
    public void setOverride(boolean bool){
    	override = bool;
    }
    
    public boolean getOverride(){
    	return override;
    }
    
    
}

