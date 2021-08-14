package fa.training.view;

import fa.training.model.Magazine;

import java.util.List;

public class TopTenMagazinesbyVolumPage {
    private List<Magazine> magazines;

    public TopTenMagazinesbyVolumPage(List<Magazine> magazines) {
        this.magazines = magazines;
    }

    public void display() {
        System.out.println("====== 5. Display top 10 of magazines by volume ======");
        System.out.println("- Magazine list:");
        magazines.forEach(magazine -> magazine.display());
    }
}
