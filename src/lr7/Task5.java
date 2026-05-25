package lr7;

public class Task5 {

    static class SuperClass {
        private String text;

        SuperClass(String text) {
            this.text = text;
        }

        public String getText() {
            return text;
        }

        public void showInfo() {
            System.out.println("Класс: " + this.getClass().getSimpleName());
            System.out.println("text = " + text);
        }
    }

    static class FirstSubClass extends SuperClass {
        protected int number;

        FirstSubClass(String text, int number) {
            super(text);
            this.number = number;
        }

        @Override
        public void showInfo() {
            System.out.println("Класс: " + this.getClass().getSimpleName());
            System.out.println("text = " + getText());
            System.out.println("number = " + number);
        }
    }

    static class SecondSubClass extends SuperClass {
        protected char symbol;

        SecondSubClass(String text, char symbol) {
            super(text);
            this.symbol = symbol;
        }

        @Override
        public void showInfo() {
            System.out.println("Класс: " + this.getClass().getSimpleName());
            System.out.println("text = " + getText());
            System.out.println("symbol = " + symbol);
        }
    }

    public static void main(String[] args) {
        SuperClass obj1 = new SuperClass("Объект суперкласса");
        FirstSubClass obj2 = new FirstSubClass("Первый подкласс", 123);
        SecondSubClass obj3 = new SecondSubClass("Второй подкласс", 'Q');

        System.out.println("Вызов метода для объекта суперкласса:");
        obj1.showInfo();
        System.out.println();

        System.out.println("Вызов метода для первого подкласса:");
        obj2.showInfo();
        System.out.println();

        System.out.println("Вызов метода для второго подкласса:");
        obj3.showInfo();
        System.out.println();

        System.out.println("Вызов переопределенного метода через переменную суперкласса:");

        SuperClass ref;

        ref = obj2;
        ref.showInfo();
        System.out.println();

        ref = obj3;
        ref.showInfo();
    }
}