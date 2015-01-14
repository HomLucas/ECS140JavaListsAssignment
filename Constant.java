//lucas hom ecs140

public class Constant extends Seq{
	protected int num;
	protected int value;
	public Constant(int num, int value)
	{
		if(num == 0){
			this.num = 0;
			this.value = 0;
		}
		else{
			this.num = num;
			this.value = value;
		}
		
	}
	
	public String toString()
	{
		return "[ " + this.num + " : " + this.value + " ]";
	}
	
	public int min()
	{
		return 	value;
	}

	public SeqIt createSeqIt(){
		ConstantIt sI = new ConstantIt(this);
		return sI;
	}
}
