// 10/20/14
// Program to demonstrate even handling
// GUI applications are event driven

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class GUI2 extends JFrame
{
  //Declare variables
  private JLabel nameLabel;
  private JTextField nameField;
  private JLabel ageLabel;
  private JTextField ageField;
  private JLabel buttonLabel;
  private JButton submitButton;

  //Create user interface
  public GUI2()
  {
    super("GUI 2"); // Title

    //setLayout(new FlowLayout()); // Set  a flowable layout
    setLayout(new GridLayout(3,2));

    // Create components
    nameLabel = new JLabel("Enter your name");
    nameField = new JTextField(10); // size of 10.... defined by size of and resolution
    ageLabel = new JLabel("Enter your age");
    ageField = new JTextField(4);
    buttonLabel = new JLabel("Click when done");
    submitButton = new JButton("Submit");

    // Add the components to JFrame
    add(nameLabel);
    add(nameField);
    add(ageLabel);
    add(ageField);
    add(buttonLabel);
    add(submitButton);

    // Create an object of Event Handler
    ButtonHandler handler = new ButtonHandler();

    // Register the event handler... the handler needs to be registered with the
    // component
    submitButton.addActionListener(handler);

  } // end GUI2 constructor

  // Create an even handler
  private class ButtonHandler implements ActionListener
  {
    public void actionPerformed(ActionEvent event)
    {
      String name;
      int age;

      // Get the name and age from the GUI
      name = nameField.getText();
      age = Integer.parseInt(ageField.getText());

      // Print the name and age
      System.out.println(name);
      System.out.println(age);

      // Clear the text from the fields after printing
      nameField.setText("");
      ageField.setText("");

      // Place the cursor in the name Field
      nameField.requestFocus();

    } // end actionPerformed
  }
} // end class
