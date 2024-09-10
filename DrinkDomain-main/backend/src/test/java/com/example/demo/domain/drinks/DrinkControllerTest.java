package com.example.demo.domain.drinks;

import com.example.demo.domain.drinks.dto.DrinkDTO;
import com.example.demo.domain.drinks.dto.DrinkMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.Collections;
import java.util.UUID;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

public class DrinkControllerTest {

    private MockMvc mockMvc;

    @Mock
    private DrinkService drinkService;

    @Mock
    private DrinkMapper drinkMapper;

    @InjectMocks
    private DrinkController drinkController;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        mockMvc = MockMvcBuilders.standaloneSetup(drinkController).build();
    }


    @Test
    public void testRetrieveById() throws Exception {
        UUID id = UUID.randomUUID();
        DrinkDTO drinkDTO = new DrinkDTO();
        drinkDTO.setId(id);
        Drink drink = new Drink();
        drink.setId(id.toString());

        when(drinkService.findById(id.toString())).thenReturn(drink);
        when(drinkMapper.toDTO(drink)).thenReturn(drinkDTO);

        mockMvc.perform(get("/drink/{id}", id))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.id").value(id.toString()));

        verify(drinkService, times(1)).findById(id.toString());
        verify(drinkMapper, times(1)).toDTO(drink);
    }


    @Test
    public void testRetrieveAll() throws Exception {
        DrinkDTO drinkDTO = new DrinkDTO();
        Drink drink = new Drink();

        when(drinkService.findAll()).thenReturn(Collections.singletonList(drink));
        when(drinkMapper.toDTOs(Collections.singletonList(drink))).thenReturn(Collections.singletonList(drinkDTO));

        mockMvc.perform(get("/drink"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$[0]").exists());

        verify(drinkService, times(1)).findAll();
        verify(drinkMapper, times(1)).toDTOs(Collections.singletonList(drink));
    }

    @Test
    public void testSave() throws Exception {
        DrinkDTO drinkDTO = new DrinkDTO();
        Drink drink = new Drink();

        when(drinkMapper.fromDTO(any(DrinkDTO.class))).thenReturn(drink);
        when(drinkService.save(any(Drink.class))).thenReturn(drink);
        when(drinkMapper.toDTO(any(Drink.class))).thenReturn(drinkDTO);

        mockMvc.perform(post("/drink/")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{}")) // Add a valid JSON content here.
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON));

        verify(drinkMapper, times(1)).fromDTO(any(DrinkDTO.class));
        verify(drinkService, times(1)).save(any(Drink.class));
        verify(drinkMapper, times(1)).toDTO(any(Drink.class));
    }

    @Test
    public void testUpdateById() throws Exception {
        UUID id = UUID.randomUUID();
        DrinkDTO drinkDTO = new DrinkDTO();
        Drink drink = new Drink();

        when(drinkMapper.fromDTO(any(DrinkDTO.class))).thenReturn(drink);
        when(drinkService.updateById(eq(id.toString()), any(Drink.class))).thenReturn(drink);
        when(drinkMapper.toDTO(any(Drink.class))).thenReturn(drinkDTO);

        mockMvc.perform(put("/drink/{id}", id)
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{}")) // Add a valid JSON content here.
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON));

        verify(drinkMapper, times(1)).fromDTO(any(DrinkDTO.class));
        verify(drinkService, times(1)).updateById(eq(id.toString()), any(Drink.class));
        verify(drinkMapper, times(1)).toDTO(any(Drink.class));
    }

    @Test
    public void testDeleteById() throws Exception {
        UUID id = UUID.randomUUID();

        doNothing().when(drinkService).deleteById(id.toString());

        mockMvc.perform(delete("/drink/{id}", id))
                .andExpect(status().isNoContent());

        verify(drinkService, times(1)).deleteById(id.toString());
    }
}
