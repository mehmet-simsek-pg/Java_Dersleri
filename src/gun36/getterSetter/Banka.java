package gun36.getterSetter;

public class Banka {
    private int subeNo;
    private String sube;
    private double bakiye;

    public Banka(int subeNo, String sube, double bakiye) {
        this.subeNo = subeNo;
        this.sube = sube;
        if (bakiye>0)
            this.bakiye = bakiye;
    }


    public int getSubeNo() {
        return subeNo;
    }

    public String getSube() {
        return sube;
    }

    public double getBakiye() {
        return bakiye;
    }


    public void setSubeNo(int subeNo) {
        if (subeNo>0)
            this.subeNo = subeNo;
    }

    public void setSube(String sube) {
        this.sube = sube;
    }


    public void paraYatir(int yatanPara){
        if (yatanPara>0)
            bakiye+=yatanPara;
    }

    public void paraCek(int cekilecekPara){
        if (bakiye >= cekilecekPara)
            bakiye-=cekilecekPara;
    }



    // bankalarda hesap acildiktan sonra bakiye ile böyle bir islem yapilmaz
    /*
    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }
     */
}
