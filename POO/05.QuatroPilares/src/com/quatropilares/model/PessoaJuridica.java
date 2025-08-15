package com.quatropilares.model;

final public class PessoaJuridica extends Pessoa {

    private String razaoSocial;
    private String nomeFantasia;
    private String CNPJ;


    public PessoaJuridica(String razaoSocial, String nomeFantasia, String CNPJ, String email, String telefone, String endereco) {
        super(email, telefone, endereco);
        this.razaoSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;
        this.CNPJ = CNPJ;
    }


    public String getRazaoSocial() {
        return this.razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getNomeFantasia() {
        return this.nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getCNPJ() {
        return this.CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }



}
