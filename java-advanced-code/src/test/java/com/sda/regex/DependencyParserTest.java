package com.sda.regex;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DependencyParserTest {

    @Test
    void givenLongString_whenConvertToShortForm_thenReturnShortString() {
        // given
        String string = "given compile group: 'mysql', name: 'mysql-connector-java', version: '8.0.17'";

        String expectedString = "implementation 'mysql:mysql-connector-java:8.0.17'";

        // when
        String actualString = DependencyParser.convertToShortForm(string);

        // then
        assertThat(actualString).isEqualTo(expectedString);
    }
}