package CartaGenerico;

public class Carta<Valor extends Enum<Valor>, Palo extends Enum<Palo>> {
    private Valor valor;
    private Palo palo;

    public Carta(Valor valor, Palo palo) {
        this.valor = valor;
        this.palo = palo;
    }

    public Valor getValor() {
        return valor;
    }

    public Palo getPalo() {
        return palo;
    }

    @Override
    public String toString() {
        return valor + " de " + palo;
    }
}
