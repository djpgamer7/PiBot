package com.frostydev;
import com.frostydev.lib.camera.CameraServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class Main {
    private static Logger logger = LoggerFactory.getLogger("Robot Logger");

    private static CameraServer cameraServer;

    public Main() {
        cameraServer = new CameraServer();
    }

    public static void main(String[] args) throws IOException {
        cameraServer.getImage();
    }

}