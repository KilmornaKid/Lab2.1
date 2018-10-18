import javax.swing.*;

public class BankAccount {
    private String accnum;
    private double balance;
    private Person customer;

    //getters

    public String getAccnum() {
        return accnum;
    }

    public double getBalance() {
        return balance;
    }

    public Person getCustomer() {
        return customer;
    }

    //setters
    public void setAccnum(String accnum) {
        this.accnum = accnum;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    //withdraw
    public void subtractbalance(double balance){
        this.balance = balance;
            int reply = JOptionPane.showConfirmDialog(null,"Would you like to lodge some money?","Bank Account", JOptionPane.YES_NO_OPTION);
                if (reply == JOptionPane.YES_OPTION) {
                    double subbalance = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter the amount you wish to lodge:"));
                    this.balance = balance - subbalance;
                }
                 else {
                    JOptionPane.showMessageDialog(null, "GOODBYE");
                System.exit(0);
                 }
    }


    public void setCustomer(Person customer) {
        this.customer = customer;
    }


    public BankAccount(){
        this("No Account Number defined",0.00,null);
    }

    public BankAccount(String accnum, double balance, Person customer){
        this.accnum = accnum;
        this.balance = balance;
        this.customer = customer;
    }



    public String toString(){
        String accHolder = "";

        if(customer==null)
            accHolder = "No Account Holder specified";
        else
            accHolder = getCustomer().toString();

        return "Account Number: " + getAccnum() + "\nBalance: " + balance + "\nAccount Holder: " + accHolder;
    }




}
