
import nhlstats.NHLStatistics;

public class Main {

    public static void main(String[] args) {
        System.out.println("Top 10 by Goals");
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);
        
        System.out.println("");
        System.out.println("Top 25 by Penalties");
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);
        
        System.out.println("");
        System.out.println("Sidney Crosby Stats");
        NHLStatistics.searchByPlayer("Sidney Crosby");
        
        System.out.println("");
        System.out.println("Philly Flyers Stats");
        NHLStatistics.teamStatistics("PHI");
        
        System.out.println("");
        System.out.println("Anaheim Ducks by Points");
        NHLStatistics.sortByPoints();
        NHLStatistics.teamStatistics("ANA");
    }
}
