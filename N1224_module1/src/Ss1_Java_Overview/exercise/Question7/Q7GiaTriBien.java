package Ss1_Java_Overview.exercise.Question7;

public class Q7GiaTriBien {
    public static void main(String[] args) {
        int i = 1 , j = 1 ;
        int a = ++i + j++ ;
        System.out.println(i); //i++ lấy giá trị ban đầu rồi sau đó mới tăng
        i += i++ + ++i;         //++i tăng ngay khi bắt đầu
        // i += <=> i=i+ i++ + ++i

        System.out.println(a);
        System.out.println(i);
        System.out.println(j);
    }
}
