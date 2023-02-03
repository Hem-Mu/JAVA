public class Blackjack {

    public int parseCard(String card) {

        return switch (card) {
            case "two" -> 2;
            case "three" -> 3;
            case "four" -> 4;
            case "five" -> 5;
            case "six" -> 6;
            case "seven" -> 7;
            case "eight" -> 8;
            case "nine" -> 9;
            case "ten", "jack", "queen", "king" -> 10;
            case "ace" -> 11;
            default -> 0;
        }; // 카드 값 int로 변환
    }

    public boolean isBlackjack(String card1, String card2) {
        int check1 = parseCard(card1);
        int check2 = parseCard(card2);
        if ((check1+check2) == 21) {
            return true;
        } else return false;
    } // 카드 2장 합이 21일 경우 true -> 블랙잭

    public String largeHand(boolean isBlackjack, int dealerScore) {
        if(!isBlackjack&&(parseCard("ace")*2)==22) {
            return "P";
        }// 카드가 ace, ace이면 스플릿
        else if (isBlackjack && !(dealerScore ==10) &&!(dealerScore ==11)){
            return "W";
        } else return "S";
    }
    /*
    - Stand (S)
    - Hit (H)
    - Split (P)
    - Automatically win (W)
    에이스 쌍 -> 스플릿
    블랙잭 -> 딜러가 11,10이 아니면 Win else Stand
    */
    public String smallHand(int handScore, int dealerScore) {

        if (handScore >= 17) {
            return "S";
        } else if (handScore >= 12&&dealerScore >= 7) {
            return "H";
        } else if (handScore<=11) {
            return "H";
        } else return "S";
    }
    /*
    17 이상 = Stand
    12~16일때 딜러 7이상 -> Hit else Stand
    11 이하 = Hit

    */

    // FirstTurn returns the semi-optimal decision for the first turn, given the cards of the player and the dealer.
    // This function is already implemented and does not need to be edited. It pulls the other functions together in a
    // complete decision tree for the first turn.
    public String firstTurn(String card1, String card2, String dealerCard) {
        int handScore = parseCard(card1) + parseCard(card2);
        int dealerScore = parseCard(dealerCard);

        if (20 < handScore) {
            return largeHand(isBlackjack(card1, card2), dealerScore);
        } else {
            return smallHand(handScore, dealerScore);
        }
    }
}
