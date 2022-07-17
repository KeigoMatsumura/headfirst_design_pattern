package headfirst.proxy.gumballmonitor;

public class GumballMachine {
	private State soldOutState;
	private State noQuarterState;
	private State hasQuarterState;
	private State soldState;
	private State winnerState;
 
	private State state = soldOutState;
	private int count = 0;
	private String location;
 
	public GumballMachine(String location, int count) {
		soldOutState = new SoldOutState(this);
		noQuarterState = new NoQuarterState(this);
		hasQuarterState = new HasQuarterState(this);
		soldState = new SoldState(this);
		winnerState = new WinnerState(this);

		this.count = count;
 		if (count > 0) {
			state = noQuarterState;
		} 
		this.location = location;
	}
 
	public void insertQuarter() {
		state.insertQuarter();
	}
 
	public void ejectQuarter() {
		state.ejectQuarter();
	}
 
	public void turnCrank() {
		state.turnCrank();
		state.dispense();
	}

	void setState(State state) {
		this.state = state;
	}
 
	void releaseBall() {
		System.out.println("ガムボールがスロットから転がり出てきます");
		if (count != 0) {
			count = count - 1;
		}
	}
 
	public int getCount() {
		return count;
	}

	public void refill(int count) {
		this.count = count;
		state = noQuarterState;
	}

    public State getState() {
        return state;
    }
 
    public String getLocation() {
        return location;
    }
 
    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getWinnerState() {
        return winnerState;
    }
 
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\nMighty Cumball, Inc.");
		result.append("\nJava対応据付型ガムボール　モデル#2004\n");
		result.append("在庫:" + count + "個のガムボール");
		result.append("\nマシンは、");
		result.append(state + "\n");
		return result.toString();
	}
}
