import controller.MovieController;
import models.Movie;
import models.Winner;

import java.awt.*;
import java.util.*;
import java.util.List;

import static javax.swing.JOptionPane.showMessageDialog;

public class Tournament implements ITournament {
    /*
    Ассоциация – это когда один класс включает в себя другой класс в качестве одного
     из полей. Ассоциация описывается словом «имеет».
    */
    MovieController mc;
    GUI g;
    private List<Movie> movieList;
    private List<Movie> winnerList;
    private int round = 0;
    public Tournament() {

    }

    /*
   Композиция – это когда двигатель не существует отдельно от автомобиля.
   Он создается при создании автомобиля и полностью управляется автомобилем.
   В типичном примере, экземпляр двигателя будет создаваться в конструкторе автомобиля.
     */
     int pairs = 0;              //количество "пар-призеров"

    int tour;  //номер тура
    private int id;

    public Tournament(List<Movie> movieList) {
        this.movieList = movieList;
    }

    public void start(){
        boolean flag=true;
        tour=0;//сброс счетчика тура(ов) при новой игре
        g=new GUI();
        movieList.clear();
        movieList=mc.getAllMovies();

    }
    public int numOfRound() {       //метод возвращает количество раундов (игр)
        return round;
    }

    public int getPairs() {
        //метод, проверяющий сколько пар в списке
        int total = 0;
        int teams = movieList.size();

             if(teams%2==0) {
             total=total+teams/2;
             teams=teams/2;
            }
            else if(teams%2!=0) {
                total=total+(teams-1)/2;
                teams=(teams-1)/2+1;
            }
       // movieList.addAll();
        return total;
        //возвращает кол-во сыгранных турниров, пока не обнаружится победитель */

    }
        public void getElements(){
        if(getPairs()>=1)
        {
            tournament();
        }

    }

    public void tournament() {
        List<Movie> pairsList=new ArrayList<>();
        for (int count=0; count <2; count++) {
            pairsList.add(count,movieList.remove(0));
       }
        pairsList.get(g.getValue());
        //из метода модуля GUI - по какой картинке нажали

    }

    List<Movie>getWinnerList(){
       // winnerList.add(round, movieList.get(0));

        return winnerList;
    }

}
