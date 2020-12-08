import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Back here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Back extends Button {

    public void act() {
        // Add your action code here.
        if (Greenfoot.mouseClicked(this)) {
            Start start = new Start();

            Greenfoot.setWorld(start);
        }

    }
}
