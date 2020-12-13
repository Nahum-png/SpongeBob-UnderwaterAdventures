import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SpongeBob here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SpongeBob extends Vehicle {

    private static final int ITERATIONS_TO_CHANGE_SPRITE = 15;
    private static final int MAX_NUMBER_SPRITES = 11;
    private static final int FLOOR = 430;
    private static final int TOP = 400;
    private static final int CHARACTER = 1; 
    
    public SpongeBob() {
        sprites = new GreenfootImage[MAX_NUMBER_SPRITES];
        sprites[0] = new GreenfootImage("Images/Bob/Bob(1).png");
        sprites[1] = new GreenfootImage("Images/Bob/Bob(2).png");
        sprites[2] = new GreenfootImage("Images/Bob/Bob(3).png");
        sprites[3] = new GreenfootImage("Images/Bob/Bob(4).png");
        sprites[4] = new GreenfootImage("Images/Bob/Bob(5).png");
        sprites[5] = new GreenfootImage("Images/Bob/Bob(6).png");
        sprites[6] = new GreenfootImage("Images/Bob/Bob(7).png");
        sprites[7] = new GreenfootImage("Images/Bob/Bob(8).png");
        sprites[8] = new GreenfootImage("Images/Bob/Bob(9).png");
        sprites[9] = new GreenfootImage("Images/Bob/Bob(10).png");
        sprites[10] = new GreenfootImage("Images/Bob/Bob(11).png");
    }

    /**
     * Act - do whatever the SpongeBob wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
        // Add your action code here.
        if (delaySprite >= ITERATIONS_TO_CHANGE_SPRITE) {
            currentSprite = (++currentSprite) % sprites.length;
            setImage(sprites[currentSprite]);

            delaySprite = 0;
        }

        delaySprite++;
        
        if(startGame == false){
          clickedMouse(CHARACTER);
        }
        

        checkKeys();
        checkFall();

    }

}

