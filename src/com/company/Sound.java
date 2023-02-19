package com.company;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.net.URL;


public class Sound {

    Clip clip;
    URL soundURL[] = new URL[36];
    public Sound() {

        soundURL[0] = getClass().getResource("/rsc/A_morse_code.wav");
        soundURL[1] = getClass().getResource("/rsc/B_morse_code.wav");
        soundURL[2] = getClass().getResource("/rsc/C_morse_code.wav");
        soundURL[3] = getClass().getResource("/rsc/D_morse_code.wav");
        soundURL[4] = getClass().getResource("/rsc/E_morse_code.wav");
        soundURL[5] = getClass().getResource("/rsc/F_morse_code.wav");
        soundURL[6] = getClass().getResource("/rsc/G_morse_code.wav");
        soundURL[7] = getClass().getResource("/rsc/H_morse_code.wav");
        soundURL[8] = getClass().getResource("/rsc/I_morse_code.wav");
        soundURL[9] = getClass().getResource("/rsc/J_morse_code.wav");
        soundURL[10] = getClass().getResource("/rsc/K_morse_code.wav");
        soundURL[11] = getClass().getResource("/rsc/L_morse_code.wav");
        soundURL[12] = getClass().getResource("/rsc/M_morse_code.wav");
        soundURL[13] = getClass().getResource("/rsc/N_morse_code.wav");
        soundURL[14] = getClass().getResource("/rsc/O_morse_code.wav");
        soundURL[15] = getClass().getResource("/rsc/P_morse_code.wav");
        soundURL[16] = getClass().getResource("/rsc/Q_morse_code.wav");
        soundURL[17] = getClass().getResource("/rsc/R_morse_code.wav");
        soundURL[18] = getClass().getResource("/rsc/S_morse_code.wav");
        soundURL[19] = getClass().getResource("/rsc/T_morse_code.wav");
        soundURL[20] = getClass().getResource("/rsc/U_morse_code.wav");
        soundURL[21] = getClass().getResource("/rsc/V_morse_code.wav");
        soundURL[22] = getClass().getResource("/rsc/W_morse_code.wav");
        soundURL[23] = getClass().getResource("/rsc/X_morse_code.wav");
        soundURL[24] = getClass().getResource("/rsc/Y_morse_code.wav");
        soundURL[25] = getClass().getResource("/rsc/Z_morse_code.wav");
        soundURL[26] = getClass().getResource("/rsc/0_number_morse_code.wav");
        soundURL[27] = getClass().getResource("/rsc/1_number_morse_code.wav");
        soundURL[28] = getClass().getResource("/rsc/2_number_morse_code.wav");
        soundURL[29] = getClass().getResource("/rsc/3_number_morse_code.wav");
        soundURL[30] = getClass().getResource("/rsc/4_number_morse_code.wav");
        soundURL[31] = getClass().getResource("/rsc/5_number_morse_code.wav");
        soundURL[32] = getClass().getResource("/rsc/6_number_morse_code.wav");
        soundURL[33] = getClass().getResource("/rsc/7_number_morse_code.wav");
        soundURL[34] = getClass().getResource("/rsc/8_number_morse_code.wav");
        soundURL[35] = getClass().getResource("/rsc/9_number_morse_code.wav");

    }
    public void PlaySound(int i){

        try{

            AudioInputStream ais = AudioSystem.getAudioInputStream(soundURL[i]);
            clip = AudioSystem.getClip();
            clip.open(ais);

        }catch (Exception e){
            System.out.println("Error.");
        }
    }
    public void play(){

        clip.start();

    }
    public void stop(){

        clip.stop();

    }
}

