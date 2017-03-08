package org.usfirst.frc.team1646.robot.commands;

import org.usfirst.frc.team1646.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class AutoReleaseServo extends Command {
	boolean releaseGear;
	
    public AutoReleaseServo(boolean releaseGear) {
    	this.releaseGear = releaseGear;
    	requires(Robot.gearStabilizer);
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
		if (releaseGear) {
			Robot.gearStabilizer.moveToReleasedL();
			Robot.gearStabilizer.moveToReleasedR();
		}
	}

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return true;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
