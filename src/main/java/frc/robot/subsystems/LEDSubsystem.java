/*----------------------------------------------------------------------------*/
/* Copyright (c) 2022 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotContainer;


public class LEDSubsystem extends SubsystemBase {
    /* Rev Robotics Blinkin takes a PWM signal from 1000-2000us
     * This is identical to a SparkMax motor. 
     *  -1  corresponds to 1000us
     *  0   corresponds to 1500us
     *  +1  corresponds to 2000us
     */
    private static Spark m_color = null;
    private final Spark LEDMode = new Spark(X);
  
    /**
     * Creates a new Blinkin LED controller.
     * 
     * @param pwmPort  The PWM port the Blinkin is connected to.
     */
    public LEDSubsystem(int pwmPort) {
        m_color = new Spark(pwmPort);
      solid_orange();
    }

    /*
   * Set the color and blink pattern of the LED strip.
   * 
   * Consult the Rev Robotics Blinkin manual Table 5 for a mapping of values to patterns.
   * 
   * @param val The LED blink color and patern value [-1,1]
   * 
   */ 
    public void set(double val) {
      if ((val >= -1.0) && (val <= 1.0)) {
          m_color.set(val);
      }
    }

    public void Shot_Blue () {
      set(-0.83);
    }

    public void Heartbeat_Red () {
      set(-0.25); /* pending to confirm correct value */
    }

    public void Gold () {
        set(0.67); 
      }
      
    public void Lime () {
        set(0.73); 
      }

    public void White () {
        set(0.93); 
      }
  }