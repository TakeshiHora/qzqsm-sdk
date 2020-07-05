package jp.ac.aiit.pbl;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class HypocenterParser {
    
    public Hypocenter parse(String qzMessage){
        Hypocenter hypocenter = new Hypocenter();
        
        PrefixParser prefixParser = new PrefixParser();
        hypocenter.setPrefix(prefixParser.parse(qzMessage));
        
        List<Notification> notifications = new ArrayList<>();
        notifications.add(Notification.getNotificationContent(Integer.parseInt(qzMessage.substring(53, 62),2)));
        notifications.add(Notification.getNotificationContent(Integer.parseInt(qzMessage.substring(62, 71),2)));
        notifications.add(Notification.getNotificationContent(Integer.parseInt(qzMessage.substring(71, 80),2)));
        hypocenter.setNotificationOnDisasterPreventions(notifications);
        
        hypocenter.setOccurrenceTimeOfEarthquake(toOccurrenceTime(qzMessage.substring(80, 96)));
        
        hypocenter.setDepthOfHypocenter(new DepthOfHypocenter(Integer.parseInt(qzMessage.substring(96, 105), 2)));
        
        hypocenter.setMagnitude(new Magnitude(Integer.parseInt(qzMessage.substring(105, 112), 2)));
        
        hypocenter.setSeismicEpicenter(SeismicEpicenter.getRegionName(Integer.parseInt(qzMessage.substring(112, 122), 2)));
        
        hypocenter.setLatitudeNorthSouth(NorthSouthLatitude.getByCode(Integer.parseInt(qzMessage.substring(122, 123), 2)));
        
        List<Latitude> latitudeList = new ArrayList<>();
        latitudeList.add(new Latitude(
                Integer.parseInt(qzMessage.substring(123, 130), 2),
                Integer.parseInt(qzMessage.substring(130, 136), 2),
                Integer.parseInt(qzMessage.substring(136, 142), 2)));
        hypocenter.setLatitude(latitudeList);
        
        hypocenter.setLongitudeEastWest(EastWestLongitude.getByCode(Integer.parseInt(qzMessage.substring(142, 143), 2)));
        
        List<Longtitude> longtitudelist = new ArrayList<>();
        longtitudelist.add(new Longtitude(
                Integer.parseInt(qzMessage.substring(143, 151), 2),
                Integer.parseInt(qzMessage.substring(151, 157), 2),
                Integer.parseInt(qzMessage.substring(157, 163), 2)));
        hypocenter.setLongitude(longtitudelist);
        
        return hypocenter;
    }
    
    private LocalDateTime toOccurrenceTime(String message){
        int day = Integer.parseInt(message.substring(0, 4),2);
        int hour = Integer.parseInt(message.substring(4, 9),2);
        int minute  = Integer.parseInt(message.substring(9, 15),2);
        return LocalDateTime.of(LocalDateTime.now().getYear(),LocalDateTime.now().getMonth(),day,hour,minute);
    }
    
}
