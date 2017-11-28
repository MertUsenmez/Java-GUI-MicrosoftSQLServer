
package database.project.projectt;


public class StudentModel {
    
    private int PERSONPersonID;
    private int StudentNumber;
    private String StudendBranch;
    private String BirthFather;
    private String BirthMother;
    private int PARENT_OF_STUDENTPERSONPersonID;
    private int CLUBClubID;
    private int SCHOOLSchoolID;

    public StudentModel(int PERSONPersonID, int StudentNumber, String StudendBranch, String BirthFather, String BirthMother, int PARENT_OF_STUDENTPERSONPersonID, int CLUBClubID, int SCHOOLSchoolID) {
        this.PERSONPersonID = PERSONPersonID;
        this.StudentNumber = StudentNumber;
        this.StudendBranch = StudendBranch;
        this.BirthFather = BirthFather;
        this.BirthMother = BirthMother;
        this.PARENT_OF_STUDENTPERSONPersonID = PARENT_OF_STUDENTPERSONPersonID;
        this.CLUBClubID = CLUBClubID;
        this.SCHOOLSchoolID = SCHOOLSchoolID;
    }

    public int getPersonID() {
        return PERSONPersonID;
    }

    public void setPersonID(int PERSONPersonID) {
        this.PERSONPersonID = PERSONPersonID;
    }

    public int getStudentNumber() {
        return StudentNumber;
    }

    public void setStudentNumber(int StudentNumber) {
        this.StudentNumber = StudentNumber;
    }

    public String getStudendBranch() {
        return StudendBranch;
    }

    public void setStudendBranch(String StudendBranch) {
        this.StudendBranch = StudendBranch;
    }

    public String getBirthFather() {
        return BirthFather;
    }

    public void setBirthFather(String BirthFather) {
        this.BirthFather = BirthFather;
    }

    public String getBirthMother() {
        return BirthMother;
    }

    public void setBirthMother(String BirthMother) {
        this.BirthMother = BirthMother;
    }

    public int getParentID() {
        return PARENT_OF_STUDENTPERSONPersonID;
    }

    public void setParentID(int PARENT_OF_STUDENTPERSONPersonID) {
        this.PARENT_OF_STUDENTPERSONPersonID = PARENT_OF_STUDENTPERSONPersonID;
    }

    public int getClubID() {
        return CLUBClubID;
    }

    public void setClubID(int CLUBClubID) {
        this.CLUBClubID = CLUBClubID;
    }

    public int getSchoolID() {
        return SCHOOLSchoolID;
    }

    public void setSchoolID(int SCHOOLSchoolID) {
        this.SCHOOLSchoolID = SCHOOLSchoolID;
    }
    
    
}
