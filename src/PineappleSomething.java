package src;

import src.FtcClasses.*;

public class PineappleSomething extends LinearOpMode {
    // Drive motors
    public static DcMotorEx frontLeft;
    public static DcMotorEx backLeft;
    public static DcMotorEx frontRight;
    public static DcMotorEx backRight;
    // Arm motors
    public static DcMotorEx armMotor1;
    public static DcMotorEx armMotor2;
    public static DcMotorEx armMotor3;
    public static void mapHardware() {
        //// Motors
        // Drive Motors
        frontLeft = hardwareMap.get("FtcClasses.DcMotorEx.class", "motor1");
        backLeft = hardwareMap.get("FtcClasses.DcMotorEx.class", "motor2");
        frontRight = hardwareMap.get("FtcClasses.DcMotorEx.class", "motor3");
        backRight = hardwareMap.get("FtcClasses.DcMotorEx.class", "motor4");
        frontRight.setDirection("DcMotor.Direction.REVERSE");
        backRight.setDirection("DcMotor.Direction.REVERSE");
        // Arm motors
        armMotor1 = hardwareMap.get("FtcClasses.DcMotorEx.class", "g");
        armMotor2 = hardwareMap.get("FtcClasses.DcMotorEx.class", "h");
        armMotor3 = hardwareMap.get("FtcClasses.DcMotorEx.class", "j");
    }

    public static void runToPosition(int position, int velocity) {
        frontLeft.setMode("DcMotor.RunMode.RUN_TO_POSITION");
        frontRight.setMode("DcMotor.RunMode.RUN_TO_POSITION");
        backLeft.setMode("DcMotor.RunMode.RUN_TO_POSITION");
        backRight.setMode("DcMotor.RunMode.RUN_TO_POSITION");
        frontLeft.setVelocity(velocity);
        frontRight.setVelocity(velocity);
        backLeft.setVelocity(velocity);
        backRight.setVelocity(velocity);

        for (int i = 0; i < position; i += velocity) {
            telemetry.addData("Position", i);
        }
        telemetry.addData("Position", position);

        frontLeft.setEncoder(position);
        frontRight.setEncoder(position);
        backLeft.setEncoder(position);
        backRight.setEncoder(position);
    }

    public static void resetEncoders() {
        frontLeft.resetEncoder();
        frontRight.resetEncoder();
        backLeft.resetEncoder();
        backRight.resetEncoder();
    }
}
