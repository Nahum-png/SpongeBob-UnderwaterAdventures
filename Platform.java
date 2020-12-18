import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Platfomr here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Platform extends Actor
{
    private GreenfootImage sprite;
    
    public Platform(){
        sprite = new GreenfootImage("images/platform.png");
        sprite.scale(90,50);
    }
    public void act() 
    {
        setImage(sprite);
        scroll();
    } 
    
     public void scroll(){
        setLocation(getX() - 5, getY());
    }
}
