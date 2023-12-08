import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DataBase dataBase = new DataBase();
        MoviesSer moviesSer = new MoviesSer();
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        while (true){
            System.out.println("""
                    
                   1. get All Movies
                   2. find Movie By Name Or Part Name
                   3. findMovieByActorName
                   4. findMovieByYear
                   5. find movie by producer
                   6. Find movie by genre
                   7. find movie by role
                   8. sort by name
                   9. sort by year""");
            int num = scanner.nextInt();
            switch (num){
                case  1 -> {
                    moviesSer.getAllMovies();
                }case 2 ->{
                    System.out.print("Enter movie name: ");
                    String name1 = scanner2.nextLine();
                    moviesSer.findMovieByActorName(name1);
                }case 3 -> {
                    System.out.print("Enter actor name: ");
                    String name = scanner1.nextLine();
                    moviesSer.findMovieByActorName(name);
                }case 4 ->{
                    System.out.print("Enter year: ");
                    String year = scanner2.nextLine();
                    moviesSer.findMovieByYear(year);
                }case 5 -> {
                    System.out.print("Enter producer name: ");
                    String producer = scanner1.nextLine();
                    moviesSer.findMovieByProducer(producer);
                }case 6 -> {
                    System.out.print("Enter movie genre: ");
                    String Genre = scanner1.nextLine();
                    moviesSer.findMovieByGenre(Genre);
                }case 7 ->{
                    System.out.print("Enter role: ");
                    String role = scanner2.nextLine();
                    moviesSer.findMovieByRole(role);
                }case 8 ->{
                    System.out.println(  " CHOICE" );
                    System.out.println("From A to Z");
                    System.out.println("From Z to A");
                    String sort = scanner1.nextLine();
                    moviesSer.sortByMovienName(sort);
                }case 9 ->{

                    moviesSer.sortByMovienYear();
                }
            }
        }

    }
}