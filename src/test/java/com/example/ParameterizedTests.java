package com.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.assertj.core.api.Assertions.assertThat;


public class ParameterizedTests {
    @ParameterizedTest
    @CsvSource({
            "1, 1, 1",
            "2, 5, 10",
            "5, 8, 40"
    })
    void testMultiplication(int a, int b, int expected){
        assertThat(a*b).isEqualTo(expected);
    }
}
