package com.frostydev.lib.camera;

import com.github.sarxos.webcam.Webcam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class CameraServer {

    private static Logger logger = LoggerFactory.getLogger("Camera");

    private static Webcam webcam = Webcam.getDefault();

    public CameraServer() {
        webcam.open();
    }

    public static void getImage() throws IOException {
        if(webcam.getImage() == null) {
            logger.error("No camera detected!");
        } else {
            ImageIO.write(webcam.getImage(), "JPG", new File("/captures/firstCapture.jpg"));
        }

    }
}
