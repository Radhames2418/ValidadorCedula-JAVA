
package jce;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class JCE extends JFrame implements ActionListener {

    private final  JLabel label1;
    private final  JLabel label2;
    private final  JLabel label3;
    private final  JLabel label4;
    private final JLabel label5;
    private final  JButton boton1;
    private final  JTextField textfield1; 
    public static String a = "";
    
    public JCE() {
        setLayout(null);
        setTitle("JCE");
        setIconImage(new ImageIcon(getClass().getResource("Proyecto/LOGO_JCE.svg.png")).getImage());
        getContentPane().setBackground(new Color(244,244,244));
        
        ImageIcon imagen = new ImageIcon("Proyecto/LOGO_JCE.svg.png");
        label1 = new JLabel(imagen);
        label1.setBounds(25,15,300,150);
        add(label1);
        
        label2 = new JLabel("Verificacion de cedula");
        label2.setBounds(35,135,300,30);
        label2.setFont(new Font("Arial",1,13));
        label2.setForeground(new Color(244,244,244));
        add(label2);
        
        label3 = new JLabel("Ingrese su Cedula:");
        label3.setBounds(45,212,300,30);
        label3.setFont(new Font("Arial",1,12));
        label3.setForeground(new Color(0,0,0));
        add(label3);
        
        label4 = new JLabel("©2020 JCE.DO.RD");
        label4.setBounds(85,375,300,30);
        label4.setFont(new Font("Arial",3,12));
        label4.setForeground(new Color(244,244,244));
        add(label4);
   
        label5 = new JLabel("Procesando: ");
        label5.setBounds(125,320,100,30);
        label5.setFont(new Font("Arial",3,12));
        label5.setForeground(new Color(0,0,0));
        add(label5);



        
        textfield1 = new JTextField();
        textfield1.setBounds(45,240,255,25);
        add(textfield1);
        
        boton1 = new JButton("Verificar");
        boton1.setBounds(125,280,100,30);
        boton1.setBackground(new Color(244,244,244));
        add(boton1);
        boton1.addActionListener(this);
        
    
    }
    
    
    public void actionPerformed(ActionEvent e){
     if(e.getSource() == boton1){

           a = textfield1.getText().toString();
           int nc = a.length();
           int x = 0;
           int y = 1;
           int total = 0;
           String z = "";
           int numero = 0;
          for(int i = 1; i < 11; i++){
            
           z = a.substring(x,y);
           numero = Integer.parseInt(z);
            
            if(i % 2 == 0){
            
            numero = numero*2;
           
            if(numero >= 10){
                numero = numero-9;
               }else{}
                           
            }else{}

            total += numero;
            x = y;
            y = y + 1;
          
       }
         total = 10 - (total%10);
         label5.setText("Procesando: " + total);
     }
    }
  
    public static void main(String args[]) {
        
        JCE formulario1 = new JCE();
        formulario1.setBounds(0,0,350,450);
        formulario1.setVisible(true);
        formulario1.setResizable(true);
        formulario1.setLocationRelativeTo(null);

    }

}
