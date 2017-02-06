
/**
 * Created by ahmetturkmen on 2/6/17.
 */
public class Main {

    public static void main(String[]args){
        CreditCard[] wallet = new CreditCard[3];

        wallet[0]=new CreditCard("Mehmet Yildiz","Yapi Kredi"," 5391 0375 9387 5309 ",5000);
        wallet[1]=new CreditCard("Yakup Yakar ", "Is Bankasi","3483 0699 5578 1953 3214",3500);
        wallet[2]=new CreditCard("Humeyni Uyumaz ","Ziraat","1544 0322 5699 7452",2500,300);


        for (int i = 0; i <= 16; i++) {
            wallet[0].charge(3*i);
            wallet[1].charge(2*i);
            wallet[2].charge(i);
        }
        for (CreditCard card: wallet) {  // For each wallet print the information of that cards
            CreditCard.printSummary(card);
            while(card.getBalance()>200.0){
                card.makePayment(200);
                System.out.println("New balance = "+card.getBalance());
            }

        }

    }
}
