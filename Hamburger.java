import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Hamburger extends Item {

    private GreenfootImage sprite;
    public final static int POINTS_HAMBURGER = 5;
    
    public Hamburger(){
        sprite = new GreenfootImage("images/burger.png");
        sprite.scale(50,50);
        
        
    }

    public void act() {
        setImage(sprite);
        scroll();
    }
}
