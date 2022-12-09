package controller;
import models.Movie;
import models.Winner;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.*;

import static javax.swing.JOptionPane.showMessageDialog;

public class MovieController {
    List<Movie> movies;
    public MovieController() {
    //movies=new ArrayList<>();
        getAllMovies();
    }

    public List<Movie> getMovies(){
       return movies;
    }
    public List<Movie> getAllMovies() {
        boolean flag=false;
        movies = new ArrayList<>();

        File[] files = new File("images").listFiles();
        if(files.length%2!=0) {
            showMessageDialog(null,"Для какой-то сущности не находится пары");
            flag = false;
        }
        else {
            flag = true;
            int i=0;
            for(File f : files) {
                movies.add(new Movie(i,removeExtension(f.getName()),new ImageIcon(f.getAbsolutePath()).getImage())); //getAbs возвращает путь к файлу
                i++;
            }
        }
            return movies;
    }
    // парсинг
    public static String removeExtension(String fileName) {
        if (fileName.indexOf(".") > 0) {
            return fileName.substring(0, fileName.lastIndexOf("."));
        } else {
            return fileName;
        }



    }
    public static void imageIoWrite(Winner winner) {
        BufferedImage bImage ;
        try {
            bImage = ImageIO.read(new File(winner.getImageUrl()));
            ImageIO.write(bImage, "jpg", new File("winners/image.png"));


        } catch (IOException e) {
            System.out.println("Ошибка :" + e.getMessage());
        }
        System.out.println("Файлы успешно записаны.");
    }


}
