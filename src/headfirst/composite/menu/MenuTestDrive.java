package headfirst.composite.menu;

public class MenuTestDrive {
	public static void main(String args[]) {
		MenuComponent pancakeHouseMenu = 
			new Menu("パンケーキハウスメニュー", "朝食");
		MenuComponent dinerMenu = 
			new Menu("食堂メニュー", "昼食");
		MenuComponent cafeMenu = 
			new Menu("カフェメニュー", "夕食");
		MenuComponent dessertMenu = 
			new Menu("デザートメニュー", "もちろんデザート");
  
		MenuComponent allMenus = new Menu("すべてのメニュー", "すべてを統合したメニュー");
  
		allMenus.add(pancakeHouseMenu);
		allMenus.add(dinerMenu);
		allMenus.add(cafeMenu);
  
		pancakeHouseMenu.add(new MenuItem(
			"K&Bのパンケーキ朝食", 
			"スクランブルエッグとトーストが付いたパンケーキ", 
			true,
			2.99));
		pancakeHouseMenu.add(new MenuItem(
			"通常のパンケーキ朝食", 
			"卵焼きとソーセージが付いたパンケーキ", 
			false,
			2.99));
		pancakeHouseMenu.add(new MenuItem(
			"ブルーベリーパンケーキ",
			"新鮮なブルーベリーで作ったパンケーキ（ブルーベリーシロップ付き）",
			true,
			3.49));
		pancakeHouseMenu.add(new MenuItem(
			"ワッフル",
			"ブルーベリーか苺の好きな方をのせたワッフル",
			true,
			3.59));

		dinerMenu.add(new MenuItem(
			"ベジタリアンBLT",
			"レタス、トマト、（偽）ベーコンをはさんだ全粒小麦パンサンドイッチ", 
			true, 
			2.99));
		dinerMenu.add(new MenuItem(
			"BLT",
			"レタス、トマト、ベーコンをはさんだ全粒小麦パンサンドイッチ", 
			false, 
			2.99));
		dinerMenu.add(new MenuItem(
			"本日のスープ",
			"ポテトサラダを添えた本日のスープ", 
			false, 
			3.29));
		dinerMenu.add(new MenuItem(
			"ホットドッグ",
			"サワークラウト、レリッ種、玉ねぎ、チーズをはさんだホットドッグ",
			false, 
			3.05));
		dinerMenu.add(new MenuItem(
			"蒸し野菜と玄米",
			"玄米の上に蒸し野菜", 
			true, 
			3.99));
 
		dinerMenu.add(new MenuItem(
			"パスタ",
			"マリナラソースのかかったスパゲティとサワードパン",
			true, 
			3.89));
   
		dinerMenu.add(dessertMenu);
  
		dessertMenu.add(new MenuItem(
			"アップルパイ",
			"バニラアイスクリームをのせたフレーク状生地のアップルパイ",
			true,
			1.59));
  
		dessertMenu.add(new MenuItem(
			"チーズケーキ",
			"チョコレートグラハム生地のクリーミーなニューヨークチーズケーキ",
			true,
			1.99));
		dessertMenu.add(new MenuItem(
			"シャーベット",
			"ひとすくいのラズベリーシャーベットとライムシャーベット",
			true,
			1.89));

		cafeMenu.add(new MenuItem(
			"野菜バーガーとフライドポテト",
			"全粒小麦パンにレタスとトマトをはさんだ野菜バーガーとフライドポテト",
			true, 
			3.99));
		cafeMenu.add(new MenuItem(
			"本日のスープ",
			"サラダが付いた本日のスープ",
			false, 
			3.69));
		cafeMenu.add(new MenuItem(
			"ブリトー",
			"インゲン豆、サルサ、グアカモーレ入りの大きなブリトー",
			true, 
			4.29));
 
		Waitress waitress = new Waitress(allMenus);
   
		waitress.printMenu();
	}
}
