import java.util.Date;

public class MusicLP implements Comparable<MusicLP>{
    int year;
    String artist;
    String title;
    float length;
    int tracks;

    public MusicLP(int year, String artist, String title, float length, int tracks ){
        this.year=year;
        this.artist=artist;
        this.title=title;
        this.length = length;
        this.tracks = tracks;
    }
    @Override
    public String toString(){
        return "Year: "+this.year+" || Artist: "+this.artist+" || Title: "+this.title+" || Length: "+this.length+" || Tracks: "+this.tracks;
    }

    @Override
    public int compareTo(MusicLP o) {
        if(this.year < o.year){
            return -1;
        }
        else if(this.year > o.year){
            return 1;
        }
        else
            return 0;
    }
}
