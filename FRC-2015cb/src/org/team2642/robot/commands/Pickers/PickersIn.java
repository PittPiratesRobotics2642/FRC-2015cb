package org.team2642.robot.commands.Pickers;

import org.team2642.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class PickersIn extends Command {

    private double speed;
	
	public PickersIn(double s) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
		requires(Robot.Pickers);
		speed = s; // 0 to 1
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.Pickers.pickerSet(-speed);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.Pickers.stopMotors();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
