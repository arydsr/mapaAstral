package com.ada.mapaAstral.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class QuantumMap {

        private String name;
        private String sign;
        private String ascending;
        private String birthplace;
        private LocalDateTime birthTime;
        private Integer age;

        @Override
        public String toString() {
            return "MapaQuantico\n" +
                    "Nome: " + name +
                    "\nSigno :" + sign +
                    "\nAnscendente: " + ascending +
                    "\nLocal Nascimento: " + birthplace +
                    "\nHora Nascimento: " + birthTime +
                    "\nIdade: " + age ;
    }
}
