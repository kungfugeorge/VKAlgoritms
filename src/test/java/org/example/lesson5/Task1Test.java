package org.example.lesson5;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Task1Test {

    @Test
    void minDiff() {
        assertThat(Task1.minDiff(4, new int[]{1, 3, 4, 11})).isEqualTo("3 4");
    }
}