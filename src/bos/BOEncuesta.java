/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bos;

import definiciones.IDAOEncuesta;
import excepciones.ConexionException;
import excepciones.NoExistenteException;
import excepciones.YaExistenteException;
import fabrica.FabricaDAO;
import java.util.ArrayList;
import modelo.Encuesta;

/**
 *
 * @author jose
 */
public class BOEncuesta {

    private IDAOEncuesta daoEncuesta;

    public BOEncuesta() {
        daoEncuesta = FabricaDAO.getFabrica().crearDAOEncuesta();
    }

    public boolean crearEncuesta(Encuesta encuesta) throws ConexionException, YaExistenteException {
        if (daoEncuesta.buscar(encuesta.getId()) == null) {
            daoEncuesta.agregar(encuesta);
            return true;
        } else {
            throw new YaExistenteException("La encuesta");
        }

    }

    public boolean modificarEncuesta(Encuesta encuesta) throws ConexionException, NoExistenteException {
        if (daoEncuesta.modificar(encuesta)) {
            return true;
        } else {
            throw new NoExistenteException("La encuesta", "modificar");
        }
    }

    public Encuesta buscarEncuesta(int idEncuesta) throws ConexionException, NoExistenteException {

        Encuesta encuesta = daoEncuesta.buscar(idEncuesta);
        if (encuesta == null) {
            throw new NoExistenteException("La encuesta", "buscar");
        }
        return encuesta;
    }

    public boolean eliminarEncuesta(int idEncuesta) throws ConexionException {
        if (daoEncuesta.eliminar(idEncuesta)) {

        }
        return true;
    }
    
    public ArrayList<Encuesta> cargarEncuestas() throws ConexionException {        
        return daoEncuesta.cargarEncuestas();
    }
       
}
