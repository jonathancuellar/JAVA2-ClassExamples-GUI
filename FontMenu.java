// 10/29/14
// Program to demonstrate JMenu

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FontMenu extends JFrame
{
  private JLabel nameLabel;
  private String faceName;
  private int fontStyle;
  private int fontSize;

  // delcare menu bar
  private JMenuBar menuBar;

  // declare main menu
  private JMenu fileMenu;
  private JMenu fontMenu;

  // declare the item for file menu
  private JMenuItem exitItem;

  // declare sub menus for Font main menu
  private JMenu faceSubMenu;
  private JMenu sizeSubMenu;
  private JMenu styleSubMenu;

  // declare items for font sub menus
  // face sub menu items
  private JMenuItem serifItem;
  private JMenuItem arialItem;


  // size sub menu items
  private JMenuItem smaller;
  private JMenuItem larger;

  // style sub menu items
  private JMenuItem plainItem;
  private JMenuItem boldItem;
  private JMenuItem italicItem;
  private JMenuItem boldItalicItem;

  // construct the JFrame
  public FontMenu()
  {
    super("");

    // create file menu and its items
    fileMenu = createFileMenu();

    // create font menu and its items
    fontMenu = createFontMenu();

    // Create a menu bar
    menuBar = new JMenuBar();
    setJMenuBar(menuBar);

    // add the menus created to the menu bar
    menuBar.add(fileMenu);
    menuBar.add(fontMenu);

    // Create a label to dsiplay text
    nameLabel = new JLabel("Welcome to JAVA");
    add(nameLabel, BorderLayout.CENTER);

    faceName = "Serif";
    fontSize = 24;
    fontStyle = Font.PLAIN;

    setLabelFont();

    // create Exit item listener as an anonymous class
    exitItem.addActionListener(
      new ActionListener()
      {
        public void actionPerformed(ActionEvent event)
        {
          System.exit(1);
        }
      }

    );

    // create event handler for font size
    SizeItemListener sizeListener = new SizeItemListener();

    // Register the size items
    smaller.addActionListener(sizeListener);
    larger.addActionListener(sizeListener);


  } // end constructor


  public JMenu createFileMenu()
  {
    // Create a menu for file
    JMenu menu = new JMenu("File");

    // Create item under File Menu
    exitItem = new JMenuItem("Exit");

    // Add exitItem to file menu
    menu.add(exitItem);

    // return file menu
    return menu;

  } // end createFileMenu

  public JMenu createFontMenu()
  {
    // Create menu for font
    JMenu menu = new JMenu("Font");

    // Create sub menus for font
    faceSubMenu = new JMenu("Face");
    sizeSubMenu = new JMenu("Size");
    styleSubMenu = new JMenu("Style");

    // Create items for each of the sub menus
    // face sub menu item
    serifItem = new JMenuItem("Serif");
    arialItem = new JMenuItem("Arial");

    // size sub menu items
    smaller = new JMenuItem("Smaller");
    larger = new JMenuItem("Larger");

    // style sub menu items
    boldItem = new JMenuItem("Bold");
    boldItalicItem = new JMenuItem("Bold Italic");

    // Add face items to face Sub menu
    faceSubMenu.add(serifItem);
    faceSubMenu.add(arialItem);

    // Add size items to size sub menu
    sizeSubMenu.add(smaller);
    sizeSubMenu.add(larger);

    // Add style items to style sub menu
    styleSubMenu.add(boldItem);
    styleSubMenu.add(boldItalicItem);

    // add sub menus to the Font main manue
    menu.add(faceSubMenu);
    menu.add(sizeSubMenu);
    menu.add(styleSubMenu);

    // return font main menu
    return menu;

  } // end createFontMenu

  public void setLabelFont()
  {
    Font F = new Font(faceName,fontStyle, fontSize);
    nameLabel.setFont(F);

  }

  // create listener for font size
  class SizeItemListener implements ActionListener
  {
    public void actionPerformed(ActionEvent event)
    {
      if(smaller.isArmed())
        --fontSize;
      if(larger.isArmed())
        ++fontSize;

        setLabelFont();
    }
  }

} // end class
