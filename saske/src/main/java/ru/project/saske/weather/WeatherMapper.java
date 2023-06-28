package ru.project.saske.weather;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import ru.project.saske.WeatherDTO;


@Mapper
public interface WeatherMapper {

    WeatherMapper INSTANCE = Mappers.getMapper(WeatherMapper.class);
    @Mapping(source = "coord", target = "name")
    WeatherDTO weatherToWeatherDto(Root root);


}