package headfirst.proxy.gumball;

import java.util.Random;

public class HasQuarterState implements State {
	private static final long serialVersionUID = 1L;
	private Random randomWinner = new Random(System.currentTimeMillis());
	private transient GumballMachine gumballMachine;
 
	public HasQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
  
	public void insertQuarter() {
		System.out.println("もう一度25セントを投入することはできません");
	}
 
	public void ejectQuarter() {
		System.out.println("25セントを返却しました");
		gumballMachine.setState(gumballMachine.getNoQuarterState());
	}
 
	public void turnCrank() {
		System.out.println("クランクを回しました...");
		int winner = randomWinner.nextInt(10);
		if (winner == 0) {
			gumballMachine.setState(gumballMachine.getWinnerState());
		} else {
			gumballMachine.setState(gumballMachine.getSoldState());
		}
	}

    public void dispense() {
        System.out.println("販売するガムボールはありません");
    }
 
	public String toString() {
		return "クランクが回されるのを待っています";
	}
}
