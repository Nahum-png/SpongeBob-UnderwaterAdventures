import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HelpButtom here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HelpButton extends Button
{
    /**
     * Act - do whatever the HelpButtom wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this)){
             Help help = new Help();
           
           Greenfoot.setWorld(help);
        }
    }    
}
