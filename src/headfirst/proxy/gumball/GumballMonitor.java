package headfirst.proxy.gumball;

import java.rmi.*;
 
public class GumballMonitor {
	private GumballMachineRemote machine;
 
	public GumballMonitor(GumballMachineRemote machine) {
		this.machine = machine;
	}
 
	public void report() {
		try {
			System.out.println("ガムボールマシン: " + machine.getLocation());
			System.out.println("現在の個数: " + machine.getCount() + "個");
			System.out.println("現在の状態: " + machine.getState());
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}
}
