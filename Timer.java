import greenfoot.*;  

public class Timer extends Actor{
    private final int SECOND = 60;
    private final int MINUTE = SECOND*60;
    private int minutes = 0;
    private int seconds = 0;
    public static int timeElapsed = 0;

    public void act() {
        watch();
    }  

    public void watch(){
        timeElapsed += 1;
        minutes = timeElapsed/MINUTE;
        seconds = timeElapsed/SECOND %60;
        getWorld().showText("Time:" + minutes +":"+ seconds,850,10);
      
        
        
    }
}