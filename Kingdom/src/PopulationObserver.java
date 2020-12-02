public final class PopulationObserver {

    private PopulationObserver() {
    }
    private static int population,totalBorn,totalDied;

    public static void incresePopulation(){
        totalBorn++;
        population++;
    }

    public static void decreasePopulation(){
        population--;
        totalDied++;
    }



    public static int getPopulation() {
        return population;
    }

    public static int getTotalBorn() {
        return totalBorn;
    }

    public static int getTotalDied() {
        return totalDied;
    }
}
