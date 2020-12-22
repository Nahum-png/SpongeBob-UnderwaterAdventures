import greenfoot.*;
import java.util.*;

/**
 * Write a description of class Scroll here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Scroller extends Actor {
    private int speed=5;

    public void scroll() {

        if (getX() < -getImage().getWidth() / 2) {
            setLocation(getX() + getWorld().getWidth() * 2, getY());
        }

        setLocation(getX() - speed, getY());
    }
}
