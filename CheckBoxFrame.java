// 10/20/14
// Program to demonstrate CheckBox

import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;


public class CheckBoxFrame extends JFrame
{
  private JTextField textField;
  private JCheckBox boldCheckBox;
  private JCheckBox italicCheckBox;

  // constructor
  public CheckBoxFrame()
  {
    super("CheckBox");

    setLayout(new FlowLayout()); // set layout

    // Create the components
    textField = new JTextField("Watch the font");
    textField.setFont(new Font("Georgia", Font.PLAIN, 14));
    add(textField); // add textField to JFrame

    boldCheckBox = new JCheckBox("Bold");
    italicCheckBox = new JCheckBox("Italic");
    add(boldCheckBox);
    add(italicCheckBox);


    // Create object of event handler
    CheckBoxHandler handler = new CheckBoxHandler();

    // register the check box
    boldCheckBox.addItemListener(handler);
    italicCheckBox.addItemListenr(handler);

  }// end constructor

  // Create event handler
  private class CheckBoxHandler implements ItemListener
  {
    // method to respond to user action
    public void itemStateChanged(ItemEvent event)
    {
      Font font = null; // create a font object

      // Determine whcih check boxes are selected and
      // create font accordingly
      if( boldCheckBox.isSelected() && italicCheckBox.isSelected())
        font = new Font("TimesNewRoman", Font.Bold+Font.ITALIC, 12);
      else
        if(boldCheckBox.isSelected() )
          font = new Font("Chalkduster", Font.Bold , 14);
        else
          if(italicCheckBox.isSelected() )
            font = new Font("Herculanum", Font.ITALIC, 14);
          else
            font = new Font("Arial", Font.PLAIN, 14);

      textField.setFont(font); // set font for text field

    } // end itemStateChange
  } // end class CheckBoxHandler
} // end class
