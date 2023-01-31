import Base.BaseTest;
import Pages.AllPages;
import Utilities.ConfigReader;
import org.testng.annotations.Test;

public class TC002 extends BaseTest {
    /*
    //2. Kullanıcı girişi yapılmadan belirtilen ürünü sepete ekleme
    // Kullanıcı Hepsiburada.com sitesini ziyaret eder.
    //  Kullanıcı, Arama sonucunda ekrana gelen ürün listesinden (veya tek bir sonuç da dönmüş olabilir) ürün seçer.
    // Seçilen ürün için 2 tane farklı satıcıdan ürün seçilip sepete eklenir.
    // Seçilen ürünün doğru olarak eklendiği 'Sepetim' sayfasında doğrulanmalıdır.
     */
    AllPages allPages=new AllPages();
    @Test
    public void test02(){
        allPages.mainPage().go_To_Url(ConfigReader.getProperty("baseURL"));
        allPages.userDashboardPage().searchProduct("iphone");
    }
}
