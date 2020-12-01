import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Scroll here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Scroller extends Actor
{

    /**
     * Constructor for objects of class Scroll.
     * 
     */
    public void act(){
        
    }
    
    
    public void scroll()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
         if(getX()< -getImage().getWidth()/2){
             setLocation(getX() + getWorld().getWidth()*2, getY());
            }
            
            setLocation (getX()-5,getY());
    }
}
