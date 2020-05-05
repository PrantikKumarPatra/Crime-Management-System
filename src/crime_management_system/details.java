/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crime_management_system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author PRANTIK
 */
public class details implements ActionListener {
    
    JFrame f;
    JLabel l1,l2;
    JButton b1,b2,b3,b4;
    
    details()
    {
        f=new JFrame("Crime Details");
        f.setBackground(Color.white);
        f.setLayout(null);
        
        l1=new JLabel();
        l1.setBounds(70, 0, 1500, 700);
        l1.setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("crime_management_system/icons/details.jpg"));
       
        l1.setIcon(i1);
        f.add(l1);
        
        l2= new JLabel("Crime Details");
        l2.setBounds(430, 20, 200, 40);
        l2.setFont(new Font("serif",Font.BOLD,25));
        l2.setForeground(Color.black);
        l1.add(l2);
        
        b1=new JButton("Add");
        b1.setBounds(420, 80, 100, 40);
        b1.setFont(new Font("serif",Font.BOLD,15));
        b1.addActionListener(this);
        l1.add(b1);
        
        b2=new JButton("View");
        b2.setBounds(530, 80, 100, 40);
        b2.setFont(new Font("serif",Font.BOLD,15));
        b2.addActionListener(this);
        l1.add(b2);
        
        b3=new JButton("Remove");
        b3.setBounds(420, 140, 100, 40);
        b3.setFont(new Font("serif",Font.BOLD,15));
        b3.addActionListener(this);
        l1.add(b3);
        
        b4=new JButton("Add");
        b4.setBounds(530, 140, 100, 40);
        b4.setFont(new Font("serif",Font.BOLD,15));
        b4.addActionListener(this);
        l1.add(b4);
        
        f.setVisible(true);
        f.setSize(700, 500);
        f.setLocation(450, 200);
     
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b1)
        {
            f.setVisible(false);
          //  new Add_Crime();
        }
        if(ae.getSource()==b2)
        {
            f.setVisible(false);
          //  new View_Crime();
        }
        if(ae.getSource()==b3)
        {
            f.setVisible(false);
          //  new Remove_Crime();
        }
        if(ae.getSource()==b4)
        {
            f.setVisible(false);
          //  new Search_Crime();
        }
    }
    public static void main(String args[])
    {
        details d=new details();
    }
    
}
