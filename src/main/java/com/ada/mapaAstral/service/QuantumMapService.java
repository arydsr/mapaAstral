package com.ada.mapaAstral.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

public class QuantumMapService {

    private final AstrologyChartService astrologyChartService;

    public QuantumMapService(AstrologyChartService astrologyChartService) {
        this.astrologyChartService = astrologyChartService;
    }

    public List<String> lerArquivo(Path path){
        List<String>integrantes;
        try {
            integrantes = Files.lines(path).parallel().collect(Collectors.toList());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return integrantes;
    }
    public void escreverArquivo (Path path, String textoIntegrantes ){
        try {
            if(!Files.exists(path)){
                Files.createFile(path);
            }
            Files.write(path,textoIntegrantes.getBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void escreverMapaQuantico(List<String> listaIntegrantes) {
        listaIntegrantes.stream().parallel().forEach(integrante ->{

            System.out.println("NOME THREAD" + Thread.currentThread().getName());
            System.out.println(System.nanoTime());


            String[] integranteSplit = integrante.split(",");

            String name = integranteSplit[0];
            String place = integranteSplit[1];
            String data = integranteSplit[2];

            //LocalDateTime localDateTime = LocalDateTime.parse(data, DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));

            LocalDateTime localDateTime = LocalDateTime.parse(integranteSplit[2]);

            String mapa = astrologyChartService.mapaAstral(localDateTime, place, name);

            String HOME = System.getProperty("user.dir");
            String pathPasta = HOME.concat("/src/main/resources/mapa");

            Path pathArquivo = Paths.get(pathPasta,name + ".txt");
            escreverArquivo(pathArquivo, mapa);

        });

    }

}
