
import java.util.Scanner;

public class Calistir {
    public static void main(String[] args) throws InterruptedException {
String message="Eğitim kurumumuzun iş başvurusuna hoş geldiniz\n"
        + "İlk olarak matematik öğretmenleri mülakata alınacaktır\n"
        + "Aşağıdaki sorulan soruları sırasıyla cevaplayın\n"
        + "1-)Kaç yaşındasınız ?";
        System.out.println(message);
        Scanner scanner=new Scanner(System.in);
            int yasA=scanner.nextInt();
    MatematikOgretmeni m=new MatematikOgretmeni();
        m.yas(yasA);
String message2="2-)Kaç yıldır eğitim sektöründesiniz ?";
        System.out.println(message2);
        int yilA=scanner.nextInt();
        scanner.nextLine();
        m.egitim_tecrube(yilA);
String message3="3-)Evli veya bekar mısınız ?";
        System.out.println(message3);
        String durum=scanner.nextLine();
        m.medeni_hali(message3);
        System.out.println("**********************************");
Thread.sleep(2000);
        String messageB="Rehberlik danışmanı mülakatı başlamıştır\n"
        + "Aşağıdaki sorulan soruları sırasıyla cevaplayın\n"
        + "1-)En son nereden çalıştınız(özel sektör veya devlet kurumu) ?";  
        System.out.println(messageB);
    RehberlikOgretmeni r =new RehberlikOgretmeni();
       String cevap=scanner.nextLine();
       r.son_calistigi_kurum(cevap);
String messageB2="2-)Kaç yaşındasınız ?";
        System.out.println(messageB2);
        int cevap2=scanner.nextInt();
        r.yas(cevap2);
String messageB3="3-)Kaç yıldır eğitim sektöründesiniz ?";
        System.out.println(messageB3);
        int cevap3=scanner.nextInt();
        scanner.nextLine();
        r.egitim_tecrube(cevap3);
String messageB4="4-)Evli veya bekar mısınız ?";
        System.out.println(messageB4);
        String cevap4=scanner.nextLine();
        r.medeni_hali(cevap4);
        System.out.println("Matematik öğretmeni mülakat sonuçları değerlendiriliyor...");
        Thread.sleep(3000);
            if(yasA<40 && yilA>=3 && durum.equals("bekar")){
                System.out.println("Matematik öğretmeni mülakatı başarıyla tamamladı");
            }
            else {
                System.out.println("Üzgünüz şartları sağlamadığınız için mülakatı geçemediniz");
            }
            
        System.out.println("Rehberlik öğretmeni mülakat sonuçları değerlendiriliyor");
        Thread.sleep(3000);
            if(cevap.equals("devlet kurumu") && cevap2<50 && cevap3>=4 && !cevap4.equals(null)){
               System.out.println("Rehberlik öğretmeni mülakatı başarıyla tamamladı");
            }
             else {
                System.out.println("Üzgünüz şartları sağlamadığınız için mülakatı geçemediniz");
            }
            return;
    }
}
