import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Coral here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Coral extends Obstacle {

    private GreenfootImage sprite;

    public Coral(){
        sprite = new GreenfootImage("images/coral.png");
        sprite.scale(50,50);
        setImage(sprite);
    }
    
    public void act() {
        scroll();
    }
}
