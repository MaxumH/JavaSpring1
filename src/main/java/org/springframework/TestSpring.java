package org.springframework;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContex.xml");


      // Music musik = context.getBean("MusicBean",Music.class);
       // MusicPlayer musicPlayer=new MusicPlayer(musik);
        MusicPlayer musicPlayer = context.getBean("MusicPlayer",MusicPlayer.class);
        MusicPlayer secondmusicPlayer = context.getBean("MusicPlayer",MusicPlayer.class);
       musicPlayer.playMusic();
      musicPlayer.setVolume(25);
       // Music music = context.getBean("popMusic",Music.class);
       // MusicPlayer musicPlayer2 = new MusicPlayer(music);
       // musicPlayer2.playMusicforAnotance();

      System.out.println(secondmusicPlayer.getVolume());
       System.out.println(musicPlayer.getVolume());


        context.close();
    }
}
