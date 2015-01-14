//lucas hom ecs140


public class JumbleUser{
	
    private static int longest = 0;
    private static int curLongest = 0;
    private static int current = 0;
    private static int compare = 0;
    JumbleIt jI;


    public static int lengthLongestNDCSS1(Jumble j){
       JumbleIt jI = new JumbleIt(j);
       longest = 0;
       curLongest = 0;
       current = 0;
       compare = 0;
    
        if(jI.hasNext() == false)
        {
            return 0;
        }
        while(jI.hasNext()){
            current = compare;
	try{
            compare = jI.next();
	}
	catch(Exception e){
		return 0;
	}
            if(compare >= current){
                longest++;
                if(curLongest < longest){
                    curLongest = longest;
                }
            }
            else
            {
                if(curLongest < longest){
                    curLongest = longest;
                }
                longest = 1;
            }

        }          
          
        return curLongest;
    }
	
	public static int lengthLongestNDCSS2(Jumble j){
		JumbleIt jI = new JumbleIt(j);
		current = 0;
		compare = 0;
		curLongest = 0;
		longest = 0;
		while(true){
			try{
				current = compare;
				compare = jI.next(); 
				if(compare >= current){
					longest++;
					if(curLongest < longest){
						curLongest= longest;
					}
				}
				else
				{
					if(curLongest < longest){
						curLongest = longest;
					}
					longest = 1;
				}
			
			}
			catch(Exception e){
				break;
			}
			
		}
		return curLongest;	
	}


}
