package br.edu.ifsp.prw3.prw3_api_slides.medico;

public record DadosListagemMedico(Long id, String nome, String email,
                                  String crm, Especialidade especialidade) {

    public DadosListagemMedico(Medico medico) {
        this(medico.getId(), medico.getNome(), medico.getEmail(),
                medico.getCrm(), medico.getEspecialidade() );
    }
}