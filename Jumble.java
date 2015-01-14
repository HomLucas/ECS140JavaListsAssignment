//lucas hom ecs140

public class Jumble extends Seq{
	
	protected int[] values;
	
	public Jumble(int[] values){

		this.values = new int[values.length];
		for(int i = 0; i< values.length; i++)
		{
			this.values[i] = values[i];
		}

	}
	
	public String toString(){
		
		
		System.out.print("{ " + this.values.length + " : ");
		for(int i = 0; i < this.values.length; i++){
			System.out.print(this.values[i] + " ");
		}			
		//System.out.print("}");	
		return "}";
	}

	public int min(){
		int min = 2147483647;
		if(this.values.length == 0){
			return 0;
		}
		for(int i = 0; i < this.values.length; i++){
			if(this.values[i] < min){
				min = this.values[i];
			}
		}
		return min; 
	}

	public SeqIt createSeqIt(){
		JumbleIt sI = new JumbleIt(this);
		return sI;
	}
}
