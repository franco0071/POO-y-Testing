package EnumColor;

public enum Color {
    ROJO("#FF0000"),
    VERDE("#00FF00"),
    AZUL("#0000FF");

    private String valorHexadecimal;

    Color(String valorHexadecimal) {
        this.valorHexadecimal = valorHexadecimal;
    }

    public String getValorHexadecimal() {
        return valorHexadecimal;
    }
}
