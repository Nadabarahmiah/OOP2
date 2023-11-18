package week42;

/**
 *
 * @author Nada
 */
public class Student {

    private int id;
    private String name;
    private double GPA;
    private String Email;

    public Student() {

    }

    public Student(int id, String name, double GPA, String Email) {
        this.id = id;
        this.name = name;
        this.GPA = GPA;
        this.Email = Email;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getGPA() {
        return GPA;
    }

    public String getEmail() {
        return Email;
    }

    public Student withid(int id) {
        setId(id);
        return this;
    }

    public Student withname(String name) {
        setName(name);
        return this;
    }

    public Student withGPA(double GAP) {
        setGPA(GPA);
        return this;
    }

    public Student withEmail(String Email) {
        setEmail(Email);
        return this;
    }

}
