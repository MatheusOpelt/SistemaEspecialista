public class PreferenciasUsuario {
    private String tipoLocal;
    private String atividades;
    private String clima;
    private String custo;
    private String localizacao;

    public PreferenciasUsuario(String tipoLocal, String atividades, String clima, String custo, String localizacao) {
        this.tipoLocal = tipoLocal;
        this.atividades = atividades;
        this.clima = clima;
        this.custo = custo;
        this.localizacao = localizacao;
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

    public String getLocalizacao() {
        return localizacao;
    }
}
