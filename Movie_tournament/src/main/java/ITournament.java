import models.Movie;
import java.util.List;

public interface ITournament {

    //List<Movie>getList();

    void start();
    int getPairs();     //количество встреч
    int numOfRound();
    void getElements();
    void tournament();

}
