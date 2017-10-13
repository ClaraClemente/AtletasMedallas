package atletamedalla.demo.controller;


import atletamedalla.demo.domain.Atleta;
import atletamedalla.demo.repository.AtletaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/atletas")

public class AtletaController {

    @Autowired
    private AtletaRepository atletaRepository;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Atleta createAtleta(@RequestBody Atleta atleta) {
        return
                atletaRepository.save(atleta);
    }

// devuelve todos los atletas
    //Pues si vaya misterio
    // Aqui provoco un conflicto soy Pau
    @GetMapping
    public List<Atleta> findAll() {
        return atletaRepository.findAll();
    }


    @GetMapping("/fechaAnterior/{birthday}")

    public List<Atleta> atletasByFechaNacimiento(@PathVariable @DataTimeFormat(pattern= "dd-MM-yyyy")LocalDate birthday{
        return atletaRepository.atletasByFechaNacimiento(Fecha_Nacimiento);
    })


}

