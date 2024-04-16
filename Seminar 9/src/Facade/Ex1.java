package Facade;

public class Ex1 {
    public static void main(String[] args) {
        HomeTheaterFacade homeTheaterFacade=new HomeTheaterFacade(new Amplifier(),new Tuner(),new DvdPlayer(),new Projector(),new TheaterLights());
        homeTheaterFacade.watchMovie("Star Wars");
        homeTheaterFacade.endMovie();
    }
}
