package DesafioDioPOO.br.com.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{
    // atributos
    private LocalDate data;

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "[Mentoria: " +
                "Titulo= '" + getTitulo() +
                ", descricao= '" + getDescricao() +
                ", data= " + data +
                ']';
    }


}
