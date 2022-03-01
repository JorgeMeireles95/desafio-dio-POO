package br.com.dio.desafio.dominio;

import java.util.*;

public class Dev {

    private String nome;
    private String cpf;
    private String estado;
    private  String cidade;
    private  String pais;




    public Dev(String nome, String cpf, String estado, String cidade, String pais) {

        if(validarcpf(cpf)) {
          throw new IllegalArgumentException("CPF inválido");
        }
            this.nome = nome;
            this.cpf = cpf;
            this.estado = estado;
            this.cidade = cidade;
            this.pais = pais;


    }



    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }



    private Set<Conteudo> conteudosInscritos   = new LinkedHashSet<>();
    private  Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();



        public boolean validarcpf(String cpf) {
            return cpf.length() != 11 || cpf.equals("00000000000")
                    || cpf.equals("11111111111") || cpf.equals("22222222222")
                    || cpf.equals("33333333333") || cpf.equals("44444444444")
                    || cpf.equals("55555555555") || cpf.equals("66666666666")
                    || cpf.equals("77777777777") || cpf.equals("88888888888")
                    || cpf.equals("99999999999");


        }



    public void inscreverBootcamp(Bootcamp bootcamp){
        this.conteudosInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsIncritos().add(this);
    }



    public void progredir(){
       Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
       if(conteudo.isPresent()){
           this.conteudosConcluidos.add(conteudo.get());
           this.conteudosInscritos.remove(conteudo.get());
       }else{
           System.err.println("Você não está matriculado em nenhum conteúdo");
       }
    }



    public double calcularXp(){
        return this.conteudosConcluidos
                .stream()
                .mapToDouble(Conteudo::calcularXp)
                .sum();
    }




    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    @Override
    public String toString() {
        return "Dev{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", estado='" + estado + '\'' +
                ", cidade='" + cidade + '\'' +
                ", pais='" + pais + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
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
