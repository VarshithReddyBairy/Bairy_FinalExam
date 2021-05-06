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
public class CricketDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CricketPlayer cricPlayer = new CricketPlayer("batsman",12000,0,2);
        CricketPlayer cricPlayer2 = new CricketPlayer("bowler",0,400,0);
        System.out.println(cricPlayer.playerStatistics());
        System.out.println(cricPlayer2.playerStatistics());
    }
    
}
