import com.ra.jokeserver.JokeServer;
import com.ra.jokeserver.programmer.ProgrammerJokeServer;

module academy.learnprogramming.jokeserver.programmer {
    requires com.ra.jokeserver;

    provides JokeServer with ProgrammerJokeServer;
}