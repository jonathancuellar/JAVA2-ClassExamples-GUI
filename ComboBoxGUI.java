// 10/22/14
// Program to demonstrate ComboBox

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ComboBoxGUI extends JFrame
{
  private JComboBox selectionBox;
  private String[] options = {"Option 1", "Option 2", "Option 3", "Option 4", "Option 5" };

  // constructor to build the GUI
  public ComboBoxGUI()
  {
    super("Combo Box Sample");

    setLayout (new FlowLayout());


    // Create combobox
    selectionBox = new JComboBox<String>(options); // passes array
    selectionBox.setMaximumRowCount(3);

    // Add the combo box to JFrame
    add(selectionBox);

    // Create an object of event handler
    ComboBoxHandler handler = new ComboBoxHandler();

    // Register the event for Combo Box
    selectionBox.addItemListener(handler);


  } // end of constructor


  // add inner class for event handler
  private class ComboBoxHandler implements ItemListener
  {
    public void itemStateChanged(ItemEvent event)
    {
      //int index;
      if (event.getStateChange() == ItemEvent.SELECTED)
        //index = selectionBox.getSelectedIndex();
        //System.out.println(options[index]);
        System.out.println(options[selectionBox.getSelectedIndex()]);
    }
  } // end inner class - ComboBoxHandler




} // end class
