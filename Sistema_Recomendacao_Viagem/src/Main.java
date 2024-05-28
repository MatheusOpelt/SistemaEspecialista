import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Destino> destinos = carregarDestinos();
        SistemaRecomendacao sistemaRecomendacao = new SistemaRecomendacao(destinos);

        PreferenciasUsuario preferenciasUsuario = capturarPreferenciasUsuario();
        List<Destino> recomendacoes = sistemaRecomendacao.recomendar(preferenciasUsuario);

        exibirRecomendacoes(recomendacoes);
    }

    private static List<Destino> carregarDestinos() {
        List<Destino> destinos = new ArrayList<>();
        destinos.add(new Destino("Porto de Galinhas", "Praia", "natação", "quente", "baixo", "Brasil", "Nordeste", "Porto de Galinhas"));
        destinos.add(new Destino("Campos do Jordão", "Montanha", "trilha", "frio", "médio", "Brasil", "Sudeste", "Campos do Jordão"));
        destinos.add(new Destino("Paris", "Cidade", "museus", "ameno", "alto", "França", "Île-de-France", "Paris"));
        destinos.add(new Destino("Rio de Janeiro", "Praia", "surf", "quente", "alto", "Brasil", "Sudeste", "Copacabana"));
        destinos.add(new Destino("Nova York", "Cidade", "compras", "frio", "alto", "EUA", "Nova York", "Manhattan"));
        destinos.add(new Destino("Florianópolis", "Praia", "natação", "ameno", "médio", "Brasil", "Sul", "Jurere"));
        destinos.add(new Destino("Gramado", "Montanha", "trilha", "frio", "médio", "Brasil", "Sul", "Gramado"));
        destinos.add(new Destino("Tóquio", "Cidade", "museus", "ameno", "alto", "Japão", "Kanto", "Shibuya"));
        destinos.add(new Destino("Sydney", "Praia", "surf", "quente", "alto", "Austrália", "Nova Gales do Sul", "Bondi"));
        destinos.add(new Destino("Bariloche", "Montanha", "esqui", "frio", "médio", "Argentina", "Patagônia", "Cerro Catedral"));
        // Adicione mais destinos conforme necessário
        return destinos;
    }

    private static PreferenciasUsuario capturarPreferenciasUsuario() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual tipo de local você prefere (praia, montanha, cidade, etc.)? ");
        String tipoLocal = scanner.nextLine().trim();

        System.out.print("Quais atividades você pretende realizar (natação, trilha, museus, etc.)? ");
        String atividades = scanner.nextLine().trim();

        System.out.print("Qual clima você prefere (quente, frio, ameno)? ");
        String clima = scanner.nextLine().trim();

        System.out.print("Qual é o seu orçamento para a viagem (baixo, médio, alto, sem limite)? ");
        String custo = scanner.nextLine().trim();

        System.out.print("Você já tem uma localização em mente (opcional)? ");
        String localizacao = scanner.nextLine().trim();

        return new PreferenciasUsuario(tipoLocal, atividades, clima, custo, localizacao);
    }

    private static void exibirRecomendacoes(List<Destino> recomendacoes) {
        if (recomendacoes.isEmpty()) {
            System.out.println("Nenhuma recomendação encontrada com base nas suas preferências.");
        } else {
            System.out.println("Recomendações de destinos:");
            for (Destino destino : recomendacoes) {
                System.out.println(destino);
            }
        }
    }
}
