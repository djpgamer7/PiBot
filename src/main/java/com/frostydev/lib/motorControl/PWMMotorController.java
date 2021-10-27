package com.frostydev.lib.motorControl;

import com.pi4j.io.gpio.*;
import com.pi4j.wiringpi.Gpio;
import com.pi4j.wiringpi.SoftPwm;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PWMMotorController {
    private static int motorNum = 0;

    private static Logger logger;

    private int pin;

    public PWMMotorController(int myPin) {
        this.pin = myPin;
        motorNum++;

        logger = LoggerFactory.getLogger("Motor: " + motorNum);
    }
}

