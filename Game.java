import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Game here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Game extends World {

    private int floor = 430;
    private Background scrollerLeft, scrollerRight;
    private SpongeBob spongeBob;

    /**
     * Constructor for objects of class Game.
     */
    public Game() {     // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(989, 520, 1, false);

        scrollerLeft = new Background();
        addObject(scrollerLeft, getWidth() / 2, getHeight() / 2);

        scrollerRight = new Background();
        addObject(scrollerRight, getWidth() + getWidth() / 2, getHeight() / 2);

        spongeBob = new SpongeBob();
        addObject(spongeBob, 50, floor);


        backButton();
    }

    public void act() {
        if (Greenfoot.isKeyDown("right")) {
            scrollerLeft.scroll();
            scrollerRight.scroll();

        }

    }

    public void backButton() {

        Back back = new Back();
        addObject(back, 91, 92);
        back.setLocation(900, 480);
    }
}
