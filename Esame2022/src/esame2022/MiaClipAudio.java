/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package esame2022;

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class MiaClipAudio {

    private String nomeDelFile;
    private Clip miaClip;

    public MiaClipAudio(String nome) {
        nomeDelFile = nome;
        try {
            File miofile = new File(nomeDelFile);
            AudioInputStream inputStream;
            inputStream = AudioSystem.getAudioInputStream(miofile);
            miaClip = AudioSystem.getClip();
            miaClip.open(inputStream);
        } catch (Exception err) {
            System.out.println(err.toString());
        } // endof try-catch
    }

    public Clip getMiaclip() {
        return miaClip;
    }

    public String getNomeDelFile() {
        return nomeDelFile;

    }

    public void start() {
        try {
            miaClip.start();              // qui è il play
        } catch (Exception err) {
            System.out.println(err.toString());
        }  // end of try-catch
    } // end of start

    public void loop(int mode) {
        try {
            miaClip.loop(mode);              // qui è il play
        } catch (Exception err) {
            System.out.println(err.toString());
        }  // end of try-catch
    } // end of loop

    public void stop() {
        try {
            if (miaClip.isOpen()) {
                miaClip.stop();
                miaClip.close();
            }
        } catch (Exception err) {
            System.out.println(err.toString());
        } // end of try-catch        
    } // end of stop

} // end of MiaClipAudio
