import java.util.List;

public class Tourney {
    private List<ConstructedPerson> winnersList;

    public void runTourney(List<ConstructedPerson> contestantsList) {
        try {
            //if ((contestantsList.size() % 2) != 0) throw Exception;

            for (int i = 0; i < contestantsList.size(); i += 2) {
                DeathMatch match = new DeathMatch();
                //match.setWinner(contestantsList.get(i));
                match.fight(contestantsList.get(i), contestantsList.get(i + 1));
                winnersList.add(match.getWinner());
            }
        } catch (IndexOutOfBoundsException e){
            winnersList.add(contestantsList.get(contestantsList.size()-1));
        }

    }
    public void showWinners(){
        winnersList.forEach(winner -> System.out.println(winner.getTheName()));
    }

}


