import java.time.LocalDateTime;
import java.util.ArrayList;

public class Task {
  private static ArrayList<Task> instances = new ArrayList<Task>();

  private String mDescription;
  private Boolean mIsCompleted;
  private LocalDateTime mCreationTime;
  private int mId;

  public Task(String description) {
    mDescription = description;
    mIsCompleted = false;
    mCreationTime = LocalDateTime.now();
    instances.add(this);
    mId = instances.size();
  }

  public String getDescription() {
    return mDescription;
  }

  public Boolean isCompleted() {
    return mIsCompleted;
  }

  public LocalDateTime getCreatedAt() {
    return mCreationTime;
  }

  public static ArrayList<Task> all() {
    return instances;
  }

  public int getId() {
    return mId;
  }

} // end of Task
