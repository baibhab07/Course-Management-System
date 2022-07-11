public class Course {
    
    private String courseID;
    private String courseName;
    private float duration;
    private String courseLeader;
    
    /*Creation of parameterized constructor Course with three parameters courseID, courseName and duration*/
    public Course (String courseID, String courseName, float duration){
    /*this keyword used for all variable because we have used same variable name as parameter and instance 
    variable*/   
        this.courseID = courseID;
        this.courseName = courseName;
        this.duration = duration;
        this. courseLeader = "";
    }
    /*creation of setter and getter methods for all variables*/
    public String getCourseID () {
        return this.courseID;
    }
    public String getCourseName () {
        return this.courseName;
    }
    public float getDuration (){
        return this.duration;
    }
     public String getCourseLeader () {
        return this.courseLeader;
    }
    public void setCourseLeader(String courseLeader){ 
        this.courseLeader = courseLeader;
    }
    
   
    /* display method for the Course class variables - this method will be later inherited by
       AcademicCourse and NonAcademicCourse classes*/
    public void display(){ 
        System.out.println("The Course ID is" + " " + courseID);
        System.out.println("The Course Name is" + " " + courseName);
        System.out.println("The duration of the course is" + " " + duration);
        
        if (courseLeader != ""){
            System.out.println ("The course leader is" + " " + courseLeader);
        }
        else {
            System.out.println ("The course leader is empty");
        }
    }
}