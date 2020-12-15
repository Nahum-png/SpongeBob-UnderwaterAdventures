import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Obstacle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Obstacle extends Actor {

    public Obstacle(){

    }

    public void scroll(){
        setLocation(getX() - 5, getY());
    }
}
