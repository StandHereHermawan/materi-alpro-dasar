package ariefbelajardikampus.materialprodasar.uas.task3.builder;

import ariefbelajardikampus.materialprodasar.uas.task3.entity.JamLembur;

public class JamLemburBuilder {

    private Integer jam;

    public JamLemburBuilder setJam(Integer jam){
        this.jam = jam;
        return this;
    }

    public JamLembur build(){
        return new JamLembur(jam);
    }
}
