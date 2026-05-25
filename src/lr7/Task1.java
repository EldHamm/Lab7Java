package lr7;

public class Task1 {

    static class SuperClass {
        private String text;

        SuperClass(String text) {
            this.text = text;
        }

        public String getText() {
            return text;
        }

        @Override
        public String toString() {
            return "Класс: " + this.getClass().getSimpleName() + "\n"
                    + "text = " + text;
        }
    }

    static class SubClass extends SuperClass {
        private String text2;

        SubClass(String text) {
            super(text);
        }

        SubClass(String text, String text2) {
            super(text);
            this.text2 = text2;
        }

        @Override
        public String toString() {
            return "Класс: " + this.getClass().getSimpleName() + "\n"
                    + "text = " + getText() + "\n"
                    + "text2 = " + text2;
        }
    }

    public static void main(String[] args) {
        SuperClass obj1 = new SuperClass("Текст суперкласса");
        System.out.println(obj1);
        System.out.println();

        SubClass obj2 = new SubClass("Текст суперкласса в подклассе");
        System.out.println(obj2);
        System.out.println();

        SubClass obj3 = new SubClass("Первое поле", "Второе поле");
        System.out.println(obj3);
    }
}