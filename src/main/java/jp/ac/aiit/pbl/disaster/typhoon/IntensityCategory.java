package jp.ac.aiit.pbl.disaster.typhoon;

import java.util.Arrays;

/**
 * Enumeration for IntensityCategory.
 * @see <a href="https://foreignlang.ecc.co.jp/know/k00046d/">Category</a>
 */
public enum IntensityCategory {
    None(0, "なし"),
    TropicalStorm(1, "強い"),
    SevereTropicalStorm(2, "非常に強い"),
    Typhoon(3, "猛烈な"),
    Others(15,"その他の強さ階級分類");

    private int id;
    private String intensityCategory;

    IntensityCategory(int id, String intensityCategory){
        this.id = id;
        this.intensityCategory = intensityCategory;
    }

    public Integer getId(){
        return id;
    }

    /**
     * Returns the Enumeration at the specified id.
     * ranges from <code>0,1,2,3</code> and <code>15</code>
     *
     * @param     id the index of the IntensityCategory.
     * @return    IntensityCategory.
     */
    public static IntensityCategory getById(int id) {
        return Arrays.stream(IntensityCategory.values())
                .filter(data -> data.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}