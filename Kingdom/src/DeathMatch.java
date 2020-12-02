public class DeathMatch {
    private int rounds;
    private ConstructedPerson winner;

    public ConstructedPerson getWinner() {
        return winner;
    }

    public void setWinner(ConstructedPerson winner) {
        this.winner = winner;
    }

    public void fight(ConstructedPerson contestant1, ConstructedPerson contestant2){
        while(contestant1.isAlive()&&contestant2.isAlive()){
            rounds++;
            contestant1.attack(contestant2);
            if(contestant2.isAlive()){
                contestant2.attack(contestant1);
            }

        }
        if(contestant1.isAlive()){
            winner = contestant1;
        } else {
            winner = contestant2;
        }
        PopulationObserver.decreasePopulation();
        System.out.println(winner.getTheName()+ " has won the match in "+rounds+" rounds.");
    }

}
