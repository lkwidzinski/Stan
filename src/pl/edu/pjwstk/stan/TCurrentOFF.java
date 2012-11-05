package pl.edu.pjwstk.stan;

public class TCurrentOFF extends TState{
	
	public TCurrentOFF(){
		System.out.println("Prad wylaczony");
	}
	
	public void on(TPowerSupply ps){
		ps.setState(new TCurrentON());
	}
}
