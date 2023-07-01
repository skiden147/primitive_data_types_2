public class Main {
    public static void main(String[] args) {

        int currentAccount = 2000;
        int bonusAccount = 100;
        int incomingFunds = 1500;
        int bonus = incomingFunds / 100;

        if (incomingFunds > 1000) {
            System.out.println("Your final account:" + (currentAccount + incomingFunds + bonusAccount + bonus));
            System.out.println("Your bonus account:" + (bonusAccount + bonus));
        } else {
            System.out.println("Your final account:" + (currentAccount + incomingFunds + bonusAccount));
            System.out.println("Your bonus account:" + (bonusAccount));
        }


    }
}


