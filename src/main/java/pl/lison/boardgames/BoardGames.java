package pl.lison.boardgames;

public class BoardGames {
    private String gamesTitle;
    private String numbersOfPlayers;
    private int gameTime;
    private int playerAge;

    public void setGamesTitle(String gamesTitle){
        this.gamesTitle = gamesTitle;
    }

    public void setNumbersOfPlayers(String numbersOfPlayers){
        this.numbersOfPlayers = numbersOfPlayers;
    }



    public void setGameTime(int gameTime){
        this.gameTime = gameTime;
    }



    public void setPlayerAge(int playerAge){
        this.playerAge = playerAge;
    }



    public String toString(){
        return gamesTitle + " to gra dla " + numbersOfPlayers + " w wieku od " +  playerAge + "lat." + " CzasGry "+ gameTime + " minut.";
    }

}
