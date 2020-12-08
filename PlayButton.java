import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartButton here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PlayButton extends Button {
    public void act() {
        if (Greenfoot.mouseClicked(this)) {
            Game game = new Game();

            Greenfoot.setWorld(game);
        }
    }
}
