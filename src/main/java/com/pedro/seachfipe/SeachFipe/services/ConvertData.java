package com.pedro.seachfipe.SeachFipe.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;
import java.util.List;

public class ConvertData implements IConvertData {
    public ObjectMapper mapper = new ObjectMapper();
    @Override
    public <T> T getData(String json, Class<T> classe) {
        try{
            return mapper.readValue(json, classe);
        }catch(JsonProcessingException e){
            throw new RuntimeException("Erro ao converter dados: \n" + e.getMessage());
        }
    }

    @Override
    public <T> List<T> getList(String json, Class<T> classe) throws JsonProcessingException {
        CollectionType list = mapper.getTypeFactory()
                .constructCollectionType(List.class, classe);

        return mapper.readValue(json, list);
    }
}
