package de.neuefische.bojava221myfistspringproject.contoller;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
@DirtiesContext(methodMode = DirtiesContext.MethodMode.BEFORE_METHOD)
class CarControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    void addCar_shouldReturnsAddedCar() throws Exception {
        //GIVEN

        String requestBody = """
                {
                    "manufacturer":"Honda",
                    "tires":4,
                    "hasTuev":false
                }
                """;

        String expectedJSON = """
                {
                    "manufacturer":"Honda",
                    "tires":4,
                    "hasTuev":false
                }
                """;


        //WHEN & THEN
        mvc.perform(MockMvcRequestBuilders.post("/car")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(requestBody))
                .andExpect(status().isOk())
                .andExpect(content().json(expectedJSON));
    }

    @Test
    void getCar_shouldReturnEmptyList() throws Exception {
        //GIVEN

        String expectedJSON = """
                [
                    {
                        "manufacturer": "Audi",
                        "tires": 4,
                        "hasTuev": true
                    },
                    {
                        "manufacturer": "BMW",
                        "tires": 4,
                        "hasTuev": false
                    },
                    {
                        "manufacturer": "VW",
                        "tires": 4,
                        "hasTuev": true
                    }
                ]
                """;
        //WHEN & THEN
        mvc.perform(MockMvcRequestBuilders.get("/car"))
                .andExpect(status().isOk())
                .andExpect(content().json(expectedJSON));
    }

}