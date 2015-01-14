//lucas hom ecs140

public class ConstantIt implements SeqIt{

    private Constant c;
    private int index = 0;
    private int curNumber = 0;
    
    public ConstantIt(Constant s){
        c = s;
        curNumber = c.value;
    }
    
    public boolean hasNext(){
        if(index < (c.num))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public int next() throws UsingIteratorPastEndException{
        if(hasNext() == true)
        {
             index++;
            return curNumber;
        }
        else
        {
//            System.err.println("ConstantIt called past end");
//            System.exit(1);
		throw new UsingIteratorPastEndException(" from ConstantIt");
//            return 0; //need to return something
        }
        
    }
}
