package jp.ac.aiit.pbl.disaster.ashfall;

import jp.ac.aiit.pbl.disaster.DisasterParser;
import jp.ac.aiit.pbl.disaster.prefix.PrefixParser;
import jp.ac.aiit.pbl.disaster.volcano.VolcanoName;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 *  The first, it returns Prefix.
 *  The second it returns Activity Time, Warning Type and Volcano Name.
 *  The third, it returns 4 times of Expected Ash Fall time, Warning Code and Local Government.
 */

public class AshFallParser implements DisasterParser {

    public AshFall parse(String qzMessage){
        AshFall ashFall = new AshFall();

        PrefixParser prefixParser = new PrefixParser();
        ashFall.setPrefix(prefixParser.parse(qzMessage));
        ashFall.setActivityTime(toActivityTime(qzMessage.substring(53,69)));
        ashFall.setWarningtype(WarningType.getById(Integer.parseInt( qzMessage.substring(69,71),2)));
        ashFall.setVolcanoName(VolcanoName.getById(Integer.parseInt(qzMessage.substring(71,83),2)));

        List<AshFallTimeWarningCodeLocalGovernment> ashFallTimeWarningCodeLocalGovernments = new ArrayList<>();
        ashFallTimeWarningCodeLocalGovernments.add(new AshFallTimeWarningCodeLocalGovernment(
                Integer.parseInt(qzMessage.substring(83, 86), 2),
                Integer.parseInt(qzMessage.substring(86, 89), 2),
                Integer.parseInt(qzMessage.substring(89, 112),2)));
        ashFallTimeWarningCodeLocalGovernments.add(new AshFallTimeWarningCodeLocalGovernment(
                Integer.parseInt(qzMessage.substring(112, 115), 2),
                Integer.parseInt(qzMessage.substring(115, 118), 2),
                Integer.parseInt(qzMessage.substring(118, 141),2)));
        ashFallTimeWarningCodeLocalGovernments.add(new AshFallTimeWarningCodeLocalGovernment(
                Integer.parseInt(qzMessage.substring(141, 144), 2),
                Integer.parseInt(qzMessage.substring(144, 147), 2),
                Integer.parseInt(qzMessage.substring(147, 170),2)));
        ashFallTimeWarningCodeLocalGovernments.add(new AshFallTimeWarningCodeLocalGovernment(
                Integer.parseInt(qzMessage.substring(170, 173), 2),
                Integer.parseInt(qzMessage.substring(173, 176), 2),
                Integer.parseInt(qzMessage.substring(176, 199),2)));
        ashFall.setAshFallTimeWarningCodeLocalGovernments(ashFallTimeWarningCodeLocalGovernments);
        return ashFall;
    }

    private LocalDateTime toActivityTime(String message){
        int day = Integer.parseInt(message.substring(0,4),2);
        int hour = Integer.parseInt(message.substring(4,9),2);
        int minute  = Integer.parseInt(message.substring(9,15),2);
        return LocalDateTime.of(LocalDateTime.now().getYear(),LocalDateTime.now().getMonth(),day,hour,minute);
    }
}