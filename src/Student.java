public class Student
{
    /* Instance Variables */

    private String firstName
    private String lastName
    private int gradYear
    private double accumulatedTestScores
    private int testScoreCount

    /* Constructor; see note below */

    public Student(String firstName, String lastName, int gradYear)

    /* Methods */

    // Sets gradYear to newGradYear
    public void updateGradYear(int newGradYear)

    // Adds newTestScore to accumulatedTestScores
// and increments testScoreCount by 1
    public void addTestScore(double newTestScore)

    // Returns the number of test scores that have been added
    public int getTestScoreCount()

    // Returns the Student’s average test score as the
// quotient of accumulatedTestScores and testScoreCount
    public double averageTestScore()

    // this method prints all info of a Student object to the console
    public void printStudentInfo()
}

