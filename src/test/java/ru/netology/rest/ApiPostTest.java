package ru.netology.rest;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class ApiPostTest {

    @Test
    void shouldReturnChampionTeam() {
        given()// Предусловия
                .baseUri("https://postman-echo.com")
                .contentType("text/plain; charset=UTF-8")
                .body("Локомотив Чемпион!")// Отправляем данные
        .when()// Выполняемые действия относительно baseUri
                .post("/post")
        .then()// Проверки
                .statusCode(200)
                .body("data", equalTo("Локомотив Чемпион!"))
        ;
    }
}
