import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Game here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Game extends World {

    private static final int FLOOR = 430;
    private Background scrollerLeft, scrollerRight;
    private Actor actor;
    /**
     * Constructor for objects of class Game.
     */
    public Game(int selection) {     // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(989, 520, 1, false);

        scrollerLeft = new Background();
        addObject(scrollerLeft, getWidth() / 2, getHeight() / 2);

        scrollerRight = new Background();
        addObject(scrollerRight, getWidth() + getWidth() / 2, getHeight() / 2);

        switch(selection){
            case 1: SpongeBob spongebob = new SpongeBob();
            actor = spongebob; 
            break;

            case 2: Gary gary = new Gary();
            actor = gary;
            break;

            case 3: Patrick patrick = new Patrick();
            actor = patrick;
            break;

            case 4: Plankton plankton = new Plankton();
            actor = plankton;
            break;
        }
        addObject(actor,150, FLOOR);
        addBackButton();
    }

    public void act() {

        scrollerLeft.scroll();
        scrollerRight.scroll();

    }

    private void addBackButton() {
        BackButton back = new BackButton();
        addObject(back, 91, 92);
        back.setLocation(900, 480);
    }
}
