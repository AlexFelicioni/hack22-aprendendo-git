package services;
import domain.Card;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.CardsRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CardsService {
    @Autowired
    private CardsRepository cardsRepository;

    public Card saveCard(Card card){

        return cardsRepository.save(card);
    }
    public List<Card> findAll() {

        List<Card> customers = new ArrayList<>();
        cardsRepository.findAll().forEach(customers :: add);
        return customers;

    }

    public Card getCard(Card card){

        return cardsRepository.findAllById(card.getId());

    }

    public Card putCard(Card card){

        return cardsRepository.save(card);
    }


   /* public Card deleteCard(Card card){


    }*/
    public Optional<Card> findById(Long id)
    {
        return cardsRepository.findById(id);
    }


}



