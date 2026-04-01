package main.java.core.level08.task152;

public class SchoolStudent {
    public String studentName;
    private int studentAge;

    public void setStudentAge(int ageToSet){
        this.studentAge = ageToSet;
    }

    public void displayStudentProfile(){
        System.out.println("Имя студента: " + studentName + ", возраст студента: " + studentAge);
    }
}
