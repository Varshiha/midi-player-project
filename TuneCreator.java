
/**
 * Write a description of class TuneCreator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TuneCreator
{
    
    private MidiPlayer player;


    /**
     * Constructor for objects of class TuneCreator
     */
    public TuneCreator()
    {
       player = new MidiPlayer();
    }

    
    public void CreateAndPlay()
    {
       SimpleTune tune = new SimpleTune();
       tune.addNote("C", 12);
       tune.addNote("B", 8);
       tune.addNote("D", 7);
       
       player.playTune(tune);
    }
    
    }
