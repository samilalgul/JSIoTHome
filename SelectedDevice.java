/**
 * Created by Samil on 11.12.2017.
 */
public class SelectedDevice {

    String name;

    public SelectedDevice(String name){

        this.name = name;

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    boolean run;

    void turnOn(){
        run = true;
        System.out.println(run);
    }

    void turnOff(){

            run = false;

    }

    public boolean isRun() {
        return run;
    }


    String deviceStatus(){
        if (run = true){
            return "Power On";
        }
        else return "Power Off";

    }
}
