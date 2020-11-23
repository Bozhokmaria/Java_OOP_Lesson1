package task2;

public class Main {
    public static void main(String[] args) {
        Book book = new Book();


        Author author = new Author();
        author.setName("Анджей Сапковский");
        author.show();
        Title title = new Title();
        title.setTitle("Сага о ведьмаке");
        title.show();
        Content content = new Content();
        content.setContent("Первый рассказ цикла увидел свет в 1986 году, а последняя книга — в 2013. Действие книг происходит в вымышленном Мире «Ведьмака» (англ. Neverland или англ. The Continent)," +
                "напоминающем Европу времён позднего средневековья, где рядом с людьми существуют разного рода волшебные существа и чудовища.");
        content.show();



        book.setAuthor(author);
        book.setTitle(title);
        book.setContent(content);

        book.show();
    }
}
//«Сага о ведьмаке» (польск. Saga o wiedźminie) — цикл книг польского писателя
// Анджея Сапковского в жанре фэнтези.
//
//Первый рассказ цикла увидел свет в 1986 году,
// а последняя книга — в 2013. Действие книг происходит
// в вымышленном Мире «Ведьмака» (англ. Neverland или англ. The Continent),
// напоминающем Европу времён позднего средневековья, где рядом с людьми
// существуют разного рода волшебные существа и чудовища.