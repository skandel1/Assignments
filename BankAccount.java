package Remhomework;

public class BankAccount {
   private Double balance;
    private String Name;
    private int accountnumber;

    private int lastaccountnumber = 0;

    public BankAccount(double initialbalance){
        balance =initialbalance;
        accountnumber = lastaccountnumber+1;
        lastaccountnumber = accountnumber;
        System.out.println("the account number is  " + accountnumber);


    }
    public void depositFund (double amount){
        balance = balance + amount;

    }
    public void withdrawFund(double amount) {
        if(balance>amount)
        balance = balance-amount;
        else System.out.println("insufficient fund");
    }
    public double getBalance (){
        return balance;
    }
    public int getNumber() {
        return accountnumber;
    }
    public void withdrawfund(double amount, double fee) {

        if(balance>amount)
        balance = balance-amount-fee;
        else System.out.println("insufficient fund");
    }
    public void depositFund(double amount, int interest) {


        balance = balance + interest+ amount ;
    }

    public static void main(String[] args) {

       BankAccount obj1 = new BankAccount(500);
        obj1.depositFund(5);
        System.out.println(obj1.getBalance());

        BankAccount obj2 = new BankAccount(1000);
        obj2.withdrawfund(200,5);
        System.out.println(obj2.getBalance());
        BankAccount obj3 = new BankAccount(2000);
        obj3.depositFund(1000,10);
        System.out.println(obj3.getBalance());


    }


}
