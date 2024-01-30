package clarusway.tests;

import org.testng.annotations.*;

/*
    @BeforeSuite-@AfterSuite : Bu paketteki tüm testlerden önce/sonra çalışır.Sadece bir kere çalışır.
    @BeforeTest-@AfterTest :Tüm test methodlarından önce/sonra çalışır.Sadece bir kere çalışır.
    @BeforeClass-@AfterClass : Bir test sınıfındaki tüm test yöntemlerinden önce/sonra çalışır.Sadece bir kere çalışır.
    @BeforeGroups-@AfterGroups :Herhangi belirli test grubundan önce/sonra çalışır.Sadece bir kere çalışır.
    @BeforeMethod-@AfterMethod :Her test methodundan önce/sonra çalışır
 */

/*
   Create a class.
   Create 3 test methods.
   Use TestNG annotations that can be used in the class.
   Interpret output in console.
*/
public class C01_Annotations {

@BeforeSuite
public void beforesuit(){
    System.out.println("beforesuit");


}

@AfterSuite
public void aftersuite(){

    System.out.println("aftersuit");
}
@BeforeTest

  public void beforetest(){
    System.out.println( "beforetest");
}

@AfterTest

public void aftertest(){

    System.out.println( "aftertest");
}

@BeforeMethod
    public void beforemethod(){

    System.out.println("beforemethod");
}
    @Test

    public void test1(){

        System.out.println("test1");


    }
 @Test

    public void test2(){


     System.out.println("test2");

    }
 @Test

    public void test3(){

     System.out.println("test3");


    }



}
