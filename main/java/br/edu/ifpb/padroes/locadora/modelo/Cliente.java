package br.edu.ifpb.padroes.locadora.modelo;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
        private String nome;
        private List<Aluguel> alugueis = new ArrayList<>();

        public Cliente(String nome) {
            this.nome = nome;
        }

        public String getNome() {
            return nome;
        }

        public void adicionaAluguel(Aluguel aluguel) {
            alugueis.add(aluguel);
        }

        public String extrato() {
            final String fimDeLinha = System.getProperty("line.separator");
            double valorTotal = 0.0;
            int pontosDeAlugadorFrequente = 0;
            StringBuilder resultado = new StringBuilder("Registro de Alugueis de ").append(getNome()).append(fimDeLinha);

            for (Aluguel aluguel : alugueis) {
                double valorCorrente = 0.0;
                switch (aluguel.getDVD().getCódigoDePreço()) {
                    case DVD.NORMAL:
                        valorCorrente += 2.0;
                        if (aluguel.getDiasAlugado() > 2) {
                            valorCorrente += (aluguel.getDiasAlugado() - 2) * 1.5;
                        }
                        break;
                    case DVD.LANÇAMENTO:
                        valorCorrente += aluguel.getDiasAlugado() * 3.0;
                        break;
                    case DVD.INFANTIL:
                        valorCorrente += 1.5;
                        if (aluguel.getDiasAlugado() > 3) {
                            valorCorrente += (aluguel.getDiasAlugado() - 3) * 1.5;
                        }
                        break;
                }
                pontosDeAlugadorFrequente++;
                if (aluguel.getDVD().getCódigoDePreço() == DVD.LANÇAMENTO && aluguel.getDiasAlugado() > 1) {
                    pontosDeAlugadorFrequente++;
                }
                resultado.append("\t").append(aluguel.getDVD().getTítulo()).append("\t").append(valorCorrente).append(fimDeLinha);
                valorTotal += valorCorrente;
            }
            resultado.append("Valor total devido: ").append(valorTotal).append(fimDeLinha);
            resultado.append("Voce acumulou ").append(pontosDeAlugadorFrequente).append(" pontos de alugador frequente");
            return resultado.toString();
        }
}
