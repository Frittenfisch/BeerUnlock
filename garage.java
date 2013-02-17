
/**
 * Write a description of class garage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class garage
{
    // instance variables - replace the example below with your own
    public Auto auto;

    /**
     * Constructor for objects of class garage
     */
    public garage()
    {
        auto = new Auto("grün");
       
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public String returnAutofarbe()
    {
        return auto.getFarbe();
     
    }
}
