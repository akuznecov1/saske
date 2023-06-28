package ru.project.saske.weather;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Weather {

    @JsonProperty("id")
    int id;
    @JsonProperty("main")
    String main;
    @JsonProperty("description")
    String description;
    @JsonProperty("icon")
    String icon;
}
