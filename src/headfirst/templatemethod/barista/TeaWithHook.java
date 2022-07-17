package headfirst.templatemethod.barista;

import java.io.*;

public class TeaWithHook extends CaffeineBeverageWithHook {
 
	public void brew() {
		System.out.println("紅茶を浸します");
	}
 
	public void addCondiments() {
		System.out.println("レモンを追加します");
	}
 
	public boolean customerWantsCondiments() {

		String answer = getUserInput();

		if (answer.toLowerCase().startsWith("y")) {
			return true;
		} else {
			return false;
		}
	}
 
	private String getUserInput() {
		// get the user's response
		String answer = null;

		System.out.print("紅茶にレモンを入れますか？(y/n)");

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			answer = in.readLine();
		} catch (IOException ioe) {
			System.err.println("回答読み込み時のI/Oエラー");
		}
		if (answer == null) {
			return "no";
		}
		return answer;
	}
}
