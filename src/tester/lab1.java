package tester;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class lab1 {

    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. элемент нэмэх");
            System.out.println("2. элемент хасах");
            System.out.println("3. бүх элементийг харах");
            System.out.println("4. эрэмбэлэх");
            System.out.println("5. хоосон эсэхийг шалгах ");
            System.out.println("6. бүх элементний нийлбэр");
            System.out.println("7. Дуусгах");
            System.out.println("----------------------------------");
            int b = sc.nextInt();
            switch (b) {
                case 1:
                    addElement(myList, sc);
                    break;
                case 2:
                    removeElement(myList, sc);
                    break;
                case 3:
                    element(myList);
                    break;
                case 4:
                    sortElement(myList);
                    break;
                case 5:
                    checkEmpty(myList);
                    break;
                case 6:
                    sum(myList);
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Буруу сонголт. 1-ээс 7 хүртэлх тоог оруулна уу.");
            }
        }
    }

    public static void addElement(List<Integer> myList, Scanner sc) {
        System.out.println("Нэмэх элемент:");
        int element = 0;
        try {
            element = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Буруу оролт. Бүхэл тоо оруулна уу.");
            sc.nextLine(); // Clear the input buffer
            return;
        }
        myList.add(element);
    }

    public static void removeElement(List<Integer> myList, Scanner sc) {
        System.out.println("Хасах элэмэнт:");
        int element = sc.nextInt();
        if (myList.contains(element)) {
            myList.remove(Integer.valueOf(element));
        } else {
            System.out.println("Олдсонгүй");
        }
    }

    public static void element(List<Integer> myList) {
        System.out.println("Жагсаалтан дахь бүх элемент:" + myList);
    }

    public static void sortElement(List<Integer> myList) {
        Collections.sort(myList);
        System.out.println("Эрэмбэлэгдсэн жагсаалт:" + myList);
    }

    public static void checkEmpty(List<Integer> myList) {
        if (myList.isEmpty()) {
            System.out.println("Жагсаалт хоосон байна.");
        } else {
            System.out.println("Жагсаалтанд:" + myList + " Эдгээр элементүүд байна.");
        }
    }

    public static void sum(List<Integer> myList) {
        int sum = 0;
        for (int i = 0; i < myList.size(); i++) {
            sum += myList.get(i);
        }
        System.out.println("Нийлбэр:" + sum);
    }
}//6:56