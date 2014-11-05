// 10/29/14
// Program to demonstrate JSlider

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class ColorSlider extends JFrame
{
  private JPanel colorPanel;
  private JSlider redSlider;
  private JSlider greenSlider;
  private JSlider blueSlider;


  private JLabel redLabel;
  private JLabel greenLabel;
  private JLabel blueLabel;

  // construct the ColorFrame
  public ColorSlider()
  {
    super("Demo color slider");

    // create panel for color
    colorPanel = new JPanel();

    // add the color panel to JFrame
    add(colorPanel, BorderLayout.CENTER);

    // create control panel for colors
    JPanel controlPanel = new JPanel();

    // create labels for colors
    redLabel = new JLabel("Red");
    greenLabel = new JLabel("Green");
    blueLabel = new JLabel("Blue");

    //Create sliders for three colors
    redSlider = new JSlider(0,255,255);
    greenSlider = new JSlider(0,255,150);
    blueSlider = new JSlider(0,255,175);

    // create a panel for color sliders
    //JPanel colorPanel = new JPanel();

    // set layout for the color panel
    controlPanel.setLayout(new GridLayout(3,2));

    // add labels and sliders to the color panel
    controlPanel.add(redLabel);
    controlPanel.add(redSlider);
    controlPanel.add(greenLabel);
    controlPanel.add(greenSlider);
    controlPanel.add(blueLabel);
    controlPanel.add(blueSlider);

    // add the control panel to JFrame
    add(controlPanel,BorderLayout.SOUTH);

    // set color
    setSampleColor();

    // create even handler object
    ColorListener listener = new ColorListener();

    // register sliders
    redSlider.addChangeListener(listener);
    greenSlider.addChangeListener(listener);
    blueSlider.addChangeListener(listener);

  } // end constructor

  class ColorListener implements ChangeListener
  {
    public void stateChanged(ChangeEvent event)
    {
      setSampleColor();
    } // end stateChanged
  } // end ColorListener

  public void setSampleColor()
  {
    // read values from the slider
    int red = redSlider.getValue();
    int green = greenSlider.getValue();
    int blue = blueSlider.getValue();

    // set panel background color
    colorPanel.setBackground(new Color(red, green,blue));
    colorPanel.repaint();
  } // end setSampleColor

} // end class
