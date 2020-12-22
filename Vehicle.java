import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

import java.util.ArrayList;

public abstract class Vehicle extends Actor {

    private static final int ITERATIONS_TO_CHANGE_SPRITE = 15;

    private ArrayList<GreenfootImage> sprites;
    protected int currentSprite = 0;
    protected int delaySprite = 0;
    private static final int FLOOR = 430;
    private static int DOWN= +5;
    private static final int ACELERATION = 1;
    private boolean onGround = true;
    protected boolean startGame = false;
    public static int points;

    public Vehicle(){
        sprites = new ArrayList();
        points =0;
    }

    public void act() {
        delaySprites();
        clickedMouse(getCharacterId());
        checkKeys();
        checkFall();
        gameOver();
        checkItem();
        underPlatform();
    }

    public abstract int getCharacterId();

    protected void addSprite(GreenfootImage sprite){
        sprites.add(sprite);
    }

    void delaySprites() {
        if (delaySprite >= ITERATIONS_TO_CHANGE_SPRITE) {
            currentSprite = (++currentSprite) % sprites.size();
            setImage(sprites.get(currentSprite));

            delaySprite = 0;
        }

        delaySprite++;
    }

    void jump(){
        onGround = false;
        DOWN = -20;
        fall();

    }

    public void checkFall(){

        if(getY()==FLOOR || getY()>FLOOR || onPlatform()){
            DOWN=0;
            onGround = true;
        }else if(underPlatform()){
            onGround= false;
            fall();
        }else{
            fall();
        }

    }

    public boolean underPlatform(){
        Actor under= null;
        under= (Actor)getOneObjectAtOffset(0, -30,Platform.class);
        return under!=null;
    }

    public boolean onPlatform(){
        Actor overPlatform = null;
        overPlatform = (Actor)getOneObjectAtOffset(0, +20,Platform.class );
        return overPlatform!=null;

    }

    public void fall(){
        setLocation(getX(), getY() + DOWN);
        DOWN= DOWN + ACELERATION;

    }

    public void checkKeys(){
        if(Greenfoot.isKeyDown("space")){
            if(onGround){
                jump();
                Greenfoot.playSound("sounds/Jump.mp3");
            }
        }
    }

    public void clickedMouse(int character){
        if (Greenfoot.mouseClicked(this) && !startGame){
            Game game = new Game(character);
            startGame = true;
            Greenfoot.setWorld(game);
        }
    }

    public void gameOver(){
        Obstacle obstacle= null;
        obstacle = (Obstacle)getOneObjectAtOffset(+20, +20, Obstacle.class);
        obstacle = (Obstacle)getOneObjectAtOffset(+20,-20, Obstacle.class);
        if(obstacle != null){
            Greenfoot.playSound("sounds/Death.mp3");
            Greenfoot.delay(20);
            Greenfoot.setWorld(new GameOver());
        }
    }

    public void checkItem(){
        Item item = null;

        getWorld().showText(" Points: "+ points, 850,30);

        item= (Item)getOneObjectAtOffset(0, 0, Item.class);

        if(item!=null){
            getWorld().removeObject(item);
            points+= item.getPoints();
        }

    }
}
