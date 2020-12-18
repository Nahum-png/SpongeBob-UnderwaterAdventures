import greenfoot.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends World
{
    public static Player player;
    private static final int INDEX_NAME = 0;
    private static final int INDEX_POINTS = 1;
    private static final String RECORDS_FILE_NAME = "nameRecordsData.txt";
    /**
     * Constructor for objects of class GameOver.
     * 
     */
    public GameOver()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, true); 

        String name = writeOnScreen();
        player = registerPlayer(name, SpongeBob.points);
        registerRecords(player);
    }

    public String writeOnScreen(){
        String name = Greenfoot.ask("Name :");
        return name;
    }

    public static Player registerPlayer(String name, int points){
        Player player = new Player(name, points);

        return player;
    } 

    public static void registerRecords(Player player) {

        try (FileWriter file = new FileWriter(RECORDS_FILE_NAME,true);
        PrintWriter pw = new PrintWriter(file)){

            pw.println(player.getName()+","+ player.getPoints());

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
