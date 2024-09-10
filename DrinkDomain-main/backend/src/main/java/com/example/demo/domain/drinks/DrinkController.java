
package com.example.demo.domain.drinks;

        import java.util.List;
        import java.util.UUID;

        import com.example.demo.domain.drinks.dto.DrinkDTO;
        import com.example.demo.domain.drinks.dto.DrinkMapper;
        import jakarta.validation.Valid;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.http.HttpStatus;
        import org.springframework.http.ResponseEntity;
        import org.springframework.validation.annotation.Validated;
        import org.springframework.web.bind.annotation.DeleteMapping;
        import org.springframework.web.bind.annotation.GetMapping;
        import org.springframework.web.bind.annotation.PathVariable;
        import org.springframework.web.bind.annotation.PostMapping;
        import org.springframework.web.bind.annotation.PutMapping;
        import org.springframework.web.bind.annotation.RequestBody;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.RestController;

@Validated
@RestController
@RequestMapping("/drink")
public class DrinkController {

    private final DrinkService drinkService;
    private final DrinkMapper drinkMapper;

    @Autowired
    public DrinkController(DrinkService drinkService, DrinkMapper drinkMapper) {
        this.drinkService = drinkService;
        this.drinkMapper = drinkMapper;
    }

    @GetMapping("/{id}")
    public ResponseEntity<DrinkDTO> retrieveById(@PathVariable String id) {
        Drink Drink = drinkService.findById(id);
        return new ResponseEntity<>(drinkMapper.toDTO(Drink), HttpStatus.OK);
    }

    @GetMapping({"", "/"})
    public ResponseEntity<List<DrinkDTO>> retrieveAll() {
        List<Drink> Drinks = drinkService.findAll();
        return new ResponseEntity<>(drinkMapper.toDTOs(Drinks), HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<DrinkDTO> save(DrinkDTO DrinkDTO) {
        Drink Drink = drinkService.save( drinkMapper.fromDTO(DrinkDTO));
        return new ResponseEntity<>(drinkMapper.toDTO(Drink), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<DrinkDTO> updateById(@PathVariable String id, @Valid @RequestBody DrinkDTO DrinkDTO) {
        Drink Drink = drinkService.updateById(id, drinkMapper.fromDTO(DrinkDTO));
        return new ResponseEntity<>(drinkMapper.toDTO(Drink), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable String id) {
        drinkService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
