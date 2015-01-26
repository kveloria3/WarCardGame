import java.util.ArrayList;
public class War {
  
  public static void main(String[] args) {
    // create deck, hands and stacks
    CardDeck deck = new CardDeck();
    CardList p1 = new CardList();
    CardList p2 = new CardList();
    CardList stacka = new CardList();
    CardList stackb = new CardList();
    System.out.println("A --- PLAYER --- B");
    System.out.println(deck.size());
    
    
    
    
    for(int i = 0; i<26; i++)
    {
      Card c = deck.takeCardFromTop();
      p1.addCardToTop(c);
    }
    for(int j = 0; j<26; j++)
    {
      Card d = deck.takeCardFromTop();
      p2.addCardToTop(d);
    }
    int round = 1;
    while(p1.size()>0 && p2.size()>0)
    {
      System.out.println(p1.size()+" ---Round"+" "+round+"--- "+p2.size());
      Card c1 = p1.takeCardFromTop();
      Card c2 = p2.takeCardFromTop();
      
      
      System.out.println(c1.toString()+":"+c2.toString());
      
      stacka.addCardToTop(c1);
      
      stackb.addCardToTop(c2);
      if(c1.compareTo(c2)>0)
      {
        System.out.println("p1 wins");
        p1.addCardToBottom(stacka.takeCardFromTop());
        p1.addCardToBottom(stackb.takeCardFromTop());
      }
      else if(c1.compareTo(c2)<0)
      {
        System.out.println("p2 wins");
        
        p2.addCardToBottom(stacka.takeCardFromTop());
        p2.addCardToBottom(stackb.takeCardFromTop());
      }
      else
      {
        
        
        
        while((stacka.getCard(0)).compareTo(stackb.getCard(0))==0)
        {
          System.out.println("In war while loop!");
          
          if(p1.size()<2) //player one has no more cards unable to do war
          {
            System.out.println("Player Two Wins!");
            for(int i=0; i<p1.size(); i=0)
            {
              stackb.addCardToBottom(p1.getCard(0));
              p1.remove(0);
            }
            break;
          }
          else if(p2.size()<2)//player two has no more cards unvableto dowar
          {
            System.out.println("Player One Wins!");
            for(int i=0; i<p2.size(); i=0)
            {
              stacka.addCardToBottom(p2.getCard(0));
              p2.remove(0);
            }
            break;
          }
          stacka.addCardToTop(p1.takeCardFromTop());
          stackb.addCardToTop(p2.takeCardFromTop());
          
          stacka.addCardToTop(p1.takeCardFromTop());
          
          stackb.addCardToTop(p2.takeCardFromTop());
          System.out.print(stacka.getCard(0).toString()+stackb.getCard(0).toString());
          
          
        }
        
        if(stacka.getCard(0).compareTo(stackb.getCard(0))>0 && p1.size()>0 && p2.size()>0)
        {

          System.out.println("p1 wins WAR!");
          for(int i = 0; i<stacka.size(); i=0)
          {
            p1.addCardToBottom(stacka.getCard(0));
            stacka.remove(0);
            p1.addCardToBottom(stackb.getCard(0));
            stackb.remove(0);
            
            
          }
        }
        else if(stacka.getCard(0).compareTo(stackb.getCard(0)) < 0 && p1.size()>0 && p2.size()>0)
        {

          System.out.println("p2 wins WAR!");
          for(int i = 0; i<stacka.size(); i=0)
          {
            
            p2.addCardToBottom(stacka.getCard(0));
            stacka.remove(0);
            p2.addCardToBottom(stackb.getCard(0));
            stackb.remove(0);
            
          }
        }
      }
      
      
      round++;
      
      
    }
  }
}
