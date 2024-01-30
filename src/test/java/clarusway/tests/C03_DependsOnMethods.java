package clarusway.tests;

import org.testng.annotations.Test;

public class C03_DependsOnMethods {
/*
- İkinci test methodu birinci test methoduna bağımlı olmak istediğinde bu attribute kullanılır.
- Birinci test methodu başarısız olursa, birinci test methodundaki bağımlı method, yani ikinci test methodu çalışmayacaktır.
- Bir parametrede bir method veya birden çok method iletilebilir.
*/



    @Test
    public void loginTest(){
        System.out.println("Login Test");
     //   throw new RuntimeException();//Bu metot fail olursa buna bağlı diğerleri çalışmaz

    }

    @Test (dependsOnMethods ="loginTest")//homepage loginteste bağımlı
    public void homepageTest(){
        System.out.println("Homepage Test");
    }

    @Test(dependsOnMethods = {"homepageTest","loginTest"})
    public void smokeTest(){
        System.out.println("Smoke Test");
    }
    @Test   // bU TEST hiç bir teste bağımlı değildir

    // Alfabetik sıra var i önce çalışır
    public void independentest(){
        System.out.println("independent test");


    }



}
