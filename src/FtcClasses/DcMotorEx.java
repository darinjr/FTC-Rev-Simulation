package src.FtcClasses;

import org.w3c.dom.html.HTMLBRElement;

public class DcMotorEx {
    public String deviceClass;
    public String deviceName;

    public int encoder;

    public DcMotorEx(String deviceClass, String deviceName) {
        this.deviceClass = deviceClass;
        this.deviceName = deviceName;
    }

    public void setDirection(String direction) {
        if (direction.equals("DcMotor.Direction.FORWARD")) {
            System.out.println(this + " direction set to forward.");
        }
        else if (direction.equals("DcMotor.Direction.REVERSE")) {
            System.out.println(this + " direction set to reverse.");
        }
        else System.out.println(this + " direction set incorrectly.");
    }

    public String setMode(String mode) {
        if (mode.equals("DcMotor.RunMode.RUN_TO_POSITION")) {
            return "Run to position";
        }
        else return "Mode not set";
    }

    public void setVelocity (int velocity) {
        System.out.println(this + " velocity set to " + velocity);
    }

    public void setEncoder(int encoder) {
        this.encoder = encoder;
    }

    public void resetEncoder() {
        this.encoder = 0;
    }
}