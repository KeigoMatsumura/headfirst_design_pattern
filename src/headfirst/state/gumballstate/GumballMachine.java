package headfirst.state.gumballstate;

public class GumballMachine {
 
	private State soldOutState;//売り切れ
	private State noQuarterState;//お金を入れていない
	private State hasQuarterState;//お金をいれた
	private State soldState;//ガムボールを排出する
 
	private State state = soldOutState;//現在の状態（初期値は売り切れ）
	private int count = 0;//自動販売機のガムボールの数（初期値は0）
 
	/**
	 * ガムボール自動販売機を生成
	 * @param count ガムボールの数
	 */
	public GumballMachine(int numberGumballs) {
		soldOutState = new SoldOutState(this);
		noQuarterState = new NoQuarterState(this);
		hasQuarterState = new HasQuarterState(this);
		soldState = new SoldState(this);

		this.count = numberGumballs;
 		if (numberGumballs > 0) {//ガムボールの数が0でないなら
			state = noQuarterState;//状態を「売り切れ」から「お金をいれていない」へ
		} 
	}
 
	/**
	 * お金を入れる
	 */
	public void insertQuarter() {
		state.insertQuarter();
	}
 
	/**
	 * お金を払い戻す
	 */
	public void ejectQuarter() {
		state.ejectQuarter();
	}
 
	/**
	 * ハンドルを回す
	 */
	public void turnCrank() {
		state.turnCrank();
		state.dispense();
	}

	/**
	 * 状態の変更
	 * @param state 変更後の状態
	 */
	void setState(State state) {
		this.state = state;
	}

	/**
	 * ガムボールの排出
	 */
	void releaseBall() {
		System.out.println("ガムボールがスロットから転がり出てきます");
		if (count != 0) {
			count --;
		}
	}
 
	/**
	 * countのゲッター
	 * @return ガムボールの個数
	 */
	int getCount() {
		return count;
	}

	/**
	 * ガムボールを補充する
	 * @param count 補充する個数
	 */
	void refill(int count) {
		this.count += count;
		state = noQuarterState;//「お金を入れていない」状態へ
	}

	/**
	 * stateのゲッター
	 * @return 現在の状態
	 */
    public State getState() {
        return state;
    }

    /**
     * soldOutStateのゲッター
     * @return 「売り切れ」状態
     */
    public State getSoldOutState() {
        return soldOutState;
    }
    /**
     * noQuarterStateのゲッター
     * @return 「お金を入れていない」状態
     */
    public State getNoQuarterState() {
        return noQuarterState;
    }

    /**
     * hasQuarterStateのゲッター
     * @return 「お金をいれた」状態
     */
    public State getHasQuarterState() {
        return hasQuarterState;
    }

    /**
     * soldStateのゲッター
     * @return 「ガムボールを排出する」状態
     */
    public State getSoldState() {
        return soldState;
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
