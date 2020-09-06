package LessonOne.task1;

public class main {
    private static void num(int a, int b, int c, int d){
        double res;
        res = a * (b + (c / d));
        System.out.println(res);
    }
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        int c = 4;
        int d = 2;
        num(a,b,c,d);

    }
}
