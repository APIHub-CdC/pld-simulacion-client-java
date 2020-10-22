package io.pld.simulacion.mx.client.model;

import java.math.BigDecimal;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

public class Persona {
	@SerializedName("porcentaje")
	private Integer porcentaje = null;
	@SerializedName("nombre")
	private String nombre = null;
	@SerializedName("apellidoPaterno")
	private String apellidoPaterno = null;
	@SerializedName("apellidoMaterno")
	private String apellidoMaterno = null;
	@SerializedName("RFC")
	private String RFC = null;
	@SerializedName("CURP")
	private String CURP = null;
	@SerializedName("fechaNacimiento")
	private String fechaNacimiento = null;
	@SerializedName("lista")
	private String lista = null;
	@SerializedName("estatus")
	private String estatus = null;
	@SerializedName("dependencia")
	private String dependencia = null;
	@SerializedName("puesto")
	private String puesto = null;
	@SerializedName("dispocisionesId")
	private String dispocisionesId = null;
	@SerializedName("CURPOk")
	private Integer cuRPOk = null;
	@SerializedName("parentescoId")
	private String parentescoId = null;
	@SerializedName("parentesco")
	private String parentesco = null;
	@SerializedName("razonSocial")
	private String razonSocial = null;
	@SerializedName("RFCMoral")
	private String rfCMoral = null;
	@SerializedName("ISSSTE")
	private String ISSSTE = null;
	@SerializedName("IMSS")
	private String IMSS = null;
	@SerializedName("ingresos")
	private BigDecimal ingresos = null;
	@SerializedName("nombreCompleto")
	private String nombreCompleto = null;
	@SerializedName("apellidos")
	private String apellidos = null;
	@SerializedName("entidad")
	private String entidad = null;
	@SerializedName("sexo")
	private String sexo = null;
	@SerializedName("area")
	private String area = null;
	@SerializedName("periodo")
	private String periodo = null;
	@SerializedName("expediente")
	private String expediente = null;
	@SerializedName("causaIrregularidad")
	private String causaIrregularidad = null;
	@SerializedName("fechaCargoInicio")
	private String fechaCargoInicio = null;
	@SerializedName("fechaCargoFin")
	private String fechaCargoFin = null;
	@SerializedName("duracion")
	private String duracion = null;
	@SerializedName("monto")
	private BigDecimal monto = null;
	@SerializedName("autoridadSancion")
	private String autoridadSancion = null;
	@SerializedName("tipoPersona")
	private String tipoPersona = null;

	public Persona porcentaje(Integer porcentaje) {
		this.porcentaje = porcentaje;
		return this;
	}

	@ApiModelProperty(example = "98", value = "Nivel de coincidencia entre los parámetros de entrada y los resultados obtenidos.")
	public Integer getPorcentaje() {
		return porcentaje;
	}

	public void setPorcentaje(Integer porcentaje) {
		this.porcentaje = porcentaje;
	}

	public Persona nombre(String nombre) {
		this.nombre = nombre;
		return this;
	}

