import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by ritter on 17-4-20.
 */
public class OperationTest {
    @Test
    public void should_return_sum() {
        int a = 3, b = 5;
        Operation op = new Operation();
        int result = op.sum(a, b);
        assertThat(result, is(8));

    }

}