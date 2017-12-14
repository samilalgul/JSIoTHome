/**
 * Created by Samil on 11.12.2017.
 */
public class AlarmClock {

    int sleepingHour;
    int alarmHour;
    String date;

    public AlarmClock(int sleepingHour, int alarmHour, String date) {
        this.sleepingHour = sleepingHour;
        this.alarmHour = alarmHour;
        this.date = date;
    }

    public int getSleepingHour() {
        return sleepingHour;
    }

    public void setSleepingHour(int sleepingHour) {
        this.sleepingHour = sleepingHour;
    }

    public int getAlarmHour() {
        return alarmHour;
    }

    public void setAlarmHour(int alarmHour) {
        this.alarmHour = alarmHour;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
