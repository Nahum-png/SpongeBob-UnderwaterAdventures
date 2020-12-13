import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Vehicle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Vehicle extends Actor {
    protected GreenfootImage sprites[];
    protected int currentSprite = 0;
    protected int delaySprite = 0;
    private static final int FLOOR = 430;
    int DOWN= +5;
    boolean onGround = true;
    private static final int ACELERATION = 1;
    protected boolean startGame = false;

    public void act() {
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
