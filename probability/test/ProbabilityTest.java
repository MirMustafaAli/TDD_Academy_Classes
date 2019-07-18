import junit.framework.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ProbabilityTest {

    @Test
    public void compare_returns0_whenGivenTwoEqualProbabilities() {
        Probability probability1 = Probability.createProbability(0.4);
        Probability probability2 = Probability.createProbability(0.4);

        int result = probability1.compare(probability2);

        Assert.assertEquals(0, result);
    }

    @Test
    public void compare_returnsNegative_whenFirstProbabilityLesserThanSecond() {
        Probability probability1 = Probability.createProbability(0.2);
        Probability probability2 = Probability.createProbability(0.4);

        int result = probability1.compare(probability2);


        Assert.assertEquals(-1, result);
    }

    @Test
    public void compare_returnsPositive_whenSecondProbabilityLesserThanFirst() {
        Probability probability1 = Probability.createProbability(0.5);
        Probability probability2 = Probability.createProbability(0.4);

        int result = probability1.compare(probability2);

        Assert.assertEquals(1, result);
    }

    @Test
    public void after_returns1By4_whenProbability1AndProbability2Are1By2() {
        Probability probability1 = Probability.createProbability(0.5);
        Probability probability2 = Probability.createProbability(0.5);

        Probability result = probability1.after(probability2);

        Probability expectedValue = Probability.createProbability(0.25);

        Assert.assertEquals(expectedValue, result);

    }

    @Test
    public void not_returns0Point4_whenProbabilityIs0Point6() {
        Probability probability = Probability.createProbability(0.6);

        Probability result = probability.not();

        Probability expectedValue = Probability.createProbability(0.4);
        Assert.assertEquals(expectedValue, result);
    }

    @Test
    public void or_return0Point7_whenProbability1is0Point3AndProbability2is0Point4() {
        Probability probability1 = Probability.createProbability(0.3);
        Probability probability2 = Probability.createProbability(0.4);
        Probability expectedValue = Probability.createProbability(0.7);

        Probability result = probability1.or(probability2);


        Assert.assertEquals(expectedValue, result);
    }
}