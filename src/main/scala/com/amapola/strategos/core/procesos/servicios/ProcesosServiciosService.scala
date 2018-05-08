package com.amapola.strategos.core.procesos.servicios

import com.amapola.strategos.core.procesos.http.json.ProcesoProcedimientoRequest

import scala.concurrent.Future

/**
  * Trait que expone las funciones encargadas de interactuar con los procesos
  * y sus dependencias
  */
trait ProcesosServiciosService {

  /**
    * Crea el proceso con sus dependencias desde el request enviado por el servicio
    * @param request
    * @return
    */
  def crearProcesos(request: ProcesoProcedimientoRequest) : Future[Long]

}


