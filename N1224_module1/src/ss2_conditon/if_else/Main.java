package ss2_conditon.if_else;

public class Main {
    public static void main(String[] args) {
        double score = 9;
        if(score > 10 || score < 0){
            System.out.println("Diem khong hop le");
        } else if (score<5) {
            System.out.println("Yeu");
        } else if (score<6.5) {
            System.out.println("Trung binh");
        } else if (score<8) {
            System.out.println("Kha");
        } else if (score<10) {
            System.out.println("Gioi");
        }
    }
}
