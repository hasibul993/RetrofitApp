package retrofit.retrofitapp.model;

import java.io.Serializable;
import java.util.List;

/**
 * Created by BookMEds on 08-03-2018.
 */

public class UserActivityEntity implements Serializable {
    public String UserGuid;
    public String OwnerGuid;
    public String OwnerName;
    public String OwnerInfo;
    public String ActivityGuid;
    public String ParentActivityGuid;
    public String ActivityName;
    public String ActivityNameBeforeEdit;//only for local use
    public String ActivityDescription;
    public boolean IsActivityDescriptionUpdated;
    public boolean IsOwnerGuidUpdated;

    public boolean IsActivityEdited;

    public boolean IsActivityNameUpdated;
    public String ActivityIcon;
    public boolean IsActivityIconUpdated;
    public String ActivityType;
    public String ActivityTypeGuid;
    public String UserType;
    public String ActivityThemeCode;
    public boolean IsActivityThemeCodeUpdated;
    public boolean IsRepeatActivity;
    public boolean IsInvited;
    public boolean ShowSummary;
    public boolean AddOnlyParentUsers;
    public boolean IsOne2OneChatExist;

    public boolean IsSingleInstance;
    public boolean IsSingleChoice;
    public int ParticipantCount;
    public int TotalInvitations;/// in xwall getting ParticipantCount but in getActivityDetailsChanged getting TotalInvitations...needs to be changed
    public boolean IsParticipantCountUpdated;
    public int ResponseCount;

    public int ChoiceQuestionTotalResponses;
    public boolean IsChoiceQuestionTotalResponsesUpdated;

    public boolean IsActivityPersistanceRequired;

    public boolean IsExecutorGuidUpdated;
    public String ExecutorGuid;
    public boolean IsExecutorNameUpdated;
    public String ExecutorName;
    public int SubActivitiesCount;
    public String SubActivityDetails;
    public boolean IsFullFresh;
    // SubActivityStatusDetails
    public String ActivityCurrentStatus;
    public boolean IsHomeScreenActivity;
    public boolean IsParentTemplateActivity;
    public boolean IsActivityDetailUpdated;
    public boolean IsNewMessageAdded;
    public String TimeStampLong;
    public String LastWriteTimeTicks;
    public String AccessType;
    public boolean IsAdminApprovalRequired;
    public String Status;
    public String AccessTypeUpdated;
    public boolean IsAdminApprovalRequiredUpdated;
    public String StatusUpdated;
    public String ParentTemplateId;


    public String CreatedTime;
    public String CompletedTime;
    public String CompletedBy;
    public String CompletedByName;
    public int IndexPosition;

    public List<UserActivityEntity> ChildUserActivities;
    public int Data1TotalValue;
    public boolean ChoiceQuestionAnswered;
    public boolean NotInitilized;

    public int UnReadMessages;
    public String LastMessage;
    public String LastMessageTime;
    public String LastMessageDate;
    public String LastMessageBy;
    public String LastMessageSenderId;
    public boolean IsLastMesageUpdated;
    public boolean IsLastMessageTimeUpdated;
    public boolean IsLastMessageByUpdated;
    public boolean IsSystemMessage;
    public String StartDate;
    public boolean IsStartDateUpdated;
    public String EndDate;
    public boolean IsEndDateUpdated;


    public int Option1Value;
    public int Option2Value;
    public int Option3Value;
    public int Option4Value;
    public int Option5Value;
    public boolean IsOption1ValueUpdated;
    public boolean IsOption2ValueUpdated;
    public boolean IsOption3ValueUpdated;
    public boolean IsOption4ValueUpdated;
    public boolean IsOption5ValueUpdated;


    public String Option1ColorCode;
    public String Option2ColorCode;
    public String Option3ColorCode;
    public String Option4ColorCode;
    public String Option5ColorCode;
    public boolean IsOption1ColorCodeUpdated;
    public boolean IsOption2ColorCodeUpdated;
    public boolean IsOption3ColorCodeUpdated;
    public boolean IsOption4ColorCodeUpdated;
    public boolean IsOption5ColorCodeUpdated;


    public String Option1Name;
    public String Option2Name;
    public String Option3Name;
    public String Option4Name;
    public String Option5Name;
    public boolean IsOption1NameUpdated;
    public boolean IsOption2NameUpdated;
    public boolean IsOption3NameUpdated;
    public boolean IsOption4NameUpdated;
    public boolean IsOption5NameUpdated;

    public String Data1Name;
    public String Data2Name;
    public String Data3Name;
    public String Data4Name;
    public String Data5Name;
    public boolean IsData1NameUpdated;
    public boolean IsData2NameUpdated;
    public boolean IsData3NameUpdated;
    public boolean IsData4NameUpdated;
    public boolean IsData5NameUpdated;


    public String Data1Value;
    public String Data2Value;
    public String Data3Value;
    public String Data4Value;
    public String Data5Value;
    public boolean IsData1ValueUpdated;
    public boolean IsData2ValueUpdated;
    public boolean IsData3ValueUpdated;
    public boolean IsData4ValueUpdated;
    public boolean IsData5ValueUpdated;


    public boolean IsPinnedActivity;
    public boolean IsMuteActivity;

    public String ETA;
    public boolean IsETAUpdated;
    public String Location;
    public boolean IsLocationUpdated;
    public boolean IsActivityCalendarEventSet;

    public String CompletedByPhoneNumber;
    public String CreatedByPhoneNumber;
    public String SenderPhoneNumber;
    public String SenderName;

    public String TaskColorCode;

    public long ActivityLastReadTimeTicks;
    public List<UserActivityEntity> SubTasks;

    public String Tags;
    public boolean IsTagsUpdated;
    public String DueDate;
    public boolean IsDueDateUpdated;
    public String NotificationSettings;


    public String HeaderMetadata;
    public boolean IsHeaderMetadataUpdated;

    public String ActivityChatLastUpdatedTime;

    public boolean IsArchived;
    public boolean IsShortcut;
    public String Read;
    public String Delivered;
    public boolean ReadNotified;
    public boolean DeliveredNotified;
    public boolean IsPresistanceRequired;


    public int childArchiveCount;
    /// Dexa
    public String Relations;
    public String ObserverIds;

    //Notes

    public String Notes;
}

