import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args)
    {
        List<String> ranks = new ArrayList<String>();
        ranks.add("Ace");
        ranks.add("Two");
        ranks.add("Three");
        ranks.add("Four");
        ranks.add("Five");
        ranks.add("Six");
        ranks.add("Seven");
        ranks.add("Eight");
        ranks.add("Nine");
        ranks.add("Ten");
        ranks.add("Jack");
        ranks.add("Queen");
        ranks.add("King");
        List<Card> d = new ArrayList<>();
        for(int i = 0; i < 13; i++)
        {
            d.add(new Card(i, "Spades", ranks.get(i)));
        }
        for(int i = 0; i < 13; i++)
        {
            d.add(new Card(i, "Hearts", ranks.get(i)));
        }
        for(int i = 0; i < 13; i++)
        {
            d.add(new Card(i, "Diamonds", ranks.get(i)));
        }
        for(int i = 0; i < 13; i++)
        {
            d.add(new Card(i, "Clovers", ranks.get(i)));
        }
        CardDeck deck = new CardDeck(d);
        deck.show();
        deck.shuffle();
        deck.show();
    }
}
