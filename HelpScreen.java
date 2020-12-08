import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Help here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class HelpScreen extends World {

    public HelpScreen() {
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);

        addBackButton();
    }

    private void addBackButton() {

        BackButton back = new BackButton();
        addObject(back, 91, 92);
        back.setLocation(550, 350);
    }
}
