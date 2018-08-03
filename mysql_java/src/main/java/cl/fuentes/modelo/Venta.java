package cl.fuentes.modelo;

import java.util.Date;

public class Venta {
	private int numDocumento;
	private Date fechaDocumento;
	private int codProducto;
	private int cantidad;
	private int codCliente;
	private int totalVenta;
	
	public Venta() {
		
	}
	
	public Venta(int numDocumento, Date fechaDocumento, int codProducto, int cantidad, int codCliente, int totalVenta) {
		super();
		this.numDocumento = numDocumento;
		this.fechaDocumento = fechaDocumento;
		this.codProducto = codProducto;
		this.cantidad = cantidad;
		this.codCliente = codCliente;
		this.totalVenta = totalVenta;
	}

	public int getNumDocumento() {
		return numDocumento;
	}

	public void setNumDocumento(int numDocumento) {
		this.numDocumento = numDocumento;
	}

	public Date getFechaDocumento() {
		return fechaDocumento;
	}

	public void setFechaDocumento(Date fechaDocumento) {
		this.fechaDocumento = fechaDocumento;
	}

	public int getCodProducto() {
		return codProducto;
	}

	public void setCodProducto(int codProducto) {
		this.codProducto = codProducto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public int getCodCliente() {
		return codCliente;
	}

	public void setCodCliente(int codCliente) {
		this.codCliente = codCliente;
	}

	public int getTotalVenta() {
		return totalVenta;
	}

	public void setTotalVenta(int totalVenta) {
		this.totalVenta = totalVenta;
	}


	
	
}
