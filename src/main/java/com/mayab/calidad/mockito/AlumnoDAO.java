package com.mayab.calidad.mockito;

public interface AlumnoDAO {
	public String addAlumno(Alumno alumno);
	public String removeAlumno(Alumno alumno);
	public String updatePromedio(Alumno alumno);
	public boolean getAll();
}
