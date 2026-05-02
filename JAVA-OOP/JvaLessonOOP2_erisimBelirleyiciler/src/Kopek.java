public class Kopek extends Hayvan {
    public void havla() {
        sesCikar(); // ✅ Protected olduğu için erişilebilir (kalıtım sayesinde)
        System.out.println("Köpek havladı!");
    }
}
