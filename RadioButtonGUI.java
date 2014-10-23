// 10/22/14
// Program to demonstrate Radio Buttons

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RadioButtonGUI extends JFrame
{
  // declare variables
  private JRadioButton age1;
  private JRadioButton age2;
  private JRadioButton age3;

  private JTextField textField;// to display selected button option
  private ButtonGroup ageGroup; // logical group to select only one

  public RadioButtonGUI()
  {
    super("Demonstrating Radio Buttons");

    setLayout(new FlowLayout());

    // create the components
    age1 = new JRadioButton("Age 20-30");
    age2 = new JRadioButton("Age 31-50");
    age3 = new JRadioButton("Over 50");

    // Create text field
    textField = new JTextField();
    textField.setEditable(false); // does not allow user to enter any text

    // Create button group
    ageGroup = new ButtonGroup();

    // Add radio buttons to button group
    ageGroup.add(age1);
    ageGroup.add(age2);
    ageGroup.add(age3);

    // Add components to JFrame
    add(age1); // add radio button age1
    add(age2); // add radio button age2
    add(age3); // add radio button age3

    add(textField);

    // Create handler object
    RadioButtonHandler handler = new RadioButtonHandler();

    // Register the buttons
    age1.addItemListener(handler);
    age2.addItemListener(handler);
    age3.addItemListener(handler);


  } // end constructor

  // Create event handler
  private class RadioButtonHandler implements ItemListener
  {
    public void itemStateChanged(ItemEvent event)
    {
      String message = "";
    //  Font font = new Font("Arial", Font.BOLD, 16);

      // Determine which radio button is selected
      if (age1.isSelected())
        message = "Age range 20-30 years selected";
      if (age2.isSelected())
        message = "Age range 31-50 years selected";
      if (age3.isSelected())
        message = "Age range over 50 years selected";

      textField.setFont(font);
      textField.setText(message);

    } // end itemStateChanged
  } // end RadioButtonHandler inner class
} // end class
