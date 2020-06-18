package edu.escuelaing.arsw.picayfama;
import edu.escuelaing.arsw.picayfama.services.PicaFamasService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class PicayfamasApplicationTests {


    @Test
    void shouldAllBeFamas() {
        PicaFamasService picaFamasService = new PicaFamasService();
        picaFamasService.setNumberRamdom("12345678");
        picaFamasService.validar("12345678");
        assertThat(picaFamasService.getCounterFamas()).isEqualTo(8);
    }

    @Test
    void shouldHaveOneFama() {
        PicaFamasService picaFamasService = new PicaFamasService();
        picaFamasService.setNumberRamdom("12345678");
        picaFamasService.validar("17654321");
        assertThat(picaFamasService.getCounterFamas()).isEqualTo(1);
    }

    @Test
    void shouldHaveTwoPica() {
        PicaFamasService picaFamasService = new PicaFamasService();
        picaFamasService.setNumberRamdom("12345678");
        picaFamasService.validar("12345687");
        assertThat(picaFamasService.getCounterPicas()).isEqualTo(2);
    }

    @Test
    void shouldHaveZeroPica() {
        PicaFamasService picaFamasService = new PicaFamasService();
        picaFamasService.setNumberRamdom("12345678");
        picaFamasService.validar("12345678");
        assertThat(picaFamasService.getCounterPicas()).isEqualTo(0);
    }

    @Test
    void shouldHaveZeroFama() {
        PicaFamasService picaFamasService = new PicaFamasService();
        picaFamasService.setNumberRamdom("12345678");
        picaFamasService.validar("21111111");
        assertThat(picaFamasService.getCounterFamas()).isEqualTo(0);
    }

    @Test
    void shouldHaveSixFama() {
        PicaFamasService picaFamasService = new PicaFamasService();
        picaFamasService.setNumberRamdom("12345678");
        picaFamasService.validar("12345687");
        assertThat(picaFamasService.getCounterFamas()).isEqualTo(6);
    }

    @Test
    void shouldHaveTwoPicas() {
        PicaFamasService picaFamasService = new PicaFamasService();
        picaFamasService.setNumberRamdom("12345678");
        picaFamasService.validar("21345678");
        assertThat(picaFamasService.getCounterPicas()).isEqualTo(2);
    }

    @Test
    void shouldHaveSixPica() {
        PicaFamasService picaFamasService = new PicaFamasService();
        picaFamasService.setNumberRamdom("12345678");
        picaFamasService.validar("87654300");
        assertThat(picaFamasService.getCounterPicas()).isEqualTo(6);
    }

}
