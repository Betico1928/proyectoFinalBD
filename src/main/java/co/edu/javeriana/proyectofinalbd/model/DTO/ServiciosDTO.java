package co.edu.javeriana.proyectofinalbd.model.DTO;

import java.util.Objects;

public class ServiciosDTO
{
    private int codigo_servicios;

    private double costo_asociado;

    private String tipo_servicio;

    private int reserva_ID;

    private int hotel_hotel_id;


    // Constructor
    public ServiciosDTO(int codigo_servicios, double costo_asociado, String tipo_servicio, int reserva_ID, int hotel_hotel_id)
    {
        this.codigo_servicios = codigo_servicios;
        this.costo_asociado = costo_asociado;
        this.tipo_servicio = tipo_servicio;
        this.reserva_ID = reserva_ID;
        this.hotel_hotel_id = hotel_hotel_id;
    }

    // Set y Get

    public int getCodigo_servicios()
    {
        return codigo_servicios;
    }
    public void setCodigo_servicios(int codigo_servicios)
    {
        this.codigo_servicios = codigo_servicios;
    }

    public double getCosto_asociado()
    {
        return costo_asociado;
    }
    public void setCosto_asociado(double costo_asociado)
    {
        this.costo_asociado = costo_asociado;
    }

    public String getTipo_servicio()
    {
        return tipo_servicio;
    }
    public void setTipo_servicio(String tipo_servicio)
    {
        this.tipo_servicio = tipo_servicio;
    }

    public int getReserva_ID()
    {
        return reserva_ID;
    }
    public void setReserva_ID(int reserva_ID)
    {
        this.reserva_ID = reserva_ID;
    }

    public int getHotel_hotel_id()
    {
        return hotel_hotel_id;
    }
    public void setHotel_hotel_id(int hotel_hotel_id)
    {
        this.hotel_hotel_id = hotel_hotel_id;
    }

    // hashCode y equals
    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (!(o instanceof ServiciosDTO)) return false;
        ServiciosDTO that = (ServiciosDTO) o;
        return getCodigo_servicios() == that.getCodigo_servicios() && Double.compare(that.getCosto_asociado(), getCosto_asociado()) == 0 && getReserva_ID() == that.getReserva_ID() && getHotel_hotel_id() == that.getHotel_hotel_id() && getTipo_servicio().equals(that.getTipo_servicio());
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(getCodigo_servicios(), getCosto_asociado(), getTipo_servicio(), getReserva_ID(), getHotel_hotel_id());
    }


    // toString
    @Override
    public String toString() {
        return "ServiciosDTO{" +
                "codigo_servicios=" + codigo_servicios +
                ", costo_asociado=" + costo_asociado +
                ", tipo_servicio='" + tipo_servicio + '\'' +
                ", reserva_ID=" + reserva_ID +
                ", hotel_hotel_id=" + hotel_hotel_id +
                '}';
    }
}
