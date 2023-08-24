public class Student {
        private String name;
        private int studentId;
        private int numberOfCredits;
        private double gpa;

        public void setName(String name) {
                this.name = name;
        }
        public void setGpa(double gpa) {
                this.gpa = gpa;
        }
        private void setNumberOfCredits(int numberOfCredits) {
                this.numberOfCredits = numberOfCredits;
        }
        public void setStudentId(int studentId) {
                this.studentId = studentId;
        }
        public String getName(){
                return name;
        }
        public double getGpa(){
                return gpa;
        }
        public int getStudentId(){
                return studentId;
        }
        public int getNumberOfCredits(){
                return numberOfCredits;
        }
        Student student = new Student("Samantha Stephens", 12345, 1, 4.0);
        // Drop your getters and setters below for the Student class.
        // To instantiate the Student class, add your code to the main in the file, SchoolPractice.

}
public class Course {
        private String topic;
        private Teacher instructor;
        private ArrayList<Student>enrolledStudents;

        public class Teacher {
                private String firstName;
                private String lastName;
                private String subject;
                private int yearsTeaching;

                public void setFirstName(String firstName){
                        return this.firstName = firstName;
                }
                public void setLastName(String lastName){
                        return this.lastName = lastName;
                }
                public void setSubject(String subject){
                        return this.subject = subject;
                }
                public void setYearsTeaching(int yearsTeaching){
                        return this.yearsTeaching = yearsTeaching;
                }
                public void getFirstName(){
                        return firstName;
                }
                public void getLastName(){
                        return lastName;
                }
                public void getSubject(){
                        return subject;
                }
                public void getYearsTeaching(){
                        return yearsTeaching;
                }
                Teacher teacher = new Teacher("Nancy", "Rogers", "Math", 7);

        }
}
