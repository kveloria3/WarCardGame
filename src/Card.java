// Complete Class card by extending abstract Class PlayingCard and implementing the Comparable interface
public class Card extends PlayingCard implements Comparable<Card>
{
  public Card(int suit, int rank)
  {
    super(suit, rank);
  }
  
  public String toString()
  {
    if(suit==1)
    {
      if(rank==10)
      {
        return "H-T";
      }
      
      else if (rank==11)
      {
        return "H-J";
      }
      
      else if (rank==12)
      {
        return "H-Q";
      }
      
      else if (rank==13)
      {
        return "H-K";
      }
      
      else if (rank==1)
      {
        return "H-A";
      }
      
      else
      {
        return "H-"+this.getRank();
      }
    }
    
    if(suit==2)
    {
      if(rank==10)
      {
        return "C-T";
      }
      
      else if (rank==11)
      {
        return "C-J";
      }
      
      else if (rank==12)
      {
        return "C-Q";
      }
      
      else if (rank==13)
      {
        return "C-K";
      }
      
      else if (rank==1)
      {
        return "C-A";
      }
      
      else
      {
        return "C-"+this.getRank();
      }
    }
    
    if(suit==3)
    {
      if(rank==10)
      {
        return "S-T";
      }
      
      else if (rank==11)
      {
        return "S-J";
      }
      
      else if (rank==12)
      {
        return "S-Q";
      }
      
      else if (rank==13)
      {
        return "S-K";
      }
      
      else if (rank==1)
      {
        return "S-A";
      }
      
      else
      {
        return "S-"+this.getRank();
      }
    }
    
    if(suit==4)
    {
      if(rank==10)
      {
        return "D-T";
      }
      
      else if (rank==11)
      {
        return "D-J";
      }
      
      else if (rank==12)
      {
        return "D-Q";
      }
      
      else if (rank==13)
      {
        return "D-K";
      }
      
      else if (rank==1)
      {
        return "D-A";
      }
      
      else
      {
        return "D-"+this.getRank();
      }
    }
    else 
    {
      return "invalid card";
    }
  }
  
  
  public int compareTo(Card other)
  {
    return this.getRank()-other.getRank();
  }
}

