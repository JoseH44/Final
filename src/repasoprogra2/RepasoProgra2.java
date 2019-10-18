package repasoprogra2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.StringTokenizer;

public class RepasoProgra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        // manejo de fechas
        Date fecha;
        // capturar el momento del sistema.
        fecha = new Date();
        System.out.println(fecha);

        //establecer un formato de salida de la fecha.
        SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd");
        System.out.println(df.format(fecha));

        //establecer un punto en el tiempo.
        //primera forma
        GregorianCalendar calendario = new GregorianCalendar(1982, 0, 6);
        fecha = calendario.getTime();
        fecha.setHours(15);
        System.out.println(fecha);

        //segunda forma.
        SimpleDateFormat fi = new SimpleDateFormat("dd/MM/yyyy");
        fecha = fi.parse("07/10/2019");
        System.out.println(fecha);

        //casteo es convertir mediante parseo.
        //parseo dividir algo en elementos mas pequeños.
        //parseo
        String cadena = "100;juan perez;col Kennedy;albañil";

        //primer forma
        String[] tokens = cadena.split(";");
        System.out.println(tokens[1]);

        //segunda forma
        StringTokenizer st = new StringTokenizer(cadena, ";");
        while (st.hasMoreElements()) {
            Object nextElement = st.nextElement();
            System.out.println(nextElement);
        }//fin del while.
        
        //tercer forma
        Scanner sc = new Scanner(cadena);
        sc.useDelimiter(";");
        while (sc.hasNext()) {
            System.out.println(sc.next());
            
        }
        
        String prueba = "";
        

    }//fin del main.

}
