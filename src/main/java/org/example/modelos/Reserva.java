package org.example.modelos;

import java.time.LocalDate;

public class Reserva {

    private Integer id;
    private Integer idUsusario;
    private Integer idOferta;
    private Double costoTotal;
    private LocalDate fechaReserva;
    private Integer cantidadPersona;

    public Reserva() {
    }

    public Reserva(Integer id, Integer idUsusario, Integer idOferta, Double costoTotal, LocalDate fechaReserva, Integer cantidadPersona) {
        this.id = id;
        this.idUsusario = idUsusario;
        this.idOferta = idOferta;
        this.costoTotal = costoTotal;
        this.fechaReserva = fechaReserva;
        this.cantidadPersona = cantidadPersona;
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "id=" + id +
                ", idUsusario=" + idUsusario +
                ", idOferta=" + idOferta +
                ", costoTotal=" + costoTotal +
                ", fechaReserva=" + fechaReserva +
                ", cantidadPersona=" + cantidadPersona +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdUsusario() {
        return idUsusario;
    }

    public void setIdUsusario(Integer idUsusario) {
        this.idUsusario = idUsusario;
    }

    public Integer getIdOferta() {
        return idOferta;
    }

    public void setIdOferta(Integer idOferta) {
        this.idOferta = idOferta;
    }

    public Double getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(Double costoTotal) {
        this.costoTotal = costoTotal;
    }

    public LocalDate getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(LocalDate fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public Integer getCantidadPersona() {
        return cantidadPersona;
    }

    public void setCantidadPersona(Integer cantidadPersona) {
        this.cantidadPersona = cantidadPersona;
    }
}
