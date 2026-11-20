/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bodymassindex;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class BodyMassIndex {

    public static void main(String[] args) {
        // TODO code application logic here
  JFrame fr=new JFrame();
fr.setSize(340,300);
fr.setVisible(true);
fr.setLayout(null);
fr.getContentPane().setBackground(Color.blue);
JLabel Weight=new JLabel("WEIGHT");
fr.add(Weight);
Weight.setBounds(130,10,100,30);
final JTextField weight=new JTextField();
weight.setBounds(100,40,100,30);
fr.add(weight);
JLabel desc=new JLabel("CONDITION   DESCRIPTION");
fr.add(desc);
desc.setBounds(80,80,150,30);
final JTextField descrs=new JTextField();
descrs.setBounds(30,120,240,30);
fr.add(descrs);
JButton details= new JButton("DESCRIBE PATIENT'S CONDITION");
fr.add(details);
details.setBounds(45,160,220,30);
JButton delete = new JButton("CLEAR ALL");
fr.add(delete);
delete.setBounds(85,200,150,30);
descrs.setFont(new Font("Arial",Font.BOLD,20));
weight.setFont(new Font("Arial",Font.BOLD,15));
details.addActionListener(new ActionListener(){
       public void actionPerformed(ActionEvent e){

          double wgt=Double.parseDouble(weight.getText());

           

           if(wgt>0 && wgt<=10){

               

               descrs.setText("UNDERWEIGHT");

           

           }

           else if(wgt>10 && wgt<=40){

              

               descrs.setText("NORMAL WEIGHT");

           

           }

         else if(wgt>40 && wgt<=70){

             

               descrs.setText("YOU'VE NORMAL WEIGHT");

           

           }

             else{

               descrs.setText("YOURE OBESSED");

           

           }

       

       

       

       }
} );
delete.addActionListener(new ActionListener(){
       public void actionPerformed(ActionEvent e){

           weight.setText(String.valueOf(""));

           descrs.setText(String.valueOf(""));



       }});

          

}
}

