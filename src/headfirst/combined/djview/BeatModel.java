package headfirst.combined.djview;
  
import javax.sound.midi.*;
import java.util.*;

public class BeatModel implements BeatModelInterface, MetaEventListener {
    private Sequencer sequencer;
	private List<BeatObserver> beatObservers = new ArrayList<BeatObserver>();//ビートオブザーバーリスト
	private List<BPMObserver> bpmObservers = new ArrayList<BPMObserver>();//BMP オブザーバーリスト
    private int bpm = 90;
    private Sequence sequence;
    private Track track;
 
	public void initialize() {
        setUpMidi();
        buildTrackAndStart();
	}
 
    public void on() {
        sequencer.start();
        setBPM(90);
    }
 
    public void off() {
		setBPM(0);
		sequencer.stop();
    }
 
    public void setBPM(int bpm) {
		this.bpm = bpm;
		sequencer.setTempoInBPM(getBPM());
		notifyBPMObservers();
    }
  
	public int getBPM() {
		return bpm;
	}
  
	void beatEvent() {
		notifyBeatObservers();
	}
  
   
	public void registerObserver(BeatObserver o) {
		beatObservers.add(o);
	}
  
	public void notifyBeatObservers() {
		for(BeatObserver observer: beatObservers) {
			observer.updateBeat();
		}
	}
  
	public void registerObserver(BPMObserver o) {
		bpmObservers.add(o);
	}
  
	public void notifyBPMObservers() {
		for(BPMObserver observer: bpmObservers) {
			observer.updateBPM();
		}
	}


	public void removeObserver(BeatObserver o) {
		int i = beatObservers.indexOf(o);
		if (i >= 0) {
			beatObservers.remove(i);
		}
	}



	public void removeObserver(BPMObserver o) {
		int i = bpmObservers.indexOf(o);
		if (i >= 0) {
			bpmObservers.remove(i);
		}
	}


    public void meta(MetaMessage message) {
        if (message.getType() == 47) {
			beatEvent();
        	sequencer.start();
        	setBPM(getBPM());
        }
    }

	public void setUpMidi() {
		try {
			sequencer = MidiSystem.getSequencer();
			sequencer.open();
			sequencer.addMetaEventListener(this);
			sequence = new Sequence(Sequence.PPQ,4);
			track = sequence.createTrack();
			sequencer.setTempoInBPM(getBPM());
		} catch(Exception e) {
				e.printStackTrace();
		}
    } 

     public void buildTrackAndStart() {
        int[] trackList = {35, 0, 46, 0};
    
        sequence.deleteTrack(null);
        track = sequence.createTrack();

      	makeTracks(trackList);
		track.add(makeEvent(192,9,1,0,4));      
	 	try {
			sequencer.setSequence(sequence);                    
		} catch(Exception e) {
			e.printStackTrace();
		}
    } 
            
    public void makeTracks(int[] list) {        
       
       for (int i = 0; i < list.length; i++) {
          int key = list[i];

          if (key != 0) {
             track.add(makeEvent(144,9,key, 100, i));
             track.add(makeEvent(128,9,key, 100, i+1));
          }
       }
    }
        
    public  MidiEvent makeEvent(int comd, int chan, int one, int two, int tick) {
        MidiEvent event = null;
        try {
            ShortMessage a = new ShortMessage();
            a.setMessage(comd, chan, one, two);
            event = new MidiEvent(a, tick);
            
        } catch(Exception e) {
			e.printStackTrace(); 
		}
        return event;
    }
}
