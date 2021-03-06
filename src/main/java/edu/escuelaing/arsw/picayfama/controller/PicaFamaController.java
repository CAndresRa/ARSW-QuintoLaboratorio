package edu.escuelaing.arsw.picayfama.controller;
import edu.escuelaing.arsw.picayfama.services.IPicaFamaService;
import edu.escuelaing.arsw.picayfama.services.PicaFamasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class PicaFamaController {
    @Autowired
    IPicaFamaService picaFamasService;

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

