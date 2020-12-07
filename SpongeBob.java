import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SpongeBob here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SpongeBob extends Vehicle
{
    
    private static final int ITERATIONS_TO_CHANGE_SPRITE = 15;
    
    
    
    public SpongeBob(){
        sprites = new GreenfootImage[2];
        sprites[0] = new GreenfootImage("Images/Bob/Bob.png");
        sprites[1] = new GreenfootImage("Images/Bob/Bob2.png");   
        
    }
    /**
     * Act - do whatever the SpongeBob wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
          if(delaySprite >= ITERATIONS_TO_CHANGE_SPRITE)
        {
           currentSprite = (++currentSprite) % sprites.length;
           setImage(sprites[currentSprite]);

           delaySprite = 0;
        }
        
        delaySprite++;
        
    } 
    
   
    
}
