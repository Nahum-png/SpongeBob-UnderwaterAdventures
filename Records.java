/**
 * Write a description of class Records here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.*;


public class Records  
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Records
     */
    public Records()
    {
    }

    
    public void RegistraRecords(String name)
    
    {
            String nameRecords ="C:\\Users\\Sacrificio Music\\Documents\\GRee\\Proyectofinal\\SpongeBobRace";
         FileWriter fichero = null;
        PrintWriter pw = null;
        try
        {
            fichero = new FileWriter(nameRecords);
            pw = new PrintWriter(fichero);

            for (int i = 0; i < 10; i++)
                pw.println("Linea " + i);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           try {
           // Nuevamente aprovechamos el finally para 
           // asegurarnos que se cierra el fichero.
           if (null != fichero)
              fichero.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }
        }
    }
}