
import com.quest.ParserJson;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import static org.junit.jupiter.api.Assertions.assertThrows;

public class InitServletTest extends Mockito {

    @Mock
    HttpServletRequest request;
    @Mock
    HttpServletResponse response;

    @Test
    public void nullSituationException() {

        ParserJson situation = Mockito.spy(new ParserJson());

        assertThrows(NullPointerException.class, () -> situation.init(null));
    }

    @Test
    public void nullSessionException() {
        assertThrows(NullPointerException.class, () -> request.getSession(false));
    }
}
