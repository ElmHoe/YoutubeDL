package youtubedl;

public class YoutubeDLTest {

    public static void main(String[] args) {

        //YOUTUBE-DL CONFIGURE
        YoutubeDL.setExecutable("resources/youtube-dl.exe");                         // Sets the executable (windows)

        //YOUTUBE-DL BUILDER
        YoutubeDLBuilder youtubeDLBuilder = new YoutubeDLBuilder();                  // Creates a youtube-dl builder

        youtubeDLBuilder.setTerminationLogger(YoutubeDL.DEFAULT_TERMINATION_LOGGER); // Sets the termination logger
        youtubeDLBuilder.setInitiationLogger(YoutubeDL.DEFAULT_INITIATION_LOGGER);   // Sets the termination logger
        youtubeDLBuilder.setConsoleLogger(YoutubeDL.DEFAULT_CONSOLE_LOGGER);         // Sets the console listener

        youtubeDLBuilder.option(Options.OUTPUT, "resources/%(id)s.%(ext)s");         // Adds an option
        youtubeDLBuilder.url("https://www.youtube.com/watch?v=jNQXAC9IVRw");         // Adds a url to download

        //YOUTUBE-DL EXECUTION
        YoutubeDL youtubeDL = youtubeDLBuilder.build();                              // Builds a YoutubeDL object
        new Thread(youtubeDL).start();                                               // Runs the downloader in a new thread
    }
}
