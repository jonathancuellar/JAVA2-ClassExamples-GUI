// 10/22/14
// Program to run radioButtonGUI

import javax.swing.JFrame;

public class RadioButtonGUITest
{
  public static void main (String[] args)
  {
    RadioButtonGUI rbg = new RadioButtonGUI();
    rbg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    rbg.setLocationRelativeTo(null);
    rbg.setSize(300,100);
    rbg.setVisible(true);

  } // end main
} // end class
