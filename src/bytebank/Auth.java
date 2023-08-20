package bytebank;

public class Auth {
    public boolean autenticar(String clave, InterfazPuedeAutenticar usuarioAutenticable){
        boolean puedeIniciarSesion = usuarioAutenticable.iniciarSesion(clave);

        if (puedeIniciarSesion){
            System.out.println("Puede iniciar sesión");
            return true;
        } else {
            System.out.println("No puede iniciar sesión");
            return false;
        }
    }
}
