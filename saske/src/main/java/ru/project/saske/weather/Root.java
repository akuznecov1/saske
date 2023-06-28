package ru.project.saske.weather;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.sun.tools.javac.Main;
import lombok.Data;

import java.util.ArrayList;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Root {
    @JsonProperty("coord")
    Coord coord;
    @JsonProperty("weather")
    ArrayList<Weather> weather;
    @JsonProperty("base")
    String base;
    @JsonProperty("main")
    Main main;
    @JsonProperty("visibility")
    int visibility;
    @JsonProperty("wind")
    Wind wind;
    @JsonProperty("clouds")
    Clouds clouds;
    @JsonProperty("dt")
    int dt;
    @JsonProperty("sys")
    Sys sys;
    @JsonProperty("timezone")
    int timezone;
    @JsonProperty("id")
    int id;
    @JsonProperty("name")
    String name;
    @JsonProperty("cod")
    int cod;


}
