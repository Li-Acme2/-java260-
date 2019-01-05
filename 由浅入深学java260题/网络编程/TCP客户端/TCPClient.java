package TCP¿Í»§¶Ë;

import java.io.IOException;

public class TCPClient {
	public static void main(String[] args) throws IOException{
		Client c = new Client("127.0.0.2",8083);
		c.connect();
	}

}
