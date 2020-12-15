import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;


public class Game extends World {

    private static final int FLOOR = 430;
    private Background scrollerLeft, scrollerRight;
    private Actor actor;
    private SpongeBob spongeBob;
    private LinkedList<Obstacle> obstacles;
    private LinkedList<Item> items;
    private int obstaclesLimit;
    private int itemLimit;
    private int timeObstacle = 0;
    private int timeItems = 0;
    private int respawn = 300;

    public Game() {     // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(989, 520, 1, false);
        spongeBob = new SpongeBob();
        obstacles = new LinkedList<>();
        items = new LinkedList<>();
        obstaclesLimit = 1;
        itemLimit = 2;
        scrollerLeft = new Background();
        scrollerRight = new Background();

        addObject(scrollerLeft, getWidth() / 2, getHeight() / 2);
        addObject(scrollerRight, getWidth() + getWidth() / 2, getHeight() / 2);

        addObject(spongeBob, 50, FLOOR);

        addObject(new Timer(),0,0);
       // addBackButton();
        switch(selection){
            case 1: actor = new SpongeBob();

            break;

            case 2: actor = new Gary();

            break;

            case 3:actor= new Patrick();

            break;

            case 4: actor = new Plankton();

            break;
        }
        addObject(actor,150, FLOOR);
        addBackButton();
    }

    public void act() {

        scrollerLeft.scroll();
        scrollerRight.scroll();
        drawObstacles();
        deleteObstacles();
        drawItems();
        deleteItems();
    }

    public void drawObstacles(){
        if(obstacles.size() < obstaclesLimit){
            Selector selector = new Selector();
            int number = new Random().nextInt(Selector.OBSTACLES_SIZE);
            Obstacle option = selector.selectorObstacles(number);
            addObject(option,900,FLOOR);
            obstacles.add(new Obstacle());
        }
    }

    public void drawItems(){
        if(items.size() < itemLimit){
            Selector selector = new Selector();
            int number = new Random().nextInt(Selector.ITEMS_SIZE);
            Item option = selector.selectorItems(number);
            addObject(option,900,FLOOR-80);
            items.add(new Item());
        }
    }

    public void deleteObstacles(){
        if(obstacles.size()> 0){
            if(timeObstacle > respawn){
                obstacles.removeFirst();
                timeObstacle = 0;
            }
            timeObstacle++;
        }
    }

    public void deleteItems(){
        if(items.size()> 0){
            if(timeItems > respawn){
                items.removeFirst();
                timeItems = 0;
            }
            timeItems++;
        }
    }

    /*private void addBackButton() {
        addObject(new BackButton(), 91, 92);
        back.setLocation(900, 480);
    }*/
}
