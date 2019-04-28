import org.apache.zookeeper.ClientWatchManager;
import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.ZooKeeper;

import java.io.IOException;
import java.util.List;

public class FileChannelTest {
	public static void main(String[] args) throws IOException, KeeperException, InterruptedException {
		ZooKeeper zooKeeper = new ZooKeeper("192.168.151.135:2181", 10000, new Watcher() {
			public void process(WatchedEvent event) {
				System.err.println("received event:" + event.getType().name() + ":" + event.getState().name());
			}
		});
		List<String> s = zooKeeper.getChildren("/",false);
		for(String p : s) {
			System.err.println(p);
		}
		Thread thread = new Thread();

	}
}
