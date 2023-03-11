package com.JobRotation.faturamento.servico.Implementacao;

import com.JobRotation.faturamento.modelo.Faturamento;
import com.JobRotation.faturamento.servico.IFaturamentoServico;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FaturamentoImpl implements IFaturamentoServico {

    @Override
    public Double calcularMenorValor(List<Faturamento> faturamentoDiario) {

        if (faturamentoDiario.size() == 0 ) return null;

        double menorValor = faturamentoDiario.get(0).getValor() ;

        for (int i = 1; i < faturamentoDiario.size(); i++) {
            if (faturamentoDiario.get(i).getValor() < menorValor) {
                menorValor = faturamentoDiario.get(i).getValor();
            }
        }
        return menorValor;

    }

    @Override
    public Double calcularMaiorValor(List<Faturamento> faturamentoDiario) {

        if (faturamentoDiario.size() == 0 ) return null;

        double maiorValor = faturamentoDiario.get(0).getValor();

        for (int i = 1; i < faturamentoDiario.size(); i++) {
            if (faturamentoDiario.get(i).getValor() > maiorValor) {
                maiorValor = faturamentoDiario.get(i).getValor();
            }
        }
        return maiorValor;
    }

    @Override
    public int calcularDiasAcimaMedia(List<Faturamento> faturamentoDiario) {
        double somaFaturamento = 0.0;
        int numDiasFaturamento = 0;
        for (int i = 1; i < faturamentoDiario.size(); i++) {
            if (faturamentoDiario.get(i).getValor() > 0.0) {
                somaFaturamento += faturamentoDiario.get(i).getValor();
                numDiasFaturamento++;
            }
        }
        double mediaMensal = somaFaturamento / numDiasFaturamento;
        int numDiasAcimaMedia = 0;

        for (int i = 1; i < faturamentoDiario.size(); i++) {
            if (faturamentoDiario.get(i).getValor() > mediaMensal) {
                numDiasAcimaMedia++;
            }
        }
        return numDiasAcimaMedia;
    }
}
