//lucas hom ecs140

public class JumbleIt implements SeqIt{
    private Jumble j;
    private int curNumber = 0;
    private int index = 0;
   
    
    public JumbleIt(Jumble s){
        j = s;
        if(j.values.length > 0){
            curNumber = j.values[0];
        }
    }
    
    public boolean hasNext(){
        if(index < (j.values.length)){         
            return true;
        }
        else{
            return false;
        }
    }
    
    public int next() throws UsingIteratorPastEndException{
        if(hasNext() == true)
        {
            curNumber = j.values[index];
            index++;
            return curNumber;
        }
        else
        {
            
//            System.err.println("JumbleIt called past end");
 //           System.exit(1);
  //          return 0; //need to return something
		throw new UsingIteratorPastEndException(" from JumbleIt");   
        }
    }
   
}
