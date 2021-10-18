package com.frostydev.lib.motorControl;

import com.pi4j.library.pigpio.PiGpio_PWM;
import com.pi4j.util.Console;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PWMMotorController {

    private static final Console console = new Console();
    private static final Logger logger = LoggerFactory.getLogger("Motor Controller");

    private static final PiGpio_PWM pwm = null;

    private static boolean isInverted = false;

    public PWMMotorController() {

    }
}
