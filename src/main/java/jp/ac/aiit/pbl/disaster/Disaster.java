package jp.ac.aiit.pbl.disaster;


import jp.ac.aiit.pbl.disaster.prefix.MessageType;
import jp.ac.aiit.pbl.disaster.prefix.Prefix;

public interface Disaster {

    public String toString();

    public MessageType getMessageType();

    public DisasterCategory getDisasterCategory();

    public Prefix getDisasterPrefix();
}
