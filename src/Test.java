

public class Test {

    public static void main(String[] args) {
        Box<String> book = new Box<>("Введите название книги");

        book.putBook("Атлант расправил плечи");
        book.putBook("1984");
        book.putBook("Так говорил Заратустра");
        book.putBook("Грокаем алгоритмы");

        try {
            book.pickUpBook(14);
            book.deleteBook(2);
            book.pickUpBook(-2);
            book.deleteBook(-2);
        } catch (IndexOutOfBoundsException index) {
            System.out.println("Вы вышли за пределы коробки. Введите корректный индекс");
        }
    }
}
