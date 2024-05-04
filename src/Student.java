public class Student {
    private String name;
    private int grade;
    private boolean hasPassed;

    public Student(String name, int grade) {
        setName(name);
        setGrade(grade);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if (grade < 0) {
            throw new IllegalArgumentException("Grade must be between 0 and 100");
        } else if (grade > 100) {
            this.grade = 100;
            hasPassed = true;
            System.err.println("Grade can't be higher than 100. Grade for "
                    + getName() + " has been set to max (" + getGrade() + ")");
        } else {
            // same as this ternary hasPassed = grade >= 50 ? true : false;
            hasPassed = grade >= 50;
            this.grade = grade;
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade=" + grade +'\'' +
                ", hasPassed=" + hasPassed +
                '}';
    }
}
