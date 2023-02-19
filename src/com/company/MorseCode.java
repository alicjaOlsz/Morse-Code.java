package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class MorseCode extends Sound {

    static Sound sound = new Sound();

    public static void playSE(int i) {

        sound.PlaySound(i);
        sound.play();

    }


    public static void main(String[] args) {
        //new MorseCode();

        boolean result = false;
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter letter or number: ");
        char character = scr.next().charAt(0);
        character = Character.toUpperCase(character);

        final char[] arrayCharacters = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',
                'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
                '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};//36 all together

        final String[] arraySymForChar = {"*-", "-***", "-*-*", "-**", "*", "**-*", "--*", "****", "**", "*---",//from A - J
                "-*-", "*-**", "--", "-*", "---", "*--*", "--*-", "*-*", "***", "-", "**-", "***-", "*--", "-**-", "-*--", "--**",//K - Z
                "-----", "*----", "**---", "***--", "****-", "*****", "-****", "--***", "---**", "----*"};//0 - 9


        for (int el : arrayCharacters) {//for-each loop
            if (el == character) {
                result = true;
                break;
            }
        }
        if (!result) {
            System.out.println("Error. Please, try again. Morse code doesn't exist for such a letter/number.");
        }

        int index = findIndex(arrayCharacters, character);//print the index, for C the index is 4
        System.out.println(arraySymForChar[index]);
        String word = arraySymForChar[index];


        switch(character){
            case 'A':
                playSE(0);
                break;
            case 'B':
                playSE(1);
                break;
            case 'C':
                playSE(2);
                break;
            case 'D':
                playSE(3);
                break;
            case 'E':
                playSE(4);
                break;
            case 'F':
                playSE(5);
                break;
            case 'G':
                playSE(6);
                break;
            case 'H':
                playSE(7);
                break;
            case 'I':
                playSE(8);
                break;
            case 'J':
                playSE(9);
                break;
            case 'K':
                playSE(10);
                break;
            case 'L':
                playSE(11);
                break;
            case 'M':
                playSE(12);
                break;
            case 'N':
                playSE(13);
                break;
            case 'O':
                playSE(14);
                break;
            case 'P':
                playSE(15);
                break;
            case 'Q':
                playSE(16);
                break;
            case 'R':
                playSE(17);
                break;
            case 'S':
                playSE(18);
                break;
            case 'T':
                playSE(19);
                break;
            case 'U':
                playSE(20);
                break;
            case 'V':
                playSE(21);
                break;
            case 'W':
                playSE(22);
                break;
            case 'X':
                playSE(23);
                break;
            case 'Y':
                playSE(24);
                break;
            case 'Z':
                playSE(25);
                break;
            case '0':
                playSE(26);
                break;
            case '1':
                playSE(27);
                break;
            case '2':
                playSE(28);
                break;
            case '3':
                playSE(29);
                break;
            case '4':
                playSE(30);
                break;
            case '5':
                playSE(31);
                break;
            case '6':
                playSE(32);
                break;
            case '7':
                playSE(33);
                break;
            case '8':
                playSE(34);
                break;
            case '9':
                playSE(35);
                break;
            default:
                System.out.println("Doesn't work.");

        }

        //FRAME

        JFrame frame = new JFrame("Morse code translator");
        JLabel label = new JLabel();
        JPanel panel = new JPanel();
        JPanel panel2 = new JPanel();

        JButton button = new JButton("Meaning of " + character + " in morse code is ");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText(word);
            }
            });

        label.setVerticalAlignment(JLabel.BOTTOM);
        label.setForeground(Color.white);
        label.setFont(new Font(word, Font.BOLD, 35));
        Dimension size = label.getPreferredSize();
        label.setBounds(500, 100, size.width, size.height);

        button.setFont(new Font("Meaning of entered character: ", Font.ROMAN_BASELINE, 20));
        button.setBackground(Color.white);
        button.setForeground(Color.black);


        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel2.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        panel.setBackground(Color.black);
        panel2.setBackground(Color.pink);
        panel.setLayout(new GridLayout(0,1));
        panel.add(button);
        panel.add(label);

        frame.add(panel, BorderLayout.CENTER);
        frame.add(panel2, BorderLayout.SOUTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        scr.close();
    }

    public static int findIndex(char[] arrayCharacters, char character) {
        for (int i = 0; i < arrayCharacters.length; i++) {
            if (arrayCharacters[i] == character)
                return i;
        }
        return -1;
    }
}
