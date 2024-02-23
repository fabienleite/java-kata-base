package com.zenika.kata;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class KataTest {

    @Test
    void test_runner_is_OK() {
        assertThat("a").isEqualTo("a");
    }

    @Test
    void test_runner_is_KO() {
        assertThat(1).isNotEqualTo(1);
    }
}
