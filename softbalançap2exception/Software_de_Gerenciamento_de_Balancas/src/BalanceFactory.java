public class BalanceFactory {
    public static IBalanca<Produto> getBalanca(TipoBalanca tipo) {
        switch (tipo) {
            case TOLEDO_MGV6:
                return new ToledoMGV6(); // Substitua pelo nome da implementação correta
            case FILIZOLA_SMART:
                return new CustomFilizolaSmart(); // Substitua pelo nome da implementação correta
            case URANO_INTEGRA:
                return new UranoIntegra(); // Substitua pelo nome da implementação correta
            default:
                throw new IllegalArgumentException("Tipo de balança desconhecido: " + tipo);
        }
    }
}

