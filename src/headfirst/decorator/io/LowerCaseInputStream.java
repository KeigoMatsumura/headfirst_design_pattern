package headfirst.decorator.io;

import java.io.*;

/**
 * 大文字を小文字に変換しながらのストリーム入力
 */
public class LowerCaseInputStream extends CharacterConvertInputStream {

	public LowerCaseInputStream(InputStream in) {
		super(in);
	}

	/**
	 * 大文字を小文字に変換
	 */
	protected int convertCharacter(char c) {
		return Character.toLowerCase(c);
	}
}
