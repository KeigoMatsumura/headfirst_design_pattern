package headfirst.proxy.gumballmonitor;
 
public class GumballMonitor {
	private GumballMachine machine;
 
	public GumballMonitor(GumballMachine machine) {
		this.machine = machine;
	}
 
	public void report() {
		System.out.println("ガムボールマシン: " + machine.getLocation());
		System.out.println("現在の個数: " + machine.getCount() + "個");
		System.out.println("現在の状態: " + machine.getState());
	}
}
