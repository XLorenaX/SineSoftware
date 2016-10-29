package br.edu.ifpb.cg.info.sine.Classes;

public class Sine {
    private String codPost;
    private String nome;
    private String entidadeConveniada;
    private String endereco;
    private String bairro;
    private String cep;
    private String telefone;
    private String municipio;
    private String uf;
    private String lat;
    private String lon;

    public Sine() {
    }

    public String getCodPost() {
        return codPost;
    }

    public void setCodPost(String codPost) {
        this.codPost = codPost;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEntidadeConveniada() {
        return entidadeConveniada;
    }

    public void setEntidadeConveniada(String entidadeConveniada) {
        this.entidadeConveniada = entidadeConveniada;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Sine sine = (Sine) o;

        if (codPost != null ? !codPost.equals(sine.codPost) : sine.codPost != null) return false;
        if (nome != null ? !nome.equals(sine.nome) : sine.nome != null) return false;
        if (entidadeConveniada != null ? !entidadeConveniada.equals(sine.entidadeConveniada) : sine.entidadeConveniada != null)
            return false;
        if (endereco != null ? !endereco.equals(sine.endereco) : sine.endereco != null)
            return false;
        if (bairro != null ? !bairro.equals(sine.bairro) : sine.bairro != null) return false;
        if (cep != null ? !cep.equals(sine.cep) : sine.cep != null) return false;
        if (telefone != null ? !telefone.equals(sine.telefone) : sine.telefone != null)
            return false;
        if (municipio != null ? !municipio.equals(sine.municipio) : sine.municipio != null)
            return false;
        if (uf != null ? !uf.equals(sine.uf) : sine.uf != null) return false;
        if (lat != null ? !lat.equals(sine.lat) : sine.lat != null) return false;
        return lon != null ? lon.equals(sine.lon) : sine.lon == null;

    }

    @Override
    public int hashCode() {
        int result = codPost != null ? codPost.hashCode() : 0;
        result = 31 * result + (nome != null ? nome.hashCode() : 0);
        result = 31 * result + (entidadeConveniada != null ? entidadeConveniada.hashCode() : 0);
        result = 31 * result + (endereco != null ? endereco.hashCode() : 0);
        result = 31 * result + (bairro != null ? bairro.hashCode() : 0);
        result = 31 * result + (cep != null ? cep.hashCode() : 0);
        result = 31 * result + (telefone != null ? telefone.hashCode() : 0);
        result = 31 * result + (municipio != null ? municipio.hashCode() : 0);
        result = 31 * result + (uf != null ? uf.hashCode() : 0);
        result = 31 * result + (lat != null ? lat.hashCode() : 0);
        result = 31 * result + (lon != null ? lon.hashCode() : 0);
        return result;
    }
}
