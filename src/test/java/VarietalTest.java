import org.sql2o.*;
import org.junit.*;
import static org.junit.Assert.*;

public class VarietalTest {
  @Before
  public void setUp() {
    DB.sql2o = new Sql2o("jdbc:postgresql://localhost:5432/coffee_klatch_test", null, null);
  }

  @Test
  public void VarietalInstantiatesCorrectly_true() {
    Varietal myVarietal = new Varietal("Sulawase");
    assertEquals(true, myVarietal instanceof Varietal);
  }

  @Test
  public void getVarietalName_returnsVarietalName_string() {
    Varietal myVarietal = new Varietal("Sulawase");
    assertEquals("Sulawase", myVarietal.getVarietalName());
  }

  @After
  public void tearDown() {
    try(Connection con = DB.sql2o.open()) {
      String sql = "DELETE FROM varietals *;";
      con.createQuery(sql).executeUpdate();
    }
  }


//end of class
}
