import bank.MainBank;
import bank.details.BankDetails;

public class PackageSubpackage {
    public static void main(String[] args) {
        MainBank m = new MainBank();
        m.showWelcome();

        BankDetails b = new BankDetails();
        b.showDetails();
    }
}