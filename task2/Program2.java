import java.util.Arrays;

/*
Задача 2 : Напишите обобщенный метод printArray, который принимает массив любого типа и выводит его элементы на консоль.
В этом примере мы объявляем обобщенный метод printArray, который принимает массив типа T.
Затем мы используем цикл for-each, чтобы пройти по всем элементам массива и вывести их на консоль.
В методе main мы создаем массивы типов Integer и String и вызываем printArray для каждого из них.
В результате мы получаем вывод на консоль элементов каждого массива.
 */
public class Program2 {
    public static void main(String[] args) {

        Integer[] iArray = new Integer[]{1, 2, 5, 7};
        Double[] dArray = new Double[]{1.0, 2.3, 5.4, 7.0};
        String[] sArray = new String[]{"Masha", "Ivan", "luda"};

        printArray(iArray);
        printArray(dArray);
        printArray(sArray);

    }


    public static <T> void printArray(T[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
}

