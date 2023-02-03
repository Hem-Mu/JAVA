public class Main {
    public static void main(String[] args) {


        Blackjack blackjack = new Blackjack();

        int check1 = blackjack.parseCard("ace");
        int check2 = blackjack.parseCard("ten");
        System.out.println("check1 = " + blackjack.firstTurn("jack", "ace", "ace"));
    //    System.out.println("test :" + blackjack.parseCard("ten")+blackjack.parseCard("ace"));

    }
}