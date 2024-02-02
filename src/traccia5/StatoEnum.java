package traccia5;

public enum StatoEnum {
    INLAVORAZIONE("in lavorazione"),
    CONSEGNATO("consegnato");

    private String descizione;

    StatoEnum(String descizione) {
        this.descizione = descizione;
    }

    public String getDescizione() {
        return descizione;
    }
}
