package abstract2;

import java.util.ArrayList;
import java.util.List;

public class Town {
    private List<Citizien> citizien;


    public List<Citizien> getCitizien() {
        return citizien;
    }

    public void setCitizien(List<Citizien> citizien) {
        this.citizien = citizien;
    }

    public long howManyCanVote(){
      return  citizien.stream().filter(Citizien::canVote).count();
    }

    public void whoCanVote(){
        citizien.stream().filter(Citizien::canVote).forEach(c-> System.out.println(c.getName()));
    }

}
