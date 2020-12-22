
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

public class Game extends World {
    private static final int FLOOR = 430;
    private Background scrollerLeft, scrollerRight;
    private Actor actor;
    private SpongeBob spongeBob;
    private int obstaclesCount;
    private int itemsCount;
    private int platformsCount;
    private int highPlatformsCount;
    private int sodasCount;
    private int obstaclesLimit;
    private int itemLimit;
    private int platformsLimit;
    private int highPlatformsLimit;
    private int sodasLimit;
    private int timeObstacle = 0;
    private int timeItems = 0;
    private int timePlaforms =0;
    private int respawn = 160;

    public Game(int selection) {     
        super(989, 520, 1, false);
        spongeBob = new SpongeBob();
        obstaclesCount = 0;
        itemsCount = 0;
        platformsCount = 0;
        highPlatformsCount = 0;
        sodasCount = 0;
        obstaclesLimit = 1;
        itemLimit = 1;
        highPlatformsLimit= 2;
        platformsLimit= 3;
        sodasLimit= 1;
        scrollerLeft = new Background();
        scrollerRight = new Background();

        addObject(scrollerLeft, getWidth() / 2, getHeight() / 2);
        addObject(scrollerRight, getWidth() + getWidth() / 2, getHeight() / 2);

        addObject(new Timer(),0,0);
        GreenfootSound music =new GreenfootSound("sounds/Soundtrack.mp3");
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

        if(!music.isPlaying()){
            music.play();
        }
    }

    public void act() {

        scrollerLeft.scroll();
        scrollerRight.scroll();
        drawObstacles();
        deleteObstacles();
        drawBurger();
        deleteItems();
        drawPlatforms();
        deletePlatforms();
        pauseAndResume();
        drawSoda();
        drawHighPlatforms();
    }

    public void drawPlatforms(){
        if(platformsCount < platformsLimit){
            Selector selector = new Selector();
            Platform option = selector.selectorPlataforms(Selector.PLATAFORM_SIZE);
            addObject(option,400+Greenfoot.getRandomNumber(700),FLOOR-100);

            platformsCount++;
        }
    }

    public void drawHighPlatforms(){
        if(highPlatformsCount < highPlatformsLimit){
            Selector selector = new Selector();
            Platform option2 = selector.selectorPlataforms(Selector.PLATAFORM_SIZE);
            addObject(option2,400+Greenfoot.getRandomNumber(700),FLOOR-250);
            highPlatformsCount++;

        }

    }

    public void drawObstacles(){
        if(obstaclesCount < obstaclesLimit){
            Selector selector = new Selector();
            int number = new Random().nextInt(Selector.OBSTACLES_SIZE);
            Obstacle option = selector.selectorObstacles(number);
            addObject(option,800,FLOOR);
            obstaclesCount++;
        }
    }

    public void drawBurger(){
        if(itemsCount < itemLimit){
            Selector selector = new Selector();
            int number = new Random().nextInt(Selector.ITEMS_SIZE);
            Item option = selector.selectorItems(number);
            addObject(option,1000+Greenfoot.getRandomNumber(300),FLOOR);
            itemsCount++;
        }
    }

    public void drawSoda(){
        if(sodasCount < sodasLimit){
            Selector selector = new Selector();
            int number = new Random().nextInt(Selector.ITEMS_SIZE);
            Item option = selector.selectorItems(number);
            addObject(option,600+Greenfoot.getRandomNumber(700),FLOOR-300);
            sodasCount++;
        }
    }

    public void deleteObstacles(){
        if(obstaclesCount> 0){
            if(timeObstacle > respawn){
                if(respawn>150){
                    respawn-=5;
                }

                obstaclesCount--;
                timeObstacle = 0;
            }
            timeObstacle++;
        }
    }

    public void deleteItems(){
        if(itemsCount> 0){
            if(timeItems > respawn){
                itemsCount--;
                sodasCount--;
                timeItems = 0;
            }
            timeItems++;
        }
    }

    public void deletePlatforms(){
        if(platformsCount> 0){
            if(timePlaforms > respawn){
                platformsCount=0;
                highPlatformsCount=0;
                timePlaforms = 0;
            }
            timePlaforms++;
        }
    }

    public void pauseAndResume(){
        if (Greenfoot.isKeyDown("p"))      
        { 
            while (!Greenfoot.isKeyDown("enter"))
            {
                Greenfoot.delay(1);
            }
        }
    }
}

