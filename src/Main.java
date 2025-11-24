class Main {
    public static void main(String[] args) {
        System.out.print("Это добавлено в ветке main");
        System.out.println("Новое сообщение для коммита 1");

        int x = 10;
        System.out.println("Значение x = " + x);

        printMessage();

        for (int i = 1; i <= 3; i++) {
            System.out.println("Цикл: шаг " + i);
        }
    }

    public static void printMessage() {
        System.out.println("Метод вызван (коммит 3)");
    }
}
