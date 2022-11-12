/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.texaspoker;
import java.awt.Color;
//import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author User
 */
public class TexasPoker {

    public static void main(String[] args) {

        System.out.println("Texas Poker");
        StarterGamePage start = new StarterGamePage();
        while(start.status){
            start.setVisible(true);
        }
        start.setVisible(false);
        
        System.out.println("2nd push");   
    }
}