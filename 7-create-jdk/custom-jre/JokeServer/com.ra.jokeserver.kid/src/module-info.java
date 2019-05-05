module com.ra.jokeserver.kid {
    requires com.ra.jokeserver;
    exports com.ra.jokeserver.kid;

    provides JokeServer
            with KidJokeServer;
}