package headfirst.decorator.io;

import java.io.*;

public class InputTest {
	public static void main(String[] args) throws IOException {
		int c;

		try {
			//ファイル"test.txt"に対する小文字変換付きストリーム入力を生成
			InputStream in = 
				new LowerCaseInputStream(
					new BufferedInputStream(
						new FileInputStream("test.txt")));

			while((c = in.read()) >= 0) {//StreamTokenizer.TT.EOFが返るまで読み続ける
				System.out.print((char)c);
			}

			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
