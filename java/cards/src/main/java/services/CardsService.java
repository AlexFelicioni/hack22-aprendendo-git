package services;
import domain.Card;
import org.springframework.beans.factory.annotation.Autowired;
import repositories.CardsRepository;

public class CardsService {
    @Autowired
    private CardsRepository cardsRepository;

    public Card saveCard(Card card){

        return cardsRepository.save(card);
    }

    public Card getCard(Card card){

        return cardsRepository.findAll(card.);

    }

    public Card putCard(Card card){

        return cardsRepository(card);

    }


    public Card deleteCard(Card card){

    }
}
