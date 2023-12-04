
package javavideogameoop;

import java.util.ArrayList;
import java.util.List;

public class JavaVideogameOOP {

    public static void main(String[] args) {
        
        List<Videogame> listVideogames = new ArrayList<Videogame>();
        
        //Creating differents videogames
        Videogame game1 = new Videogame (123, 4, "Banjo Kazooie", "Nintendo 64", "Platform");
        Videogame game2 = new Videogame (456, 4, "Mario Party 3", "Nintendo 64", "Platform");
        Videogame game3 = new Videogame (789, 1, "Age of Empire II", "PC", "Strategy");
        Videogame game4 = new Videogame (101, 1, "Counter Strike 1.6", "PC", "Shooter");
        Videogame game5 = new Videogame (100, 2, "Mario Kart 64", "Nintendo 64", "Platform");
        
        //Adding videogames to the list
        listVideogames.add(game1);
        listVideogames.add(game2);
        listVideogames.add(game3);
        listVideogames.add(game4);
        listVideogames.add(game5);
        
        //Loop For-Each to show 3 attributes of all games
        for (Videogame i : listVideogames) {
            System.out.println("Title: " + i.getTitle() + ", Console: " + i.getConsole()
                + ", Number of players: "  +  i.getPlayersNum());  
        }
        System.out.println("");
        
        //Changing data
        game1.setTitle("Banjo Kazooie II");
        game1.setPlayersNum(1);
        
        game5.setTitle("Super Mario Kart");
        game5.setPlayersNum(4);
        
        //Loop For-Each for all games
        for (Videogame i : listVideogames) {
            System.out.println("Title: " + i.getTitle() + ", Console: " + i.getConsole()
                + ", Number of players: "  +  i.getPlayersNum());  
        }
        System.out.println("");
        
        //Loop For-Each showing only Nintendo 64's games
        for (Videogame i : listVideogames) {
            if (i.getConsole().equals("Nintendo 64")) {
                System.out.println(i.toString());  
            }
            
        }
        
    }
    
}
