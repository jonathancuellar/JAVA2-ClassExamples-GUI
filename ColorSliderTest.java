// 10/29/14
// Program to test ColorSlider.java

import javax.swing.JFrame;

public class ColorSliderTest
{
  public static void main(String[] args)
  {
    ColorSlider colorSlider = new ColorSlider();
    colorSlider.setSize(300,400);
    colorSlider.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    colorSlider.setLocationRelativeTo(null);
    colorSlider.setVisible(true);

  } // end main
} // end class
