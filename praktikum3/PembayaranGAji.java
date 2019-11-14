package praktikum3;
public class PembayaranGAji {
    public int hitunggaji(Pegawai peg){
        int uang = peg.gaji();
        if(peg instanceof direktur)
            uang+=((direktur)peg).tunjangan();
        if(peg instanceof Staf)
            uang+=((Staf)peg).Bonus();
        return uang;
    }
    public static void main(String[] args) {
        PembayaranGAji pg = new PembayaranGAji();
        Staf ali = new  Staf();
        direktur tony = new direktur();
        System.out.println("Gaji yang di bayarkan untuk Staf ="+pg.hitunggaji(ali));
        System.out.println("Gaji yang di bayarkan kepada Direktur ="+pg.hitunggaji(tony));
    }
}
