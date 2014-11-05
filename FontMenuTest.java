// 10/29/14
// Program to test FontMenu.java

import javax.swing.JFrame;

public class FontMenuTest
{
  public static void main(String[] args)
  {
    FontMenu fontFrame = new FontMenu();
    fontFrame.setSize(300,400);
    fontFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    fontFrame.setLocationRelativeTo(null);
    fontFrame.setVisible(true);
    
  } // end main
} // end class
