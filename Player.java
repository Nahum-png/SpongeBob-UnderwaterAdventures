/**
 * Write a description of class Player here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Player implements Comparable<Player> {
    // instance variables - replace the example below with your own
    private String name;
    private int lives;
    private int points;
    private int gas;
    private int time;

    /**
     * Constructor for objects of class Player
     */

    /**
     * An example of a method - replace this comment with your own
     *
     * @param y a sample parameter for a method
     * @return the sum of x and y
     */
    public Player(String name, int lives, int points, int gas) {

        this.name = name;
        this.lives = lives;
        this.points = points;
        this.gas = gas;
    }

    public Player(String name, int points) {
        this.points = points;
        this.name = name;
    }
    
     public Player(String name, int points, int time) {
        this.points = points;
        this.name = name;
        this.time = time;
    }

    @Override
    public int compareTo(Player player) {
        return player.points - points;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public void setGas(int gas) {
        this.gas = gas;
    }

    public String getName() {
        return name;
    }

    public int getLives() {
        return lives;
    }

    public int getPoints() {
        return points;
    }

    public int getGas() {
        return gas;
    }


}
