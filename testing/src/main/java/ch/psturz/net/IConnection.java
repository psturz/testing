package ch.psturz.net;

import java.io.IOException;

public interface IConnection {

	/**
	 * 
	 * @throws IOException
	 */
	public void open() throws IOException;

	/**
	 * 
	 * @throws IOException
	 */
	public void close() throws IOException;

	/**
	 * 
	 * @param data
	 * @throws IOException
	 */
	public void send(byte[] data) throws IOException;

	/**
	 * 
	 * @return @throws IOException
	 */
	public byte[] recv() throws IOException;

	/**
	 * 
	 * @param framer
	 */
	public void setFramer(IFramer framer);

	/**
	 * 
	 * @param timeout
	 */
	public void setTimeout(int timeout);

}
