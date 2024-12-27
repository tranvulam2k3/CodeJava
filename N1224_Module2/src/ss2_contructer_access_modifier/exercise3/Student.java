package ss2_contructer_access_modifier.exercise3;

public class Student {
    private int id;
    private String name;
    private double score;

    public Student() {
    }

    public Student(int id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.trim().equals("")) {
            System.out.println("Name is empty");
        } else {
            this.name = name;

        }
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        if (score < 0 || score > 10) {
            System.out.println("Score is out of range");
        } else {
            this.score = score;
        }
    }
}
