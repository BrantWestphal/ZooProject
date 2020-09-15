
/**
 * Write a description of class Teacher here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Teacher
{
    // instance variables - replace the example below with your own
    private int subjects;

    /**
     * Constructor for objects of class Teacher
     */
    public Teacher()
    {
        // initialise instance variables
        subjects = 0;
    }

    /**
     * Teacher says
     *
     * @param  r  which response to send
     * @return    the corresponding response
     */
    public void teacherSays(int r)
    {
        // put your code here
        if (r == 0)
            System.out.println("Sit down!");
        else if (r == 1)
            System.out.println("Very Good!");
        else
            System.out.println("There is a test tomorrow!");
    }
}
