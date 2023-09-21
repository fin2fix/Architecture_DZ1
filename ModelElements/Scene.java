package ModelElements;

import java.util.List;

public class Scene {
  public int id;
  public List<PoligonalModel> models;
  public List<Flash> flashes;
  public List<Camera> cameras;

  public Scene(int id, List<PoligonalModel> models, List<Flash> flashes, List<Camera> cameras) {
    this.id = id;
    this.models = models;
    this.flashes = flashes;
    this.cameras = cameras;

    // models.add(new PoligonalModel(null));
    // cameras.add(new Camera(null, null));
  }

  // TODO: реализовать метод method1
  public <Type> Type method1(Type type) {
    return type;
  }

  // TODO: реализовать метод method2
  public <Type> Type method2(Type type1, Type type2) {
    return type1;
  }
}