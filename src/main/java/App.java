import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;
import java.util.HashMap;
import java.util.Map;

public class App {
  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/index.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
      
    post("/regions", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      String name = request.queryParams("name");
      Region newRegion = new Region(name);
      newRegion.save();
      model.put("template", "templates/region-success.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    post("/varietals", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      Region region = Region.find(Integer.parseInt(request.queryParams("regionId")));
      String description = request.queryParams("description");
      Varietal newVarietal = new Varietal(description, region.getId());
      newVarietal.save();
      model.put("region", region);
      model.put("template", "templates/region-varietal-success.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

  }
}
