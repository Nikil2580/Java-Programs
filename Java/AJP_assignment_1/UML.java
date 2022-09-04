package AJP_assignment_1;

class Account {
    private String id, name;
    private int balance = 0;

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public int credit(int amount) {
        balance = balance + amount;
        return balance;
    }

    public int debit(int amount) {
        if (amount < balance) {
            balance = balance - amount;
            return balance;
        } else {
            System.out.println("Amount exceeded balance\n");
            return balance;
        }
    }

    public int transferTo(Account obj, int amount) {
        if (amount <= balance) {
            obj.balance = obj.balance + amount;
            balance = balance - amount;
            return balance;
        } else {
            System.out.println("Amount exceeded balance\n");
            return balance;
        }
    }

    public String toString() {
        return id + "," + name + "," + balance;
    }
}

public class UML {
    public static void main(String[] args) {
        Account a1 = new Account("A100", "NIKIL", 1500);
        System.out.println("\nAccount 1 Details:");
        System.out.println("ID : " + a1.getID());
        System.out.println("Name : " + a1.getName());
        System.out.println("Balance : " + a1.getBalance());
        System.out.println("After amount credit :" + a1.credit(140));
        System.out.println("After amount debit : " + a1.debit(40));
        Account a2 = new Account("A200", "PAVAN");
        System.out.println("\nAccount 2 Details:");
        System.out.println("ID : " + a2.getID());
        System.out.println("Name : " + a2.getName());
        System.out.println("Balance : " + a2.getBalance());
        System.out.println("After amount credit :" + a2.credit(230));
        System.out.println("After amount debit : " + a2.debit(20));
        System.out.println("After transaction account 2 to 1 :" + a2.transferTo(a1, 100));
        System.out.println("After transaction account 1 Balance :" + a1.getBalance());
        System.out.println("After transaction account 2 Balance :" + a2.getBalance());
        System.out.println("After transaction account 1 to 2 :" + a1.transferTo(a2, 30));
        System.out.println("\n[" + a1 + "]");
        System.out.println("[" + a2 + "]\n");
    }
}