
package javavideogameoop;

public class Videogame {
    
    private int code, playersNum;
    private String title, console, category;

    //Empty Builder
    public Videogame() {
    }

    //Builder
    public Videogame(int code, int playersNum, String title, String console, String category) {
        this.code = code;
        this.playersNum = playersNum;
        this.title = title;
        this.console = console;
        this.category = category;
    }
    
    //Getters & Setters
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getPlayersNum() {
        return playersNum;
    }

    public void setPlayersNum(int playersNum) {
        this.playersNum = playersNum;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getConsole() {
        return console;
    }

    public void setConsole(String console) {
        this.console = console;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    
    /*
    This method is used to display all the values of the object without 
    having to call all the get methods
    */
    @Override
    public String toString() {
        return "Videogame{" + "code=" + code + ", playersNum=" + playersNum + ", title=" + title + ", console=" + console + ", category=" + category + '}';
    }
    
    
}
