package src.FtcClasses;

public class Telemetry {
    public Telemetry() {

    }

    public void addData(String caption, String content) {
        System.out.println(caption + ": " + content);
    }
    public void addData(String caption, int content) {
        System.out.println(caption + ": " + content);
    }
    public void addData(String caption, double content) {
        System.out.println(caption + ": " + content);
    }
}
