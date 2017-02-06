
/**
 * Created by ahmetturkmen on 2/6/17.
 */
public class CreditCard {

    private String customer,bank,account;
    private int limit;
    protected double balance;

    public CreditCard(String customer, String bank, String account, int limit, double balance) {
        this.customer = customer;
        this.bank = bank;
        this.account = account;
        this.limit = limit;
        this.balance = balance;
    }
    public CreditCard(String customer,String bank,String account,int limit){
        this(customer,bank,account,limit,0.0);   // Use a balance of zero as default
    }
// Accessor methods
    public String getCustomer() {
        return customer;
    }

    public String getBank() {
        return bank;
    }

    public String getAccount() {
        return account;
    }

    public int getLimit() {
        return limit;
    }

    public double getBalance() {
        return balance;
    }

    public boolean charge(double price){
        if(price+balance >limit)
            return  false;
        balance += price;
        return true;
    }

    public void makePayment(double amount ){
        balance -= amount;
    }

    // Utility method to print a card's information, similar to toString method
    public static void printSummary(CreditCard card){
        System.out.println("Customer = "+ card.customer);
        System.out.println("Bank = "+card.bank);
        System.out.println("Account = "+card.account);
        System.out.println("Balance = "+card.balance);   // implicit cast
        System.out.println("Limit = "+card.limit);        // implicit cast

    }

}