	@ApiModelProperty(example = "JAVIER", value = "Nombre(s) de la persona.")
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Persona apellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
		return this;
	}

	@ApiModelProperty(example = "PRUEBA", value = "Apellido paterno de la persona.")
	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public Persona apellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
		return this;
	}

	@ApiModelProperty(example = "CUATRO", value = "Apellido materno de la persona.")
	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public Persona RFC(String RFC) {
		this.RFC = RFC;
		return this;
	}

	@ApiModelProperty(example = "SAZR010101Q23", value = "RFC con homoclave de la persona.")
	public String getRFC() {
		return RFC;
	}

	public void setRFC(String RFC) {
		this.RFC = RFC;
	}

	public Persona CURP(String CURP) {
		this.CURP = CURP;
		return this;
	}

	@ApiModelProperty(example = "SAZR010101HCMLNS09", value = "CURP de la persona, emitida por RENAPO.")
	public String getCURP() {
		return CURP;
	}

	public void setCURP(String CURP) {
		this.CURP = CURP;
	}

	public Persona fechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
		return this;
	}

	@ApiModelProperty(example = "2001-01-01", value = "Fecha de nacimiento de la persona (formato por defecto yyyy-MM-dd).")
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Persona lista(String lista) {
		this.lista = lista;
		return this;
	}

	@ApiModelProperty(example = "SAT69", value = "Lista en la que se encuentra.")
	public String getLista() {
		return lista;
	}

	public void setLista(String lista) {
		this.lista = lista;
	}

	public Persona estatus(String estatus) {
		this.estatus = estatus;
		return this;
	}

	@ApiModelProperty(example = "ACTIVO", value = "Información adicional del registro.")
	public String getEstatus() {
		return estatus;
	}

	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}

	public Persona dependencia(String dependencia) {
		this.dependencia = dependencia;
		return this;
	}

	@ApiModelProperty(example = "CAMARA DE SENADORES", value = "Dependencia en la que labora o laboró.")
	public String getDependencia() {
		return dependencia;
	}

	public void setDependencia(String dependencia) {
		this.dependencia = dependencia;
	}

	public Persona puesto(String puesto) {
		this.puesto = puesto;
		return this;
	}

	@ApiModelProperty(example = "SENADOR", value = "Cargo que desempeña o desempeñó el sancionado.")
	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public Persona dispocisionesId(String dispocisionesId) {
		this.dispocisionesId = dispocisionesId;
		return this;
	}

	@ApiModelProperty(example = "532", value = "Referencia a disposiciones de la SHCP. Solo se utiliza en la lista PEP.")
	public String getDispocisionesId() {
		return dispocisionesId;
	}

	public void setDispocisionesId(String dispocisionesId) {
		this.dispocisionesId = dispocisionesId;
	}

	public Persona cuRPOk(Integer cuRPOk) {
		this.cuRPOk = cuRPOk;
		return this;
	}

	@ApiModelProperty(example = "1", value = "Estatus CURP validada (0-No, 1-Si).")
	public Integer getCuRPOk() {
		return cuRPOk;
	}

	public void setCuRPOk(Integer cuRPOk) {
		this.cuRPOk = cuRPOk;
	}

	public Persona parentescoId(String parentescoId) {
		this.parentescoId = parentescoId;
		return this;
	}

	@ApiModelProperty(value = "Número de identificación con el que esta persona tiene parentesco.")
	public String getParentescoId() {
		return parentescoId;
	}

	public void setParentescoId(String parentescoId) {
		this.parentescoId = parentescoId;
	}

	public Persona parentesco(String parentesco) {
		this.parentesco = parentesco;
		return this;
	}

	@ApiModelProperty(value = "Tipo de parentesco con la persona relacionada.")
	public String getParentesco() {
		return parentesco;
	}

	public void setParentesco(String parentesco) {
		this.parentesco = parentesco;
	}

	public Persona razonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
		return this;
	}

	@ApiModelProperty(example = "MORAL", value = "Razón social (física o moral).")
	public String getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public Persona rfCMoral(String rfCMoral) {
		this.rfCMoral = rfCMoral;
		return this;
	}

	@ApiModelProperty(example = "REA010101S28", value = "RFC en caso de ser persona moral.")
	public String getRfCMoral() {
		return rfCMoral;
	}

	public void setRfCMoral(String rfCMoral) {
		this.rfCMoral = rfCMoral;
	}

	public Persona ISSSTE(String ISSSTE) {
		this.ISSSTE = ISSSTE;
		return this;
	}

	@ApiModelProperty(value = "Número de Seguridad Social asignado por el ISSSTE.")
	public String getISSSTE() {
		return ISSSTE;
	}

	public void setISSSTE(String ISSSTE) {
		this.ISSSTE = ISSSTE;
	}

	public Persona IMSS(String IMSS) {
		this.IMSS = IMSS;
		return this;
	}

	@ApiModelProperty(value = "Número de Seguridad Social asignado por el IMSS.")
	public String getIMSS() {
		return IMSS;
	}

	public void setIMSS(String IMSS) {
		this.IMSS = IMSS;
	}

	public Persona ingresos(BigDecimal ingresos) {
		this.ingresos = ingresos;
		return this;
	}

	@ApiModelProperty(example = "107283.76", value = "Ingreso reportado por la dependencia en la que labora.")
	public BigDecimal getIngresos() {
		return ingresos;
	}

	public void setIngresos(BigDecimal ingresos) {
		this.ingresos = ingresos;
	}

	public Persona nombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
		return this;
	}

	@ApiModelProperty(example = "JAVIER PRUEBA CUATRO", value = "Nombre completo de la persona.")
	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public Persona apellidos(String apellidos) {
		this.apellidos = apellidos;
		return this;
	}

	@ApiModelProperty(example = "PRUEBA CUATRO", value = "Apellidos (materno y paterno) de la persona.")
	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public Persona entidad(String entidad) {
		this.entidad = entidad;
		return this;
	}

	@ApiModelProperty(example = "HIDALGO", value = "Entidad federativa donde se ubica la dependencia.")
	public String getEntidad() {
		return entidad;
	}

	public void setEntidad(String entidad) {
		this.entidad = entidad;
	}

	public Persona sexo(String sexo) {
		this.sexo = sexo;
		return this;
	}

	@ApiModelProperty(example = "MASCULINO", value = "Sexo de la persona.")
	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Persona area(String area) {
		this.area = area;
		return this;
	}

	@ApiModelProperty(example = "GUBERNATURA", value = "Área en la que labora la persona.")
	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public Persona periodo(String periodo) {
		this.periodo = periodo;
		return this;
	}

	@ApiModelProperty(value = "Periodo en el que desempeñó funciones.")
	public String getPeriodo() {
		return periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	public Persona expediente(String expediente) {
		this.expediente = expediente;
		return this;
	}

	@ApiModelProperty(value = "")
	public String getExpediente() {
		return expediente;
	}

	public void setExpediente(String expediente) {
		this.expediente = expediente;
	}

	public Persona causaIrregularidad(String causaIrregularidad) {
		this.causaIrregularidad = causaIrregularidad;
		return this;
	}

	@ApiModelProperty(value = "Motivo de la sanción al funcionario.")
	public String getCausaIrregularidad() {
		return causaIrregularidad;
	}

	public void setCausaIrregularidad(String causaIrregularidad) {
		this.causaIrregularidad = causaIrregularidad;
	}

	public Persona fechaCargoInicio(String fechaCargoInicio) {
		this.fechaCargoInicio = fechaCargoInicio;
		return this;
	}

	@ApiModelProperty(example = "2001-01-01", value = "Fecha en que la persona inició labores en el cargo (formato por defecto yyyy-MM-dd).")
	public String getFechaCargoInicio() {
		return fechaCargoInicio;
	}

	public void setFechaCargoInicio(String fechaCargoInicio) {
		this.fechaCargoInicio = fechaCargoInicio;
	}

	public Persona fechaCargoFin(String fechaCargoFin) {
		this.fechaCargoFin = fechaCargoFin;
		return this;
	}

	@ApiModelProperty(example = "2010-01-01", value = "Fecha en que la persona terminó labores en el cargo (formato por defecto yyyy-MM-dd).")
	public String getFechaCargoFin() {
		return fechaCargoFin;
	}

	public void setFechaCargoFin(String fechaCargoFin) {
		this.fechaCargoFin = fechaCargoFin;
	}

	public Persona duracion(String duracion) {
		this.duracion = duracion;
		return this;
	}

	@ApiModelProperty(value = "Tiempo que se determinó como sanción.")
	public String getDuracion() {
		return duracion;
	}

	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}

	public Persona monto(BigDecimal monto) {
		this.monto = monto;
		return this;
	}

	@ApiModelProperty(value = "Monto de la sanción.")
	public BigDecimal getMonto() {
		return monto;
	}

	public void setMonto(BigDecimal monto) {
		this.monto = monto;
	}

	public Persona autoridadSancion(String autoridadSancion) {
		this.autoridadSancion = autoridadSancion;
		return this;
	}

	@ApiModelProperty(value = "Órgano que dicta la sanción.")
	public String getAutoridadSancion() {
		return autoridadSancion;
	}

	public void setAutoridadSancion(String autoridadSancion) {
		this.autoridadSancion = autoridadSancion;
	}

	public Persona tipoPersona(String tipoPersona) {
		this.tipoPersona = tipoPersona;
		return this;
	}

	@ApiModelProperty(example = "PF", value = "Tipo de persona (física o moral).")
	public String getTipoPersona() {
		return tipoPersona;
	}

	public void setTipoPersona(String tipoPersona) {
		this.tipoPersona = tipoPersona;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Persona persona = (Persona) o;
		return Objects.equals(this.porcentaje, persona.porcentaje) && Objects.equals(this.nombre, persona.nombre)
				&& Objects.equals(this.apellidoPaterno, persona.apellidoPaterno)
				&& Objects.equals(this.apellidoMaterno, persona.apellidoMaterno)
				&& Objects.equals(this.RFC, persona.RFC) && Objects.equals(this.CURP, persona.CURP)
				&& Objects.equals(this.fechaNacimiento, persona.fechaNacimiento)
				&& Objects.equals(this.lista, persona.lista) && Objects.equals(this.estatus, persona.estatus)
				&& Objects.equals(this.dependencia, persona.dependencia) && Objects.equals(this.puesto, persona.puesto)
				&& Objects.equals(this.dispocisionesId, persona.dispocisionesId)
				&& Objects.equals(this.cuRPOk, persona.cuRPOk)
				&& Objects.equals(this.parentescoId, persona.parentescoId)
				&& Objects.equals(this.parentesco, persona.parentesco)
				&& Objects.equals(this.razonSocial, persona.razonSocial)
				&& Objects.equals(this.rfCMoral, persona.rfCMoral) && Objects.equals(this.ISSSTE, persona.ISSSTE)
				&& Objects.equals(this.IMSS, persona.IMSS) && Objects.equals(this.ingresos, persona.ingresos)
				&& Objects.equals(this.nombreCompleto, persona.nombreCompleto)
				&& Objects.equals(this.apellidos, persona.apellidos) && Objects.equals(this.entidad, persona.entidad)
				&& Objects.equals(this.sexo, persona.sexo) && Objects.equals(this.area, persona.area)
				&& Objects.equals(this.periodo, persona.periodo) && Objects.equals(this.expediente, persona.expediente)
				&& Objects.equals(this.causaIrregularidad, persona.causaIrregularidad)
				&& Objects.equals(this.fechaCargoInicio, persona.fechaCargoInicio)
				&& Objects.equals(this.fechaCargoFin, persona.fechaCargoFin)
				&& Objects.equals(this.duracion, persona.duracion) && Objects.equals(this.monto, persona.monto)
				&& Objects.equals(this.autoridadSancion, persona.autoridadSancion)
				&& Objects.equals(this.tipoPersona, persona.tipoPersona);
	}

	@Override
	public int hashCode() {
		return Objects.hash(porcentaje, nombre, apellidoPaterno, apellidoMaterno, RFC, CURP, fechaNacimiento, lista,
				estatus, dependencia, puesto, dispocisionesId, cuRPOk, parentescoId, parentesco, razonSocial, rfCMoral,
				ISSSTE, IMSS, ingresos, nombreCompleto, apellidos, entidad, sexo, area, periodo, expediente,
				causaIrregularidad, fechaCargoInicio, fechaCargoFin, duracion, monto, autoridadSancion, tipoPersona);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Persona {\n");

		sb.append("    porcentaje: ").append(toIndentedString(porcentaje)).append("\n");
		sb.append("    nombre: ").append(toIndentedString(nombre)).append("\n");
		sb.append("    apellidoPaterno: ").append(toIndentedString(apellidoPaterno)).append("\n");
		sb.append("    apellidoMaterno: ").append(toIndentedString(apellidoMaterno)).append("\n");
		sb.append("    RFC: ").append(toIndentedString(RFC)).append("\n");
		sb.append("    CURP: ").append(toIndentedString(CURP)).append("\n");
		sb.append("    fechaNacimiento: ").append(toIndentedString(fechaNacimiento)).append("\n");
		sb.append("    lista: ").append(toIndentedString(lista)).append("\n");
		sb.append("    estatus: ").append(toIndentedString(estatus)).append("\n");
		sb.append("    dependencia: ").append(toIndentedString(dependencia)).append("\n");
		sb.append("    puesto: ").append(toIndentedString(puesto)).append("\n");
		sb.append("    dispocisionesId: ").append(toIndentedString(dispocisionesId)).append("\n");
		sb.append("    cuRPOk: ").append(toIndentedString(cuRPOk)).append("\n");
		sb.append("    parentescoId: ").append(toIndentedString(parentescoId)).append("\n");
		sb.append("    parentesco: ").append(toIndentedString(parentesco)).append("\n");
		sb.append("    razonSocial: ").append(toIndentedString(razonSocial)).append("\n");
		sb.append("    rfCMoral: ").append(toIndentedString(rfCMoral)).append("\n");
		sb.append("    ISSSTE: ").append(toIndentedString(ISSSTE)).append("\n");
		sb.append("    IMSS: ").append(toIndentedString(IMSS)).append("\n");
		sb.append("    ingresos: ").append(toIndentedString(ingresos)).append("\n");
		sb.append("    nombreCompleto: ").append(toIndentedString(nombreCompleto)).append("\n");
		sb.append("    apellidos: ").append(toIndentedString(apellidos)).append("\n");
		sb.append("    entidad: ").append(toIndentedString(entidad)).append("\n");
		sb.append("    sexo: ").append(toIndentedString(sexo)).append("\n");
		sb.append("    area: ").append(toIndentedString(area)).append("\n");
		sb.append("    periodo: ").append(toIndentedString(periodo)).append("\n");
		sb.append("    expediente: ").append(toIndentedString(expediente)).append("\n");
		sb.append("    causaIrregularidad: ").append(toIndentedString(causaIrregularidad)).append("\n");
		sb.append("    fechaCargoInicio: ").append(toIndentedString(fechaCargoInicio)).append("\n");
		sb.append("    fechaCargoFin: ").append(toIndentedString(fechaCargoFin)).append("\n");
		sb.append("    duracion: ").append(toIndentedString(duracion)).append("\n");
		sb.append("    monto: ").append(toIndentedString(monto)).append("\n");
		sb.append("    autoridadSancion: ").append(toIndentedString(autoridadSancion)).append("\n");
		sb.append("    tipoPersona: ").append(toIndentedString(tipoPersona)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}
}
