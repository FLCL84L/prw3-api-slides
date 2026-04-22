package br.edu.ifsp.prw3.prw3_api_slides.medico;

import br.edu.ifsp.prw3.prw3_api_slides.endereco.DadosEndereco;

public record DadosCadastroMedico(String nome, String email,
                                  String crm, Especialidade especialidade,
                                  DadosEndereco endereco) {
}
