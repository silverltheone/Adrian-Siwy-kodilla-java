public class Book {

    class Book {
        private String author;
        private String title;

        public Book(String author, String title) {
            this.author = author;
            this.title = title;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Book)) return false;

            Book book = (Book) o;

            if (author != null ? !author.equals(book.author) : book.author != null) return false;
            return title != null ? title.equals(book.title) : book.title == null;
        }

        @Override
        public int hashCode() {
            int result = author != null ? author.hashCode() : 0;
            result = 31 * result + (title != null ? title.hashCode() : 0);
            return result;
        }
    }
