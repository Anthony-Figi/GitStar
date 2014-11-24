package q1;

import java.text.NumberFormat;
import java.util.Locale;


/**
 * <p>Creates a household object which consist of a identification number,
 * yearly income, number of household members 
 * and the total amount of household objects.</p>
 *
 * @author Anthony Figueroa
 * @version 1.0
 */
public class Household {
    /**1member household low income cut-off.*/
    private static final int ONE_MEMBERS = 22229;
    
    /**2member household low income cut-off.*/
    private static final int TWO_MEMBERS = 27674;
    
    /**3member household low income cut-off.*/
    private static final int THREE_MEMBERS = 34022;
    
    /**4member household low income cut-off.*/
    private static final int FOUR_MEMBERS = 41307;
    
    /**5member household low income cut-off.*/
    private static final int FIVE_MEMBERS = 46850;
    
    /**7member household low income cut-off.*/
    private static final int SIX_MEMBERS = 52838;
    
    /**7member household low income cut-off.*/
    private static final int SEVEN_MEMBERS = 58827;
    
    /** additional member household low income cut-off.*/
    private static final int EXTRA_MEMBERS = 5989;
    
    /**Stores the number of household objects.*/
    private static int numHousehold;
    
    /**Stores the number of low income houses.*/
    private static double incomeBellow;
    
    /**sets the percent locale.*/
    private static Locale loc = Locale.US;
    
    /**formats the low income percent.*/
    private static NumberFormat per = NumberFormat.getPercentInstance(loc);
    
    /**Stores the possible count of household members.*/
    private static final int[] MEMBERS = new int[]{1, 2, 3, 4, 5, 6, 7};
    
    /**Stores the identification number.*/
    private int id;
    /**Stores the yearly income.*/
    private int income;
    /**Stores the number of household members.*/
    private int numMembers;
    /**formats the income into currency.*/
    private NumberFormat fmt = NumberFormat.getCurrencyInstance();
    
    
    /**
     * <p>constructor that sets up the household object.</p>
     * @param identificationNumber ID of household.
     * @param yearlyIncome Income of household.
     * @param householdMembers The count of household members.
     */
    public Household(int identificationNumber, 
            int yearlyIncome, int householdMembers) {
        id = identificationNumber;
        income = yearlyIncome;
        numMembers = householdMembers;
        numHousehold++;
        
    }
    /**
     * Returns ID number.
     * @return Returns the Identification number as an integer.
     */
    public int getID() {
        return id;
    }
    /**
     * Returns Yearly income.
     * @return Returns the income formated as currency.
     */
    public String getIncome() {
        return fmt.format(income);
    }
    /**
     * Returns number of members.
     * @return Returns the count of members in a household.
     */
    public int getMembers() {
        return numMembers;
    }
    /**
     * Returns number of households.
     * @return returns the overall count of household objects.
     */
    public int getNumHouseholds() {
        return numHousehold;
    }
    /**
     * Returns number of income level.
     * @return Returns the income level from the 'calcIncome' method.
     */
    public String getIncomeLevel() {
        return calcIncome(income, numMembers);
    }
    /**
     * calculates the income level.
     * @param incomeYr stores the income per year.
     * @param members stores the count of household members.
     * @return returns a string value indicating whether the
     * household is bellow or above the low income cut-off.
     */
    private String calcIncome(int incomeYr, int members) {
        if ((members == MEMBERS[0] && incomeYr <= ONE_MEMBERS)
                || (members == MEMBERS[1] && incomeYr <= TWO_MEMBERS)
                || (members == MEMBERS[2] && incomeYr <= THREE_MEMBERS)
                || (members == MEMBERS[3] && incomeYr <= FOUR_MEMBERS) 
                || (members == MEMBERS[4] && incomeYr <= FIVE_MEMBERS)
                || (members == MEMBERS[5] && incomeYr <= SIX_MEMBERS)
                || (members == MEMBERS[6] && incomeYr <= SEVEN_MEMBERS)) {
            incomeBellow++;
            return "Bellow ";
        } else if (members > MEMBERS[6]) {
            int tempMembers = members - MEMBERS[6];
            int tempIncome = tempMembers * EXTRA_MEMBERS;
            if (incomeYr <= (SEVEN_MEMBERS + tempIncome)) {
                incomeBellow++;
                return "Bellow ";
            }
        } else {
            return "Exceeds";
        }
        return null;
    }
    /**
     * Returns percent of incomes below cut-off level.
     * @return returns the income as a percent.
     */
    public static String getLowIncomePercent() {
        per.setMaximumFractionDigits(2);
        return per.format((incomeBellow / numHousehold));
        
    }
    /**
     * Returns a string containing the id, yearly income, and household members.
     * @return returns a string.
     */
    public String toString() {
        return "ID:" + id 
                + "\nIncome: " + income 
                + "\nMembers: " + numMembers + "\n";
    }

};
