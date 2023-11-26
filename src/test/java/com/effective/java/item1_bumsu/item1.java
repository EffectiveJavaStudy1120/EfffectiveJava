일반 생성자를 사용하는 경우
public class Book {
    private String title;
    private String author;
    private int pageCount;

    // 일반 생성자
    public Book(String title, String author, int pageCount) {
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
    }

    // Getters and other methods...
}

// 객체 생성 예시
Book book = new Book("Java Programming", "John Doe", 300);

정적 팩토리 메서드를 사용하는 경우
public class Book {
    private String title;
    private String author;
    private int pageCount;

    // private 생성자
    private Book(String title, String author, int pageCount) {
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
    }

    // 정적 팩토리 메서드
    public static Book createWithPageCount(String title, String author, int pageCount) {
        return new Book(title, author, Math.max(pageCount, 0)); // 예를 들어 페이지 수를 양수로 제한
    }

    // Getters and other methods...
}

// 객체 생성 예시
Book book = Book.createWithPageCount("Java Programming", "John Doe", 300);
