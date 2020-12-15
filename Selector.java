import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Selector{

    private final Obstacle coral = new Coral();
    private final Obstacle erizo = new Erizo();
    private final Item hamburguer = new Hamburger();
    public final static int OBSTACLES_SIZE = 2;
    public final static int ITEMS_SIZE = 1;

    public Obstacle selectorObstacles(int obstacle){
        switch(obstacle){
            case 0: return coral;
            case 1: return erizo;
        }
        return null;
    }

    public Item selectorItems(int item){
        switch(item){
            case 0: return hamburguer;
        }
        return null;
    }
}