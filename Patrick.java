import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Patrick here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Patrick extends Delay {

    private static final int ITERATIONS_TO_CHANGE_SPRITE = 15;
    private static final int MAX_NUMBER_SPRITES = 12;
    private static final int CHARACTER = 3; 

    public Patrick() {
        sprites = new GreenfootImage[MAX_NUMBER_SPRITES];
        sprites[0] = new GreenfootImage("Images/Patrick/Patrick(1).png");
        sprites[1] = new GreenfootImage("Images/Patrick/Patrick(2).png");
        sprites[2] = new GreenfootImage("Images/Patrick/Patrick(3).png");
        sprites[3] = new GreenfootImage("Images/Patrick/Patrick(4).png");
        sprites[4] = new GreenfootImage("Images/Patrick/Patrick(5).png");
        sprites[5] = new GreenfootImage("Images/Patrick/Patrick(6).png");
        sprites[6] = new GreenfootImage("Images/Patrick/Patrick(7).png");
        sprites[7] = new GreenfootImage("Images/Patrick/Patrick(8).png");
        sprites[8] = new GreenfootImage("Images/Patrick/Patrick(9).png");
        sprites[9] = new GreenfootImage("Images/Patrick/Patrick(10).png");
        sprites[10] = new GreenfootImage("Images/Patrick/Patrick(11).png");
        sprites[11] = new GreenfootImage("Images/Patrick/Patrick(12).png");
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
