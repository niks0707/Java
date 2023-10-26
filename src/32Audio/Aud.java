import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Aud {
    public static void main(String[] args) throws IOException, UnsupportedAudioFileException, LineUnavailableException {
        File file = new File("test.wav");
        Clip clip = AudioSystem.getClip();
        clip.open(AudioSystem.getAudioInputStream(file));

        String res = "";
        Scanner sc = new Scanner(System.in);
        
        while(!res.equals("Q")){
            System.out.println("P = play, S = stop, R = Reset, Q = Quit");
            res = sc.next();
            res = res.toUpperCase();

            switch(res){
                case "P":
                    clip.start();
                    break;
                case "S":
                    clip.stop();
                    break;
                case "R":
                    clip.setMicrosecondPosition(0);
                    break;
                case "Q":
                    clip.stop();
                    clip.close();
                    break;
                default:
                    System.out.println("Invalid input");
            }
        }

        clip.stop();
        clip.close();
    }
}
