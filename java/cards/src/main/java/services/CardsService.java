package services;
import domain.Card;
import org.springframework.beans.factory.annotation.Autowired;
import repositories.CardsRepository;

import java.util.Optional;

public class CardsService {
    @Autowired
    private CardsRepository cardsRepository;

    public Card saveCard(Card card){

        return cardsRepository.save(card);
    }

   /* public Card getCard(Card card){

        return cardsRepository.findAllById(card.getId());

    }*/

    public Card putCard(Card card){

        return cardsRepository.save(card);
    }


    public Card deleteCard(Card card){


    }
    public Optional<Card> findById(Long id)
    {
        return cardsRepository.findById(id);
    }


}


}
