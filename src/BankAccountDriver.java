import javax.swing.*;

public class BankAccountDriver {
    public static void main(String[] args) {

        BankAccount newAccount = new BankAccount();
        Person newCustomer = new Person();

        System.out.println(newAccount);

        newAccount.setAccnum("3245");
        newAccount.setBalance(300.00);
        newCustomer.setName("Geraldine Corker");

        Person newCustomer2 = new Person("Kieran");
        BankAccount newAccount2 = new BankAccount("12345",1000,newCustomer2);

        System.out.println(newAccount2);

        System.out.println("Account Num: " + newAccount.getAccnum() + "\nBalance: " + newAccount.getBalance() + "\nCustomer: " + newCustomer.getName());


        BankAccount newAccount3 = new BankAccount();
        Person newPerson3 = new Person();

        newAccount3.setAccnum(JOptionPane.showInputDialog(null,"Please enter your count number:"));
        newAccount3.setBalance(Double.parseDouble(JOptionPane.showInputDialog(null,"Please enter your Balance:")));

        System.exit(0);
    }
}
