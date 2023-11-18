package week42;

/**
 *
 * @author Nada
 */
public class Test {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setId(202120391);
        s1.setName("Nada");
        s1.setGPA(90);
        s1.setEmail("naada@gmail");
        Student s2 = new Student(202120391, "na", 80, "@gmail");
        Student s3 = new Student();
        s3.withid(1234).withname("sara").withGPA(50).withEmail("@gg");
    }

}
