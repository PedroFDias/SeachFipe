package com.pedro.seachfipe.SeachFipe.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Data(@JsonAlias("codigo") String cod,
                   @JsonAlias("nome") String mark) {
}
