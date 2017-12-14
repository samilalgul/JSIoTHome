/**
 * Created by Samil on 11.12.2017.
 */
public class JSIoTSoftware {

    boolean sleep;

    void switchSleepMode(){

        System.out.println("Sleep Mode Switched");
        sleep = true;

    }
    void switchAwakeMode(){

        System.out.println("Awake Mode Switched");
        sleep = false;

    }
    boolean sleepMode(){

        return sleep;

    }

    void commandSmartphone(){
        if (sleep == true){
            System.out.println();

        }
        if (sleep == false){

        }

    }

    void touchButton(){

    }

}
