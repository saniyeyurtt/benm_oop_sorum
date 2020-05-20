public class MatematikOgretmeni implements EgitimKurumu{

    @Override
    public int yas(int basvuran_yasi) {
        return basvuran_yasi;
    }

    @Override
    public int egitim_tecrube(int basvuran_tecrubesi) {
        return  basvuran_tecrubesi;
    }

    @Override
    public String medeni_hali(String medeni_hal) {
        return  medeni_hal;
    }
    
}
