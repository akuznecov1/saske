package ru.project.saske;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import ru.project.saske.weather.*;

import java.util.ArrayList;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherDTO {

    @JsonProperty("weather")
    public ArrayList<Weather> weather;

    @JsonProperty("base")
    public String base;

    @JsonProperty("main")
    public Main main;

    @JsonProperty("visibility")
    public int visibility;

    @JsonProperty("wind")
    public Wind wind;

    @JsonProperty("clouds")
    public Clouds clouds;

    @JsonProperty("dt")
    public int dt;

    @JsonProperty("sys")
    public Sys sys;

    @JsonProperty("timezone")
    public int timezone;

    @JsonProperty("id")
    public int id;

    @JsonProperty("name")
    public String name;

    @JsonProperty("cod")
    public int cod;


}
