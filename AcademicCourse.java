/* AcademicCourse class inherits Course class */
public class AcademicCourse extends Course{
    
    private String lecturerName;
    private String level;
    private String credit;
    private String startingDate;
    private String completionDate;
    private int noOfAssessments;
    private boolean isRegistered;
    
    /*The constructor accepts six parameters, three of which are inherited from Course class */
    public AcademicCourse(String courseID, String courseName, float duration, String level, String credit, int noOfAssessments ){
    /*Variables courseID,coursename and duration are inherited from Course class */    
        super(courseID,courseName,duration);
    /*Setting values for two of AcademicCourse's own variables within the parameterized constructor */    
        this.level = level;
        this.credit = credit;
    /*Assigning values to other instance variables of the class */    
        this.startingDate = "";
        this.completionDate = "";
        this.isRegistered = false;
        this.lecturerName = "";
        this.noOfAssessments = noOfAssessments;
    }
    /* Accessor method for each attribute */    
    public String getLevel(){
        return this.level;
    }
    public String getCredit(){
        return this.credit;
    }
    public String getStartingDate (){
        return this.startingDate;
    }
    public String getCompletionDate (){
        return this.completionDate;
    }
    public boolean getIsRegistered(){
        return this.isRegistered;
    }
    public String getLecturerName () {
        return this.lecturerName;
    }
    /* This method allows to set and update lecturer name for Academic course */
    public void setLecturerName (String lecturerName){
        this.lecturerName = lecturerName;
    }
    public int getNoOfAssessments () {
        return this.noOfAssessments;
    }
    
    /*This method allows to set and update number of assignments for Academic course */
    public void setNoOfAssessments (int noOfAssessments){
        this.noOfAssessments = noOfAssessments;
    }
    
    /*This method accepts four parameters, if the course is already registered it displays lecturer name
    starting date and completion date else it assigns a new lecturer name, starting date and completion date*/
    
    public void register(String courseLeader,String lecturerName,String startingDate,String completionDate){
        if (isRegistered){
            System.out.println ("The course is already registered with the following details");
            System.out.println ("The lecturer name is" + " " + lecturerName);
            System.out.println ("The starting date of the course is" + " " + startingDate);
            System.out.println ("The completion date of the course is" + " " + completionDate);
        }
        else {        
            super.setCourseLeader(courseLeader);
            this.lecturerName = lecturerName;
            this.startingDate = startingDate;
            this.completionDate = completionDate;
            this.isRegistered = true;
        }
    }
    
    /*This is the method to display the details of the academic course
       *It has same signature as the display method in Course class
       *If the course is already registered it displays lecturerName,level,credit,startingDate,completionDate
       *and noOfAssessments
       *Else,a suitale message is displayed
    */
    
    public void display(){
        /*Calls display() from Course class */
        super.display();
        
        if (isRegistered){
            System.out.println("The lecturer name is" + " " + lecturerName);
            System.out.println("The level is" + " " + level);
            System.out.println("The credit is" + " " + credit);
            System.out.println("The starting date is" + " " + startingDate);
            System.out.println("The completion date is" + " " +completionDate);
            System.out.println("The number of assessments is" + " " + noOfAssessments);
        }
        else{
            System.out.println("The details cannot be found");
        }
    }
}