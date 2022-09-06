package classroom;

public class Tipo {
	
	public enum tipo {
		DISCIPLINAR(10),FUNDAMENTACION(20),ELECTIVA(30);
		
		Tipo tipo;
		private int codigo;
		
		tipo(int codigo) {
			
			this.codigo = codigo;
		}
	
	}

	public static final Tipo FUNDAMENTACION = null;
	public static final Tipo DISCIPLINAR = null;

}

	
