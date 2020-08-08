package jp.ac.aiit.pbl.disaster.typhoon;

import java.util.Arrays;

/**
 * Enumeration for ScaleCategory.
 */
public enum ScaleCategory {
    None(0, "なし"),
    LargeScale(1, "大型"),
    SuperScale(2, "超大型"),
    Others(15,"その他の大きさ階級分類");

    private int id;
    private String scaleCategory;

    ScaleCategory(int id, String scaleCategory){
        this.id = id;
        this.scaleCategory = scaleCategory;
    }

    public Integer getId(){
        return id;
    }

    /**
     * Returns the Enumeration at the specified id.
     * ranges from <code>0,1,2</code> and <code>15</code>
     *
     * @param     id the index of the ScaleCategory.
     * @return    ScaleCategory.
     */
    public static ScaleCategory getById(int id) {
        return Arrays.stream(ScaleCategory.values())
                .filter(data -> data.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}
