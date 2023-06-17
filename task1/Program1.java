/*Задача 1 : Напишите обобщенный метод printElement, который принимает один параметр типа T и выводит его на консоль.
В этом примере мы объявляем обобщенный метод printElement, который принимает один параметр типа T.
Мы просто выводим этот элемент на консоль с помощью метода System.out.println().
В методе main мы вызываем printElement с различными типами данных: целое число (Integer), строку (String)
и число с плавающей запятой (Double). Компилятор автоматически выводит тип параметра T на основе переданных аргументов.
*/

public class Program1 {
    public static void main(String[] args) {

        El<String> str = new El<String>("Some string");
        str.printElement();

        El<Integer> intNum = new El<Integer>(5);
        intNum.printElement();

        El<Double> dNum = new El<Double>(5.42);
        dNum.printElement();

    }

    static class El<T> {
        private T el;

        El(T el) {
            this.el = el;
        }

        public void printElement() {
            System.out.println(el);
        }

    }
}