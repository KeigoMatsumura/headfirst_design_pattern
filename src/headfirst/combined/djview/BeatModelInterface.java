package headfirst.combined.djview;
  
public interface BeatModelInterface {
	void initialize();//BeatMode がインスタンス化された後に呼び出される
  
	void on();//ビートジェネレーターの on
  
	void off();//ビートジェネレーターの off
  
    void setBPM(int bpm);//BMP の設定
  
	int getBPM();//現在の BMP を返す（off なら0）
  
	void registerObserver(BeatObserver o);//ビートオブザーバーの追加
  
	void removeObserver(BeatObserver o);//ビートオブザーバーの削除
  
	void registerObserver(BPMObserver o);//BMP オブザーバーの追加
  
	void removeObserver(BPMObserver o);//BMP オブザーバーの削除
}
