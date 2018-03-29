package net.blay09.javairc;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;

public class IRCConfiguration {
    private String server;
    private int port;
    private String nick;
    private String username;
    private String realName;
    private int messageDelay;
    private String localAddress;
    private Charset encoding;
    private boolean debug;
    private String password;
    private boolean snapshots;
    private boolean secure;
    private boolean selfSigned;
    private boolean disableDiffieHellman;
    private Collection<String> autoJoinChannels = new ArrayList<>();
    private Collection<String> capabilities = new ArrayList<>();

    public static IRCConfiguration builder() {
        return new IRCConfiguration().setPort(6667).setMessageDelay(33).setEncoding(StandardCharsets.UTF_8);
    }

    public Collection<String> getAutoJoinChannels()
    {
        return autoJoinChannels;
    }

    public Collection<String> getCapabilities()
    {
        return capabilities;
    }

    public String getServer()
    {
        return server;
    }

    public int getPort()
    {
        return port;
    }

    public String getNick()
    {
        return nick;
    }

    public String getUsername()
    {
        return username;
    }

    public String getRealName()
    {
        return realName;
    }

    public int getMessageDelay()
    {
        return messageDelay;
    }

    public String getLocalAddress()
    {
        return localAddress;
    }

    public Charset getEncoding()
    {
        return encoding;
    }

    public String getPassword()
    {
        return password;
    }

    public boolean isDebug()
    {
        return debug;
    }

    public boolean isSnapshots()
    {
        return snapshots;
    }

    public boolean isSecure()
    {
        return secure;
    }

    public boolean isSelfSigned()
    {
        return selfSigned;
    }

    public boolean isDisableDiffieHellman()
    {
        return disableDiffieHellman;
    }

    public IRCConfiguration setServer(String server)
    {
        this.server = server;
        return this;
    }

    public IRCConfiguration setPort(int port)
    {
        this.port = port;
        return this;
    }

    public IRCConfiguration setNick(String nick)
    {
        this.nick = nick;
        return this;
    }

    public IRCConfiguration setUsername(String username)
    {
        this.username = username;
        return this;
    }

    public IRCConfiguration setRealName(String realName)
    {
        this.realName = realName;
        return this;
    }

    public IRCConfiguration setMessageDelay(int messageDelay)
    {
        this.messageDelay = messageDelay;
        return this;
    }

    public IRCConfiguration setLocalAddress(String localAddress)
    {
        this.localAddress = localAddress;
        return this;
    }

    public IRCConfiguration setEncoding(Charset encoding)
    {
        this.encoding = encoding;
        return this;
    }

    public IRCConfiguration setDebug(boolean debug)
    {
        this.debug = debug;
        return this;
    }

    public IRCConfiguration setPassword(String password)
    {
        this.password = password;
        return this;
    }

    public IRCConfiguration setSnapshots(boolean snapshots)
    {
        this.snapshots = snapshots;
        return this;
    }

    public IRCConfiguration setSecure(boolean secure)
    {
        this.secure = secure;
        return this;
    }

    public IRCConfiguration setSelfSigned(boolean selfSigned)
    {
        this.selfSigned = selfSigned;
        return this;
    }

    public IRCConfiguration setDisableDiffieHellman(boolean disableDiffieHellman)
    {
        this.disableDiffieHellman = disableDiffieHellman;
        return this;
    }

    public IRCConfiguration setAutoJoinChannels(Collection<String> autoJoinChannels)
    {
        this.autoJoinChannels = autoJoinChannels;
        return this;
    }

    public IRCConfiguration setCapabilities(Collection<String> capabilities)
    {
        this.capabilities = capabilities;
        return this;
    }

    public IRCConfiguration addCapability(String capability)
    {
        this.capabilities.add(capability);
        return this;
    }
}
