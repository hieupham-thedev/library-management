package fa.training.dao;

import fa.training.model.Magazine;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class MagazineDao {

    private List<Magazine> magazines;

    public MagazineDao() {
        magazines = new ArrayList<>();
        Magazine magazine1 = new Magazine("author1", 54, 3, 2007, "Manning", new Date());
        Magazine magazine2 = new Magazine("author2", 34, 3, 2007, "Manning", new Date());
        Magazine magazine3 = new Magazine("author3", 65, 3, 2007, "Manning", new Date());
        magazines.add(magazine1);
        magazines.add(magazine2);
        magazines.add(magazine3);
    }

    public List<Magazine> getMagazines() {
        return magazines;
    }

    public void setMagazines(List<Magazine> magazines) {
        this.magazines = magazines;
    }

    public List<Magazine> getTopTenMagazineByVolume() {
        return magazines.stream().sorted(new Comparator<Magazine>() {
            @Override
            public int compare(Magazine o1, Magazine o2) {
                return o1.getVolume() < o2.getVolume() ? 1 : -1;
            }
        }).limit(10).collect(Collectors.toList());
    }
}
