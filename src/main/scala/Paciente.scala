package ar.edu.unahur

trait Nombrable {
  def nombre: String
}

class Persona(val nombre: String) extends Nombrable
class Paciente(val nombre: String, var obraSocial: Boolean) extends Nombrable {
  var edad = 0
  val direccion = ".ndsiahusia"
  def tieneObraSocial: Boolean = obraSocial
}

class Perro(val nombre: String, var edad: Int)

class Recepcionista(val soloObraSocial: Boolean = false) {
  def nombrar(persona: {def nombre: String}) = "Paciente " + persona.nombre

  def puedeIngresar(paciente: Paciente) = {
    if (soloObraSocial)
      paciente.tieneObraSocial
    else
      true
  }
}