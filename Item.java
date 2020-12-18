import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Item extends Actor {

    public void act() {

    }

    public int getPoints(){
        return 0;
    }

    public void scroll(){
        setLocation(getX() - 5, getY());
    }
}
