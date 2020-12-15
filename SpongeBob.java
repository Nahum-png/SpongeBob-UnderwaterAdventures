import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SpongeBob here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SpongeBob extends Vehicle {

    private static final int FLOOR = 430;
    private static final int TOP = 400;
    private static final int CHARACTER = 1; 

    public SpongeBob() {
        addSprite(new GreenfootImage("Images/Bob/Bob(1).png"));
        addSprite(new GreenfootImage("Images/Bob/Bob(2).png"));
        addSprite(new GreenfootImage("Images/Bob/Bob(3).png"));
        addSprite(new GreenfootImage("Images/Bob/Bob(4).png"));
        addSprite(new GreenfootImage("Images/Bob/Bob(5).png"));
        addSprite(new GreenfootImage("Images/Bob/Bob(6).png"));
        addSprite(new GreenfootImage("Images/Bob/Bob(7).png"));
        addSprite(new GreenfootImage("Images/Bob/Bob(8).png"));
        addSprite(new GreenfootImage("Images/Bob/Bob(9).png"));
        addSprite(new GreenfootImage("Images/Bob/Bob(10).png"));
        addSprite(new GreenfootImage("Images/Bob/Bob(11).png"));
    }

    public int getCharacterId(){
        return CHARACTER;
    }

    
    public void act(){
        super.act();
        
    }
}

