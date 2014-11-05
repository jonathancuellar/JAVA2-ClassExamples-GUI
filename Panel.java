// 10/27/14
// Program to demonstrate panels

import java.awt.*;
import javax.swing.*;

public class Panel extends JFrame
{
  private JLabel checkBoxLabel;
  private JLabel ageLabel;
  private JLabel levelLabel;
  private JCheckBox yesBox;
  private JCheckBox noBox;
  private JRadioButton age1;
  private JRadioButton age2;
  private JRadioButton age3;
  private ButtonGroup ageGroup;
  private JComboBox levelComboBox;
  private String[] levels = {"FRESHMAN", "SOPHOMORE",
    "JUNIOR", "SENIOR"};

  //Declare panels
  private JPanel checkBoxPanel;
  private JPanel agePanel;

  //constructor
  public Panel()
  {
    super("Testing Panels");
    setLayout(new GridLayout(3,2));

    checkBoxLabel = new JLabel("Select one");
    ageLabel = new JLabel("Select  an age group");
    levelLabel = new JLabel("Select a level");

    // Create a panel for checkbox
    checkBoxPanel = new JPanel(new GridLayout(1,2));

    // Create checkbox
    yesBox = new JCheckBox("Yes");
    noBox = new JCheckBox("No");

    // add checkboxes to the panel
    checkBoxPanel.add(yesBox);
    checkBoxPanel.add(noBox);

    // Create panel for ageGroup

    agePanel = new JPanel(new GridLayout(1,3));

    // Create Radio Buttons
    age1 = new JRadioButton("10-25");
    age2 = new JRadioButton("26,50");
    age3 = new JRadioButton("Over 50");

    // Create a logical group for the radio buttons
    ageGroup = new ButtonGroup();

    // Add the buttons to the button group
    ageGroup.add(age1);
    ageGroup.add(age2);
    ageGroup.add(age3);

    // Add the buttons to the age panel
    agePanel.add(age1);
    agePanel.add(age2);
    agePanel.add(age3);

    // Create comboBox for the level
    levelComboBox = new JComboBox<String>(levels);
    levelComboBox.setMaximumRowCount(2);

    // Add the labels and panels to the JFrame
    add(checkBoxLabel);
    add(checkBoxPanel);
    add(ageLabel);
    add(agePanel);
    add(levelComboBox);


  } // end constructor


} // end class
