package lr7;

public class Task4 {

    static class FirstClass {
        public char symbol;

        FirstClass(char symbol) {
            this.symbol = symbol;
        }

        FirstClass(FirstClass obj) {
            this.symbol = obj.symbol;
        }

        @Override
        public String toString() {
            return "Класс: " + this.getClass().getSimpleName() + "\n"
                    + "symbol = " + symbol;
        }
    }

    static class SecondClass extends FirstClass {
        public String text;

        SecondClass(char symbol, String text) {
            super(symbol);
            this.text = text;
        }

        SecondClass(SecondClass obj) {
            super(obj.symbol);
            this.text = obj.text;
        }

        @Override
        public String toString() {
            return "Класс: " + this.getClass().getSimpleName() + "\n"
                    + "symbol = " + symbol + "\n"
                    + "text = " + text;
        }
    }

    static class ThirdClass extends SecondClass {
        public int number;

        ThirdClass(char symbol, String text, int number) {
            super(symbol, text);
            this.number = number;
        }

        ThirdClass(ThirdClass obj) {
            super(obj.symbol, obj.text);
            this.number = obj.number;
        }

        @Override
        public String toString() {
            return "Класс: " + this.getClass().getSimpleName() + "\n"
                    + "symbol = " + symbol + "\n"
                    + "text = " + text + "\n"
                    + "number = " + number;
        }
    }

    public static void main(String[] args) {
        FirstClass obj1 = new FirstClass('A');
        FirstClass copy1 = new FirstClass(obj1);

        System.out.println("Первый объект:");
        System.out.println(obj1);
        System.out.println("Копия первого объекта:");
        System.out.println(copy1);
        System.out.println();

        SecondClass obj2 = new SecondClass('B', "Второй класс");
        SecondClass copy2 = new SecondClass(obj2);

        System.out.println("Второй объект:");
        System.out.println(obj2);
        System.out.println("Копия второго объекта:");
        System.out.println(copy2);
        System.out.println();

        ThirdClass obj3 = new ThirdClass('C', "Третий класс", 300);
        ThirdClass copy3 = new ThirdClass(obj3);

        System.out.println("Третий объект:");
        System.out.println(obj3);
        System.out.println("Копия третьего объекта:");
        System.out.println(copy3);
    }
}