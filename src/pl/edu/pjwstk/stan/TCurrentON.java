package pl.edu.pjwstk.stan;

public class TCurrentON extends TState{
	
	public TCurrentON(){
		System.out.println("Prad wlaczony");
	}
	
	public void off(TPowerSupply ps){
		ps.setState(new TCurrentOFF());
	}

}
