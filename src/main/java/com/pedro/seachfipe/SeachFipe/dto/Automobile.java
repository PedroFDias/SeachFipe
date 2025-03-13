package com.pedro.seachfipe.SeachFipe.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Automobile(@JsonAlias("Valor") String value,
                        @JsonAlias("Marca") String mark,
                        @JsonAlias("Modelo") String model,
                        @JsonAlias("AnoModelo") Integer yearModel,
                        @JsonAlias("Combustivel") String fuel)
{
}
