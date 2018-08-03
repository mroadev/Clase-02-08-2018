package cl.fuentes.querys;

import java.sql.SQLException;

import cl.fuentes.db.Mysqlconn;
import cl.fuentes.modelo.Venta;

public class VentaQuery implements Crud<Venta>{
	
	private Mysqlconn conn;
	
	public VentaQuery(Mysqlconn con) {
		conn = con;
	}
	
	@Override
	public void create(Venta objeto) {
		try{
			String sql = "insert into Venta (fechaDocumento, codProducto, cantidad, codCliente, totalVenta)"
					+ " values (" 
					+ "" + objeto.getFechaDocumento() + ","
					+ "" + objeto.getCodProducto() + ","
					+ "" + objeto.getCantidad() + ","
					+ "" + objeto.getCodCliente() + ","
					+ "" + objeto.getTotalVenta() + ")";

			System.out.println(sql);
			
			conn.ejecutarUpdate(sql);
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public Venta read(String valor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Venta objeto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(String valor) {
		// TODO Auto-generated method stub
		
	}

}
