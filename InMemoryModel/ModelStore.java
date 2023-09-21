package InMemoryModel;

import java.util.ArrayList;
import java.util.List;

import ModelElements.Camera;
import ModelElements.Flash;
import ModelElements.PoligonalModel;
import ModelElements.Scene;

public class ModelStore implements IModelChanger {
  public List<PoligonalModel> models;
  public List<Scene> scenes;
  public List<Flash> flashes;
  public List<Camera> cameras;
  private List<IModelChangedObserver> changeObservers;

  public ModelStore(List<IModelChangedObserver> changeObservers) {
    this.models = new ArrayList<>();
    this.scenes = new ArrayList<>();
    this.flashes = new ArrayList<>();
    this.cameras = new ArrayList<>();
    this.changeObservers = changeObservers;

    // models.add(new PoligonalModel(null));
    // flashes.add(new Flash(null, null, null, 1));
    // cameras.add(new Camera(null, null));
    // scenes.add(new Scene(0, null, null, null));
  }

  @Override
  public void NotifyChange(IModelChanger sender) {
  }

  public Scene getScene(int id) {
    return new Scene(id, models, flashes, cameras);
  }

}
