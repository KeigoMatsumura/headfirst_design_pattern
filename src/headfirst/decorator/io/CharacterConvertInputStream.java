package headfirst.decorator.io;

import java.io.*;

/**
 * 1対1の文字変換を行いながらストリームから読む（Template Method パターンを使用）
 */
public class CharacterConvertInputStream extends FilterInputStream {
	private static final int EOF = StreamTokenizer.TT_EOF;// ファイルの終わりを表すコード

	public CharacterConvertInputStream(InputStream in) {
		super(in);
	}

	/**
	 * 1文字入力
	 */
	public int read() throws IOException {
		int c = super.read();
		return (c == EOF ? c : convertCharacter((char) c));
	}

	/**
	 * バッファー入力
	 * @param b 読み込むバッファー
	 * @param offset バッファーの何文字目から読んだ文字をセットするか
	 * @param len 読み込む文字数
	 * @return 読み込んだ文字数（１文字も読めなければStreamTokenizer.TT.EOF）
	 */
	public int read(byte[] b, int offset, int len) throws IOException {
		int result = super.read(b, offset, len);
		for (int i = offset; i < offset + result; i++) {
			b[i] = (byte)convertCharacter((char) b[i]);
		}
		return result;
	}

	/**
	 * 読み込んだ文字を1対1の変換するフック（デフォルトで何もしない）
	 * @param c
	 * @return c
	 */
	protected int convertCharacter(char c) {
		return (int)c;
	}

}
