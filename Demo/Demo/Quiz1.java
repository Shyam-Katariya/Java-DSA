package Demo;

class bank {
    int amount;
    String name;

    bank(int amount, String name) {
        this.amount = amount;
        this.name = name;
    }

    void deposite(int money) {
        System.out.println("Amount before deposite:" + amount);
        amount = amount + money;
        System.out.println("Amount after deposite:" + amount);
    }

    void withdraw(int money) {
        try {
            System.out.println("Balance before Withdraw:" + amount);
            amount = amount - money;
            System.out.println("Balance after Withdraw:" + amount);
        } catch (ArithmeticException e) {
            System.out.println("Not enought amount to withdraw");
        }
    }

    void display() {
        System.out.println("Name of customer:" + name);
        System.out.println("balance in account of customer:" + amount);
    }
}

public class Quiz1 {
    public static void main(String[] args) {
        bank b1 = new bank(10000, "Nishit");
        b1.deposite(500);
        b1.withdraw(10600);
        b1.display();
    }
}
