/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

/**
 *
 * @author SEBASTIAN
 */
public class DniUnicoExcepcion extends Exception{
    //el exception puede parar el fujo de ejecucion
    //y el runtimeexcepcion segue continuando la ejecucion
    public DniUnicoExcepcion (){
        super("Este DNI Ya Esta Registrado, Por Favor Utilzar Otro");
    }
}
