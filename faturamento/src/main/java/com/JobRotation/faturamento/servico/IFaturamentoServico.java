package com.JobRotation.faturamento.servico;

import com.JobRotation.faturamento.modelo.Faturamento;

import java.util.List;

public interface IFaturamentoServico {

    Double calcularMenorValor(List<Faturamento> faturamentoDiario);

    Double calcularMaiorValor(List<Faturamento> faturamentoDiario);

     int calcularDiasAcimaMedia(List<Faturamento> faturamentoDiario);
}
