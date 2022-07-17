package headfirst.adapter.ducks;

/**
 * 七面鳥(Turkey)をカモ(Duck)のように振る舞わせるadapter
 */
public class TurkeyAdapter implements Duck {
	private final int flyNumber = 5;//アヒルは七面鳥の5倍長い距離を飛ぶ
	private Turkey turkey;
 
	/**
	 * @param turkey この七面鳥カモに化けさせる
	 */
	public TurkeyAdapter(Turkey turkey) {
		this.turkey = turkey;
	}
    
	public void quack() {
		turkey.gobble();
	}
  
	//カモは七面鳥のflyNumber倍飛ぶので、七面鳥はflyNumber回飛ばないとカモと同じにならない
	public void fly() {
		for(int i=0; i < flyNumber; i++) {
			turkey.fly();
		}
	}
}
