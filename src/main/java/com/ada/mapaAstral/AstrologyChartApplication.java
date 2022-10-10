package com.ada.mapaAstral;

import com.ada.mapaAstral.service.MapaAstralService;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.*;

@SpringBootApplication
public class AstrologyChartApplication {

	public static void main(String[] args) {

		LocalDateTime localDateTimeLucas = LocalDateTime.of(1992, Month.DECEMBER, 16, 12, 35);
		LocalDateTime localDateTimeAry = LocalDateTime.of(1991, Month.NOVEMBER, 20, 17, 17);

		MapaAstralService mapaAstralService = new MapaAstralService();

		String signoIngrid = mapaAstralService.buscaPorSigno(localDateTimeAry.toLocalDate());
		String signoAscendenteAry = mapaAstralService.procurarAscendente(signoIngrid, LocalTime.from(localDateTimeAry));
		String buscaSignoPorEnunAry = mapaAstralService.buscaSignoPorEnun(localDateTimeAry);
		mapaAstralService.mapaAstral(localDateTimeAry);

		String localizarSingnoLunarAry = mapaAstralService.localizarSingnoLunar(LocalTime.from(localDateTimeAry),"Rio_de_Janeiro");
		System.out.println(localizarSingnoLunarAry);
	}
}



