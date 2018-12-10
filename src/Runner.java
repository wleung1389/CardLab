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
        List<Card> d = new ArrayList<Card>();
        for(int i = 0; i < 13; i++)
        {
            d.add(new Card(i,));
        }
    }
}
