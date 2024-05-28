public class Destino {
    private String local;
    private String tipoLocal;
    private String atividades;
    private String clima;
    private String custo;
    private String pais;
    private String regiao;
    private String bairro;

    public Destino(String local, String tipoLocal, String atividades, String clima, String custo, String pais, String regiao, String bairro) {
        this.local = local;
        this.tipoLocal = tipoLocal;
        this.atividades = atividades;
        this.clima = clima;
        this.custo = custo;
        this.pais = pais;
        this.regiao = regiao;
        this.bairro = bairro;
    }

    public String getLocal() {
        return local;
    }

    public String getTipoLocal() {
        return tipoLocal;
    }

    public String getAtividades() {
        return atividades;
    }

    public String getClima() {
        return clima;
    }

    public String getCusto() {
        return custo;
    }

    public String getPais() {
        return pais;
    }

    public String getRegiao() {
        return regiao;
    }

    public String getBairro() {
        return bairro;
    }

    @Override
    public String toString() {
        return String.format("Local: %s, Tipo: %s, Atividades: %s, Clima: %s, Custo: %s, País: %s, Região: %s, Bairro: %s",
                local, tipoLocal, atividades, clima, custo, pais, regiao, bairro);
    }
}
