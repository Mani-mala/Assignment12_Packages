package university.faculty;

public class Faculty {
	   private String name;
	    private String department;
	    private String subject;
	    public Faculty(String name, String department, String subject) {
	        this.name = name;
	        this.department = department;
	        this.subject = subject;
	    }
	    public void displayFaculty() {
	        System.out.println("Faculty Name: " + name);
	        System.out.println("Department: " + department);
	        System.out.println("Subject: " + subject);
	    }
}
