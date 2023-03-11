package com.JobRotation.faturamento.modelo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;


@Data
public class Faturamento {
    @JsonFormat (pattern = "yyyy-MM-dd")
    @NotBlank (message = "O campo data deve ser preenchido")
    private LocalDate data;
    private double valor;

}
