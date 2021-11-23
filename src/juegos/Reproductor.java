package juegos;

import java.io.InputStream;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/**
 *
 * @author Joctan Esquivel
 */
public class Reproductor {
    private String path;
    
    public Reproductor(String path){
        this.path = path;
    }
    
    public void playWav() throws Exception {
        InputStream is = Reproductor.class.getResourceAsStream(path);
        AudioInputStream ais = AudioSystem.getAudioInputStream(is);

        Clip clip = AudioSystem.getClip();
        clip.open(ais);

        //System.out.printf("Audio format: %s%n", ais.getFormat());
        //System.out.printf("Sampled duration: %d seconds%n", clip.getMicrosecondLength() / 1000000);
        clip.getLevel();
        clip.start();
        

        do  {
            Thread.sleep(100);
        } while (clip.isRunning());

        clip.close();
        ais.close();
        
    }

    
     
}