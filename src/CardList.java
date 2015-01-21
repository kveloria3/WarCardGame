// create class CardList
import java.util.*;

public class CardList
{
  private ArrayList<Card> cards;
  Random random = new Random();
  
  public CardList()
  {
    cards=new ArrayList<Card>();
  }
  
  public int size()
  {
    return cards.size();
  }
  
  public void addCardToBottom(Card c)
  {
    cards.add(c);
  }
  
  public void addCardToTop(Card c)
  {
    cards.add(0, c);
  }
  
  public Card takeCardFromTop()
  {
    Card temp= cards.get(0);
    cards.remove(0);
    return temp;
  }
  
  public Card removeRandomCard()
  {
    int r=random.nextInt(cards.size());
    Card temp= cards.get(r);
    cards.remove(r);
    return temp;
  }
  
  public Card get(int i)
  {
    return cards.get(i);
  }
  
}
