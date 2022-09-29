public class Main {
    public static void main(String[] args) {
        int [] array = new int[5];
        System.out.println("Элементы в правильном порядке");
        for (int i = 0; i < array.length; i++) {
            array[i] = i;

            System.out.println(i);


        }
        System.out.println("Элементы в обратном порядке");
        int [] arrayy = new int[5];
        for (int i = 5 - 1; i >= 0; i--) {
            arrayy[i] = i;
            System.out.println(i);

        }


    }
}
