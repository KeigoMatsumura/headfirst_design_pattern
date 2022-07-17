package headfirst.adapter.ducks;

public class DuckTestDrive {
	public static void main(String[] args) {
		MallardDuck duck = new MallardDuck();
 
		WildTurkey turkey = new WildTurkey();
		Duck turkeyAdapter = new TurkeyAdapter(turkey);
   
		System.out.println("七面鳥が鳴きます...");
		turkey.gobble();
		turkey.fly();
 
		System.out.println("\nカモが鳴きます...");
		testDuck(duck);
  
		System.out.println("\n七面鳥のAdapterが鳴きます...");
		testDuck(turkeyAdapter);
	}
 
	static void testDuck(Duck duck) {
		duck.quack();
		duck.fly();
	}
}
