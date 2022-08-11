package test.java.baseball;

import static org.junit.Assert.assertThat;

import main.ValidationUtils;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class ValidationUtilsTest {
    @Test
    @DisplayName("야구 숫자 1~9 검")
    void invalid() {
        // 거꾸로 만드는 것에 익숙해지기!
        assertThat(ValidationUtils.validNo(9)).isTrue();
    }
}
