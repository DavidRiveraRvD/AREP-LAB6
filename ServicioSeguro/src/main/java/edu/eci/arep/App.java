/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.eci.arep;

/**
 *
 * @author Usuario
 */
import static spark.Spark.*;

public class App 
{
    /**
     * Metodo principal main encargado de recibir peticiones de inicio de sesion del usuario.
     * @param args Argumentos que entran a la clase principal.
     */
    public static void main( String[] args )
    {
        port(getPort());
        secure("keystores/ecikeystore.p12","david","keystores/myTrustStore","567890");
        get("/information", (req, res) -> "Acceso Autorizado");
    }
    /**
     * Metodo encargado de ejecutar el programa de manera local con un puerto predeterminado.
     * @return Puerto asignado por defecto para ejecutar el programa de forma local, que es 5001.
     */
    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 5001;
    }
}