package headfirst.facade.hometheater;

public class HomeTheaterTestDrive {
	public static void main(String[] args) {
		Amplifier amp = new Amplifier("アンプ");
		Tuner tuner = new Tuner("AM/FM チューナー", amp);
		DvdPlayer dvd = new DvdPlayer("DVDプレーヤー", amp);
		CdPlayer cd = new CdPlayer("CDプレーヤー", amp);
		Projector projector = new Projector("プロジェクター", dvd);
		TheaterLights lights = new TheaterLights("天井の照明");
		Screen screen = new Screen("シアタのスクリーン");
		PopcornPopper popper = new PopcornPopper("ポップコーン製造機");
 
		HomeTheaterFacade homeTheater = 
				new HomeTheaterFacade(amp, tuner, dvd, cd, 
						projector, screen, lights, popper);
 
		homeTheater.watchMovie("進撃の巨人 Vol.3");
		homeTheater.endMovie();
	}
}
