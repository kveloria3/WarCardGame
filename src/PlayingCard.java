public abstract class PlayingCard {
	
	
  int suit;
  int rank;
  
  public PlayingCard(int cardSuit, int cardRank)
  {
    suit=cardSuit;
    rank=cardRank;
  }
  
  public int getSuit()
  {
    return suit;
  }
  
  public int getRank()
  {
    return rank;
  }
  
  public abstract String toString();
  
}

