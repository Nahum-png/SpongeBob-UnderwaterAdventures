import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

import java.util.ArrayList;

/**
 * Write a description of class Vehicle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Vehicle extends Actor {

    private static final int ITERATIONS_TO_CHANGE_SPRITE = 15;

    private ArrayList<GreenfootImage> sprites;
    protected int currentSprite = 0;
    protected int delaySprite = 0;
    private static final int FLOOR = 430;
    int DOWN= +5;
    boolean onGround = true;
    private static final int ACELERATION = 1;
    protected boolean startGame = false;

    public Vehicle(){
        sprites = new ArrayList();
    }

    public void act() {
        delaySprites();
        clickedMouse(getCharacterId());
        checkKeys();
        checkFall();
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
        DOWN = -15;
        fall();

    }

    public void checkFall(){
        if(getY()==FLOOR || getY()>FLOOR){
            DOWN=0;
            onGround = true;
        }else{
            fall();
        }

    }

    public void fall(){

        setLocation(getX(), getY() + DOWN);
        DOWN= DOWN + ACELERATION;

    }

    public void checkKeys(){
        if(Greenfoot.isKeyDown("space")){
            if(onGround)
                jump();

        }
    }

    public void clickedMouse(int character){
        if (Greenfoot.mouseClicked(this) && !startGame){
            Game game = new Game(character);
            startGame = true;
            Greenfoot.setWorld(game);
        }
    }

}
