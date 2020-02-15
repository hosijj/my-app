package ir.org.acm.session13.musicPlayer;

class MusicPlayerFactory {

    public static MusicPlayer getPlayer(int year) {

        MusicPlayer mp;

        switch(year) {

            case 70: mp = new WalkMan();
                break;

            case 80: mp = new CdMan();
                break;

            case 90: mp = new Mp3Player();
                break;

            default: mp = new Mp3Player();

        }

        return mp;

    }

}
