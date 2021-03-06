package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class CryptographyTest {

    @Test
    public void codeLengthGreat4() {
        String code = Cryptography.code("4556364607935616");
        assertThat(code, is("############5616"));
    }

    @Test
    public void codeLengthLess4() {
        String code = Cryptography.code("123");
        assertThat(code, is("123"));
    }

    @Test
    public void codeEmptyString() {
        String code = Cryptography.code("");
        assertThat(code, is("empty"));
    }

    @Test
    public void codeLengthOne() {
        String code = Cryptography.code("1234");
        assertThat(code, is("1234"));
    }

    @Test
    public void codeLengthGreat5() {
        String code = Cryptography.code("12345");
        assertThat(code, is("#2345"));
    }
}