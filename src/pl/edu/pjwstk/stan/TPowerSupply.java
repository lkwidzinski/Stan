package pl.edu.pjwstk.stan;

public class TPowerSupply {
	
	private TState state;

	public TPowerSupply(){
		state=new TCurrentOFF();
	}
	
	void setState(TState state){
		this.state=state;
	}
	
	public void on() {
		System.out.println("Zasilacz wlaczony (ON)");
		state.on(this);
	}
	
	public void off() {
		System.out.println("Zasilacz wylaczony (OFF)");
		state.off(this);
	}

}
