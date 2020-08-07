package jp.ac.aiit.pbl.disaster.typhoon;

import java.util.Arrays;

/**
 * Enumeration for TypeOfReferenceTime.
 */
public enum TypeOfReferenceTime {
    Live(1, "実況"),
    Estimate(2, "推定"),
    Forecast(3, "予報");

    private int id;
    private String typeOfReference;

    TypeOfReferenceTime(int id, String typeOfReference){
        this.id = id;
        this.typeOfReference = typeOfReference;
    }

    public Integer getId(){
        return id;
    }

    /**
     * Returns the Enumeration at the specified id.
     * ranges from <code>1</code> to <code>3</code>
     *
     * @param     id the index of the ReferenceTime.
     * @return    typeOfReferenceTime.
     */
    public static TypeOfReferenceTime getById(int id) {
        return Arrays.stream(TypeOfReferenceTime.values())
                .filter(data -> data.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}
