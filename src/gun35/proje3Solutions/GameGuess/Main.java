package gun35.proje3Solutions.GameGuess;

public class Main {


    /*
     Main methodunda
     İlk olarak randomGenerator method'undan random sayıyı alın
     Sonra LetsGuess method unu çağırın.
     randomGenerator,  LetsGuess method'unun parametresidir
     */


    public static void main(String[] args) {

        GuessGame g = new GuessGame();
        g.letsGuess(g.randomGenerator());
    }

}
