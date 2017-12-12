/**
 * Created by Samil on 12.12.2017.
 */
public class Similator {
    public static void main(String[] args) {
        //Please Create Devices what you want
        System.out.println("Selected Devices:");
        SelectedDevice device = new SelectedDevice("Kettle");
        System.out.println(device.getName());
        SelectedDevice device1 = new SelectedDevice("Kombi");
        System.out.println(device1.getName());
        Smartphone smartphone = new Smartphone();
        smartphone.switchSleepMode();
        System.out.println(device.getName()+"\tsleep mode status:\t"+smartphone.sleepMode());
    }
}
