import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Gary here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Gary extends Delay{

    private static final int ITERATIONS_TO_CHANGE_SPRITE = 15;
    private static final int MAX_NUMBER_SPRITES = 9;
    private static final int CHARACTER = 2; 

    public Gary() {
        sprites = new GreenfootImage[MAX_NUMBER_SPRITES];
        sprites[0] = new GreenfootImage("Images/Gary/Gary(1).png");
        sprites[1] = new GreenfootImage("Images/Gary/Gary(2).png");
        sprites[2] = new GreenfootImage("Images/Gary/Gary(3).png");
        sprites[3] = new GreenfootImage("Images/Gary/Gary(4).png");
        sprites[4] = new GreenfootImage("Images/Gary/Gary(5).png");
        sprites[5] = new GreenfootImage("Images/Gary/Gary(6).png");
        sprites[6] = new GreenfootImage("Images/Gary/Gary(7).png");
        sprites[7] = new GreenfootImage("Images/Gary/Gary(8).png");
        sprites[8] = new GreenfootImage("Images/Gary/Gary(9).png");
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

    public void act() {
        delaySprites();
        clickedMouse(CHARACTER);
        checkKeys();
        checkFall();
    }
}
