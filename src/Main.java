package src;

import src.FtcClasses.*;

public class Main extends PineappleSomething {
    public static void main(String[] args) {
        telemetry.addData("Something", "value");
        System.out.print(true);
        mapHardware();
        runToPosition(420, 69);
        System.out.println(frontLeft.encoder);
        resetEncoders();
        System.out.println(frontLeft.encoder);
        runToPosition(360, 44);
        System.out.println(frontLeft.encoder);
    }
}