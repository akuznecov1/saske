package ru.project.saske.weather;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Sys {
    @JsonProperty("type")
    int type;
    @JsonProperty("id")
    int id;
    @JsonProperty("country")
    String country;
    @JsonProperty("sunrise")
    int sunrise;
    @JsonProperty("sunset")
    int sunset;
}
