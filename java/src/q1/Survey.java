package q1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * <p>creates Household objects from list on survey.txt.</p>
 * @author Anthony Figueroa
 * @version 1.0
 */
public class Survey {
    
    /**
     * main entry point method.
     * @param args  {@inheritDoc}
     * @throws FileNotFoundException 
     */
    public static void main(String[] args) throws FileNotFoundException {
        File surveyTxt = new File("survey.txt");
        Scanner surveyScan = new Scanner(surveyTxt);
        int id;
        int yearlyIncome;
        int householdMembers;
        ArrayList<Household> houses = new ArrayList<Household>();
        Object[] headers = new String[]{
            "ID Number", 
            "Yearly Income", 
            "# of Members", 
            "Income Level"
        };
        
        
        while (surveyScan.hasNextInt()) {
            id = surveyScan.nextInt();
            yearlyIncome = surveyScan.nextInt();
            householdMembers = surveyScan.nextInt();
            Household house = new Household(id, yearlyIncome, householdMembers);
            
            //Add to array list
            houses.add(house);
            
            if (surveyScan.hasNext()) {
                surveyScan.nextLine();
            }
        }
        System.out.format("%15s%15s%15s%15s\n", headers);
       
        for (Household x : houses) {
            System.out.format("%12d%18s%12s%15s\n", 
                    x.getID(), 
                    x.getIncome(), 
                    x.getMembers(), 
                    x.getIncomeLevel());
        }
        System.out.println(Household.getLowIncomePercent() 
                + " of households fall bellow the low income cut-off.");
        System.out.println("\nQuestion one was called and ran sucessfully.");
        surveyScan.close();
    }
    
}
