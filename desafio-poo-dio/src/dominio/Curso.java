package dominio;

public class Curso {
    //atributos
    private String titulo;
    private String descricao;
    private int cargaHoraria;

    public String getTitulo(){
        return titulo;

    }
    public void setTitulo(String titulo){
        this.titulo = titulo;

    }

    public String getDescricao(){
        return descricao;

    }

    public void SetDescricao(String descricao){
        this.descricao = descricao;

    }
    
    public int getCargaHoraria(){
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria){
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString(){
        return "Curso{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' + 
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
    
}
