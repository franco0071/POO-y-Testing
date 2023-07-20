package DiasSemanaEnum;

public enum DiaSemana {

    LUNES("Primer día de la semana"),
    MARTES("Segundo día de la semana"),
    MIERCOLES("Tercer día de la semana"),
    JUEVES("Cuarto día de la semana"),
    VIERNES("Quinto día de la semana"),
    SABADO("Sexto día de la semana"),
    DOMINGO("Séptimo día de la semana");

    private String descripcion;
    private DiaSemana(String descripcion) {
    this.descripcion = descripcion;
}
public String getDescripcion() {
    return descripcion;
}
}