
// create class CardDeck that extends CardList
public class CardDeck extends CardList
{
  private int suits = 4;
  private int ranks = 13;
  private int swaps = 10000;
  
  public CardDeck()
  {
    super();
    Card temp;
    for(int s = 1; s<=4; s++)
    {
      for(int r = 1; r<=13; r++)
      {
        temp = new Card(s, r);
        this.addCardToTop(temp);
      }
    }
  }
  public void shuffle()
  {
    for(int i=0; i<swaps; i++)
    {
      Card c = removeRandomCard();
      addCardToBottom(c);
    }
  }
}
    
