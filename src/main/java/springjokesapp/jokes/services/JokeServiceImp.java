package springjokesapp.jokes.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImp implements JokeService{
    private final ChuckNorrisQuotes chusnorisquotes;

    public JokeServiceImp() {
        this.chusnorisquotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getJoke()
    {
        return chusnorisquotes.getRandomQuote();
    }
}
