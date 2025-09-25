package OrientacionObjetos1.ejercicio3_Presupuesto;

public class Item {
	private Double precioUnitario;
	private String detalle;
	private Integer cantidad;
	
	public Item(String detalle, Integer cantidad, Double precioUnitario) {
		this.detalle = detalle;
		this.precioUnitario = precioUnitario;
		this.cantidad = cantidad;
	}

	public Double getCostoUnitario() {
		return this.precioUnitario;
	}

	public void setPrecioUnitario(Double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	
	public Double costo() {
		return this.getCostoUnitario() * this.getCantidad();
	}
}
