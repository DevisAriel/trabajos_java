package Tp7part2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmpleadoService {

	private static List<Empleado> empleados = new ArrayList<Empleado>();

	public static Boolean agregar(Empleado empleado) throws EnteroPositivoException {
		try {
			empleado.setLegajo(empleado.getLegajo()); 
		} catch (EnteroPositivoException e) {
			throw e;
		}
        if (empleado.getNombre() != null && empleado.getSueldo() != null 
				&& empleado.getSueldo() > 0) {
			return empleados.add(empleado);
		}
		return Boolean.FALSE;
	}
	// Devuelve el empleado de mayor sueldo
    public static Empleado mayorSueldo() throws CollectionVaciaException, EnteroPositivoException {
		if (empleados.isEmpty()) {
			throw new CollectionVaciaException("No hay empleados.");
		}		
        Empleado mayor = empleados.get(0);

		for (Empleado empleado : empleados){
			if (mayor.getSueldo() <= empleado.getSueldo()) {
				mayor = empleado;
			}
		}
		return mayor;
	}

	//Devuelve el sueldo promedio
	public static Double sueldoPromedio() throws CollectionVaciaException {
		if (empleados.isEmpty()) {
			throw new CollectionVaciaException("No hay empleados.");
		}
        
        Double total = 0.0;
		for (Empleado empleado : empleados) {
			total += empleado.getSueldo();
		}
		return total / empleados.size();
	}

	public static void eliminar(String nombre) throws CollectionVaciaException, NoEncontradoException {
		if (empleados.isEmpty()) {
			throw new CollectionVaciaException("No hay empleados.");
		}
		
        Iterator<Empleado> iterador = empleados.iterator();
        boolean encontrado = false;

		while (iterador.hasNext()) {
			Empleado empl = iterador.next();
			if (empl.getNombre().equalsIgnoreCase(nombre)) {
				iterador.remove();
			}
		}
        if (!encontrado) {
			throw new NoEncontradoException("Empleado no encontrado.");
		}
	}

	public static List<Empleado> getEmpleados() {		
		return empleados;
	}
    public static void setEmpleados(List<Empleado> empleados) {
        EmpleadoService.empleados = empleados;
    }
    @Override
    public String toString() {
        return "EmpleadoService []";
    }

}