package DrumKit;

public class DrumKitTest {
    public static void main (String[] args){
        DrumKit d = new DrumKit();
        d.playSnare();
        d.snare = false;

        if (d.snare == true){
            d.playSnare();
        }
        d.playTopHat();

    }
}
