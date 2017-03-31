import java.util.List;
import java.util.ArrayList;
import org.sql2o.*;

public class Varietal {
  private String varietalName;
  private int id;
  private int regionId;
  private boolean completed;

  public Varietal(String varietalName, int categoryId) {
    this.varietalName = varietalName;
    this.regionId = regionId;
    completed = false;
  }

  public String getVarietalName() {
    return varietalName;
  }

  public static List<Varietal> all() {
    String sql = "SELECT id, varietal_name, regionId FROM varietals";
    try(Connection con = DB.sql2o.open()) {
      return con.createQuery(sql).executeAndFetch(Varietal.class);
    }
  }

  public void save() {
    try(Connection con = DB.sql2o.open()) {
      String sql = "INSERT INTO varietals (varietal_name, regionId) VALUES (:varietal_name, :regionId)";
      this.id = (int) con.createQuery(sql, true)
        .addParameter("varietal_name", this.varietalName)
        .addParameter("regionId", this.regionId)
        .executeUpdate()
        .getKey();
    }
  }

  @Override
  public boolean equals(Object otherVarietal) {
    if (!(otherVarietal instanceof Varietal)) {
      return false;
    } else {
      Varietal newVarietal = (Varietal) otherVarietal;
      return this.getVarietalName().equals(newVarietal.getVarietalName()) &&
      this.getId() == newVarietal.getId() &&
      this.getRegionId() == newVarietal.getRegionId();
    }
  }

  public int getId() {
    return id;
  }

  public int getRegionId() {
    return regionId;
  }

  public List<Varietal> getVarietals() {
    try(Connection con = DB.sql2o.open()) {
      String sql = "SELECT * FROM varietals WHERE regionId=:id";
      return con.createQuery(sql)
        .addParameter("id", this.id)
        .executeAndFetch(Varietal.class);
    }
  }

  public static Varietal find(int id) {
    try(Connection con = DB.sql2o.open()) {
      String sql = "SELECT * FROM varietals WHERE id=:id";
      Varietal varietal = con.createQuery(sql)
        .addParameter("id", id)
        .executeAndFetchFirst(Varietal.class);
      return varietal;
    }
  }

}
