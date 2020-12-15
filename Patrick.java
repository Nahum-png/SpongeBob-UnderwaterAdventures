import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Patrick here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Patrick extends Vehicle {

    private static final int CHARACTER = 3; 

    public Patrick() {
        addSprite(new GreenfootImage("Images/Patrick/Patrick(1).png"));
        addSprite(new GreenfootImage("Images/Patrick/Patrick(2).png"));
        addSprite(new GreenfootImage("Images/Patrick/Patrick(3).png"));
        addSprite(new GreenfootImage("Images/Patrick/Patrick(4).png"));
        addSprite(new GreenfootImage("Images/Patrick/Patrick(5).png"));
        addSprite(new GreenfootImage("Images/Patrick/Patrick(6).png"));
        addSprite(new GreenfootImage("Images/Patrick/Patrick(7).png"));
        addSprite(new GreenfootImage("Images/Patrick/Patrick(8).png"));
        addSprite(new GreenfootImage("Images/Patrick/Patrick(9).png"));
        addSprite(new GreenfootImage("Images/Patrick/Patrick(10).png"));
        addSprite(new GreenfootImage("Images/Patrick/Patrick(11).png"));
        addSprite(new GreenfootImage("Images/Patrick/Patrick(12).png"));
    }

    public int getCharacterId(){
        return CHARACTER;
    }
}
