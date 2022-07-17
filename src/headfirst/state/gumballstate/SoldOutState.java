package headfirst.state.gumballstate;

/**
 * 「売り切れ」状態
 */
public class SoldOutState implements State {
    private GumballMachine gumballMachine;
 
    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
    /**
     * お金を入れる
     */
	public void insertQuarter() {
		System.out.println("25セントを投入することはできません。このマシンは売り切れです");
	}
 
	/**
	 * お金を払い戻す
	 */
	public void ejectQuarter() {
		System.out.println("返金できません。まだ25セントを投入していません");
	}
 
	/**
	 * ハンドルを回す
	 */
	public void turnCrank() {
		System.out.println("クランクを回しましたが、ガムボールがありません");
	}
 
	/**
	 * ガムボールを排出する
	 */
	public void dispense() {
		System.out.println("販売するガムボールはありません");
	}
 
	public String toString() {
		return "売り切れです";
	}
}
