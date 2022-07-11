/*This class also inherits Course */
public class NonAcademicCourse extends Course{
    private String instructorName;
    private float duration;
    private String startingDate;
    private String completionDate;
    private String examDate;
    private String prerequisite;
    private boolean isRegistered;
    private boolean isRemoved;
    /* Constructor with four parameters in which three are inherited from Course class */
    public NonAcademicCourse (String courseID, String courseName, float duration, String prerequisite){
    /*Variables courseID,coursename and duration are inherited from Course superclass*/    
        super(courseID,courseName,duration);
    /* Setting values from parameter to own variables */    
        this.prerequisite=prerequisite;
    /*Assigning values to other variables from own class */    
        this.startingDate="";
        this.completionDate="";
        this.examDate="";
        isRegistered = false;
        isRemoved = false;
    }
    //Accessor methods
    public String getInstructorName(){
        return this.instructorName;
    }
    public float getDuration (){
        return this.duration;
    }
    public String getStartingDate (){
        return this.startingDate;
    }
    public String getCompletionDate (){
        return this.completionDate;
    }
    public String getExamDate (){
        return this.examDate;
    }
    public String getPrerequisite (){
        return this.prerequisite;
    }
    public boolean getIsRegistered (){
        return this.isRegistered;
    }
    public boolean getIsRemoved (){
        return this.isRemoved;
    }
    public void setIsRemoved (boolean isRemoved) {
        this.isRemoved = isRemoved; 
    }
    
    /*This method allows to set instructor name if isRegistered is set to false.Else, a suitable 
    message is displayed*/
    
    public void setInstructorName (String instructorName){
        if (isRegistered == false){
            this.instructorName = instructorName;
        }
        else{
            System.out.println ("It is not possible to change instructor name");
        }
    }
    
    /*This method takes five parameters 
    *if isRegistered is set to false it takes instructorName, startingDate, completionDate from its own class whereas it calls
    *courseLeader from superclass else a suitable message is displayed
    *isRegistered us set to true
    */
   
    public void register (String courseLeader,String instructorName,String startingDate,String completionDate,String examDate){
        if (isRegistered == false){
            this.instructorName = instructorName;
            super.setCourseLeader(courseLeader);
            this.startingDate = startingDate;
            this.completionDate = completionDate;
            this.examDate = examDate;
            isRegistered = true;
            
        }
        else {
            System.out.println ("The course is already registered");
        }
    }
    
    /* This is the method to remove the course. If the course is already removed
    *a suitable message is displayed. Else, course leader is called from superclass, instructor
    name,starting date,completion date and exam date are set to an empty string.
    *Similarly, isRegistered is set to false and isRemoved is set to true 
    */
   
    public void remove (){
        if (isRemoved){
            System.out.println ("The non-academic course has already been removed");
        }
        else {
            super.setCourseLeader("");
            this.instructorName = "";
            this.startingDate = "";
            this.completionDate= "";
            this.examDate="";
            this.isRegistered = false;
            this.isRemoved = true;
        }
    }
    
    /*This is the method to display the details of the non-academic course
     * It has same signature as the display method in Course class. It first calls the method display
     * in Course to display its three attributes: courseID, courseName and duration
     * addition its own attributes are also displayed if the course is registered
    */
    public void display(){ 
        super.display(); 
        if (isRegistered){
            System.out.println ("The instructor name is" + " " + instructorName);
            System.out.println ("The starting date is" + " " + startingDate);
            System.out.println ("The completion date is" + " " + completionDate);
            System.out.println ("The exam date is" + " " + examDate);
        }
        else {
            System.out.println ("The non-academic course is not registered");
        }
    }
}