package fa.training.service;

import fa.training.dao.MagazineDao;
import fa.training.model.Magazine;

import java.util.List;

public class MagazineService {

    private MagazineDao magazineDao;

    public MagazineService() {
        this.magazineDao = new MagazineDao();
    }

    public void create(Magazine magazine) {
        magazineDao.getMagazines().add(magazine);
    }

    public List<Magazine> getTopTenMagazineByVolume(){
        return magazineDao.getTopTenMagazineByVolume();
    }

    public List<Magazine> readAll() {
        return magazineDao.getMagazines();
    }
}
