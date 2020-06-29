package dominio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class LectorArchivo {
	public List<Pelicula> leerArchPel() {
		List <Pelicula> pelis = new ArrayList ();
		BufferedReader in = null;
		try {
			in = new BufferedReader(new FileReader("peliculas.txt"));
			String l;
			while ((l=in.readLine())!=null) {
				p = crearPelicula (l);
				pelis.add(p);
			}
		}finally {
			if(in!=null)
				in.close();
		}
		return pelis;
	}
	public Pelicula crearPelicula(String l) {
		String [] atr = l.split(",");
		Pelicula p;
		p = new Pelicula(atr[0],Integer.parseInt(atr[1]),atr[2]);
		return p;
	}
}
