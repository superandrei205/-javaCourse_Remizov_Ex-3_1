public class Main {
    public static void main(String[] args){

        int[] myArray = {3, 22, 1, 13, 4, 6, 16, 5};

        System.out.println("1.Напишите программу, которая выводит (через пробел) те элементы массива, которые являются чётными числами.");
        for (int number: myArray) {
            if(number % 2 == 0)
                System.out.print(number+" ");
        }
        System.out.println("");
        System.out.println("2.Напишите программу, которая выводит все двузначные числа массива.");
        for (int number: myArray) {
            if(number>9 && number<100){
                System.out.print(number + " ");
            }
        }
        System.out.println("");
        System.out.println("3.Напишите программу, которая выводит на экран наибольшее целое число этого массива.");
        int max = 0;
        for (int number: myArray) {
            if(number>max){
                max = number;
            }
        }
        System.out.println(max);
        System.out.println("4.Напишите программу, которая считает сумму элементов массива и выводит её на экран.");
        int sum = 0;
        for (int number: myArray) {
            sum = sum + number;
        }
        System.out.println(sum);
        System.out.println("5.***Напишите программу, которая переворачивает массив в обратном порядке.");
        int[] arr = new int[myArray.length];
        for (int i = 0; i < myArray.length; i++) {
            arr[i] = myArray[ myArray.length - i-1];
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }


    }
}


