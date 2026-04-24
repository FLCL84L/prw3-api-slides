package br.edu.ifsp.prw3.prw3_api_slides.medico;

import br.edu.ifsp.prw3.prw3_api_slides.endereco.DadosEndereco;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoMedico(
        @NotNull
        Long id,
        String nome,
        String telefone,
        DadosEndereco endereco) {


}
