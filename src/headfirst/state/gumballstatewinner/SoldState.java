package headfirst.state.gumballstatewinner;

public class SoldState implements State {
	private GumballMachine gumballMachine;
 
    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
       
	public void insertQuarter() {
		System.out.println("お待ちください。すでにガムボールを販売中です");
	}
 
	public void ejectQuarter() {
		System.out.println("申し訳ありません。すでにクランクを回しています");
	}
 
	public void turnCrank() {
		System.out.println("2回回してもガムボールをもう1つ手に入れることはできません！");
	}
 
	public void dispense() {
		gumballMachine.releaseBall();
		if (gumballMachine.getCount() > 0) {
			gumballMachine.setState(gumballMachine.getNoQuarterState());
		} else {
			System.out.println("おっと、ガムボールがなくなりました");
			gumballMachine.setState(gumballMachine.getSoldOutState());
		}
	}
 
	public String toString() {
		return "ガムボールを販売中です";
	}
}
