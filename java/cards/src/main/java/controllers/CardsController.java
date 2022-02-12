package controllers;


import domain.Card;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import services.CardsService;

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
    public ResponseEntity<Card> get(@RequestBody Card card){
        Card gotCard = cardService.getCard(card);

        return new ResponseEntity(gotCard, HttpStatus.OK);

    }

    @PutMapping
    public ResponseEntity<Card> put(@RequestBody Card card){
        Card putedCard = cardService.putCard(card);

        return new ResponseEntity(putedCard, HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<Card> delete(@RequestBody Card card){
        Card deletedCard = cardService.putCard(card);

        return new ResponseEntity(deletedCard, HttpStatus.OK);
    }


}
