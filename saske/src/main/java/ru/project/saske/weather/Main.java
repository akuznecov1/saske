package ru.project.saske.weather;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Main {
    @JsonProperty("temp")
    double temp;
    @JsonProperty("feels_like")
    double feels_like;
    @JsonProperty("temp_min")
    double temp_min;
    @JsonProperty("temp_max")
    double temp_max;
    @JsonProperty("pressure")
    int pressure;
    @JsonProperty("humidity")
    int humidity;
}
