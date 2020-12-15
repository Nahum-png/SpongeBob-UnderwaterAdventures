import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Erizo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Erizo extends Obstacle {

    private GreenfootImage sprite;

    public Erizo(){
        sprite = new GreenfootImage("images/erizo.png");
        sprite.scale(50,50);
    }

    public void act() {
        setImage(sprite);
        scroll();
    }
}
