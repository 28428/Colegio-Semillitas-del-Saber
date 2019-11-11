package pe.edu.ss.demoColegio.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="apoderados")
public class Apoderado {

	@Id
	@Column(name="cod_apoderado" , length= 5)
	private String codigo;

	@Column(name="dni" , length=8 , nullable=false)
	private String DNI;
	
	@Column(name="nombre_apoderado" , length=20 , nullable=false)
	private String nombre;
	
	@Column(name="apellido_Paterno" , length=20 , nullable=false)
	private String ApePat;
	
	@Column(name="apellido_Materno" , length=20 , nullable=false)
	private String ApeMat;
	
	@Column(name="edad" , length=2 , nullable=false)
	private Short edad;
	
	@Column(name="direccion" , length=30 , nullable=false)
	private String direccion;
	
	@Column(name="telefono" , length=9 , nullable=false)
	private String telefono;
	
	@Column(name="correo" , length=30 , nullable=false)
	private String correo;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="cod_alumno")
	private Alumno alumno;

	@OneToOne(mappedBy = "apoderado")
	private ComprobantePago comprobantePago;
	
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApePat() {
		return ApePat;
	}

	public void setApePat(String apePat) {
		ApePat = apePat;
	}

	public String getApeMat() {
		return ApeMat;
	}

	public void setApeMat(String apeMat) {
		ApeMat = apeMat;
	}

	public Short getEdad() {
		return edad;
	}

	public void setEdad(Short edad) {
		this.edad = edad;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public Alumno getAlumno() {
		return alumno;
	}

	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}

	public ComprobantePago getComprobantePago() {
		return comprobantePago;
	}

	public void setComprobantePago(ComprobantePago comprobantePago) {
		this.comprobantePago = comprobantePago;
	}
		
}
