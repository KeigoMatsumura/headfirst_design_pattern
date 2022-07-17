package headfirst.state.gumballstate;

/**
 * 「お金を入れていない」状態
 */
public class NoQuarterState implements State {
    private GumballMachine gumballMachine;
 
    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
    /**
     * お金を入れる
     */
	public void insertQuarter() {
		System.out.println("25セントを投入しました");
		//「お金をいれた」状態へ
		gumballMachine.setState(gumballMachine.getHasQuarterState());
	}

	/**
	 * お金を払い戻す
	 */
	public void ejectQuarter() {
		System.out.println("25セントを投入していません");
	}
 
	/**
	 * ハンドルを回す
	 */
	public void turnCrank() {
		System.out.println("クランクを回しましたが、25セントを投入していません");
	 }

	/**
	 * ガムボールを排出する
	 */
	public void dispense() {
		System.out.println("まず支払いをする必要があります");
	} 
 
	public String toString() {
		return "25セントが投入されるのを待っています";
	}
}
