public class War {

	public static void main(String[] args)
  {
    CardDeck deck= new CardDeck();
    CardList playerACards= new CardList();
    CardList playerBCards= new CardList();
    CardList stackA= new CardList();
    CardList stackB= new CardList();
    int round=1; 
    
    //shuffle the deck.
    deck.shuffle();
    
    //Adds cards to player A's deck.
    for(int i=0; i<deck.size(); i++)
    {
      playerACards.addCardToBottom(deck.takeCardFromTop());
    }
    
    //Adds cards to player B's deck.
    playerBCards= deck;
    
    
    //Playing the Game (Taking a Turn)
    System.out.println("WELCOME TO WAR!!!");
    System.out.println("A---Player---B");
    System.out.println("______________");
    while(playerACards.size()!=0 && playerBCards.size()!=0)
    {
      System.out.println(playerACards.size()+" ROUND-"+round+" "+playerBCards.size());
      //Both players turn over a card
      stackA.addCardToTop(playerACards.takeCardFromTop());
      
      stackB.addCardToTop(playerBCards.takeCardFromTop());
      System.out.println("   "+stackA.get(0).toString()+":"+stackB.get(0).toString()+"   ");
      //This is when a WAR happens!
      while(stackA.size()>0 && stackB.size()>0 && stackA.get(0).compareTo(stackB.get(0))==0)
      {
        
        //if player A doesn't have enough cards for war, add cards to Player B'sDeck
        
        if(playerACards.size()<2)
        {
          System.out.println("Player A Doesn't Have Enough Cards For War!");
          for(int i=0; i<stackB.size(); i=0)
          {
            playerBCards.addCardToTop(stackA.takeCardFromTop());
            playerBCards.addCardToTop(stackB.takeCardFromTop());
          }
          
          if(playerACards.size()>0)
          {
            playerBCards.addCardToTop(playerACards.takeCardFromTop());
          }
        }
        //if player B doesn't have enough cards for war, add cards to Player B'sDeck
        
        else if(playerBCards.size()<2)
        {
          System.out.println("Player B Doesn't Have Enough Cards For War!");
          System.out.println(playerBCards.size());
          for(int i=0; i<stackB.size(); i=0)
          {
            playerACards.addCardToTop(stackB.takeCardFromTop());
            playerACards.addCardToTop(stackA.takeCardFromTop());
          }
          if(playerBCards.size()>0)
          {
            playerACards.addCardToTop(playerBCards.takeCardFromTop());
          }
        }
        else
        {
          System.out.println("-----War!-----");
          stackA.addCardToTop(playerACards.takeCardFromTop());
          stackA.addCardToTop(playerACards.takeCardFromTop());
          stackB.addCardToTop(playerBCards.takeCardFromTop());
          stackB.addCardToTop(playerBCards.takeCardFromTop());
          System.out.println("   "+stackA.get(0).toString()+":"+stackB.get(0).toString()+"   ");
        }
      }
      //If player A wins, add cards to their pile
      if(stackB.size()==0 || stackA.get(0).compareTo(stackB.get(0))>0)
      {
        for(int i=0; i<stackB.size(); i=0)
        {
          playerACards.addCardToTop(stackA.takeCardFromTop());
          playerACards.addCardToTop(stackB.takeCardFromTop());
        }
      }
      
      //If player B wins, add cards to their pile
      else
      {
        for(int i=0; i<stackB.size(); i=0)
        {
          playerBCards.addCardToTop(stackA.takeCardFromTop());
          playerBCards.addCardToTop(stackB.takeCardFromTop());
        }
      }
      // Incread round number
      round++;
    }
    //Game Over, Announce Winner
    if(playerACards.size()!=0)
    {
      System.out.println("--GAME OVER!--");
      System.out.println("PLAYER A VICTORIOUS!");
    }
    
    else
    {
      System.out.println("--GAME OVER!--");
      System.out.println("PLAYER B VICTORIOUS!");
    }
    
  }
}
