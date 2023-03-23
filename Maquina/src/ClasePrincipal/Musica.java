/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasePrincipal;

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;




public class Musica {
    public void reproducir(){
        try {
            File cansion = new File("src/Music/selvawav.wav");
            AudioInputStream audio = AudioSystem.getAudioInputStream(cansion);
            Clip clip = AudioSystem.getClip();
            clip.open(audio);
            FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
            gainControl.setValue(-15.0f);
            clip.start();
        
        } catch (Exception e) {
            System.out.println("no vale el sonido");
        }
        
    }
    public Clip reproducirGiro(){
        try {
            File cansion = new File("src/Music/spin.wav");
            AudioInputStream audio = AudioSystem.getAudioInputStream(cansion);
            Clip clip = AudioSystem.getClip();
            clip.open(audio);
            
            return clip;

        } catch (Exception e) {
            System.out.println("no vale el sonido");
        }
            return null;
    
    }
    public void reproducirAccion(){
        try {
            File cansion = new File("src/Music/hit.wav");
            AudioInputStream audio = AudioSystem.getAudioInputStream(cansion);
            Clip clip = AudioSystem.getClip();
            clip.open(audio);
            clip.start();
        
        } catch (Exception e) {
            System.out.println("no vale el sonido");
        }
    }
        
    
    
     
}
