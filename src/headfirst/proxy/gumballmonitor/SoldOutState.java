package headfirst.proxy.gumballmonitor;

public class SoldOutState implements State {
	private static final long serialVersionUID = 1L;
    private GumballMachine gumballMachine;
 
    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
	public void insertQuarter() {
		System.out.println("25セントを投入することはできません。このマシンは売り切れです");
	}
 
	public void ejectQuarter() {
		System.out.println("返金できません。まだ25セントを投入していません");
	}
 
	public void turnCrank() {
		System.out.println("クランクを回しましたが、ガムボールがありません");
	}
 
	public void dispense() {
		System.out.println("販売するガムボールはありません");
	}
 
	public String toString() {
		return "売り切れです";
	}
}
