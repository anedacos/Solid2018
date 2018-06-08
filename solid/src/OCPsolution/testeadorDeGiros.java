
package OCPsolution;

/**
 *
 * @author william
 */
public abstract class testeadorDeGiros {
    public abstract void girar();
    public void girar(testeadorDeGiros vehicle, Direccion direccion){
    vehicle.girar();
    }

    private static class Direccion {

        public Direccion() {
            //Codigo de giro a izquierda o derecha
        }
    }
}


