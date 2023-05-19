public class Main extends PineappleSomething {
    public static void main(String[] args) {
        telemetry.addData("Something", "value");
        telemetry.addData("Something", "value");
        telemetry.addData("Something", "value");
        
        mapHardware();
        runToPosition(1000);
    }
}