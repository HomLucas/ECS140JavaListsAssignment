//lucas hom ecs140

public class DeltaIt implements SeqIt{

	private Delta d;
	private int[] values;
    private int curNumber = 0;
    private int index = 0;
    
	public DeltaIt(Delta s){
    	d = s;
        curNumber = d.initial;
        values = new int[d.num];
        for(int i = 0; i < d.num; i++){
        	values[i] = d.initial + (i*d.delta);
        }
    }
    
    public boolean hasNext(){
    	 if(index < (d.num)){
         	return true;
         }
         else{
         	return false;
         }
    }
    
    public int next() throws UsingIteratorPastEndException{
    	if(hasNext() == true)
        {
            curNumber = values[index];
        	index++;
            return curNumber;
        }
        else
        {
//       		System.err.println("DeltaIt called past end");
//			System.exit(1);
//            return 0; //need to return something
		throw new UsingIteratorPastEndException(" from DeltaIt");
        }
    }
}
