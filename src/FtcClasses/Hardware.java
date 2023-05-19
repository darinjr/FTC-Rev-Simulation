package src.FtcClasses;

public class Hardware {
    public Hardware() {

    }

    public DcMotorEx get(String deviceClass, String deviceName) {
        return new DcMotorEx(deviceClass, deviceName);
    }
}
