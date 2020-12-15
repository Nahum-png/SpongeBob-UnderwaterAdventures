import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class SpongeBob extends Vehicle {

    private static final int ITERATIONS_TO_CHANGE_SPRITE = 15;
    public static int points;

    public SpongeBob() {
        points = 0;
        sprites = new GreenfootImage[2];
        sprites[0] = new GreenfootImage("Images/Bob/Bob.png");
        sprites[1] = new GreenfootImage("Images/Bob/Bob2.png");

    }

    public void act() {
        // Add your action code here.
        if (delaySprite >= ITERATIONS_TO_CHANGE_SPRITE) {
            currentSprite = (++currentSprite) % sprites.length;
            setImage(sprites[currentSprite]);

            delaySprite = 0;
        }

        delaySprite++;
        checkKeys();
        checkFall();
        checkCollision();
        checkItem();
    }

    public void checkCollision(){
        
        Obstacle obstacle= null;

        obstacle= (Obstacle)getOneObjectAtOffset(+20, +20, Obstacle.class);
        if(obstacle != null){

            Greenfoot.setWorld(new GameOver());
        }

        
    }

    public void checkItem(){
        getWorld().showText(" Points: "+ points, 850,30);
        if(isTouching(Item.class)){
            
            removeTouching(Item.class);
            points+= Hamburger.POINTS_HAMBURGER;
            
        }
    }
    
}