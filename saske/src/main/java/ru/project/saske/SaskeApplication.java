package ru.project.saske;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.function.client.WebClient;
import ru.project.saske.car.Car;
import ru.project.saske.car.CarDTO;
import ru.project.saske.car.CarMapper;
import ru.project.saske.weather.Root;
import ru.project.saske.weather.WeatherMapper;

@SpringBootApplication
public class SaskeApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SaskeApplication.class, args);
    }


    CarDTO carDTO = CarMapper.INSTANCE.carToCarDTO(new Car("Good", 5, "Green"));

    WeatherDTO weatherDTO = WeatherMapper.INSTANCE.weatherToWeatherDto();


    @Override
    public void run(String... args) throws Exception {

        String baseUrl = "api.openweathermap.org/data/2.5/weather";

        String apiKey = "9df2b60a85e24f0eeeef0c3152485824";

        WebClient webClient = WebClient.create();

        String getWeather = webClient
                .get()
                .uri("api.openweathermap.org/data/2.5/weather?q=Kartaly,ru&APPID=" + apiKey)
                .retrieve()
				.bodyToMono(String.class)
				.block();

		System.out.println(getWeather);

        ObjectMapper objectMapper = new ObjectMapper();

        WeatherDTO weatherDTO = objectMapper.readValue(getWeather, WeatherDTO.class);

        System.out.println(weatherDTO);


        System.out.println(weatherDTO);




    }

}
