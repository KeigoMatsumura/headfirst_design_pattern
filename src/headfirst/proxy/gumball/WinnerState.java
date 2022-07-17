package headfirst.proxy.gumball;

public class WinnerState implements State {
	private static final long serialVersionUID = 1L;
    private transient GumballMachine gumballMachine;
 
    public WinnerState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
	public void insertQuarter() {
		System.out.println("お待ちください。すでにガムボールを販売中です");
	}
 
	public void ejectQuarter() {
		System.out.println("お待ちください。すでにガムボールを販売中です");
	}
 
	public void turnCrank() {
		System.out.println("2回回してもガムボールをもう1つ手に入れることはできません！");
	}
 
	public void dispense() {
		System.out.println("当たりです！25セントで2つのガムボールがもらえます");
		gumballMachine.releaseBall();
		if (gumballMachine.getCount() == 0) {
			gumballMachine.setState(gumballMachine.getSoldOutState());
		} else {
			gumballMachine.releaseBall();
			if (gumballMachine.getCount() > 0) {
				gumballMachine.setState(gumballMachine.getNoQuarterState());
			} else {
          		 	System.out.println("おっと、ガムボールがなくなりました");
				gumballMachine.setState(gumballMachine.getSoldOutState());
			}
		}
	}
 
	public String toString() {
		return "当たりなので、ガムボールが2つスロットから転がり出てきます！";
	}
}
