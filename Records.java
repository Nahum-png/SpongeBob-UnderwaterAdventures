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
public class Records extends World
{
    private static final int indexName=0;
    private static final int indexPoints=1;
    private static final String fileName = "nameData.txt";
    /**
     * Constructor for objects of class Records2.
     * 
     */
    public Records()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        showRecords();
        back();
    }

    public void showRecords(){
        String linea = null;
        String[] datos = null;
        List<Player> players = new ArrayList<Player>();
        Player player = null;
        int count=0;
        try{
            FileReader f = new FileReader(fileName);
            BufferedReader br = new BufferedReader(f);
            // leer todas la lineas del archivo
            while((linea=br.readLine())!=null){
                // cada linea tiene los datos para crear un producto
                datos = linea.split(" ");
                player = new Player(
                    datos[indexName],
                    Integer.parseInt(datos[indexPoints]));
                // agregamos el producto a la lista de productos
                players.add(player);
                count ++;
            }
            br.close();

            Collections.sort(players);
        }catch(IOException e){
            System.out.println(e);   
        }finally{
            show(players, count);
        }

    }

    public void show(List<Player> players, int count){
        // imprimir archivo ordenado

        showText("Los 5 Mejores Records:",450,100);
        String points;
        for(int i = 0, j = 10; i<count && i<5; i++,j+=20){

            showText("Nombre: ",100,190 + j);
            showText(players.get(i).getName(),200,190 + j);
            showText("Points: ",300,190 + j);
            points = Integer.toString(players.get(i).getPoints());
            showText(points,400,190 + j);

        }

    }

    public void registerRecords(Player player){
        FileWriter file = null;
        PrintWriter pw = null;

        try
        {
            file = new FileWriter(fileName);
            pw = new PrintWriter(file);

            for (int i = 0; i < 5; i++)
                pw.println("Name: " + player.getName() +" "+ "Score: "+ player.getPoints() );

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                // Nuevamente aprovechamos el finally para 
                // asegurarnos que se cierra el fichero.
                if (null != file)
                    file.close();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

    }

    public void back(){
        Back back = new Back();
        addObject(back,91,92);
        back.setLocation(550,350);
    }
}
