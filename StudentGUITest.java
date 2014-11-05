// 10/27/14
// Program to test StudentGUI.java

import javax.swing.JFrame;

public class StudentGUITest
{
  public static void main(String[] args)
  {
    StudentGUI sgt = new StudentGUI();
    sgt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    sgt.setSize(250,200);
    sgt.setVisible(true);
    sgt.pack();
    sgt.setLocationRelativeTo(null);
  } // end main
} // end class
