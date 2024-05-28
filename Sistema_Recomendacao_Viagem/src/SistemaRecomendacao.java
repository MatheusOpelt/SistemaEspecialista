import java.util.List;
import java.util.stream.Collectors;

public class SistemaRecomendacao {
    private List<Destino> destinos;

    public SistemaRecomendacao(List<Destino> destinos) {
        this.destinos = destinos;
    }

    public List<Destino> recomendar(PreferenciasUsuario preferencias) {
        List<Destino> recomendacoes = destinos.stream()
                .filter(d -> preferencias.getTipoLocal() == null || preferencias.getTipoLocal().isEmpty() || d.getTipoLocal().equalsIgnoreCase(preferencias.getTipoLocal()))
                .filter(d -> preferencias.getAtividades() == null || preferencias.getAtividades().isEmpty() || d.getAtividades().toLowerCase().contains(preferencias.getAtividades().toLowerCase()))
                .filter(d -> preferencias.getClima() == null || preferencias.getClima().isEmpty() || d.getClima().equalsIgnoreCase(preferencias.getClima()))
                .filter(d -> preferencias.getCusto() == null || preferencias.getCusto().isEmpty() || d.getCusto().equalsIgnoreCase(preferencias.getCusto()))
                .filter(d -> preferencias.getLocalizacao() == null || preferencias.getLocalizacao().isEmpty() ||
                        d.getPais().equalsIgnoreCase(preferencias.getLocalizacao()) ||
                        d.getRegiao().equalsIgnoreCase(preferencias.getLocalizacao()) ||
                        d.getBairro().equalsIgnoreCase(preferencias.getLocalizacao()))
                .collect(Collectors.toList());

        return recomendacoes.stream().limit(5).collect(Collectors.toList());
    }
}

