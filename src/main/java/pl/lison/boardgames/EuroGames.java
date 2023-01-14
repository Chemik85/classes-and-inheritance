package pl.lison.boardgames;

public class EuroGames extends BoardGames{
    private String mechanic;
    public void setMechanic(String mechanic){
        this.mechanic = mechanic;
    }


    @Override
    public String toString(){
        return super.toString() + " Mechanika gry to " + mechanic;
    }
}
