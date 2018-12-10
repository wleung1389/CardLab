import java.util.List;

public class CardDeck {
    private List<Card> deck;
    private List<Card> dealt;
    public CardDeck(List<Card> d)
    {
        deck = d;
    }
    public void shuffle()
    {
        deck.addAll(dealt);
        dealt.removeAll(dealt);
        for(int i = 0; i < deck.size(); i++)
        {
            int rnd1 = getRndInt(0,deck.size());
            int rnd2 = getRndInt(0,deck.size());
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
}
