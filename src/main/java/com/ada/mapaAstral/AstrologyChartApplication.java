package com.ada.mapaAstral;

import com.ada.mapaAstral.service.AstrologyChartService;
import com.ada.mapaAstral.service.QuantumMapService;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.*;
import java.util.List;

@SpringBootApplication
public class AstrologyChartApplication {

	public static void main(String[] args) {

		private static String HOME = System.getProperty("user.dir");
		private static String pathPasta = HOME.concat("/src/main/resources/mapa");

		public static void main (String[]args){
			AstrologyChartService astrologyChartService = new AstrologyChartService();
			QuantumMapService quantumMapService = new QuantumMapService(astrologyChartService);


			// lendo arquivo

			Path pathArquivo = Paths.get(pathPasta, "integrantes.txt");

			List<String> listaIntegrantes = QuantumMapService.lerArquivo(pathArquivo);
			listaIntegrantes.forEach(System.out::println);

			// escrevendo arquivo -com Parallel

			quantumMapService.escreverMapaQuantico(listaIntegrantes);

		}
	}
}



