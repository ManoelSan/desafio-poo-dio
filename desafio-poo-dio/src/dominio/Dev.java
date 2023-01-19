package dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    public void iscreverBootcamp (Bootcamp bootcamp){
        this.conteudosInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);

    }
    public void progredir(){
        Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
        if(conteudo.isPresent())
        {
            this.conteudosConcluidos.add(conteudo.get());
            this.conteudosInscritos.remove(conteudo.get());
        }
        else
        {
            System.out.println("Você naão está matriculado em nenhum conteúdo!");
        }
    }

    public double calcularTotalXp(){
        return this.conteudosConcluidos
        .stream()
        .mapToDouble(Conteudo::calcularXp)
        .sum();
    }

    public String getNome()
    {
        return nome;
    }

    public void SetNome(String nome){
        this.nome = nome;
    }

    public Set<Conteudo> getconteudosInscritos()
    {
        return conteudosInscritos;
    }

    public void SetconteudosInscritos(Set<Conteudo> conteudosInscritos)
    {
        this.conteudosInscritos = conteudosInscritos;
    }

    public Set<Conteudo> getconteudosConcluidos()
    {
        return conteudosConcluidos;
    }

    public void setconteudosConcluidos(Set<Conteudo> conteudosConcluidos)
    {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    @Override
    public boolean equals(Objects o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudosInscritos, dev.conteudosInscritos) && Objects.equals(conteudosConcluidos, dev.conteudosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosInscritos, conteudosConcluidos);
    }
}
