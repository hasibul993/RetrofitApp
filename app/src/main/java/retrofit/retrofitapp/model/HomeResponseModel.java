package retrofit.retrofitapp.model;

import java.io.Serializable;
import java.util.List;

/**
 * Created by BookMEds on 08-03-2018.
 */

public class HomeResponseModel implements Serializable {

    public String Status;

    public List<UserActivityEntity> UserActivities;
    public List<UserActivityEntity> UserXWallActivities;

    public long ResponseTimeTicks;

    public List<String> SecondLevelActivityGuidUpdatedPairs;

    public boolean IsFullRefresh;

    public int StartTime;

    public int CurrentVersionCode;

    public int EndTime;
}
