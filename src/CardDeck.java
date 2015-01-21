// create class CardDeck that extends CardList
public class CardDeck extends CardList
{
  int suits=4;
  int ranks=13;
  int swaps=10000;
  
  public CardDeck()
  {
    super();
    Card temp;
    for(int s=1; s<=suits; s++)
    {
      for(int r=1; r<=ranks; r++)
      {
        temp=new Card(s, r);
        this.addCardToBottom(temp);
      }
    }
  }
  
  //shuffles deck
  public void shuffle()
  {
    Card c;
    for(int i=0; i<swaps; i++)
    {
      //removes random card from deck, and adds it to the bottom. 
      c=removeRandomCard();
      this.addCardToBottom(c);
    }
  }
}
