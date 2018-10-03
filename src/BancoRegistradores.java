
public class BancoRegistradores {
    private String mbr;
    private String ir;
    private int pc;
    private int mar;
    private int acc;

    public String getMbr() {
        return mbr;
    }

    public void setMbr(String mbr) {
        this.mbr = mbr;
    }

    public String getIr() {
        return ir;
    }

    public void setIr(String ir) {
        this.ir = ir;
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

    public int getAcc() {
        return acc;
    }

    public void setAcc(int acc) {
        this.acc = acc;
    }

    @Override
    public String toString() {
        return "BancoRegistradores{" + "mbr=" + mbr + ", ir=" + ir + ", pc=" + pc + ", mar=" + mar + ", acc=" + acc + '}';
    }

    
    
    
}
