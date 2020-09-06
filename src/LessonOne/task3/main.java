package LessonOne.task3;

public class main {
    private static void taskThree(int a){
        if (a >= 0){
            System.out.println("Positive");
        }else {
            System.out.println("Negative");
        }
    }
    public static void main(String[] args) {
        int a = 0;
        int b = -1;
        taskThree(b);
    }
}
