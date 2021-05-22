
/**
 * Write a description of class MarkovRunner here.
 * 
 * @author Duke Software
 * @version 1.0
 */

import edu.duke.*;

public class MarkovRunner {
    public void runMarkovZero() {
		FileResource fr = new FileResource("data/confucius.txt");
		String st = fr.asString();
		st = st.replace('\n', ' ');
		MarkovZero markov = new MarkovZero();
		markov.setRandom(1024);
		markov.setTraining(st);
		//for(int k=0; k < 2; k++){
			String text = markov.getRandomText(500);
			printOut(text);
		//}
	}
	
    public void runMarkovOne() {
		FileResource fr = new FileResource("data/romeo.txt");
		String st = fr.asString();
		st = st.replace('\n', ' ');
		//st="this is a test yes this is a test";
		MarkovOne markov = new MarkovOne();
		markov.setRandom(365);
		markov.setTraining(st);
		//for(int k=0; k < 3; k++){
			String text = markov.getRandomText(500);
			printOut(text);
		//}
	}
	
    public void runMarkovFour() {
		FileResource fr = new FileResource("data/romeo.txt");
		String st = fr.asString();
		int N=4;
		st = st.replace('\n', ' ');
		MarkovFour markov = new MarkovFour(N);
		markov.setRandom(715);
		markov.setTraining(st);
		//for(int k=0; k < 3; k++){
			String text = markov.getRandomText(500);
			printOut(text);
		//}
	}
	
	private void printOut(String s){
		String[] words = s.split("\\s+");
		int psize = 0;
		System.out.println("----------------------------------");
		for(int k=0; k < words.length; k++){
			System.out.print(words[k]+ " ");
			psize += words[k].length() + 1;
			if (psize > 60) {
				System.out.println();
				psize = 0;
			}
		}
		System.out.println("\n----------------------------------");
	}
	
}
