import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Start here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Start extends World
{

    /**
     * Constructor for objects of class Start.
     * 
     */
    public Start()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 600, 1); 
       prepare();
    }
    
       private void prepare()
    {
        PlayButton playButton = new PlayButton();
        addObject(playButton,91,92);
        playButton.setLocation(450,250);
        
        HelpButton helpButton = new HelpButton();
        addObject(helpButton,91,92);
        helpButton.setLocation(460,350);
        
        ExitButton exitButton = new ExitButton();
        addObject(exitButton,91,92);
        exitButton.setLocation(460,550);
        
        TopButton topButton = new TopButton();
        addObject(topButton,91,92);
        topButton.setLocation(460,450);
        
        
    }
}
