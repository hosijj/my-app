package ir.org.acm.session31.strategy;

public class Woman { // Context Object

    private Emotion emotion; // Strategy Object

    void talk() {
        System.out.print("Woman is talking ");
        emotion.reaction();
    }

    void walk() {
        System.out.print("Woman is walking ");
        emotion.reaction();
    }

    void eat() {
        System.out.print("Woman is eating ");
        emotion.reaction();
    }

    public Emotion getEmotion() {
        return emotion;
    }

    public void setEmotion(Emotion e) {
        this.emotion = e;
    }

}
