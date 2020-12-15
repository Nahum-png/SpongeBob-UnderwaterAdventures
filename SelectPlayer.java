import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SelectPlayer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SelectPlayer extends World
{

    public SelectPlayer()
    {    
        super(989, 520, 1, false); 
        prepare();

    }

    public void prepare(){
        SpongeBob spongeBob = new SpongeBob();
        addObject(spongeBob, 91, 92);
        spongeBob.setLocation(450, 250);

        Gary gary = new Gary();
        addObject(gary, 91, 92);
        gary.setLocation(350, 250);

        Patrick patrick = new Patrick();
        addObject(patrick, 91, 92);
        patrick.setLocation(250, 250);

        Plankton plankton = new Plankton();
        addObject(plankton, 91, 92);
        plankton.setLocation(150, 250);
    }
}
