package br.edu.ifsp.prw3.prw3_api_slides.controller;

import br.edu.ifsp.prw3.prw3_api_slides.medico.DadosCadastroMedico;
import br.edu.ifsp.prw3.prw3_api_slides.medico.Medico;
import br.edu.ifsp.prw3.prw3_api_slides.medico.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("medicos")
public class MedicoController {

    @Autowired
    private MedicoRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody DadosCadastroMedico dados){
        repository.save( new Medico(    dados));

    }
}
