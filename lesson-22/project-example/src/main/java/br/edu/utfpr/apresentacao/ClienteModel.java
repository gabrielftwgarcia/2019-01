package br.edu.utfpr.apresentacao;

import br.edu.utfpr.dao.Pais;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ClienteModel {
    private Long id;
    private String nome;
    private int idade;
    private String telefone;
    private double limiteCredito;

    private Pais pais;
}
