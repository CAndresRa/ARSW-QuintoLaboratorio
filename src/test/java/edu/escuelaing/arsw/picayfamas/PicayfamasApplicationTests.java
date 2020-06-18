package edu.escuelaing.arsw.picayfamas;

import edu.escuelaing.arsw.picayfamas.services.PicaFamasService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import sun.jvm.hotspot.utilities.Assert;

@SpringBootTest
class PicayfamasApplicationTests {

    @Test
    void shouldAllBeFamas() {
        PicaFamasService picaFamasService = new PicaFamasService();
        picaFamasService.setNumberRamdom("12345678");
        picaFamasService.validar("12345678");
        Assert.that(picaFamasService.getCounterFamas() == 8, "");
    }

    @Test
    void shouldHaveOneFama() {
        PicaFamasService picaFamasService = new PicaFamasService();
        picaFamasService.setNumberRamdom("12345678");
        picaFamasService.validar("17654321");
        Assert.that(picaFamasService.getCounterFamas() == 1, "");
    }

    @Test
    void shouldHaveTwoPica() {
        PicaFamasService picaFamasService = new PicaFamasService();
        picaFamasService.setNumberRamdom("12345678");
        picaFamasService.validar("12345687");
        Assert.that(picaFamasService.getCounterPicas() == 2, "");
    }

    @Test
    void shouldHaveZeroPica() {
        PicaFamasService picaFamasService = new PicaFamasService();
        picaFamasService.setNumberRamdom("12345678");
        picaFamasService.validar("12345678");
        Assert.that(picaFamasService.getCounterPicas() == 0, "");
    }

    @Test
    void shouldHaveZeroFama() {
        PicaFamasService picaFamasService = new PicaFamasService();
        picaFamasService.setNumberRamdom("12345678");
        picaFamasService.validar("21111111");
        Assert.that(picaFamasService.getCounterFamas() == 0, "");
    }

    @Test
    void shouldHaveSixFama() {
        PicaFamasService picaFamasService = new PicaFamasService();
        picaFamasService.setNumberRamdom("12345678");
        picaFamasService.validar("12345687");
        Assert.that(picaFamasService.getCounterFamas() == 6, "");
    }

    @Test
    void shouldHaveTwoPicas() {
        PicaFamasService picaFamasService = new PicaFamasService();
        picaFamasService.setNumberRamdom("12345678");
        picaFamasService.validar("21345678");
        Assert.that(picaFamasService.getCounterPicas() == 2, "");
    }

    @Test
    void shouldHaveSixPica() {
        PicaFamasService picaFamasService = new PicaFamasService();
        picaFamasService.setNumberRamdom("12345678");
        picaFamasService.validar("87654300");
        Assert.that(picaFamasService.getCounterPicas() == 6, "");
    }

}
