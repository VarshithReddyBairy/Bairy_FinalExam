/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question03;

/**
 *
 * @author S542263
 */
public class TcsDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int bud = 32000;
        double budget = (double)bud;
        Tcs tcs = new TcsBranches("Kohinoor Park",bud, 3); 
        System.out.println(((TcsBranches)tcs).getProjects()+" and has a bubdget of $"+((TcsBranches)tcs).getBudget());
        TcsBranches tcsBranches = new TcsBranches("Deccan Park", bud,4);
        System.out.println(((Tcs)(tcsBranches)).toString());
    }
    
}
