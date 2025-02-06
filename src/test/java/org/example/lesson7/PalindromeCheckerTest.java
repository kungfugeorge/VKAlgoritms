package org.example.lesson7;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PalindromeCheckerTest {

    @Test
    void isPalindrome() {
        assertThat(PalindromeChecker.isPalindrome("po")).isEqualTo(false);
    }
}