
public class Main {
	
	public static void main(String[] args) {
		String youtube = "https://www.youtube.com/watch?v=YVLIn6xMSh0";
		
		YoutubeParse youtubeParse = new YoutubeParse();
		youtubeParse.parse(youtube);
		
		System.out.println(youtubeParse.getUrl());
	}
}
