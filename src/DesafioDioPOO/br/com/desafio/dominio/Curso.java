package DesafioDioPOO.br.com.desafio.dominio;

public class Curso extends Conteudo {
    // atributos
    private int cargaHoraria;

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "[Curso: " +
                "Titulo= '" + getTitulo() + '\'' +
                ", descricao= '" + getDescricao() + '\'' +
                ", carga horaria= " + cargaHoraria +
                ']';
    }


}
