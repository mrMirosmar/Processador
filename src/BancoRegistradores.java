public class BancoRegistradores {

    private int acc;
    private int pc;
    private int mar;
    private String ir;
    private String mbr;

    public BancoRegistradores() {
        mar = pc;
    }

    @Override
    public String toString() {
        return "BancoRegistradores{" + "acc=" + acc + ", pc=" + pc + ", mar=" + mar + ", ir=" + ir + ", mbr=" + mbr + '}';
    }

    public int getAcc() {
        return acc;
    }

    public void setAcc(int acc) {
        this.acc = acc;
    }

    public int getPc() {
        return pc;
    }

    public void setPc(int pc) {
        this.pc = pc;
    }

    public int getMar() {
        return mar;
    }

    public void setMar(int mar) {
        this.mar = mar;
    }

    public String getIr() {
        return ir;
    }

    public void setIr(String ir) {
        this.ir = ir;
    }

    public String getMbr() {
        return mbr;
    }

    public void setMbr(String mbr) {
        this.mbr = mbr;
    }

}