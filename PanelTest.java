// 10/27/14

import javax.swing.JFrame;

public class PanelTest
{
  public static void main(String[] args)
  {
    Panel panelGUI = new Panel();
    panelGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    panelGUI.setSize(400,300);
    panelGUI.setVisible(true);
    panelGUI.pack();
    panelGUI.setLocationRelativeTo(null);
  }
} // end class
