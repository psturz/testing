package ch.psturz.net;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public interface IFramer {
	/**
	 * 
	 * @param in
	 * @return
	 * @throws IOException
	 */
	byte[] recvMsg(InputStream in) throws IOException;

	/**
	 * 
	 * @param message
	 * @param out
	 * @throws IOException
	 */
	void sendMsg(byte[] message, OutputStream out) throws IOException;

}
