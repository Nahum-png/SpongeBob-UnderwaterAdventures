import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Help here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class HelpScreen extends World {

    public HelpScreen() {
        
        super(648, 367, 1);

        addBackButton();
    }

    private void addBackButton() {

        BackButton back = new BackButton();
        addObject(back, 91, 92);
        back.setLocation(550, 300);
    }
}
