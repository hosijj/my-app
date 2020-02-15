package ir.org.acm.session13.musicPlayer;

public class RunPlayer {

    public static void main(String[] args) {

        MusicPlayerFactory f = new MusicPlayerFactory();

        new Party().startParty( f.getPlayer(90) );

    }


}
