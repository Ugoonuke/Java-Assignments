import java.util.*;
import javax.sound.sampled.*;

public class Morse_Code {

	public static void main(String args[]) throws LineUnavailableException {
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		String morse = new String("");
		sc.close();
		for (int i =0; i < text.length(); i++) {
			if (text.charAt(i) == ' ') morse += ' ';
			else morse += convrt(text.charAt(i));
		}
		System.out.print(morse);
		for (int i =0; i < morse.length(); i++) {
			if (morse.charAt(i) == '.') tone(1000, 200, 1.0);
			if (morse.charAt(i) == '-') tone(1000, 400, 1.0);
			if (morse.charAt(i) == ' ') tone(1000, 800, 0.0);
		}
	}
	
	public static String convrt(char c) {
		char[] Alpha = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
                'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 
                'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0',
                ',', '.', '?' };
		String[] Morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", 
                ".---", "-.-", ".-..", "--", "-.", "---", ".---.", "--.-", ".-.",
                "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----",
                "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.",
                "-----", "--..--", ".-.-.-", "..--.." };
		for(int i = 0; i < Alpha.length; i++) {
			if (c == Alpha[i]) return Morse[i];
		}
		return "";
	}
	
	public static void tone(int hz, int msecs, double vol) throws LineUnavailableException{
		float SAMPLE_RATE = 8000f;
		byte[] buf = new byte[1];
		AudioFormat af = new AudioFormat(SAMPLE_RATE,8,1,true,false);
		SourceDataLine sdl = AudioSystem.getSourceDataLine(af);
		sdl.open(af);
		sdl.start();
		for (int i=0; i < msecs*8; i++) {
		double angle = i / (SAMPLE_RATE / hz) * 2.0 * Math.PI;
		buf[0] = (byte)(Math.sin(angle) * 127.0 * vol);
		sdl.write(buf,0,1);
		}
		sdl.drain();
		sdl.stop();
		sdl.close();
		}
}
