
/**
 * Write a description of class Album here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Album
{
    // instance variables - replace the example below with your own
    final public String title;
    final public String artist;
    final public int tracks;
    final public double playTime;

    /**
     * Constructor for objects of class Album
     */
    public Album(String title, String artist, int tracks, double playTime)
    {
       this.title=title;
       this.artist=artist;
       this.tracks=tracks;
       this.playTime=playTime;
    }

    public String toString()
    {
        return (title+" by "+artist+", with "
        +tracks+" tracks, totalling in "+playTime+" minutes of play time");
    }
}
