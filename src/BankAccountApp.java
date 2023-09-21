public class BankAccountApp {
    public static void main(String[] args) {

        Checking chk = new Checking("Tom Wilson", "321456879", 1500);

        Savings sav = new Savings("Rich Lowe", "456657897", 2500);

        sav.showInfo();
        System.out.println("*************************************************************");
        chk.showInfo();

        sav.deposit(5000);
        sav.withdraw(200);
        sav.transfer("brokerage", 3000);

        // Read a CSV File then create new accounts based on that data
    }
}
