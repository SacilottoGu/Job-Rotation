package com.JobRotation.faturamento.controlador;

import com.JobRotation.faturamento.modelo.Faturamento;
import com.JobRotation.faturamento.servico.Implementacao.FaturamentoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping({"/faturamento"})
@RestController
public class FaturamentoControlador {

    @Autowired
    private FaturamentoImpl faturamentoService;

    @PostMapping("/menor")
    public double calcularMenorValor(@RequestBody List<Faturamento> faturamentoDiario) {
        return this.faturamentoService.calcularMenorValor(faturamentoDiario);
    }
    @PostMapping("/maior")
    public double calcularMaiorValor(@RequestBody List<Faturamento> faturamentoDiario) {
        return this.faturamentoService.calcularMaiorValor(faturamentoDiario);
    }
    @PostMapping("/media")
    public int calcularDiasAcimaMedia(@RequestBody List<Faturamento> faturamentoDiario) {
        return this.faturamentoService.calcularDiasAcimaMedia(faturamentoDiario);
    }

}
