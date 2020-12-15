import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Gary here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Gary extends Vehicle {

    private static final int CHARACTER = 2; 

    public Gary() {
        addSprite(new GreenfootImage("Images/Gary/Gary(1).png"));
        addSprite(new GreenfootImage("Images/Gary/Gary(2).png"));
        addSprite(new GreenfootImage("Images/Gary/Gary(3).png"));
        addSprite(new GreenfootImage("Images/Gary/Gary(4).png"));
        addSprite(new GreenfootImage("Images/Gary/Gary(5).png"));
        addSprite(new GreenfootImage("Images/Gary/Gary(6).png"));
        addSprite(new GreenfootImage("Images/Gary/Gary(7).png"));
        addSprite(new GreenfootImage("Images/Gary/Gary(8).png"));
        addSprite(new GreenfootImage("Images/Gary/Gary(9).png"));

    }

    public int getCharacterId(){
        return CHARACTER;
    }
}
