import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Scroll here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Scroller extends Actor {


    public void act() {

    }

    public void scroll() {

        if (getX() < -getImage().getWidth() / 2) {
            setLocation(getX() + getWorld().getWidth() * 2, getY());
        }

        setLocation(getX() - 5, getY());
    }
}
