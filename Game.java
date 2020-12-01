import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Game here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Game extends World
{
        private Background img, img2;
    /**
     * Constructor for objects of class Game.
     * 
     */
    public Game()
    {     // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(989, 520, 1, false);
        
        img = new Background();
        addObject(img, getWidth()/2, getHeight()/2);
        
        img2 = new Background();
        addObject(img2,getWidth() + getWidth()/2, getHeight()/2);
        
    }
    
     public void act(){
     if(Greenfoot.isKeyDown("right")){
        img.scroll();
        img2.scroll();
       
        }
        
    }
}
