
package proyectocalculadora;

public class Proyectocalculadora {

    
    public static void main(String[] args) {
      
        ventana inicio = new ventana();
        inicio.setTitle("Calculadora basica");
        inicio.setBounds(550, 300, 400, 300); 
        inicio.setResizable(false); 
        inicio.insertarPanel();
        inicio.insertarEtiquetas();
        inicio.insertarTexto();
        inicio.insertarBotones();
    }
    }
    

