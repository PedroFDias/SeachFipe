package com.pedro.seachfipe.SeachFipe.services;

import com.fasterxml.jackson.core.JsonProcessingException;

import java.util.List;

public interface IConvertData {
    <T> T getData(String json, Class<T> classe);
    <T> List<T> getList(String json, Class<T> classe) throws JsonProcessingException;
}
