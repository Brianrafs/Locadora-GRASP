package br.edu.ifpb.padroes.locadora;

import br.edu.ifpb.padroes.locadora.modelo.*;



public class LocadoraApplication {
        public static void main(String[] args) {
            Cliente c1 = new Cliente("Alex Sandro");
            c1.adicionaAluguel(new Aluguel(new DVD("O Atirador", DVD.NORMAL), 10));
            c1.adicionaAluguel(new Aluguel(new DVD("Luca", DVD.INFANTIL), 2));
            c1.adicionaAluguel(new Aluguel(new DVD("O Gato de Botas 2", DVD.LANÇAMENTO), 30));
            c1.adicionaAluguel(new Aluguel(new DVD("Arremessando Alto", DVD.LANÇAMENTO), 4));
            c1.adicionaAluguel(new Aluguel(new DVD("Moana", DVD.INFANTIL), 10));
            c1.adicionaAluguel(new Aluguel(new DVD("Uma Noite no Museu", DVD.NORMAL), 3));
            System.out.println(c1.extrato());
        }
}

