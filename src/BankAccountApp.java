import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {
    public static void main(String[] args) {

        /*Checking chk = new Checking("Tom Wilson", "321456879", 1500);
        Savings sav = new Savings("Rich Lowe", "456657897", 2500);

        sav.compound();

        sav.showInfo();
        System.out.println("*************************************************************");
        chk.showInfo();*/

        List<Account> accounts = new LinkedList<Account>();

        // Read a CSV File then create new accounts based on that data
        String file = "C:\\Users\\ayana\\Downloads\\NewBankAccounts.csv";  // Destination where the csv file is stored.

// Data of the CSV file.
        /*
Arielle Duncan,444102638,Savings,1000
Marybeth Sanders,431551383,Checking,2500
Hattie Storey,476687875,Checking,3500
Hilary Ward,005965723,Checking,6000
Luella Bradbury,217512645,Savings,1500
Frankie Davidson,002607927,Checking,10000
Darnell Goodman,469426397,Savings,15000
Shila Obrien,233479044,Savings,2200
Agnes Leonard,003827896,Savings,6500
Florinda Goulding,233025468,Checking,25000
Eliseo Waller,395157182,Savings,12500
Fredia Hastings,208728517,Checking,6500
Melody Potts,687057316,Savings,1500
Deadra Power,009545701,Checking,4500
Clyde Higgs,164445329,Checking,1000
        * */
        List<String[]> newAccountHolders = utilities.CSV.read(file);

        for (String[] accountHolder : newAccountHolders) {
//            System.out.println("NEW ACCOUNT");
//            System.out.println(accountHolder[0] + " " + accountHolder[1] + " " + accountHolder[2] + " " + accountHolder[3]);
//            System.out.println("*********************************************************");

            String name = accountHolder[0];
            String sSN = accountHolder[1];
            String accountType = accountHolder[2];
            double initDeposit = Double.parseDouble(accountHolder[3]);

//            System.out.println(name + " " + sSN + " " + accountType + " $" + initDeposit);
            if (accountType.equals("Savings")) {
                accounts.add(new Savings(name, sSN, initDeposit));
            } else if (accountType.equals("Checking")){
                accounts.add(new Checking(name, sSN, initDeposit));
            } else {
                System.out.println("ERROR READING ACCOUNT TYPE");
            }
        }

        for (Account acc : accounts) {
            System.out.println("\n******************************************************");
            acc.showInfo();
        }
    }
}
