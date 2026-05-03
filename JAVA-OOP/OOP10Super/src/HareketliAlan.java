public class HareketliAlan {
    private int xNoktasi;
    private int yNoktasi;
    private int zNoktasi;

    public HareketliAlan(){}

    public HareketliAlan(int xNoktasi, int yNoktasi, int zNoktasi){
        this.xNoktasi=xNoktasi;
        this.yNoktasi=yNoktasi;
        this.zNoktasi=zNoktasi;
    }
    public void koordinatlariGetir(){
        System.out.println("X: " + xNoktasi + " Y:" + yNoktasi + " Z:" + zNoktasi);
    }
}
