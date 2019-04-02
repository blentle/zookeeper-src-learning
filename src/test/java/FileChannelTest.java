import java.nio.channels.FileChannel;
import java.nio.file.Paths;

public class FileChannelTest {
	public static void main(String[] args) {
		FileChannel.open(Paths.get()).transferTo()
	}
}
