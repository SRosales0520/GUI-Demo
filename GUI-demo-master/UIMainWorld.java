import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class UIMainWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class UIMainWorld extends World
{

    /**
     * Constructor for objects of class UIMainWorld.
     * 
     * @param There are no parameters
     * @return An object of type UIMainWorld
     */
    public UIMainWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        
        //TODO (20): Make a method call to the testActors method
        testActors();
    }
    
    /**
     * testActors will create an instance of each type of element in the GUI
     * and add each instance to the world
     * 
     * @param There are no parameters
     * @return Nothing is returned
     */
    private void testActors()
    {
        /**
         * TODO (21): Declare a Label variable called label that stores a new instance of the Label class.
         *          The text for the label can say whatever you want and the text size can be whatever
         *          you want
         */
        Label label = new Label("Greetings", 50);
        
        //TODO (22): Add the label object at an x location of 150 and a y location of 180
        addObject( label, 150, 180);
        
        /**
         * TODO (40): Declare a TextBox variable called textbox that stores a new instance of the TextBox class.
         *          The text for the text box can be anything you wish, the text size should be 24, the textbox should
         *          have a border (border is true...), use any color for the background and any color for the text
         */
        TextBox textbox = new TextBox("hello", 24, true, new Color(160,32,240), Color.GREEN);
        
        //TODO (41): Add the textbox object at an x location of 150 and a y location of 50
        addObject( textbox, 150, 50);
        
        /**
         * TODO (65): Declare a Button variable called button that stores a new instance of the Button class.
         *          The text for the button should be +1, the text size should be 18, the first image
         *          should use the button-blue.png file and the second image should use the button-green.png
         */
        Button button = new Button("+1", 18, "button-blue.png", "button-green.png");
        
        
        //TODO (66): Add the button object at an x location of 450 and a y location of 50
        addObject( button, 450, 50);
        
        /**
         * TODO (94): Declare a Menu variable called menu that stores a new instance of the Menu class.
         *          The text for the main menu should be File, the text for the dropdown menu should
         *          have New, Open, Save, Close, and Exit on separate lines (\n), the text size should
         *          be 18, the main menu can have any text color and any background color, the dropdown menu
         *          can have any text color and any background color, and uses a new instance of the FileCommands class
         */
        Menu menu = new Menu( "Menu", "New\nOpen\nSave\nClose\nExit", 18, Color.BLUE, Color.RED, Color.BLUE, Color.RED, new FileCommands()); 
        
        //TODO (95): Add the menu object at an x location of 450 and a y location of 180
        addObject(menu, 450, 180);
    }
}
