import Base.BaseTest;
import Pages.AllPages;
import Utilities.ConfigReader;
import org.testng.annotations.Test;

public class TC001 extends BaseTest {
    /*
    //1. Kullanıcı girişi yapılarak sepete ürün eklenmesi
    // Kullanıcı Hepsiburada.com sitesini ziyaret eder.
    // Kullanıcı giriş işlemi yapılır.
    // Yönlendirmeden sonra anasayfada kullanıcı giriş işleminin yapıldığı doğrulanır
    // Kullanıcı, burada satın almak istediği ürün için arama yapacaktır.
    // Kullanıcı, Arama sonucunda ekrana gelen ürün listesinden (veya tek bir sonuç da dönmüş olabilir) ürün seçer.
    // Seçilen ürün için 2 tane farklı satıcıdan ürün seçilip sepete eklenir.
    // Seçilen ürünün doğru olarak eklendiği 'Sepetim' sayfasında doğrulanmalıdır.
     */
    AllPages allPages=new AllPages();
    @Test
    public void test01(){
        allPages.mainPage().go_To_Url(ConfigReader.getProperty("baseURL"));
        allPages.mainPage().hoverOverGirisYapButon();
        allPages.loginPage().loginHepsiBurada(ConfigReader.getProperty("UserMail"),ConfigReader.getProperty("UserPassword"));
        allPages.userDashboardPage().verifyValidLogin("Betül Ç");
        allPages.userDashboardPage().searchProduct("robot süpürge");
    }
/*
Kazanimlar
-Markete karsima cikan bir task'e nasil yaklasmaliyim?
-Calisma hayatimda framework kurulumuna nasil yaklasmaliyim?
-Private Repo kullanimi?
-Collabrate olarak calisma arkadasligi?
-Kac farkli POM dizayni var?
-PageFactory ile method arasinda avantaj-dezavantaj?
-Hangi framework yapisi daha avantajli?
*/
/*
Github'da Beraber Calisma
Repo'dan karsi tarafin proje linkini githubdan kopyala
Kendi intellij projene gir. File-New-Project from version control
Url kismina linki kopyala, adi ayniysa degistir, clone, trust project
Sag ustteki cekice tikla
Test-Java klasorundeki testlere kendi class'ini olustur, bitir
Terminal'i ac
git pull
 */
}
