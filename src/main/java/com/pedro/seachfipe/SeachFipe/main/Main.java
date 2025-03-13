package com.pedro.seachfipe.SeachFipe.main;

import com.pedro.seachfipe.SeachFipe.dto.*;
import com.pedro.seachfipe.SeachFipe.services.ConsumptionAPI;
import com.pedro.seachfipe.SeachFipe.services.ConvertData;

import java.io.IOException;
import java.lang.reflect.GenericDeclaration;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    Scanner scanner = new Scanner(System.in);
    ConsumptionAPI consumer = new ConsumptionAPI();
    private final String API_BASE_URL = "https://parallelum.com.br/fipe/api/v1";
    ConvertData converter = new ConvertData();

    public void showMenu() throws IOException, InterruptedException {
        var menu = """
                ***OPÇÕES***
                Car
                Motorcycles
                Trucks
                
                Inform one the options:
                """;
        System.out.println(menu);
        var option = scanner.nextLine();

        var endpoint = "";
        if(option.toLowerCase().contains("car")){
            endpoint = API_BASE_URL + "/carros/marcas";
            System.out.println(endpoint);
        } else if (option.toLowerCase().contains("moto")) {
            endpoint = API_BASE_URL + "/motos/marcas";
            System.out.println(endpoint);
        } else if (option.toLowerCase().contains("truck")) {
            endpoint = API_BASE_URL + "/caminhoes/marcas";
            System.out.println(endpoint);
        }

        var json = consumer.ConsumptionApi(endpoint);
        System.out.println(json);
        var marks = converter.getList(json, Data.class);

        marks.stream()
                .sorted(Comparator.comparing(Data::cod))
                .forEach(System.out::println);

        System.out.println("Inform the automobile model: ");
        var model = scanner.nextLine();

        endpoint += "/" + model + "/modelos";
        System.out.println(endpoint);
        json = consumer.ConsumptionApi(endpoint);
        var listmodel = converter.getData(json, ModelAutomobile.class);

        System.out.println("Models this mark:");
        listmodel.models().stream()
                .sorted(Comparator.comparing(Data::cod))
                .forEach(System.out::println);

        System.out.println("Enter a third of the car's name: ");
        var carName = scanner.nextLine();

        List<Data> filteredModels = listmodel.models().stream()
                .filter(m -> m.mark().toLowerCase().contains(carName.toLowerCase()))
                        .toList();

        System.out.println("filtered models: ");
        filteredModels.forEach(System.out::println);

        System.out.println("Type a model code for search the evaluation's values: ");
        var code = scanner.nextLine();
        System.out.println(code);
        endpoint += "/" + code + "/anos";

        json = consumer.ConsumptionApi(endpoint);
        List<Data> years = converter.getList(json, Data.class);
        List<Automobile> automobiles = new ArrayList<>();

        for (int i = 1; i < years.size(); i++) {
            var address = endpoint + "/" + years.get(i).cod();
            json = consumer.ConsumptionApi(address);

            Automobile automobile = converter.getData(json, Automobile.class);
            automobiles.add(automobile);
        }

        automobiles.forEach(System.out::println);
    }
}
