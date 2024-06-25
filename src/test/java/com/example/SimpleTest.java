package com.example;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assumptions;
import static org.assertj.core.api.Assertions.assertThat;


public class SimpleTest {

    @Test
    public void testAddition(){
        int a = 4;
        int b = 6;
        Assumptions.assumeTrue(a+b>8, "Sum of numbers not more than 8");
        int sum = a+b;
        assertThat(sum).isEqualTo(10);
    }
}
