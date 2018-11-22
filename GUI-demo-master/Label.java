import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A Label class that allows you to display a textual value on screen.
 * 
 * The Label is an actor, so you will need to create it, and then add it to the world
 * in Greenfoot.  If you keep a reference to the Label then you can change the text it
 * displays.  
 *
 * @author Amjad Altadmri 
 * @version 1.1
 */
public class Label extends Actor
{
    //TODO (1): Declare a String instance variable called value
    private String value;
    
    //TODO (2): Declare an integer instance variable called fontSize
    private int fontSize;
    
    //TODO (3): Declare a Color instance variable called lineColor that is initialized to BLACK
    private Color lineColor = Color.BLACK;
    
    //TODO (4): Declare a Color instance variable called fillColor that is initialized to WHITE
    private Color fillColor = Color.WHITE;
    
    //TODO (5): Declare a Color instance constant called TRANSPARENT that is initialized to a new Color with four 0s as parameters
    final Color TRANSPARENT = new Color(0, 0, 0, 0);
    
    /**
     * Constructor for objects of class Label
     * 
     * @param text is the text that will be displayed in the label
     * @param size is the text size of the text that will be displayed in the label
     * @return An object of type Label
     */
    public Label(String text, int size)
    {
        //TODO (6): Initialize value to the parameter text
        value = text;
        
        //TODO (7): Initialize fontSize to the parameter size
        fontSize = size;
        
        //TODO (10): Make a call to the updateImage method
        updateImage();
        
    }
    
    /**
     * TODO (8): Declare a method called updateImage that does not
     *          return anything and has no parameters
     *          
     * TODO (9): Inside the method, set the image of the Label to a new
     *           GreenfootImage that uses the value variable, fontSize 
     *           variable, the TRANSPARENT constant, and the lineColor
     *           variables as parameters
     */
    public void updateImage()
    {
        setImage ( new GreenfootImage( value, fontSize, fillColor, TRANSPARENT, lineColor));
    }

    /**
     * TODO (11): Declare a public method called setValue that does not
     *            return anything and has a String parameter called text
     *          
     * TODO (12): Inside the method, set the variable value to the text parameter
     * 
     * TODO (13): After the line of code changing the value of the value variable, make a call 
     *            to the updateImage method
     */
    public void setValue(String text)
    {
        value = text;
        updateImage();
    }
    
    
    /**
     * TODO (14): Declare a public method called setLineColor that does not
     *            return anything and has a Color parameter called color
     *          
     * TODO (15): Inside the method, set the variable lineColor to the color parameter
     * 
     * TODO (16): After the line of code changing the value of the lineColor variable, make a call 
     *            to the updateImage method
     */
    public void setLineColor(Color color)
    {
        lineColor = color;
        updateImage();
    }
    
    
    /**
     * TODO (17): Declare a public method called setFillColor that does not
     *            return anything and has a Color parameter called color
     *          
     * TODO (18): Inside the method, set the variable fillColor to the color parameter
     * 
     * TODO (19): After the line of code changing the value of the fillColor variable, make a call 
     *            to the updateImage method
     */
    public void setFillColor(Color color)
    {
        fillColor = color;
        updateImage();
    }
    
}