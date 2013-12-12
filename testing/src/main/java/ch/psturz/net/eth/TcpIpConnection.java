package ch.psturz.net.eth;

import java.io.IOException;
import java.net.Socket;

import ch.psturz.net.IConnection;
import ch.psturz.net.IFramer;

public class TcpIpConnection implements IConnection {
	final private String ipAddress;
    final private int port;
    private IFramer framer;
    private Socket socket;
    private int timeout = 10000;

    /**
     *
     * @param ipAddress
     * @param port
     */
    public TcpIpConnection(String ipAddress, int port)
    {
        this.ipAddress = ipAddress;
        this.port = port;
    }

    /**
     *
     * @param data
     * @throws IOException
     */
    @Override
    public void send(byte[] data) throws IOException
    {
        framer.sendMsg(data, socket.getOutputStream());
    }

    /**
     *
     * @return @throws IOException
     */
    @Override
    public byte[] recv() throws IOException
    {
        return framer.recvMsg(socket.getInputStream());
    }

    /**
     *
     * @throws IOException
     */
    @Override
    public void open() throws IOException
    {
        if (socket == null || socket.isClosed())
        {
            socket = new Socket(ipAddress, port);
            socket.setSoTimeout(timeout);
        }
    }

    /**
     *
     * @throws IOException
     */
    @Override
    public void close() throws IOException
    {
        if (socket != null && !socket.isClosed())
        {
            socket.close();
        }
    }

    /**
     *
     * @param framer
     */
    @Override
    public void setFramer(IFramer framer)
    {
        this.framer = framer;
    }

    /**
     *
     * @param timeout
     */
    @Override
    public void setTimeout(int timeout)
    {
        this.timeout = timeout;
    }
	
}
