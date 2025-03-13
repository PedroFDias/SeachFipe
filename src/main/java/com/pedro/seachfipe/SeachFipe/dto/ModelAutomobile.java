package com.pedro.seachfipe.SeachFipe.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record ModelAutomobile(@JsonAlias("modelos") List<Data> models) {
}
