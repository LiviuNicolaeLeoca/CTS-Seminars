package Facade;

public class HomeTheaterFacade {
    private Amplifier amp;
    private Tuner tuner;
    private DvdPlayer dvd;
    private Projector projector;
    private TheaterLights lights;

    HomeTheaterFacade(Amplifier amp, Tuner tuner, DvdPlayer dvd, Projector projector, TheaterLights lights)
    {
        this.amp=amp;
        this.tuner=tuner;
        this.dvd=dvd;
        this.projector=projector;
        this.lights=lights;
    }
    void watchMovie(String movie){
        System.out.println("Get ready to watch a movie...");
        dvd.play(movie);
        //functions
    }
    void endMovie()
    {
        System.out.println("Shutting movie theater down...");
        //functions
    }

}
