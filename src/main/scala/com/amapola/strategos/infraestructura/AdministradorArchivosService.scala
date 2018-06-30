package com.amapola.strategos.infraestructura

import java.io.File
import java.nio.file.Files

trait AdministradorArchivosService {

  /**
    * Escribe el archivo dentro del destio especificado
    * @param archivo
    * @param nombreArchivo
    * @param destino
    */
  def crearArchivo(archivo: File,  nombreArchivo: String, destino: String): Unit

}

object AdministradorArchivosServiceImpl extends AdministradorArchivosService {

  /**
    * Escribe el archivo dentro del destio especificado
    *
    * @param archivoTmp
    * @param nombreArchivo
    * @param destino
    */
  override def crearArchivo(archivoTmp: File, nombreArchivo: String, destino: String): Unit = {

    val directorio = new File(destino)

    val archivoFinalD = new File(directorio, nombreArchivo)

    val archivoFinal = Files.newOutputStream(archivoFinalD.toPath)

    Files.copy(archivoTmp.toPath, archivoFinal)

  }
}
