package less4;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class BookTest {

    @Mock
    private BookRepository bookRepository;

    @InjectMocks
    private BookService bookService;

    @Test
    void findBookById() {

        when(bookService.findBookById("1")).thenReturn(new Book("1", "SomeTitle", "SomeAuthor"));

        String expectIdBook = "1";
        String actualIdBook = bookService.findBookById("1").getId();


        verify(bookRepository).findById("1");

        assertEquals(expectIdBook, actualIdBook);

    }

    @Test
    public void findAllBooksTest() {

        when(bookService.findAllBooks())
                .thenReturn(new ArrayList<>(Arrays.asList(
                        new Book("1"),
                        new Book("2")
                )));

        int expectedSizeListBooks = 2;
        int actualSizeListBooks = bookService.findAllBooks().size();


        verify(bookRepository, times(1)).findAll();

        assertEquals(expectedSizeListBooks, actualSizeListBooks);
    }

}
