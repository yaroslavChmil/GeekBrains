package LessonOne.task2;

public class main {
    private static void result(int a, int b){
        int sum = a + b;
        if (sum >= 10 && sum <= 20){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        result(a,b);
    }
}
