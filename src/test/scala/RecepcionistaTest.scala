package ar.edu.unahur

import org.scalatest.freespec.AnyFreeSpec
import org.scalatest.matchers.should.Matchers

class RecepcionistaTest extends AnyFreeSpec with Matchers {
  "Recepcionista" - {
    "que acepta solo con obra social" - {
      "deberia aceptar a un paciente con OS" in {
        val pacienteConObraSocial: Paciente = new Paciente("Agu", obraSocial = true)
        val recepcionista: Recepcionista = new Recepcionista(true)
        assert(recepcionista.puedeIngresar(pacienteConObraSocial))
      }
      "lala" in {
        val pacienteConObraSocial: Paciente = new Paciente("Agu", obraSocial = true)
        val unaPersona = new Persona(nombre = "Pepe")
        //        val unPerro = new Perro("Oliver")

        val recepcionista: Recepcionista = new Recepcionista(true)
        recepcionista.nombrar(pacienteConObraSocial)
        recepcionista.nombrar(unaPersona)
        //        recepcionista.nombrar(unPerro)
      }
    }
  }

  "Lista" - {
    "tamanio" in {
      val lista = List(1, 2, 3, 4)
      lista.size should be (4)
    }
  }
}
