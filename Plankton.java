import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Plankton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Plankton extends Delay
{

    private static final int ITERATIONS_TO_CHANGE_SPRITE = 15;
    private static final int MAX_NUMBER_SPRITES = 16;
    private static final int CHARACTER = 4; 

    public Plankton() {
        sprites = new GreenfootImage[MAX_NUMBER_SPRITES];
        sprites[0] = new GreenfootImage("Images/Plankton/Plankton(1).png");
        sprites[1] = new GreenfootImage("Images/Plankton/Plankton(2).png");
        sprites[2] = new GreenfootImage("Images/Plankton/Plankton(3).png");
        sprites[3] = new GreenfootImage("Images/Plankton/Plankton(4).png");
        sprites[4] = new GreenfootImage("Images/Plankton/Plankton(5).png");
        sprites[5] = new GreenfootImage("Images/Plankton/Plankton(6).png");
        sprites[6] = new GreenfootImage("Images/Plankton/Plankton(7).png");
        sprites[7] = new GreenfootImage("Images/Plankton/Plankton(8).png");
        sprites[8] = new GreenfootImage("Images/Plankton/Plankton(9).png");
        sprites[9] = new GreenfootImage("Images/Plankton/Plankton(10).png");
        sprites[10] = new GreenfootImage("Images/Plankton/Plankton(11).png");
        sprites[11] = new GreenfootImage("Images/Plankton/Plankton(12).png");
        sprites[12] = new GreenfootImage("Images/Plankton/Plankton(13).png");
        sprites[13] = new GreenfootImage("Images/Plankton/Plankton(14).png");
        sprites[14] = new GreenfootImage("Images/Plankton/Plankton(15).png");
        sprites[15] = new GreenfootImage("Images/Plankton/Plankton(16).png");
    }

    @Override
    void delaySprites() {
        if (delaySprite >= ITERATIONS_TO_CHANGE_SPRITE) {
            currentSprite = (++currentSprite) % sprites.length;
            setImage(sprites[currentSprite]);

            delaySprite = 0;
        }

        delaySprite++;
    }

    public void act()
    {

        delaySprites();
        clickedMouse(CHARACTER);
        checkKeys();
        checkFall();
    }

}
