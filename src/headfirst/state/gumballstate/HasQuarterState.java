package headfirst.state.gumballstate;

/**
 * 「お金をいれた」状態
 */
public class HasQuarterState implements State {
	private GumballMachine gumballMachine;
 
	public HasQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

    /**
     * お金を入れる
     */
	public void insertQuarter() {
		System.out.println("もう一度25セントを投入することはできません");
	}

	/**
	 * お金を払い戻す
	 */
	public void ejectQuarter() {
		System.out.println("25セントを返却しました");
		//「お金を入れていない」状態へ
		gumballMachine.setState(gumballMachine.getNoQuarterState());
	}
 
	/**
	 * ハンドルを回す
	 */
	public void turnCrank() {
		System.out.println("クランクを回しました...");
		//「ガムボールを排出する」状態へ
		gumballMachine.setState(gumballMachine.getSoldState());
	}

	/**
	 * ガムボールを排出する
	 */
    public void dispense() {
        System.out.println("販売するガムボールはありません");
    }
 
	public String toString() {
		return "クランクが回されるのを待っています";
	}
}
