package compras.entidades;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Historial {
    
    private String observacion;
    private String fecha;

    public Historial(String observacion, LocalDateTime fecha) {
        this.observacion = observacion;
        
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String fechaHoraFormateada = fecha.format(formato);
        
        this.fecha = fechaHoraFormateada;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getFecha() {
        return fecha;
    }
}