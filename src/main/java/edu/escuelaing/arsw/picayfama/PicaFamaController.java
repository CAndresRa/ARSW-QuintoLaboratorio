package edu.escuelaing.arsw.picayfama;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class PicaFamaController {
    @Autowired
    PicaFamasService picaFamasService;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping ("/ramdom")
    public String ramdomNumber(){
        return picaFamasService.numeroAletorio();
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping("/adivinar/{numero}")
    public String intentoAdivinarNumero(@PathVariable int numero){
        return picaFamasService.validar(String.valueOf(numero));
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping("/adivinar")
    public void restart(){
        picaFamasService = new PicaFamasService();
    }
}

