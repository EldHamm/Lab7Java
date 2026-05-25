package lr7;

public class Task3 {

    static class FirstClass {
        public int number;

        FirstClass(int number) {
            this.number = number;
        }

        public void setValue(int number) {
            this.number = number;
        }

        @Override
        public String toString() {
            return "Класс: " + this.getClass().getSimpleName() + "\n"
                    + "number = " + number;
        }
    }

    static class SecondClass extends FirstClass {
        public char symbol;

        SecondClass(int number, char symbol) {
            super(number);
            this.symbol = symbol;
        }

        public void setValue(int number, char symbol) {
            this.number = number;
            this.symbol = symbol;
        }

        @Override
        public String toString() {
            return "Класс: " + this.getClass().getSimpleName() + "\n"
                    + "number = " + number + "\n"
                    + "symbol = " + symbol;
        }
    }

    static class ThirdClass extends SecondClass {
        public String text;

        ThirdClass(int number, char symbol, String text) {
            super(number, symbol);
            this.text = text;
        }

        public void setValue(int number, char symbol, String text) {
            this.number = number;
            this.symbol = symbol;
            this.text = text;
        }

        @Override
        public String toString() {
            return "Класс: " + this.getClass().getSimpleName() + "\n"
                    + "number = " + number + "\n"
                    + "symbol = " + symbol + "\n"
                    + "text = " + text;
        }
    }

    public static void main(String[] args) {
        FirstClass obj1 = new FirstClass(10);
        System.out.println(obj1);
        System.out.println();

        SecondClass obj2 = new SecondClass(20, 'A');
        System.out.println(obj2);
        System.out.println();

        ThirdClass obj3 = new ThirdClass(30, 'B', "Третий класс");
        System.out.println(obj3);
        System.out.println();

        obj3.setValue(100, 'Z', "Новые значения");
        System.out.println("После изменения значений:");
        System.out.println(obj3);
    }
}