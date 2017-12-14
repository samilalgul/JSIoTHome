/**
 * Created by Samil on 11.12.2017.
 */
public class Door {

    boolean lock;

    public void locking(){

        lock = true;

        System.out.println("Door has been locked");

    }

    public void unlocking(){
        lock = false;

        System.out.println("Door has been unlocked");
    }

    boolean isLock(){
        return lock;
    }
}
