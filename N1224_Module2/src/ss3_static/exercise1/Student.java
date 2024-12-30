package ss3_static.exercise1;

public class Student {
    private int id;
    private String name;
    private double score;
    private static int dem = 0;

    public Student() {
        dem++;
    }

    public Student(int id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score = score;
        dem++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public static int getDem() {
        return dem;
    }

}
