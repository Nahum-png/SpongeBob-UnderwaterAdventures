import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Write a description of class Records2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Records extends World {
    private static final int INDEX_NAME = 0;
    private static final int INDEX_POINTS = 1;
    private static final String RECORDS_FILE_NAME = "nameData.txt";
    File file = new File(RECORDS_FILE_NAME);
    /**
     * Constructor for objects of class Records2.
     */
    public Records() {
        super(600, 400, 1);
        
        checkFile();
        showRecords();
        addBackButton();
    }

    public void showRecords() {
        String linea = null;
        String[] datos = null;
        List<Player> players = new ArrayList<>();
        Player player = null;
        int count = 0;
        try (FileReader recordsFile = new FileReader(RECORDS_FILE_NAME);
        BufferedReader bufferedReader = new BufferedReader(recordsFile)) {

            while ((linea = bufferedReader.readLine()) != null) {
                datos = linea.split(" ");
                player = new Player(datos[INDEX_NAME], Integer.parseInt(datos[INDEX_POINTS]));
                players.add(player);
                count++;
            }

            Collections.sort(players);
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            show(players, count);
        }

    }

    public void show(List<Player> players, int count) {

        showText("Los 5 Mejores Records:", 450, 100);
        String points;
        for (int i = 0, j = 10; i < count && i < 5; i++, j += 20) {
            showText("Nombre: ", 100, 190 + j);
            showText(players.get(i).getName(), 200, 190 + j);
            showText("Points: ", 300, 190 + j);
            points = Integer.toString(players.get(i).getPoints());
            showText(points, 400, 190 + j);

        }

    }

    public void registerRecords(Player player) {

        try (FileWriter file = new FileWriter(RECORDS_FILE_NAME);
        PrintWriter pw = new PrintWriter(file)) {
            

            for (int i = 0; i < 5; i++)
                pw.println("Name: " + player.getName() + " " + "Score: " + player.getPoints());

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void checkFile(){
        if(!file.exists()){
            try{
                file.createNewFile();
            }catch (IOException ex){
                ex.printStackTrace();
            }
        }
    }

    private void addBackButton() {
        BackButton back = new BackButton();
        addObject(back, 91, 92);
        back.setLocation(550, 350);
    }
}
