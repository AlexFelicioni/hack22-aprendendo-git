package controllers;


import domain.Card;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import services.CardsService;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cards")
public class CardsController {

    @Autowired
    private CardsService cardService;

    @PostMapping
    public ResponseEntity<Card> save(@RequestBody Card card){
        Card savedCard = cardService.saveCard(card);

        return new ResponseEntity(savedCard, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Card>> findAll() {
        List<Card> card = cardService.findAll();
        return ResponseEntity.ok(card);
    }

    @PutMapping("/card/{id}")
    public ResponseEntity<Card> put(@RequestBody Card card){
        Card putedCard = cardService.putCard(card);

        return new ResponseEntity(putedCard, HttpStatus.OK);
    }

    @DeleteMapping("/card/{id}")
    public ResponseEntity<Card> delete(@RequestBody Card card){
        Card deletedCard = cardService.putCard(card);

        return new ResponseEntity(deletedCard, HttpStatus.OK);
    }

    @GetMapping("/card/{id}")
    public ResponseEntity<Card> findById(@PathVariable Long id) {
        Optional<Card> fetchedCustomer = cardService.findById(id);

        return ResponseEntity.ok(fetchedCustomer.get());
    }


}
