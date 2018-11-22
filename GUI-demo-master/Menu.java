import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends Actor
{
    //TODO (67): Declare a TextBox instance variable called titleBar
    private TextBox titleBar;
    
    //TODO (68): Declare a TextBox instance variable called menuItems
    private TextBox menuItems;
    
    //TODO (69): Declare a MenuCommands instance variable called menuCommands
    private MenuCommands menuCommands;
    
    //TODO (70): Declare a Color instance variable called mainFG
    private Color mainFG;
    
    //TODO (71): Declare a Color instance variable called mainBG
    private Color mainBG;
    
    //TODO (72): Declare a Color instance variable called secondFG
    private Color secondFG;
    
    //TODO (73): Declare a Color instance variable called secondBG
    private Color secondBG;
    
    //TODO (74): Declare an integer instance variable called titleHeight
    private int titleHeight;
    
    //TODO (75): Declare an integer instance variable called menuHeight
    private int menuHeight;
    //TODO (76): Declare an integer instance variable called fontSize initialized to 24
    private int fontSize = 24;
    
    //TODO (77): Declare a boolean instance variable called visible initialized to false
    private boolean visible = false;
    
    /**
     * A default constructor for objects of class Menu
     * 
     * @param There are no parameters
     * @return An object of type Menu
     */
    public Menu() 
    {
        this("not initialized", "none", 24, Color.BLACK, Color.LIGHT_GRAY, Color.BLACK, Color.WHITE, null);
    }
    
    /**
     * A constructor for objects of class Menu
     * 
     * @param title is the text displayed in the main section of the menu
     * @param items is the text that is displayed in the submenu section of the menu
     * @param size is the text size that will be used to display the text from the menu
     * @param mfg is the main foreground color (or the text color for the main section) of the menu
     * @param mbg is the main background color (or the background color for the main section) of the menu
     * @param sfg is the submenu foreground color (or the text color for the submenu section) of the menu
     * @param sbg is the submenu background color (or the background color for the submenu section) of the menu
     * @param commands stores an object that deals with the functionality of the menu
     * @return An object of type Menu
     */
    public Menu(String title, String items, int size, Color mfg, Color mbg, Color sfg, Color sbg, MenuCommands commands)
    {
        //TODO (78): Initialize the mainFG variable to the mfg parameter
        mainFG = mfg;
        
        //TODO (79): Initialize the mainBG variable to the mbg parameter
        mainBG = mbg;
        
        //TODO (80): Initialize the secondFG variable to the sfg parameter
        secondFG = sfg;
        
        //TODO (81): Initialize the secondBG variable to the sbg parameter
        secondBG = sbg;
        
        //TODO (82): Initialize the fontSize variable to the size parameter
        fontSize = size;
        
        //TODO (83): Initialize the menuCommands variable to the commands parameter
        menuCommands = commands;
        
        //TODO (84): Initialize the titleBar variable to a new TextBox object using the title parameter, fontSize variable, a value of true, the mainFG variable, and the mainBG variable as parameters 
        titleBar = new TextBox(title, fontSize, true, mainFG, mainBG);
        
        //TODO (85): Initialize the menuItems variable to a new TextBox object using the items parameter, fontSize variable, a value of true, the secondFG variable, and the secondBG variable as parameters
        menuItems = new TextBox( items, fontSize, true, secondFG, secondBG);
    }
    
    /**
     * addedToWorld is a method that is run when a new object of this class
     * is added to the world
     * 
     * @param w is the reference to the world it is added to
     * @return Nothing is returned
     */
    protected void addedToWorld( World w ) 
    {
        //TODO (86): Use the w parameter to add the titleBar object at an x location of the current X location of the object and a y location of the current Y location of the object
        w.addObject(titleBar, getX(), getY());
        
        //TODO (87): Initialize the titleHeight variable to be the height of the image of the titleBar variable
        titleHeight = titleBar.getImage().getHeight();
        
        //TODO (88): Initialize the menuHeight variable to be the height of the image of the menuItems variable
        menuHeight = menuItems.getImage().getHeight();
    }
    
    /**
     * Act - do whatever the Menu wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        
        //TODO (93): Make a method call to the handleMouse method
        handleMouse();
    }    
    
    /**
     * TODO (89): Declare a method called handleMouse that does not
     *            have a return type and has no parameters
     *          
     * TODO (90): Inside the method, declare a local MouseInfo variable called mouse
     * 
     * TODO (91): Next, declare a local integer variable called menuIndex
     * 
     * TODO (92): After the declaration of the local variables, create code that
     *            will only occur when the mouse has been clicked on the titleBar:
     *          
     *          //If the mouse has been clicked on the titleBar...
     *          
     *              //If the visible variable is set to false...
     *                  
     *                  //Add the menuItems object at the current X location and a y location of the current Y location plus (titleHeight + menuHeight)/2
     *                  
     *              //Otherwise...
     *              
     *                  //Remove the menuItems object
     *                  
     *              //Underneath the if-else, set visible to NOT visible (!visible)
     *              
     *              
     *          //If the mouse has been clicked on the menuItems...
     *          
     *              //Set the mouse variable to be the current MouseInfo (Check the Greenfoot documentation for an appropriate method...)
     *              
     *              //Set the menuIndex variable to ( (mouse.getY() - menuItems.getY() + menuHeight / 2) - 1 ) / fontSize
     *              
     *              //Make a method call to the execute method of the menuCommands variable. The execute method will require the menuIndex variable and the getWorld() method as parameters
     *              
     *              //Set the visible variable to NOT visible
     *              
     *              //Remove the menuItems object
     */
    public void handleMouse()
    {
        MouseInfo mouse;
        int menuIndex;
        
        if (Greenfoot.mouseClicked(titleBar))
        {
            if (visible == false)
            {
                getWorld().addObject(menuItems, getX(), getY() +(titleHeight + menuHeight)/2 );
            }
            else
            {
                getWorld().removeObject(menuItems);
            }
            visible = !visible;
        }
        if (Greenfoot.mouseClicked(menuItems))
        {
            mouse = Greenfoot.getMouseInfo();
            menuIndex = ((mouse.getY() - menuItems.getY() + menuHeight /2) -1) / fontSize;
            menuCommands.execute(menuIndex, getWorld());
            visible = false;
            getWorld().removeObject(menuItems);
        }
    }
}
