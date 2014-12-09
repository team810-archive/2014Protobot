// RobotBuilder Version: 1.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc810;
    
import edu.wpi.first.wpilibj.*;

import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import java.util.Vector;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static SpeedController driveDrive1;
    public static SpeedController driveDrive2;
    public static Compressor mechanismCompressor;
    public static Solenoid mechanismPiston;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        driveDrive1 = new Victor(1, 1);
	LiveWindow.addActuator("Drive", "Drive1", (Victor) driveDrive1);
        
        driveDrive2 = new Victor(1, 2);
	LiveWindow.addActuator("Drive", "Drive2", (Victor) driveDrive2);
        
        mechanismCompressor = new Compressor(1, 1, 1, 1);
	
        
        mechanismPiston = new Solenoid(1, 1);
	LiveWindow.addActuator("Mechanism", "Piston", mechanismPiston);
        
        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}
