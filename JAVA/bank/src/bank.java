import java.util.Scanner;
public class bank {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        BankAccount p;
        System.out.println("Enter account number");
        int a= s.nextInt();
        System.out.println("Enter balance");
        int b =s.nextInt();
        p=new BankAccount(a,b);
        lp : while (true){
            System.out.println("\n1.Withdraw money \n2.Deposit money \n3.Show account details\n0.Exit");
            int c=s.nextInt();
            switch (c){
                case 0:
                    break lp;
                case 1:
                    System.out.println("Enter the amount of money you want to Withdraw");
                    int w= s.nextInt();
                    p.withdraw(w);
                    break;
                case 2:
                    System.out.println("Enter the amount of money you want to Deposit");
                    int d= s.nextInt();
                    p.deposit(d);
                    break;
                case 3:
                    System.out.println("***Showing Account Details***");
                    p.show();
                    break;
            }
        }

    }
}
class BankAccount{

    int accno;
    double balance;
    int amt;
    BankAccount(int a, double b){
        this.accno=a;
        this.balance=b;
    }
    void withdraw(int o) {
        this.amt = o;
        try {
            if (balance < amt) {
                throw new ArithmeticException("Your balance is low!");
            }
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        if (balance > amt) {
            balance = balance - amt;
        }
        System.out.println("The updated balance is "+balance);
    }
    void deposit(int p){
        this.amt=p;
        balance=balance+amt;
        System.out.println("The updated balance is "+balance);
    }
    void show(){
        System.out.println("The account number is "+accno+" The balance is "+balance);
    }
}




