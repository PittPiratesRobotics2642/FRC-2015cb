package org.team2642.robot.commands.Lift;

import org.team2642.robot.Robot;
import org.team2642.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class SetLiftToCoop extends Command {
	
	private int position;
	
    public SetLiftToCoop() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.Lift);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	position = 800;
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.Lift.moveLiftToPos(position);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return Robot.Lift.liftAtTarget(position);
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.Lift.stopLift();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
