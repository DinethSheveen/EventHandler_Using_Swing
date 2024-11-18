/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.eventlistener;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.*;

/**
 *
 * @author User
 */
public class EventListener2 extends JFrame{
    //Instance Components
    JTextField text1;
    JTextField text2;
    JTextField text3;
    JPasswordField textpwd;
    
    //Constructor
    public EventListener2(){
        setLayout(new FlowLayout());
        
        //Initializing the components
        text1 = new JTextField(10);
        text2 = new JTextField("Enter text here ");
        text3 = new JTextField("Uneditable text field");
        text3.setEditable(false);           //Cannot be edited
        textpwd = new JPasswordField("Hidden text");
        
        //Adding the components to the frame
        add(text1);
        add(text2);
        add(text3);
        add(textpwd);
        
        //Initializing the listener
        TextHandler listener = new TextHandler();
        text1.addActionListener(listener);
        text2.addActionListener(listener);
        text3.addActionListener(listener);
        textpwd.addActionListener(listener);
    }
    
    //Implementing the ActionListener
    public class TextHandler implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            String myString = " ";
            
            if(e.getSource() == text1){
                myString = "Textfield 1 : "+text1.getText();
            }
            else if(e.getSource() == text2){
                myString = "Textfield 2 : "+text2.getText();
            }
            else if(e.getSource() == text3){
                myString = "Textfield 3 : "+text3.getText();
            }
            else if(e.getSource() == textpwd){
                myString = "Textfield 1 : "+ new String (textpwd.getPassword());
            }
            
            JOptionPane.showMessageDialog(null,myString);
        }
        
    }
    
    public static void main(String[] args){
        EventListener2 frame = new EventListener2();
        frame.setSize(300,200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Textfield handler");
    }
}
