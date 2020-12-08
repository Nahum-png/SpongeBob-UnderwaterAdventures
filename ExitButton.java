import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ExitButton here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ExitButton extends Button {

    public void act() {
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.stop();
        }
    }
}
