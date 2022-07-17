package headfirst.state.gumball;

/**
 * ガムボールの自動販売機
 */
public class GumballMachine {
 
	private final static int SOLD_OUT = 0;//売り切れ
	private final static int NO_QUARTER = 1;//お金を入れていない
	private final static int HAS_QUARTER = 2;//お金をいれた
	private final static int SOLD = 3;//ガムボールを排出する
 
	private int state = SOLD_OUT;//現在の状態（初期値は売り切れ）
	private int count = 0;//自動販売機のガムボールの数（初期値は0）

	/**
	 * ガムボール自動販売機を生成
	 * @param count ガムボールの数
	 */
	public GumballMachine(int count) {
		this.count = count;
		if (count > 0) {//ガムボールの数が0でないなら
			state = NO_QUARTER;//状態を「売り切れ」から「お金をいれていない」へ
		}
	}

	/**
	 * お金を入れる
	 */
	public void insertQuarter() {
		if (state == HAS_QUARTER) {//状態が「お金をいれた」なら
			System.out.println("もう一度25セントを投入することはできません");
		} else if (state == NO_QUARTER) {//状態が「お金をいれていない」なら
			state = HAS_QUARTER;//状態を「お金をいれた」にして
			System.out.println("25セントを投入しました");
		} else if (state == SOLD_OUT) {//状態が「売り切れ」なら
			System.out.println("25セントを投入することはできません。このマシンは売り切れです");
		} else if (state == SOLD) {//状態が「ガムボールを排出する」なら
        	System.out.println("お待ちください。すでにガムボールを販売中です");
		}
	}

	/**
	 * お金を払い戻す
	 */
	public void ejectQuarter() {
		if (state == HAS_QUARTER) {//状態が「お金をいれた」なら
			System.out.println("25セントを返却しました");
			state = NO_QUARTER;//状態が「お金をいれていない」なら
		} else if (state == NO_QUARTER) {
			System.out.println("25セントを投入していません");
		} else if (state == SOLD) {//状態が「ガムボールを排出する」なら
			System.out.println("申し訳ありません。すでにクランクを回しています");
		} else if (state == SOLD_OUT) {//状態が「売り切れ」なら
        	System.out.println("返金できません。まだ25セントを投入していません");
		}
	}
 
	/**
	 * ハンドルを回す
	 */
	public void turnCrank() {
		if (state == SOLD) {//状態が「ガムボールを排出する」なら
			System.out.println("2回回してもガムボールをもう1つ手に入れることはできません！");
		} else if (state == NO_QUARTER) {//状態が「お金をいれていない」なら
			System.out.println("クランクを回しましたが、25セントを投入していません");
		} else if (state == SOLD_OUT) {//状態が「売り切れ」なら
			System.out.println("クランクを回しましたが、ガムボールがありません");
		} else if (state == HAS_QUARTER) {//状態が「お金をいれた」なら
			System.out.println("クランクを回しました...");
			state = SOLD;//状態を「ガムボールを排出する」にして
			dispense();//ガムボールを排出する
		}
	}

	/**
	 * ガムボールを排出する
	 */
	public void dispense() {
		if (state == SOLD) {//状態が「ガムボールを排出する」なら
			System.out.println("ガムボールがスロットから転がり出てきます");
			count --;//ガムボールの個数を1つ減らす
			if (count == 0) {//ガムボールが無くなったら
				System.out.println("おっと、ガムボールがなくなりました");
				state = SOLD_OUT;////状態を「売り切れ」にする
			} else {//そうでなければ
				state = NO_QUARTER;//状態を「お金をいれていない」にする
			}
		} else if (state == NO_QUARTER) {//状態が「お金をいれていない」なら
			System.out.println("まず支払いをする必要があります");
		} else if (state == SOLD_OUT) {//状態が「売り切れ」なら
			System.out.println("販売するガムボールはありません");
		} else if (state == HAS_QUARTER) {//状態が「お金をいれた」なら
			System.out.println("販売するガムボールはありません");
		}
	}
 
	/**
	 * ガムボールの補充をする
	 * @param numGumBalls 補充するガムボールの数
	 */
	public void refill(int numGumBalls) {
		this.count += numGumBalls;
		state = NO_QUARTER;//状態を「お金をいれていない」状態にする
	}

	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\nMighty Cumball, Inc.");
		result.append("\nJava対応据付型ガムボール　モデル#2004\n");
		result.append("在庫:" + count + "個のガムボール");
		result.append("\nマシンは");
		if (state == SOLD_OUT) {
			result.append("売り切れです");
		} else if (state == NO_QUARTER) {
			result.append("25セントが投入されるのを待っています");
		} else if (state == HAS_QUARTER) {
			result.append("クランクが回されるのを待っています");
		} else if (state == SOLD) {
			result.append("ガムボールを販売中です");
		}
		result.append("\n");
		return result.toString();
	}
}
