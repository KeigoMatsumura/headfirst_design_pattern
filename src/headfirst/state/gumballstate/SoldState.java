package headfirst.state.gumballstate;

/**
 * 「ガムボールを排出する」状態
 */
public class SoldState implements State {
 
    private GumballMachine gumballMachine;
 
    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    /**
     * お金を入れる
     */
	public void insertQuarter() {
		System.out.println("お待ちください。すでにガムボールを販売中です");
	}
 
	/**
	 * お金を払い戻す
	 */
	public void ejectQuarter() {
		System.out.println("申し訳ありません。すでにクランクを回しています");
	}
 
	/**
	 * ハンドルを回す
	 */
	public void turnCrank() {
		System.out.println("2回回してもガムボールをもう1つ手に入れることはできません！");
	}
 
	/**
	 * ガムボールを排出する
	 */
	public void dispense() {
		gumballMachine.releaseBall();//ガムボールの排出
		if (gumballMachine.getCount() > 0) {//ガムボールが残っていれば
			//「お金を入れていない」状態へ
			gumballMachine.setState(gumballMachine.getNoQuarterState());
		} else {
			System.out.println("おっと、ガムボールがなくなりました");
			//「売り切れ」状態へ
			gumballMachine.setState(gumballMachine.getSoldOutState());
		}
	}
 
	public String toString() {
		return "ガムボールを販売中です";
	}
}


