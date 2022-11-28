package Datos;


public class Encargado {

	private int id_encargado;
	private String nombre;

	public Encargado(int id_encargado, String nombre) {
		super();
		this.id_encargado = id_encargado;
		this.nombre = nombre;
	}

	public int getId_encargado() {
		return id_encargado;
	}

	public void setId_encargado(int id_encargado) {
		this.id_encargado = id_encargado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Venta cargarVentas(Cafe cafe) {
		
		int cantidad;
		
		cantidad=(int)(Math.random()*3+1);
	
		
		Venta ventanueva = new Venta(01,cafe,cantidad,true);
		
		
		System.out.println("Tipo de cafe: " + cafe.getTipo_cafe() + "\nCantidad: " + cantidad 
				+ "\nPrecio: " + cafe.getPrecio() + "\n");
		
		return ventanueva;

		
		
	}

}
