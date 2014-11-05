// 10/27/14
// Program to demonstrate reading text Files in an event handler

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;

public class StudentGUI extends JFrame
{
  private JLabel nameLabel;
  private JTextField nameField;
  private JLabel ageLabel;
  private JTextField ageField;
  private JLabel submitLabel;
  private JButton submitButton;
  private GridLayout layout;

  // Constructor
  public StudentGUI()
  {
    super ("Testing GUI");
    layout = new GridLayout(3,2);
    setLayout(layout);

    // Create lanels, text fields, and submit button
    nameLabel = new JLabel("Enter name");
    ageLabel = new JLabel("Enter age");
    submitButton = new JButton("Click when done");

    nameField = new JTextField(20);
    ageField = new JTextField(4);

    submitButton = new JButton("Submit");

    // add components to JFrame
    add(nameLabel);
    add(nameField);
    add(ageLabel);
    add(ageField);
    add(submitLabel);
    add(submitButton);


  } // end constructor
/*
  // Create even handler inner class
  private class ButtonHandler implements ActionListener
  {
    public void actionPerformed(ActionEvent ae)
    {
      // Declare variables
      String nameKeyed;
      int age;
      String level;

      //Receive the values from GUI
      nameKeyed = nameField.getText();
      age = Integer.parseInt(ageField.getText());

      // get the level
      level = readFile(nameKeyed);

      // Create the student object
      Student s1 = new Student(nameKeyed, age, level);

      System.out.println(s1.toString());

      // Clear the fields
      nameField.setText("");
      ageField.setText("");

      // requestFocus on the name field
      nameField.requestFocus();
    } // end actionPerformed

    public static String readFile(String nameKeyed)
    {
      // Declare variables
      // using try... catch block, open a text file
      // called students.txt
      // Read the values
      // Compare the nameKeyed with that in the files
      // If name matches, returns the level


    } // end readFile
  }*/
} // end class

/*
Student.txt
Smith
Freshman
Jones
Sophomore
Willis
Junior
Morton
Senior
*/
