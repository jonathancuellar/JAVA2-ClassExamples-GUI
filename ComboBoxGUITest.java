// 10/22/14

// Program to test ComboBoxGUI

import javax.swing.JFrame;

public class ComboBoxGUITest
{
  public static void main (String[] args)
  {
    ComboBoxGUI comboBoxFrame = new ComboBoxGUI();

    comboBoxFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    comboBoxFrame.setLocationRelativeTo(null);
    comboBoxFrame.setSize(250,200);
    comboBoxFrame.setVisible(true);

  } // end main
} // end class
