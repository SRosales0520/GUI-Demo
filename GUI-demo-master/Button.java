import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Button extends Actor
{
    //TODO (42): Declare an integer instance variable called fontSize
    private int fontSize;
    
    //TODO (43): Declare a String instance variable called firstImage
    
    private String firstImage;
    //TODO (44): Declare a String instance variable called secondImage
    private String secondImage;
    
    //TODO (45): Declare a GreenfootImage instance variable called text1
    private GreenfootImage text1;
    
    //TODO (46): Declare a GreenfootImage instance variable called text2
    private GreenfootImage text2;
    
    /**
     * A constructor for objects of class Button
     * 
     * @param first is the name of the first image file used for the button
     * @param second is the name of the second image file used for the button
     * @return An object of type Button
     */
    public Button(String first, String second)
    {
        //TODO (47): Initialize the firstImage variable to the value of first parameter
        firstImage = first;
        
        //TODO (48): Initialize the secondImage variable to the value of second parameter
        secondImage = second;
        
        //TODO (49): Set the image of the button to the firstImage variable
        setImage(firstImage);
        
    }
    
    /**
     * A constructor for objects of class Button
     * 
     * @param text is the text that will be displayed on the button
     * @param size is the text size for the text that will be displayed on the button
     * @param first is the name of the first image file used for the button
     * @param second is the name of the second image file used for the button
     * @return An object of type Button
     */
    public Button(String text, int size, String first, String second)
    {
        //TODO (50): Initialize the fontSize variable to the value of size parameter
        fontSize = size;
        
        //TODO (51): Initialize the firstImage variable to the value of first parameter
        
        firstImage = first;
        //TODO (52): Initialize the secondImage variable to the value of second parameter
        secondImage = second;
        
        //TODO (53): Initialize the text1 variable to a new GreenfootImage using the message stored in the text variable, the fontSize variable, the color white, and a new Color with 4 0s as parameters ( new Color(0, 0, 0, 0) )
        text1 = new GreenfootImage("text", fontSize, Color.WHITE,  new Color(0, 0, 0, 0));
        
        //TODO (54): Initialize the text1 variable to a new GreenfootImage using the message stored in the text variable, the fontSize variable, the color black, and a new Color with 4 0s as parameters ( new Color(0, 0, 0, 0) )
        text2 = new GreenfootImage("text", fontSize, Color.BLACK,  new Color(0, 0, 0, 0));
        
        //TODO (55): Set the image of the button to the firstImage variable
        setImage(firstImage);
        
        //TODO (56): Get the image for this class and draw an image on top of it using text1, an x location of (getImage().getWidth() - text1.getWidth())/2 and a y location of (getImage().getHeight() - text1.getHeight())/2
        getImage().drawImage(text1, (getImage().getWidth() - text1.getWidth())/2, (getImage().getHeight() - text1.getHeight())/2);
    }
    
    /**
     * Act - do whatever the Button wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        
        //TODO (64): Make a method call to the handleMouseClicks method
        handleMouseClicks();
    }    
    
    /**
     * handleMouseClicks handles what will happen when the button gets
     * clicked
     * 
     * @param There are no parameters
     * @return Nothing is returned
     */
    private void handleMouseClicks() 
    {
        //TODO (57): If the mouse is pressed by the user on this object...
        if( Greenfoot.mouseClicked(this))
        {
            //TODO (58): Set the image to the secondImage
            setImage(secondImage);
            //TODO (59): Get the image for this class and draw an image on top of it using text2, an x location of (getImage().getWidth() - text2.getWidth())/2 and a y location of (getImage().getHeight() - text2.getHeight())/2
            getImage().drawImage(text2, (getImage().getWidth() - text2.getWidth())/2, (getImage().getHeight() - text2.getHeight())/2);  
        }
        //TODO (60): Otherwise, if the mouse is clicked by the user on this object...
        else
        {
            //TODO (61): Set the image to the firstImage
            setImage(firstImage);
            //TODO (62): Get the image for this class and draw an image on top of it using text1, an x location of (getImage().getWidth() - text1.getWidth())/2 and a y location of (getImage().getHeight() - text1.getHeight())/2
            getImage().drawImage(text1, (getImage().getWidth() - text1.getWidth())/2, (getImage().getHeight() - text1.getHeight())/2);
            //TODO (63): Make a method call to the clickedAction method
            clickedAction();
        }
    }
    
    /**
     * clickedAction is what the button will accomplish when it is clicked
     * 
     * @param There are no parameters
     * @return Nothing is returned
     */
    private void clickedAction() 
    {
        //Empty due to this button not having any function in the GUI  
    }
}
