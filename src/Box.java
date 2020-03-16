import java.util.ArrayList;

public class Box<T> {
    public T book;

    Box(T name) {

        book = name;
    }

    ArrayList<T> books = new ArrayList<>();

    //Метод, позволяющий положить книгу в коробку
    public void putBook(T name) {
        books.add(name);
        System.out.println("Вы положили в коробку книгу " + name + " в коробку");
        System.out.println(" ");
    }

    //Метод, позволяющий взять книгу из коробки
    public void pickUpBook(int index) {
        if (index > books.size()) {
            System.out.println("Введеный индек превышает количество существующих книг: " + books.size());
            System.out.println("Содержимое коробки " + books);
            System.out.println(" ");
        } else {
            System.out.println("Вы взяли книгу " + books.get(index));
            System.out.println(" ");
        }
    }

    //Метод, позволяющий удалить книгу из коробки
    public void deleteBook(int index) {
        if (index > books.size()) {
            System.out.println("Введеный индек превышает количество существующих книг: " + books.size());
            System.out.println("Содержимое коробки " + books);
            System.out.println(" ");
        } else {
            System.out.println("Книга " + books.remove(index) + " удалена");
            System.out.println(" ");
        }
    }
}

