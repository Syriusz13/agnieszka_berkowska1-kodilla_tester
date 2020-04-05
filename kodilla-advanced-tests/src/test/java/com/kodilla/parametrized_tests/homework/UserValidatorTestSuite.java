package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserValidatorTestSuite {

    private UserValidator userValidator = new UserValidator();

    @ParameterizedTest
    @ValueSource(strings = {"User","user","USER123", "_.-0"})
    public void shouldReturnTrueForCorrectUsername(String username) {
        boolean result = userValidator.validateUsername(username);
        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"u", "#$%","12 34", ""})
    public void shouldReturnFalseForIncorrectUsername(String username) {
        boolean result = userValidator.validateUsername(username);
        assertFalse(result);
    }

    @ParameterizedTest
    @NullSource
    public void shouldReturnFalseForNullEmail(String email) {
        assertFalse(userValidator.validateEmail(email));
    }

    @ParameterizedTest
    @ValueSource(strings = {"a.b@gmail.com"})
    public void shouldReturnTrueForNotNullEmail(String email) {
        assertTrue(userValidator.validateEmail(email));
    }
}
