package learning;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.util.Scanner;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

public class audioPlay {
	public static void main(String[] args) throws MalformedURLException, JavaLayerException, FileNotFoundException {
		Scanner input = new Scanner(System.in);
		// 播放音乐
		 String filename = "onceIsGood.mp3";   
		BufferedInputStream buffer = new BufferedInputStream(new FileInputStream(filename));   
        Player player = new Player(buffer);
        player.play();
		
		System.out.print("请按任意键...");
		input.next();

	}

}
