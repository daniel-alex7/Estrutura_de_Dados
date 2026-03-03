import java.util.ArrayList;
import java.util.List;

public class GaleriaFotos{
    public static void main(String[] args) {
        List<byte[]> fotosNaMemoria = new ArrayList<>();
        int cont = 0;

        while (true){

            byte[] fotoAltaResolução = new byte[ 10 * 1024 * 1024];

            fotosNaMemoria.add(fotoAltaResolução);
            cont++;

            System.out.println("Fotos carregas"+ cont + " (" + (cont * 10) + " MB)");

        }
    }
}