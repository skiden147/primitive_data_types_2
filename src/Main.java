public class Main {
    public static void main(String[] args) {

        int current_account = 2000;
        int bonus_account = 100;
        int incoming_funds = 1500;
        int bonus = incoming_funds / 100;

        if (incoming_funds > 1000) {
            System.out.println("Your final account:" + (current_account + incoming_funds + bonus_account + bonus));
            System.out.println("Your bonus account:" + (bonus_account + bonus));
        } else {
            System.out.println("Your final account:" + (current_account + incoming_funds + bonus_account));
            System.out.println("Your bonus account:" + (bonus_account));
        }


    }
}


