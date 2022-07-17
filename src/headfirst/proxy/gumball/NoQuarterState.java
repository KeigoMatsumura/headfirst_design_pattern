package headfirst.proxy.gumball;

public class NoQuarterState implements State {
	private static final long serialVersionUID = 1L;
    private transient GumballMachine gumballMachine;
 
    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
	public void insertQuarter() {
		System.out.println("25セントを投入しました");
		gumballMachine.setState(gumballMachine.getHasQuarterState());
	}
 
	public void ejectQuarter() {
		System.out.println("25セントを投入していません");
	}
 
	public void turnCrank() {
		System.out.println("クランクを回しましたが、25セントを投入していません");
	 }
 
	public void dispense() {
		System.out.println("まず支払いをする必要があります");
	} 
 
	public String toString() {
		return "25セントが投入されるのを待っています";
	}
}
