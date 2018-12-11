import java.util.ArrayList;
import java.util.List;

public class CardDeck {
    private List<Card> deck;
    private List<Card> dealt;
    public CardDeck(List<Card> d)
    {
        deck = d;
        dealt = new ArrayList<>();
    }
    public void shuffle()
    {
        if(dealt.size() > 0) {
            deck.addAll(dealt);
        }
        while(dealt.size() > 0)
        {
            dealt.remove(0);
        }
        for(int i = 0; i < deck.size(); i++)
        {
            int rnd1 = getRndInt(0,deck.size()-1);
            int rnd2 = getRndInt(0,deck.size()-1);
            Card temp = deck.get(rnd1);
            deck.set(rnd1, deck.get(rnd2));
            deck.set(rnd2, temp);
        }
    }
    public Card deal()
    {
        dealt.add(deck.get(0));
        deck.remove(0);
        return dealt.get(dealt.size()-1);
    }
    public boolean isEmpty()
    {
        if(deck.size() == 0)
        {
            return true;
        }
        return false;
    }
    public int size()
    {
        return deck.size();
    }
    public int getRndInt(int min, int max)
    {
        return (int) Math.floor(Math.random() * (max - min + 1) ) + min;
    }
    public void show()
    {
        for(int i = 0; i < deck.size(); i++)
        {
            System.out.print(" | " + deck.get(i).getRank() + " | ");
        }
        System.out.println();
    }
}
