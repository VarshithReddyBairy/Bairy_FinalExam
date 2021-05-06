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
public class TcsBranches extends Tcs{
    public String branch;
    public double budget;

    public TcsBranches(String branch, int numOfProjects) {
        super(numOfProjects);
        this.branch = branch;
    }

    public TcsBranches(String branch, double budget, int numOfProjects) {
        super(numOfProjects);
        this.branch = branch;
        this.budget = budget;
    }

    public String getBranch() {
        return branch;
    }

    public double getBudget() {
        return budget;
    }

    
    
    public String getProjects(){
        if(branch.equals("Deccan Park"))
         return "Deccan Park location has "+super.numOfProjects+" and the main project developed is Passport";
        if(branch.equals("Kohinoor Park"))
           return "Kohinoor location has "+super.numOfProjects+" and the main project developed is TTD(Tirumala Tirupathi Devasthanams)";
        else
            return "Rest of the projects are developed here";
    }

    @Override
    public String toString() {
        return "TcsBranches{" + "branch=" + branch + ", budget=" + budget + '}';
    }
    
    
}
