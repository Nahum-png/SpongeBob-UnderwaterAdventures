import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Soda extends Item {

    private GreenfootImage sprite;
    public final static int POINTS_SODA = 15;

    public Soda(){
        sprite = new GreenfootImage("images/soda.png");
        sprite.scale(50,50);

    }

    public int getPoints(){
        return POINTS_SODA;
    }

    public void act() {
        setImage(sprite);
        scroll();
    }
}
