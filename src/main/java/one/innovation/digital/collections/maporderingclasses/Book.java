package one.innovation.digital.collections.maporderingclasses;

import java.util.Objects;
/**
 *  MapOrdering
 */
public class Book {
    private String name;
    private Integer numOfPages;

    public Book(String name, Integer numOfPages) {
        this.name = name;
        this.numOfPages = numOfPages;
    }

    public String getName() {
        return name;
    }

    public Integer getNumOfPages() {
        return numOfPages;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return name.equals(book.name) && numOfPages.equals(book.numOfPages);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, numOfPages);
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", paginas=" + numOfPages +
                '}';
    }
}