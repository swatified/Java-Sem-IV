abstract class Bank {
    String bankName;

    Bank(String name) {
        this.bankName = name;
    }

    // Abstract method
    abstract double getInterestRate();

    // Concrete method
    void displayBankName() {
        System.out.println("Bank Name: " + bankName);
    }
}


class SBI extends Bank {
    SBI() {
        super("State Bank of India");
    }

    //Implementing Abstract Method
    double getInterestRate() {
        return 6.50;
    }
}

class PNB extends Bank {
    PNB() {
        super("Punjab National Bank");
    }

    //Implementing Abstract Method
    double getInterestRate() {
        return 7.89;
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        Bank sbi = new SBI();
        Bank pnb = new PNB();

        sbi.displayBankName();
        System.out.println(sbi.getInterestRate() + "%\n");

        pnb.displayBankName();
        System.out.println(pnb.getInterestRate() + "%");
    }
}
