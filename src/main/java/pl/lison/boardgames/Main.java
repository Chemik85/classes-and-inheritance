package pl.lison.boardgames;

public class Main {
    public static void main(String[] args){
        BoardGames newGame = new BoardGames();
        newGame.setGamesTitle("Aeon's End");
        newGame.setNumbersOfPlayers("1-4");
        newGame.setPlayerAge(14);
        newGame.setGameTime(60);

        System.out.println(newGame);

        EuroGames newGames2 = new EuroGames();
        newGames2.setGamesTitle("Teotihuacan");
        newGames2.setNumbersOfPlayers("1-4");
        newGames2.setGameTime(120);
        newGames2.setPlayerAge(14);
        newGames2.setMechanic("worker placement");

        System.out.println(newGames2);
    }

}
