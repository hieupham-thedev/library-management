package fa.training;

import static org.junit.Assert.assertTrue;

import fa.training.model.Magazine;
import fa.training.service.MagazineService;
import org.junit.Test;

import java.util.Date;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void magazineTest()
    {
        Magazine magazine1 = new Magazine("author1", 54, 3, 2007, "Manning", new Date());
        Magazine magazine2 = new Magazine("author2", 34, 3, 2007, "Manning", new Date());
        Magazine magazine3 = new Magazine("author3", 65, 3, 2007, "Manning", new Date());
        Magazine magazine4 = new Magazine("author4", 76, 3, 2007, "Manning", new Date());
        Magazine magazine5 = new Magazine("author5", 56, 3, 2007, "Manning", new Date());
        Magazine magazine6 = new Magazine("author6", 98, 3, 2007, "Manning", new Date());
        Magazine magazine7 = new Magazine("author7", 109, 3, 2007, "Manning", new Date());
        Magazine magazine8 = new Magazine("author8", 43, 3, 2007, "Manning", new Date());
        Magazine magazine9 = new Magazine("author9", 56, 3, 2007, "Manning", new Date());
        Magazine magazine10 = new Magazine("author10", 34, 3, 2007, "Manning", new Date());
        Magazine magazine11 = new Magazine("author11", 23, 3, 2007, "Manning", new Date());
        Magazine magazine12 = new Magazine("author12", 54, 3, 2007, "Manning", new Date());
        Magazine magazine13 = new Magazine("author13", 65, 3, 2007, "Manning", new Date());
        Magazine magazine14 = new Magazine("author14", 76, 3, 2007, "Manning", new Date());
        MagazineService magazineService = new MagazineService();
        magazineService.create(magazine1);
        magazineService.create(magazine2);
        magazineService.create(magazine3);
        magazineService.create(magazine4);
        magazineService.create(magazine5);
        magazineService.create(magazine6);
        magazineService.create(magazine7);
        magazineService.create(magazine8);
        magazineService.create(magazine9);
        magazineService.create(magazine10);
        magazineService.create(magazine11);
        magazineService.create(magazine12);
        magazineService.create(magazine13);
        magazineService.create(magazine14);
        magazineService.getTopTenMagazineByVolume().forEach(magazine -> magazine.display());
    }
}
