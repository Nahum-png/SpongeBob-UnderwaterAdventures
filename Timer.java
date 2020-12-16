import greenfoot.*;  

public class Timer extends Actor{
    private final int SECOND = 60;
    private final int MINUTE = SECOND*60;
    private int minutes;
    private int seconds;
    public static int timeElapsed;

    public Timer(int minutes, int seconds, int timeElapsed){ 
        this.minutes = minutes;
        this.seconds = seconds;
        this.timeElapsed = timeElapsed;
    }

    public void act() {
        watch();
    }  

    public void watch(){
        timeElapsed += 1;
        minutes = timeElapsed/MINUTE;
        seconds = timeElapsed/SECOND % 60;
        getWorld().showText("Time:" + minutes +":"+ seconds,850,10);
    }
}