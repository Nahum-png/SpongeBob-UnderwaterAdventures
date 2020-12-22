import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Back here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BackButton extends Button {

    public void act() {
        if (Greenfoot.mouseClicked(this)) {
            StartWorld startWorld = new StartWorld();

            Greenfoot.setWorld(startWorld);
        }

    }
}