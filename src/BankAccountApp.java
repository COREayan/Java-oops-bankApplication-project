import java.util.List;

public class BankAccountApp {
    public static void main(String[] args) {

        /*Checking chk = new Checking("Tom Wilson", "321456879", 1500);
        Savings sav = new Savings("Rich Lowe", "456657897", 2500);

        sav.compound();

        sav.showInfo();
        System.out.println("*************************************************************");
        chk.showInfo();*/

        // Read a CSV File then create new accounts based on that data
        String file = "C:\\Users\\ayana\\Downloads\\NewBankAccounts.csv";
        List<String[]> newAccountHolders = utilities.CSV.read(file);

        for (String[] accountHolder : newAccountHolders) {
            System.out.println("NEW ACCOUNT");
            System.out.println(accountHolder[0] + " " + accountHolder[1] + " " + accountHolder[2] + " " + accountHolder[3]);
            System.out.println("*********************************************************");

        }
    }
}
