
public class UnidadeControle extends BancoRegistradores{

    private BancoRegistradores br;

    public UnidadeControle() {
        br = new BancoRegistradores();
    }

    public String buscar(String[] memoria) {
        br.setMar(br.getPc());
        br.setPc(br.getPc() + 1);
        br.setMbr(memoria[br.getMar()]);
        br.setIr(br.getMbr());
        return br.getIr();
    }

}
