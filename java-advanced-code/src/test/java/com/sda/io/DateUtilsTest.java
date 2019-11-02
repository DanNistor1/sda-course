package com.sda.io;

import com.sda.io.util.DateUtils;
import org.junit.jupiter.api.Test;

import java.text.SimpleDateFormat;
import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;

public class DateUtilsTest {

    @Test
    void givenLocalDate_whenConvertToString_thenReturnFormatString() {
       //  given
        LocalDate localDate = LocalDate.of(2019, 8, 4);
        String expectedLocalDate = "2019-08-4";

        // when
        String actualLocalDate = DateUtils.convertLocalDateToString(localDate);

        // then
        assertThat(actualLocalDate).isEqualTo(expectedLocalDate);
    }

    @Test
    void givenLocalDate_whenConvertToString_thenReturnFormatString2() {
       //  given
        LocalDate localDate = LocalDate.of(2019, 8, 4);
        String expectedLocalDate = "2019-08-04";

        // when
        String actualLocalDate = DateUtils.convertLocalDateToString2(localDate);

        // then
        assertThat(actualLocalDate).isEqualTo(expectedLocalDate);
    }

    @Test
    void convertToDateViaInstantTest() {
        LocalDate localDate = LocalDate.of(2019, 8, 8);
        String expectedDate = "2019-08-08";

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String actualDate = sdf.format(DateUtils.convertToDateViaInstant(localDate));

        assertThat(actualDate).isEqualTo(expectedDate);
    }
}
