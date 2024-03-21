package br.edu.ifpb.padroes.locadora.modelo;

public class DVD {
    public static final int NORMAL = 0;
    public static final int LANÇAMENTO = 1;
    public static final int INFANTIL = 2;

    private String título;
    private int códigoDePreço;

    public DVD(String título, int códigoDePreço) {
        this.título = título;
        this.códigoDePreço = códigoDePreço;
    }

    public String getTítulo() {
        return título;
    }

    public int getCódigoDePreço() {
        return códigoDePreço;
    }
}
