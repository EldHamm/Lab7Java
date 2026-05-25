package lr7;

public class Task2 {

    static class SuperClass {
        private String text;

        SuperClass(String text) {
            this.text = text;
        }

        public void setValue(String text) {
            this.text = text;
        }

        public int getLength() {
            return text.length();
        }

        public String getText() {
            return text;
        }

        @Override
        public String toString() {
            return "Класс: " + this.getClass().getSimpleName() + "\n"
                    + "text = " + text + "\n"
                    + "Длина строки = " + getLength();
        }
    }

    static class SubClass extends SuperClass {
        public int number;

        SubClass(String text, int number) {
            super(text);
            this.number = number;
        }

        public void setValue() {
            super.setValue("Значение по умолчанию");
            this.number = 0;
        }

        @Override
        public void setValue(String text) {
            super.setValue(text);
        }

        public void setValue(int number) {
            this.number = number;
        }

        public void setValue(String text, int number) {
            super.setValue(text);
            this.number = number;
        }

        @Override
        public String toString() {
            return "Класс: " + this.getClass().getSimpleName() + "\n"
                    + "text = " + getText() + "\n"
                    + "Длина строки = " + getLength() + "\n"
                    + "number = " + number;
        }
    }

    public static void main(String[] args) {
        SuperClass obj1 = new SuperClass("Суперкласс");
        System.out.println(obj1);
        System.out.println();

        SubClass obj2 = new SubClass("Подкласс", 10);
        System.out.println(obj2);
        System.out.println();

        obj2.setValue();
        System.out.println("После вызова setValue():");
        System.out.println(obj2);
        System.out.println();

        obj2.setValue("Новый текст");
        System.out.println("После вызова setValue(String):");
        System.out.println(obj2);
        System.out.println();

        obj2.setValue(25);
        System.out.println("После вызова setValue(int):");
        System.out.println(obj2);
        System.out.println();

        obj2.setValue("Текст и число", 100);
        System.out.println("После вызова setValue(String, int):");
        System.out.println(obj2);
    }
}