import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Plankton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Plankton extends Vehicle
{

    private static final int CHARACTER = 4; 

    public Plankton() {
        addSprite(new GreenfootImage("Images/Plankton/Plankton(1).png"));
        addSprite(new GreenfootImage("Images/Plankton/Plankton(2).png"));
        addSprite(new GreenfootImage("Images/Plankton/Plankton(3).png"));
        addSprite(new GreenfootImage("Images/Plankton/Plankton(4).png"));
        addSprite(new GreenfootImage("Images/Plankton/Plankton(5).png"));
        addSprite(new GreenfootImage("Images/Plankton/Plankton(6).png"));
        addSprite(new GreenfootImage("Images/Plankton/Plankton(7).png"));
        addSprite(new GreenfootImage("Images/Plankton/Plankton(8).png"));
        addSprite(new GreenfootImage("Images/Plankton/Plankton(9).png"));
        addSprite(new GreenfootImage("Images/Plankton/Plankton(10).png"));
        addSprite(new GreenfootImage("Images/Plankton/Plankton(11).png"));
        addSprite(new GreenfootImage("Images/Plankton/Plankton(12).png"));
        addSprite(new GreenfootImage("Images/Plankton/Plankton(13).png"));
        addSprite(new GreenfootImage("Images/Plankton/Plankton(14).png"));
        addSprite(new GreenfootImage("Images/Plankton/Plankton(15).png"));
        addSprite(new GreenfootImage("Images/Plankton/Plankton(16).png"));
    }

    public int getCharacterId(){
        return CHARACTER;
    }

}
