public class Card {
    private String rank;
    private int value;
    private String suite;
    public Card(int v, String s)
    {
        value = v;
        suite = s;
        rank = v + " " + s;
    }

    public String getSuite() {
        return suite;
    }

    public void setSuite(String suite) {
        this.suite = suite;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
    public boolean equals(Card c)
    {
        if(this.getValue() == c.getValue())
        {
            return true;
        }
        return false;
    }
    @Override
    public String toString()
    {
        return this.getRank();
    }
}
