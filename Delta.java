//lucas hom ecs140

public class Delta extends Seq{
	protected int num;
	protected int initial;
	protected int delta;
	public Delta(int num, int initial, int delta){
		if(num == 0){
			this.num = 0;
			this.initial = 0;
			this.delta = 0;

		}
		else{
			this.num = num;
			this.initial = initial;
			this.delta = delta;
		}
	}
	
	public String toString()
	{
		return "< " + this.num + " : " + this.initial + " &" + this.delta + " >";
	}
	
	public int min(){
		if(delta < 0){
			return(initial + ((num-1)*delta));
		}
		else{
			return initial;
		}
	}	
	public SeqIt createSeqIt(){
		DeltaIt sI = new DeltaIt(this);
		return sI;
	}

}
