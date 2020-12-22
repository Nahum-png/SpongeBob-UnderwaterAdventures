import greenfoot.*;  
import java.time.LocalDateTime;
import java.time.*;
import java.time.temporal.ChronoUnit;

public class Timer extends Actor{

    LocalDateTime startTime = LocalDateTime.now();

    public void act() {
        time();
    }  

    public void time(){
        LocalDateTime current = LocalDateTime.now(); 
        long minutes = ChronoUnit.MINUTES.between(startTime,current);
        long seconds = ChronoUnit.SECONDS.between(startTime,current);

        seconds= seconds %60;

        getWorld().showText("Time : "+minutes +" : "+ seconds , 850,10);
    }
}