package ch.psturz.net;

import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class StxEtxFramer implements IFramer {
	private static final byte ETX = 0x03;
	private static final byte STX = 0x02;
	private static final int STX_RECEIVED = 1;
	private static final int WAIT_STX = 0;

	/**
	 * 
	 * @param in
	 * @return
	 * @throws IOException
	 */
	@Override
	public byte[] recvMsg(InputStream in) throws IOException {
		ByteArrayOutputStream messageBuffer = new ByteArrayOutputStream();

		int nextByte;
		int state = WAIT_STX;

		while ((nextByte = in.read()) != ETX) {
			switch (state) {
			case WAIT_STX:
				checkEndOfStream(nextByte, messageBuffer);
				if (nextByte == STX) {
					state = STX_RECEIVED;
				}
				break;

			case STX_RECEIVED:
				checkEndOfStream(nextByte, messageBuffer);
				messageBuffer.write(nextByte);
				break;
			}
		}
		return messageBuffer.toByteArray();
	}

	/**
	 * 
	 * @param message
	 * @param out
	 * @throws IOException
	 */
	@Override
	public void sendMsg(byte[] message, OutputStream out) throws IOException {
		for (byte b : message) {
			if (b == ETX || b == STX) {
				throw new IOException("Message contains delimiter");
			}
		}
		out.write(STX);
		out.write(message);
		out.write(ETX);
		out.flush();
	}

	/**
	 * 
	 * @param nextByte
	 * @param messageBuffer
	 * @throws EOFException
	 */
	private void checkEndOfStream(int nextByte,
			ByteArrayOutputStream messageBuffer) throws EOFException {
		if (nextByte == -1) {
			if (messageBuffer.size() == 0) {
				throw new EOFException("empty message");
			} else {
				throw new EOFException("Non-empty message without delimiter");
			}
		}
	}

}
