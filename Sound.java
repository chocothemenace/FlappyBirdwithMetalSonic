
import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;


public class Sound {

    Clip clip;
    URL soundURL[] = new URL[30];

    public Sound() {
        soundURL[0] = getClass().getResource("/BgMusic.wav");
        soundURL[1] = getClass().getResource("/jumpSound.wav");
        soundURL[2] = getClass().getResource("/TryAgainSound.wav");
        soundURL[3] = getClass().getResource("/titleScreen.wav");
        soundURL[4] = getClass().getResource("/soundTitle.wav");
    }

    public void setFile(int i){

        try{
            AudioInputStream ais = AudioSystem.getAudioInputStream(soundURL[i]);
            clip = AudioSystem.getClip();
            clip.open(ais);

        } catch(Exception e){

        }

    }

    public void play(){

        clip.start();

    }

    public void loop(){
        clip.loop(Clip.LOOP_CONTINUOUSLY);//looping music!!!
        
    }

    public void stop(){
        clip.stop();
        //clip.setFramePosition(0);clip.setFramePosition(0);
    }




}
/* 
    public BackgroundMusic(String musicFilePath) {
        try {
            // Load the audio file
            
            URL url = getClass().getResource(musicFilePath);
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(url);

            // Get audio format
            AudioFormat format = audioInputStream.getFormat();
            DataLine.Info info = new DataLine.Info(Clip.class, format);

            // Open and start the clip
            clip = (Clip) AudioSystem.getLine(info);
            clip.open(audioInputStream);
            clip.loop(Clip.LOOP_CONTINUOUSLY); // Loop the music
            clip.start();

        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }
    }

    public void stopMusic() {
        if (clip != null && clip.isRunning()) {
            clip.stop();
        }
    }

    public void startMusic() {
        if (clip != null && !clip.isRunning()) {
            clip.start();
        }
    }
}*/