package ss5_overrice_overloading.exercise1;

public class HocVien {

    public void a(){
        System.out.println("a cha");
    }

    private void b(){
        System.out.println("b cha");
    }

    public int c(int a , int b){
        return a+b;
    }

    public int d(int a , int b, int c){
        return a+b+c;
    }

    public int e(int a , int b, int c , int d){
        return a+b+c+d;
    }
}
