Simple calculator, created while learning JavaFX. Supports basic operations (+, -, *, /) on numbers of arbitrary size.

UI built using SceneBuilder and FXML and styled using CSS.

Designed using the Model - View - Controller design pattern. The view (Main.fxml) relays commands to the controller (MainController.java), 
which updates the model (MainModel.java), and then relays any changes in the model back to the view.

The methods the model is required to implement are specified in the Calculator interface.
