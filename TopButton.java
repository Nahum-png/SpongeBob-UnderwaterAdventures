import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TopButtom here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TopButton extends Button {

    public void act() {
        // Add your action code here.
        if (Greenfoot.mouseClicked(this)) {
            Records records = new Records();

            Greenfoot.setWorld(records);
        }
    }
}
