package pe.edu.upc.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Magnitud")
public class Magnitud { 

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int CodigoMagnitud;

	@Column(name = "NombreMagnitud", nullable = false, length = 47)
	private String NombreMagnitud;

	@Column(name = "EscalaMagnitud", nullable = false, length = 47)
	private String EscalaMagnitud;

	public Magnitud() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Magnitud(int codigoMagnitud, String nombreMagnitud, String escalaMagnitud) {
		super();
		CodigoMagnitud = codigoMagnitud;
		NombreMagnitud = nombreMagnitud;
		EscalaMagnitud = escalaMagnitud;
	}

	public int getCodigoMagnitud() {
		return CodigoMagnitud;
	}

	public void setCodigoMagnitud(int codigoMagnitud) {
		CodigoMagnitud = codigoMagnitud;
	}

	public String getNombreMagnitud() {
		return NombreMagnitud;
	}

	public void setNombreMagnitud(String nombreMagnitud) {
		NombreMagnitud = nombreMagnitud;
	}

	public String getEscalaMagnitud() {
		return EscalaMagnitud;
	}

	public void setEscalaMagnitud(String escalaMagnitud) {
		EscalaMagnitud = escalaMagnitud;
	}

}
