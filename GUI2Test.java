// 10/20/14
// Program to run GUI2

import javax.swing.JFrame;

public class GUI2Test
{
  public static void main(String[] args)
  {
    // create object of JFrame
    GUI2 frame = new GUI2();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(500, 300);
    frame.setVisible(true);
    frame.pack();
    frame.setLocationRelativeTo(null);
  } // end main
} // end class
