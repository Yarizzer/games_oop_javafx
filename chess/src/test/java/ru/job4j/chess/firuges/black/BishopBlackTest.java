package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class BishopBlackTest {
    @Test
    public void testPosition() {
        Figure b = new BishopBlack(Cell.C1);
        assertThat(b.position(), is(Cell.C1));
    }

    @Test
    public void testC3CopyD4() {
        Figure b = new BishopBlack(Cell.C1);
        b = b.copy(Cell.E3);
        assertThat(b.position(), is(Cell.E5));
    }

    @Test
    public void testWay() {
        Figure b = new BishopBlack(Cell.C1);
        Cell[] result = b.way(Cell.G5);
        Cell[] expexted = new Cell[]{Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        assertThat(result, is(expexted));
    }
}