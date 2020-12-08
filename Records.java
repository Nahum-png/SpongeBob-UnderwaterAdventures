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

    /**
     * Constructor for objects of class Records2.
     */
    public Records() {
        super(600, 400, 1);

        showRecords();
        back();
    }

    public void showRecords() {
        String linea = null;
        String[] datos = null;
        List<Player> players = new ArrayList<>();
        Player player = null;
        int count = 0;
        try (FileReader f = new FileReader(RECORDS_FILE_NAME)) {
            BufferedReader br = new BufferedReader(f);
            while ((linea = br.readLine()) != null) {
                datos = linea.split(" ");
                player = new Player(datos[INDEX_NAME], Integer.parseInt(datos[INDEX_POINTS]));
                players.add(player);
                count++;
            }
            br.close();

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

        try (FileWriter file = new FileWriter(RECORDS_FILE_NAME)) {

            PrintWriter pw = new PrintWriter(file);

            for (int i = 0; i < 5; i++)
                pw.println("Name: " + player.getName() + " " + "Score: " + player.getPoints());

        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    public void back() {
        Back back = new Back();
        addObject(back, 91, 92);
        back.setLocation(550, 350);
    }
}
