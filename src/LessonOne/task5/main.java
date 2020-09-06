package LessonOne.task5;

public class main {
    private static void years(int a){
        if (a % 4 == 0 && a % 400 == 0){
            System.out.println("Высокосный");
        }else {
            System.out.println("Не высокосный");
        }
    }

    public static void main(String[] args) {
        int a = 400;
        int b = 100;
        years(b);
    }
}
