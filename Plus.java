//lucas hom ecs140

public class Plus{
// create new plus with for all the different possibilities and simplifying down to simplest type
	public static Seq plus(Seq s1, Seq s2){
		int current = 0;
		int next = 0;
		// creates two seqIt objects
		SeqIt sI1 = s1.createSeqIt();
		SeqIt sI2 = s2.createSeqIt();
		// checks for what type of object
		boolean isConstant = true;
		boolean isDelta = true;
		boolean isJumble = true;
		int deltaCount = 0;
		int curDelta = 0;
		int difference = 0;
		int SeqLength = 0;
		// adds up next values 
		try{
			next = sI1.next() +sI2.next();
			SeqLength++;
		}
		// if not throws exception
		catch(Exception e){
		}
		
		// adds up values, checks for differences between values and increments the seq length 
		while(true){
			// adds up next two values and puts into next
			try{
				current = next;
				next = sI1.next() + sI2.next();
				difference = next-current;
				// checks if there is a difference if there is, sets the constant to be false
				if(difference != 0 && isConstant)
				{
					isConstant = false;
				}
				// compares difference and delta
				if(difference != curDelta)
				{
					curDelta = difference;
					deltaCount++;
					// if curdelta is same as difference then isdelta is false
					if(deltaCount > 1)
					{
						isDelta = false;
					
						
					}	
					
				}
				SeqLength++;
			}
			// otherwise throws the exception
			catch(Exception e)
			{
				break;
			}
		}
		
		// creates two new seqIt
		sI1 = s1.createSeqIt();
		sI2 = s2.createSeqIt();
		
		// checks if it is a constant object
		if(isConstant){
			int newNum = SeqLength;
			int newValue =0;
			// attempts to add the two next values
			try{
				newValue = sI1.next() + sI2.next();
			}
			// otherwise exception called
			catch(Exception e){
			}
			// creates new constant object with the new num and value
			Constant c = new Constant(newNum, newValue);
			// returns new constant object
			return c;
		}
		// checks if it is a delta object
		else if(isDelta){
			int newNum = SeqLength;
			int newDelta = curDelta;
			int newInitial = 0;
			// attempts to add the next values to see if it is delta
			try{
				newInitial = sI1.next() + sI2.next();
			}
			// otherwise exception called
			catch(Exception e){
			}
			// creates new delta object with the new num, initial, and delta
			Delta d = new Delta(newNum,newInitial,newDelta);
			// returns the new delta object
			return d;
		}
		// otherwise has to be a jumble
		else{
		// creates new array with size of seqlength
			int[] values = new int[SeqLength];
			// adds up values of the two seq 
			for(int i = 0;i < SeqLength; i++){
				try{
					values[i] = sI1.next() + sI2.next();
				}
				catch(Exception e){}
			}
			// creates new jumble to store the values
			Jumble j = new Jumble(values);
			// returns the jumble object
			return j;
		}

	}

}
