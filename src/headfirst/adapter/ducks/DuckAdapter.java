package headfirst.adapter.ducks;
import java.util.Random;

/**
 * カモ(Duck)を七面鳥(Turkey)のように振る舞わせるadapter
 */
public class DuckAdapter implements Turkey {
	private final int flyNumber = 5;//カモは七面鳥の5倍長い距離を飛ぶ
	private Duck duck;
	private Random rand;//flyNumber回に1回だけ飛ぶための乱数
 
	/**
	 * @param duck このカモを七面鳥に化けさせる
	 */
	public DuckAdapter(Duck duck) {
		this.duck = duck;
		rand = new Random();
	}
    
	public void gobble() {
		duck.quack();
	}
  
	public void fly() {
		//カモは七面鳥のflyNumber倍飛ぶので、flyNumber回に1回だけ飛べば同じだけ飛ぶことになる
		if (rand.nextInt(flyNumber)  == 0) {
		     duck.fly();
		}
	}
}
