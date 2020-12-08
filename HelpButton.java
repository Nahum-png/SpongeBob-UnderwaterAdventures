import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HelpButtom here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class HelpButton extends Button {

    public void act() {
        // Add your action code here.
        if (Greenfoot.mouseClicked(this)) {
            Help help = new Help();

            Greenfoot.setWorld(help);
        }
    }
}
