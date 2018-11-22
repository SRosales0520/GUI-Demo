import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TextBox here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TextBox extends Actor
{
    //TODO (23): Declare a String instance variable called value
    private String value;
    
    //TODO (24): Declare an integer instance variable called fontSize
    private int fontSize;
    
    //TODO (25): Declare a Color instance variable called foreground
    private Color foreground;
    
    //TODO (26): Declare a Color instance variable called background
    private Color background;
    
    //TODO (27): Declare a boolean instance variable called border initialized to false
    private boolean border = false;
    
    /**
     * Constructor for objects of class TextBox
     * 
     * @param message is the text that will be displayed in the text box
     * @param size is the text size that will be used for the text in the text box
     * @param isBordered states whether the text box is bordered or not
     * @param fg is the foreground color (or the color of the text) of the text box
     * @param bg is the background color of the text box
     * @return An object of type of TextBox
     */
    public TextBox(String message, int size, boolean isBordered, Color fg, Color bg)
    {
        //TODO (28): Initialize the value variable to the message parameter
        value = message;
        
        //TODO (29): Initialize the fontSize variable to the size parameter
        fontSize = size;
        
        //TODO (30): Initialize the foreground variable to the fg parameter
        foreground = fg;
        
        //TODO (31): Initialize the background variable to the bg parameter
        background = bg;
        
        //TODO (32): Set the value of the border variable to the isBordered parameter
        border = isBordered;
        
        //TODO (36): Make a method call to the display method
        display();
    }
    
    /**
     * TODO (33): Declare a private method called display that does not
     *            have a return type and has no parameters
     * 
     * TODO (34): Inside the method, set the image of this class to a
     *            new GreenfootImage with the value variable, fontSize 
     *            variable, foreground variable, and background variable
     *            as parameters
     *          
     * TODO (35): Underneath this line that sets the image, create code that
     *            will only occur if border is set to true:
     *          
     *          //If border is set to true...
     *          
     *              //Get the image and set the color of the image to BLACK
     *              
     *              //Get the image and draw a rectangle on the image starting at (0,0) and going to (getImage().getWidth()-1, getImage().getHeight()-1) 
     */
    private void display()
    {
        setImage( new GreenfootImage(value, fontSize, foreground, background));
        if( border == true)
        {
            getImage().setColor(Color.BLACK);
            getImage().drawRect(0, 0, getImage().getWidth()-1, getImage().getHeight()-1);
        }
    }
    
    /**
     * TODO (37): Declare a public method called setText that does not
     *            return a value and has a String parameter called message
     *          
     * TODO (38): Inside the method, change the value of the value variable to the message parameter
     * 
     * TODO (39): Underneath the line changing the value variable, make a method call to the display method
     */
    public void setText(String message)
    {
        value = message;
        display();
    }
    
}
