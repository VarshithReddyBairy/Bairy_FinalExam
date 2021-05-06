/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question01;

/**
 *
 * @author S542263
 */
public class CricketPlayer implements Cricket {
    String playerType;
    int numberOfRuns;
    int numOfWickets;
    int numOfCenturies;

    public CricketPlayer(String playerType,int numberOfRuns, int numOfWickets, int numOfCenturies) {
        this.playerType = playerType;
        this.numberOfRuns = numberOfRuns;
        this.numOfWickets = numOfWickets;
        this.numOfCenturies = numOfCenturies;
    }

    @Override
    public String playerStatistics() {
        String statistics;
        if(playerType.equals("batsman")){
            statistics = "The batsman has scored "+numOfCenturies+" centuries and "+numberOfRuns+" runs";
        }
        else
            statistics = "The bowler has taken "+numOfWickets+" wickets";
        return statistics;
    }
    
    
}
