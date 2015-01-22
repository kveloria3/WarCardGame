import java.util.ArrayList;
import java.util.Random;
public class CardList
{
  private ArrayList<Card> list;
  private Random random;
  
  public CardList()
  {
    list= new ArrayList<Card>();
    random= new Random();
  }
  public int size(){
    return list.size();
  }
  public void addCardToBottom(Card c)
  {
    list.add(c);
  }
  public void addCardToTop(Card c)
  {
    list.add(0, c);
  }
  public Card takeCardFromTop()
  {
    Card c = list.get(0);
    list.remove(0);
    return c;
  }
  public void remove(int i)
  {
    list.remove(i);
  }
  public Card removeRandomCard()
  {
    int randCardNum= random.nextInt(list.size());
    Card c = list.get(randCardNum);
    list.remove(randCardNum);
    
    return c;
  }
  public Card getCard(int index)
  {
    return list.get(index);
  }
}
