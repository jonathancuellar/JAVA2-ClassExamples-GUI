// 10/15/14
// program to develop GUI frame

import javax.swing.*;
import java.awt.*;

public class GUIFrame extends JFrame // standard extension for all GUI classes
{
  // declare variables
  private JLabel labelName;
  private JTextField fieldName;
  private JButton buttonSubmit;

  // GUI is built in the constructor
  public GUIFrame()
  {
    // Call super class JFrame
    super ("GUIFrame");

    // Set layout
    setLayout (new FlowLayout() );

    // Create a label component
    labelName = new JLabel("Enter Name");

    // Add tool tip to the labelName
    labelName.setToolTipText("Please enter your name here");

    // Add the label component to JFrame
    add(labelName);

    // Create a text field component
    fieldName = new JTextField(10);

    // add the text field to JFrame
    add(fieldName);

    // Create button component
    buttonSubmit = new JButton("Submit");

    // add the button the JFrame
    add(buttonSubmit);
  }


} // end class
