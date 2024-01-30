package clarusway.tests;



import dev.failsafe.Timeout;
import org.testng.annotations.Test;

public class C05_TimeOut {
    /*
        - Test için bir timeOut - zaman aşımı değeri belirlemeye yardımcı olur (genellikle milisaniye olarak kullanılır). Test belirtilen zaman aşımı değerinden daha fazlasını alırsa, test başarısız olarak işaretlenir.
        - Yöntemin makul bir süre içinde geri döndüğünden emin olmak için bu zaman aşımını bir performans testi yapmak için kullanabiliriz.
    */
    @Test
    public void test01() {
        System.out.println("Test 01");
    }

    @Test(timeOut = 5000)//6000 ms bekleniliyor ama 5 bin belirlenmş bu yüzden test fail olur ama bu <5000 olursa test geçer

    public void test02() throws InterruptedException {
        Thread.sleep(6000);
        System.out.println("Test 02");
    }

    @Test
    public void test03() {
        System.out.println("Test 03");
    }
}