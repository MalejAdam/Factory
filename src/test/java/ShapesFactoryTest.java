import com.*;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShapesFactoryTest {
    private static ShapesFactory shapesFactory;
    private static Draw draw;

    @BeforeClass
    public   static void setUp()
    {
        shapesFactory = new ShapesFactory();
    }

    @Test
    public void DrawRectangle(){
        draw = shapesFactory.getDraw(Shapes.Rectangle);
        assertTrue(draw instanceof Rectangle);
        assertEquals(draw.draw(), "Draw rectangle.");
    }

    @Test
    public void DrawCircle(){
        draw = shapesFactory.getDraw(Shapes.Circle);
        assertTrue(draw instanceof Circle);
        assertEquals(draw.draw(), "Draw circle.");
    }

    @Test
    public void DrawSquare(){
        draw = shapesFactory.getDraw(Shapes.Square);
        assertTrue(draw instanceof Square);
        assertEquals(draw.draw(), "Draw square.");
    }
}