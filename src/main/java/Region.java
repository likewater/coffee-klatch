import java.util.List;
import org.sql2o.*;

public class Region {
  private String regionName;
  private int id;

  public Region(String regionName) {
    this.regionName = regionName;
  }

  public static Region find(int id) {
    try(Connection con = DB.sql2o.open()) {
      String sql = "SELECT * FROM regions where id=:id";
      Region region = con.createQuery(sql)
        .addParameter("id", id)
        .executeAndFetchFirst(Region.class);
      return region;
    }
  }

  public int getId() {
      return id;
  }

  public String getRegionName() {
    return regionName;
  }

  public static List<Region> all() {
    String sql = "SELECT id, region_name FROM regions";
    try(Connection con = DB.sql2o.open()) {
      return con.createQuery(sql).executeAndFetch(Region.class);
    }
  }
//potential issue with region_name vs regionName
  public void save() {
    try(Connection con = DB.sql2o.open()) {
      String sql = "INSERT INTO regions (region_name) VALUES (:region_name)";
      this.id = (int) con.createQuery(sql, true)
        .addParameter("region_name", this.regionName)
        .executeUpdate()
        .getKey();
    }
  }

  @Override
  public boolean equals(Object otherRegion) {
    if (!(otherRegion instanceof Region)) {
      return false;
    } else {
      Region newRegion = (Region) otherRegion;
      return this.getRegionName().equals(newRegion.getRegionName()) &&
             this.getId() == newRegion.getId();
    }
  }

}
